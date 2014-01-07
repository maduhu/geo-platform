/**
 *
 *    geo-platform
 *    Rich webgis framework
 *    http://geo-platform.org
 *   ====================================================================
 *
 *   Copyright (C) 2008-2014 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 *   This program is free software: you can redistribute it and/or modify it
 *   under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version. This program is distributed in the
 *   hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *   even the implied warranty of MERCHANTABILITY or FITNESS FOR
 *   A PARTICULAR PURPOSE. See the GNU General Public License
 *   for more details. You should have received a copy of the GNU General
 *   Public License along with this program. If not, see http://www.gnu.org/licenses/
 *
 *   ====================================================================
 *
 *   Linking this library statically or dynamically with other modules is
 *   making a combined work based on this library. Thus, the terms and
 *   conditions of the GNU General Public License cover the whole combination.
 *
 *   As a special exception, the copyright holders of this library give you permission
 *   to link this library with independent modules to produce an executable, regardless
 *   of the license terms of these independent modules, and to copy and distribute
 *   the resulting executable under terms of your choice, provided that you also meet,
 *   for each linked independent module, the terms and conditions of the license of
 *   that module. An independent module is a module which is not derived from or
 *   based on this library. If you modify this library, you may extend this exception
 *   to your version of the library, but you are not obligated to do so. If you do not
 *   wish to do so, delete this exception statement from your version.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.17 at 10:27:36 PM CEST 
//
package org.geosdi.geoplatform.xml.gml.v311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

/**
 * A feature collection contains zero or more features.
 *
 * <p>Java class for AbstractFeatureCollectionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="AbstractFeatureCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}featureMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}featureMembers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureCollectionType", propOrder = {
    "featureMember",
    "featureMembers"
})
@XmlSeeAlso({
    FeatureCollectionType.class
})
public abstract class AbstractFeatureCollectionType
        extends AbstractFeatureType
        implements ToString {

    protected List<FeaturePropertyType> featureMember;
    protected FeatureArrayPropertyType featureMembers;

    public AbstractFeatureCollectionType() {
    }

    /**
     * Gets the value of the featureMember property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the featureMember property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureMember().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link FeaturePropertyType }
     *
     *
     */
    public List<FeaturePropertyType> getFeatureMember() {
        if (featureMember == null) {
            featureMember = new ArrayList<FeaturePropertyType>();
        }
        return this.featureMember;
    }

    public boolean isSetFeatureMember() {
        return ((this.featureMember != null) && (!this.featureMember.isEmpty()));
    }

    public void unsetFeatureMember() {
        this.featureMember = null;
    }

    /**
     * Gets the value of the featureMembers property.
     *
     * @return possible object is {@link FeatureArrayPropertyType }
     *
     */
    public FeatureArrayPropertyType getFeatureMembers() {
        return featureMembers;
    }

    /**
     * Sets the value of the featureMembers property.
     *
     * @param value allowed object is {@link FeatureArrayPropertyType }
     *
     */
    public void setFeatureMembers(FeatureArrayPropertyType value) {
        this.featureMembers = value;
    }

    public boolean isSetFeatureMembers() {
        return (this.featureMembers != null);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator,
            StringBuilder buffer,
            ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator,
            StringBuilder buffer,
            ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            List<FeaturePropertyType> theFeatureMember;
            theFeatureMember = (this.isSetFeatureMember() ? this.getFeatureMember() : null);
            strategy.appendField(locator, this, "featureMember", buffer,
                    theFeatureMember);
        }
        {
            FeatureArrayPropertyType theFeatureMembers;
            theFeatureMembers = this.getFeatureMembers();
            strategy.appendField(locator, this, "featureMembers", buffer,
                    theFeatureMembers);
        }
        return buffer;
    }

    public void setFeatureMember(List<FeaturePropertyType> value) {
        this.featureMember = null;
        List<FeaturePropertyType> draftl = this.getFeatureMember();
        draftl.addAll(value);
    }
}
