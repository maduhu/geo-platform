/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-platform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2013 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 * This program is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version. This program is distributed in the 
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR 
 * A PARTICULAR PURPOSE. See the GNU General Public License 
 * for more details. You should have received a copy of the GNU General 
 * Public License along with this program. If not, see http://www.gnu.org/licenses/ 
 *
 * ====================================================================
 *
 * Linking this library statically or dynamically with other modules is 
 * making a combined work based on this library. Thus, the terms and 
 * conditions of the GNU General Public License cover the whole combination. 
 * 
 * As a special exception, the copyright holders of this library give you permission 
 * to link this library with independent modules to produce an executable, regardless 
 * of the license terms of these independent modules, and to copy and distribute 
 * the resulting executable under terms of your choice, provided that you also meet, 
 * for each linked independent module, the terms and conditions of the license of 
 * that module. An independent module is a module which is not derived from or 
 * based on this library. If you modify this library, you may extend this exception 
 * to your version of the library, but you are not obligated to do so. If you do not 
 * wish to do so, delete this exception statement from your version. 
 *
 */
package org.geosdi.geoplatform.gui.client.widget.wfs;

import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.store.Record;
import com.extjs.gxt.ui.client.store.StoreEvent;
import com.extjs.gxt.ui.client.store.StoreListener;
import com.extjs.gxt.ui.client.widget.form.Field;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.form.Validator;
import com.extjs.gxt.ui.client.widget.grid.CellEditor;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.EditorGrid;
import com.google.common.collect.Lists;
import com.google.gwt.user.client.Timer;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.geosdi.geoplatform.gui.client.model.wfs.AttributeDetail;
import org.geosdi.geoplatform.gui.client.model.wfs.AttributeValuesDetail;
import org.geosdi.geoplatform.gui.client.widget.GeoPlatformContentPanel;
import org.geosdi.geoplatform.gui.client.widget.wfs.builder.GetFeatureControlBuilder;
import org.geosdi.geoplatform.gui.client.widget.wfs.event.FeatureStatusBarEvent;
import org.geosdi.geoplatform.gui.client.widget.wfs.handler.FeatureAttributesHandler;
import org.geosdi.geoplatform.gui.client.widget.wfs.statusbar.FeatureStatusBar.FeatureStatusBarType;
import org.geosdi.geoplatform.gui.configuration.action.event.ActionEnableEvent;
import org.geosdi.geoplatform.gui.puregwt.GPEventBus;
import org.gwtopenmaps.openlayers.client.feature.VectorFeature;
import org.gwtopenmaps.openlayers.client.protocol.WFSProtocolCRUDOptions;

/**
 *
 * @author Vincenzo Monteverde <vincenzo.monteverde@geosdi.org>
 */
public class FeatureAttributesWidget extends GeoPlatformContentPanel
        implements FeatureAttributesHandler {

    private GPEventBus bus;
    //
    private List<AttributeDetail> attributes;
    //
    private ListStore<AttributeValuesDetail> store;
    private EditorGrid<AttributeValuesDetail> grid;
    //
    private VectorFeature feature;
    private GetFeatureControlBuilder featureControlBuilder;
    private WFSProtocolCRUDOptions featureCRUDProtocol;

    @Inject
    public FeatureAttributesWidget(GPEventBus bus,
            GetFeatureControlBuilder theFeatureControlBuilder,
            WFSProtocolCRUDOptions theFeatureCRUDProtocol) {
        super(true);
        this.bus = bus;
        this.featureControlBuilder = theFeatureControlBuilder;
        this.featureCRUDProtocol = theFeatureCRUDProtocol;

        this.bus.addHandler(FeatureAttributesHandler.TYPE, this);
    }

    public void setAttributes(List<AttributeDetail> attributes) {
        assert (attributes != null) : "Attributes must not bu null.";
        this.attributes = attributes;
    }

    @Override
    protected void beforeRender() {
        this.createStore();
        this.createEditorGrid();
    }

    @Override
    public void addComponent() {
    }

    @Override
    public void initSize() {
    }

    @Override
    public void setPanelProperties() {
//        super.setCollapsible(true);
        super.setHeaderVisible(false);
        super.setScrollMode(Style.Scroll.AUTO);
    }

    @Override
    public void reset() {
        store = null;
        grid = null;
        feature = null;
        bus.fireEvent(new ActionEnableEvent(false));
        super.setVScrollPosition(0);
    }

    private void createStore() {
        store = new ListStore<AttributeValuesDetail>();
        store.addStoreListener(new StoreListener<AttributeValuesDetail>() {
            @Override
            public void storeClear(StoreEvent<AttributeValuesDetail> se) {
                bus.fireEvent(new ActionEnableEvent(false));
            }

            @Override
            public void storeUpdate(StoreEvent<AttributeValuesDetail> se) {
                bus.fireEvent(new ActionEnableEvent(true));
            }
        });
    }

    private void createEditorGrid() {
        grid = new EditorGrid<AttributeValuesDetail>(store, this.prepareColumnModel());
        grid.setAutoExpandColumn(attributes.get(0).getName());
        grid.setBorders(true);
        grid.setStripeRows(true);
        grid.setColumnLines(true);
        grid.setColumnResize(false);

//        grid.setHeight(600);
        grid.setAutoHeight(true);
        grid.setAutoWidth(true);

//        grid.getView().setAutoFill(true);
        grid.getView().setForceFit(true);

        super.add(grid);
    }

    private ColumnModel prepareColumnModel() {
        List<ColumnConfig> configs = Lists.newArrayListWithCapacity(attributes.size());

        for (AttributeDetail att : attributes) {
            TextField<String> valueTextField = new TextField<String>();
            valueTextField.setValidator(this.attributeValuesValidator());
            valueTextField.setAutoValidate(true);
            CellEditor valueEditor = new CellEditor(valueTextField) {
                @Override
                public Object postProcessValue(Object value) {
                    if (value == null) {
                        return value;
                    }
                    bus.fireEvent(new FeatureStatusBarEvent(
                            "The value \"" + value + "\" is correct",
                            FeatureStatusBarType.STATUS_OK));
                    return value;
                }
            };

            ColumnConfig valueColumn = new ColumnConfig();
            String name = att.getName();
            valueColumn.setId(name);
            valueColumn.setHeader(name);
            valueColumn.setEditor(valueEditor);

            configs.add(valueColumn);
        }

        return new ColumnModel(configs);
    }

    @Override
    public void saveAttributes() {
        for (Record record : store.getModifiedRecords()) {
            ModelData model = record.getModel();
            AttributeDetail attribute = (AttributeDetail) model;
            feature.getAttributes().setAttribute(attribute.getName(),
                                                 attribute.getValue());
        }

        this.feature.toState(VectorFeature.State.Update);

        this.bus.fireEvent(new FeatureStatusBarEvent("Transaction in Progress",
                                                     FeatureStatusBarType.STATUS_LOADING));

        Timer t = new Timer() {
            @Override
            public void run() {
                featureControlBuilder.getWfsProtocol().commit(feature,
                                                              featureCRUDProtocol);
            }
        };

        t.schedule(2000);
    }

    @Override
    public void resetAttributes() {
        grid.stopEditing(true);
        store.rejectChanges();
        bus.fireEvent(new ActionEnableEvent(false));
    }

    // TODO For more that one istance of feature
    @Override
    public void setValues(Map<String, String> attributeValues, VectorFeature feature) {
        assert (attributeValues != null) : "Attribute values must not be null.";
        assert (attributes != null) : "Attributes must not be null.";

        this.feature = feature;

        grid.mask("Retrieve feature attributes");

        AttributeValuesDetail attValues = new AttributeValuesDetail();
        for (AttributeDetail att : attributes) {
            String value = attributeValues.get(att.getName());
            attValues.setValue(att.getName(), value);
        }

        this.populateStore(attValues);

        grid.unmask();
    }

    private void populateStore(AttributeValuesDetail attValues) {
        assert (attributes != null) : "Attributes must not be null.";
        store.removeAll();
        store.add(attValues);
    }

    @Override
    public void resetValues() {
        this.reset();
    }

    @Override
    public void successfulTransaction() {
        this.bus.fireEvent(new FeatureStatusBarEvent("Successful Transaction",
                                                     FeatureStatusBarType.STATUS_OK));

        store.commitChanges();
        bus.fireEvent(new ActionEnableEvent(false));
    }

    private Validator attributeValuesValidator() {
        return new Validator() {
            @Override
            public String validate(Field<?> field, String value) {
//                AttributeValuesDetail selectedItem = grid.getSelectionModel().getSelectedItem();
//                System.out.println("*** SELECTED " + selectedItem);

//                String type = selectedItem.getType();
//                String typeName = type.substring(type.lastIndexOf(".") + 1);
////                System.out.println("*** " + typeName + " - value: " + value);
//
//                TypeValidator validator = TypeValidatorController.MAP_VALIDATOR.get(type);
//                if (!validator.validateType(value)) {
//                    String errorValidation = "The value must be of " + typeName + " type";
//                    bus.fireEvent(new FeatureStatusBarEvent(
//                            errorValidation, FeatureStatusBarType.STATUS_ERROR));
//                    return errorValidation;
//                }
                return null;
            }
        };
    }
}