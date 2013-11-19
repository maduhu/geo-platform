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
package org.geosdi.geoplatform.gui.client.widget;

import com.extjs.gxt.ui.client.event.BaseEvent;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.store.StoreEvent;
import com.extjs.gxt.ui.client.store.StoreListener;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.SimpleComboBox;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.grid.*;
import com.google.common.collect.Lists;
import com.google.gwt.core.client.GWT;
import java.util.List;
import org.geosdi.geoplatform.gui.client.BasicWidgetResources;
import org.geosdi.geoplatform.gui.client.command.publish.basic.ProcessEPSGResultRequest;
import org.geosdi.geoplatform.gui.client.command.publish.basic.ProcessEPSGResultResponse;
import org.geosdi.geoplatform.gui.client.event.shapepreview.FeaturePreviewEvent;
import org.geosdi.geoplatform.gui.client.i18n.PublisherWidgetConstants;
import org.geosdi.geoplatform.gui.client.i18n.buttons.ButtonsConstants;
import org.geosdi.geoplatform.gui.client.model.EPSGLayerData;
import org.geosdi.geoplatform.gui.client.model.PreviewLayer;
import org.geosdi.geoplatform.gui.client.widget.progressbar.PublisherProgressBar;
import org.geosdi.geoplatform.gui.command.api.ClientCommandDispatcher;
import org.geosdi.geoplatform.gui.command.api.GPClientCommand;
import org.geosdi.geoplatform.gui.configuration.message.GeoPlatformMessage;
import org.geosdi.geoplatform.gui.impl.view.LayoutManager;
import org.geosdi.geoplatform.gui.puregwt.GPHandlerManager;
import org.geosdi.geoplatform.gui.shared.publisher.LayerPublishAction;

/**
 * @author Nazzareno Sileno - CNR IMAA geoSDI Group
 * @email nazzareno.sileno@geosdi.org
 */
public class EPSGTablePanel extends GeoPlatformContentPanel {

    private EditorGrid<EPSGLayerData> grid;
    private ListStore<EPSGLayerData> store = new ListStore<EPSGLayerData>();
    private Button processEPSGButton = new Button(ButtonsConstants.INSTANCE.nextText(),
            BasicWidgetResources.ICONS.done());
    private ProcessEPSGResultRequest processEPSGRequest = GWT.
            <ProcessEPSGResultRequest>create(ProcessEPSGResultRequest.class);
    private TextField<String> newNameTextField = new TextField<String>();

    public EPSGTablePanel() {
        super(Boolean.TRUE);
    }

    public void populateStore(List<PreviewLayer> epsgLayerList) {
        this.store.removeAll();
        for (PreviewLayer previewLayer : epsgLayerList) {
            EPSGLayerData epsgLayerData = new EPSGLayerData(previewLayer.
                    getTitle(), previewLayer.getCrs(), previewLayer.getStyleName(),
                    previewLayer.isIsShape(), previewLayer.isIsPresent(),
                    previewLayer.getFileName());
            this.store.add(epsgLayerData);
        }
        this.manageProcessEPSGButton();
    }

    @Override
    public void addComponent() {
        List<ColumnConfig> configs = Lists.<ColumnConfig>newArrayList();
        ColumnConfig featureNameColumnConfig = new ColumnConfig(
                EPSGLayerData.NAME, PublisherWidgetConstants.INSTANCE.EPSGTablePanel_columnFeatureNameText(), 80);
        configs.add(featureNameColumnConfig);
        ColumnConfig epsgColumnConfig = new ColumnConfig(EPSGLayerData.CRS,
                PublisherWidgetConstants.INSTANCE.EPSGTablePanel_columnEPSGCodeText(), 80);
        TextField<String> epsgTextField = new TextField<String>();
        epsgTextField.setEmptyText(PublisherWidgetConstants.INSTANCE.EPSGTablePanel_epsgTextFieldEmptyText());
        epsgTextField.setAllowBlank(Boolean.FALSE);
        epsgColumnConfig.setEditor(new CellEditor(epsgTextField));
        configs.add(epsgColumnConfig);

        ColumnConfig newNameColumnConfig = new ColumnConfig(EPSGLayerData.NEW_NAME,
                "New Name", 120);//ToDo: i18n
        newNameTextField.setEmptyText(PublisherWidgetConstants.INSTANCE.EPSGTablePanel_epsgTextFieldEmptyText());
        newNameTextField.setEnabled(Boolean.FALSE);
        newNameTextField.setAllowBlank(Boolean.TRUE);
        final CellEditor newNameCellEditor = new CellEditor(newNameTextField);
        newNameColumnConfig.setEditor(newNameCellEditor);

        ColumnConfig publishColumnConfig = new ColumnConfig(EPSGLayerData.PUBLISH_ACTION,
                "Publish Action", 100);//ToDo: i18n
        GridCellRenderer<EPSGLayerData> renderer = new GridCellRenderer<EPSGLayerData>() {

            private boolean init = false;
            private SimpleComboBox<String> publishActionComboBox;
            private EPSGLayerData model;

            @Override
            public Object render(final EPSGLayerData model, String property,
                    ColumnData config, int rowIndex, int colIndex,
                    final ListStore<EPSGLayerData> store, Grid<EPSGLayerData> grid) {
                if (!init || (this.model != null && !this.model.equals(model))) {
                    this.publishActionComboBox = new SimpleComboBox<String>();
                    newNameTextField.setAllowBlank(Boolean.TRUE);
                    newNameTextField.setEnabled(Boolean.FALSE);
                    publishActionComboBox.setEditable(Boolean.FALSE);
                    publishActionComboBox.setWidth(grid.getColumnModel().getColumnWidth(colIndex) - 5);
                    List<LayerPublishAction> l = model.getPublishActions();
                    if (l != null) {
                        for (LayerPublishAction publishAction : l) {
                            publishActionComboBox.add(publishAction.toString());
                        }
                        publishActionComboBox.setAllowBlank(Boolean.FALSE);
                        publishActionComboBox.addListener(Events.Select, new Listener<BaseEvent>() {

                            @Override
                            public void handleEvent(BaseEvent be) {
                                if (publishActionComboBox.isValid()) {
                                    model.setPublishAction(publishActionComboBox.getValue().getValue());
                                    String publishAction = publishActionComboBox.getValue().getValue();
                                    if (LayerPublishAction.valueOf(publishAction).equals(LayerPublishAction.RENAME)) {
                                        newNameTextField.setEnabled(Boolean.TRUE);
                                        newNameTextField.setAllowBlank(Boolean.FALSE);
                                    } else {
                                        store.getRecord(model).reject(Boolean.FALSE);
                                        newNameTextField.setAllowBlank(Boolean.TRUE);
                                        newNameTextField.setEnabled(Boolean.FALSE);
                                    }
                                } else {
                                    model.setPublishAction(null);
                                }
                                manageProcessEPSGButton();
                            }
                        });
                    }
                    init = true;
                    this.model = model;
                }
                return publishActionComboBox;
            }
        };
        publishColumnConfig.setRenderer(renderer);
        configs.add(publishColumnConfig);

        configs.add(newNameColumnConfig);

        this.grid = new EditorGrid<EPSGLayerData>(store,
                new ColumnModel(configs));
        grid.setBorders(Boolean.TRUE);
        grid.setStripeRows(Boolean.TRUE);
        grid.setBorders(Boolean.TRUE);
        this.grid.setClicksToEdit(EditorGrid.ClicksToEdit.ONE);
        grid.setStyleAttribute("borderTop", "none");
        grid.setAutoExpandColumn(EPSGLayerData.NAME);
        grid.setAutoExpandMin(120);
        grid.setSize(GPPublisherWidget.PUBLISHER_WIDGET_WIDTH - 29,
                GPPublisherWidget.PUBLISHER_WIDGET_HEIGHT - 223);
        super.add(this.grid);
        this.processEPSGButton.addSelectionListener(
                new SelectionListener<ButtonEvent>() {
                    @Override
                    public void componentSelected(ButtonEvent ce) {
                        PublisherProgressBar.getInstance().show("Processing data");//TODO: i18n
                        store.commitChanges();
                        processEPSGRequest.setPreviewLayerList(store.getModels());
                        ClientCommandDispatcher.getInstance().execute(
                                new GPClientCommand<ProcessEPSGResultResponse>() {
                                    private static final long serialVersionUID = -8303308816796000537L;

                                    {
                                        super.setCommandRequest(processEPSGRequest);
                                    }
                                    private FeaturePreviewEvent event = new FeaturePreviewEvent();

                                    @Override
                                    public void onCommandSuccess(
                                            ProcessEPSGResultResponse response) {
                                                PublisherProgressBar.getInstance().hide();
                                                event.setResult(response.getResult());
                                                GPHandlerManager.fireEvent(event);
                                            }

                                            @Override
                                            public void onCommandFailure(Throwable exception) {
                                                PublisherProgressBar.getInstance().hide();
                                                GeoPlatformMessage.errorMessage("Publisher Error",
                                                        exception.getMessage());//TODO:i18n
                                                System.out.println("EPSGTablePanel Exception: " + exception.toString());
                                                System.out.println("Stack Trace Exception: " + exception.getStackTrace());
                                                System.out.println("Message Exception: " + exception.getMessage());
                                                exception.printStackTrace();
                                            }
                                });
                    }
                });
        this.processEPSGButton.setToolTip(PublisherWidgetConstants.INSTANCE.EPSGTablePanel_processEPSGButtonTooltipText());
        super.addButton(this.processEPSGButton);
    }

    @Override
    public void initSize() {
        super.setSize(GPPublisherWidget.PUBLISHER_WIDGET_WIDTH - 29,
                GPPublisherWidget.PUBLISHER_WIDGET_HEIGHT - 213);
    }

    private boolean isAllEPSGNotNull() {
        boolean result = Boolean.TRUE;
        for (EPSGLayerData epsgLayerData : store.getModels()) {
            String epsgCode = epsgLayerData.getEpsgCode();
            String test = "";
            if (epsgCode.length() > 5) {
                test = epsgCode.substring(0, 5);
            }
            if (epsgCode == null || epsgCode.isEmpty()
                    || !test.equalsIgnoreCase("EPSG:")
                    || (epsgLayerData.getPublishAction() == null && epsgLayerData.isIsPresent())
                    || !this.newNameTextField.isValid()) {
                result = Boolean.FALSE;
                break;
            }
        }
        return result;
    }

    private void manageProcessEPSGButton() {
        if (isAllEPSGNotNull()) {
            processEPSGButton.enable();
        } else {
            LayoutManager.getInstance().getStatusMap().setStatus(
                    PublisherWidgetConstants.INSTANCE.EPSGTablePanel_statusEPSGFillRequiredText(),
                    SearchStatus.EnumSearchStatus.STATUS_NO_SEARCH.toString());
            processEPSGButton.disable();
        }
    }

    @Override
    public void setPanelProperties() {
        super.setHeadingHtml(PublisherWidgetConstants.INSTANCE.EPSGTablePanel_headingText());
        this.store.addStoreListener(new StoreListener<EPSGLayerData>() {
            @Override
            public void storeUpdate(StoreEvent<EPSGLayerData> se) {
                se.getModel().setEpsgCode(se.getModel().getEpsgCode().
                        toUpperCase());
                super.storeUpdate(se);
                manageProcessEPSGButton();
            }
        });
    }
}
