/**
 *
 *    geo-platform
 *    Rich webgis framework
 *    http://geo-platform.org
 *   ====================================================================
 *
 *   Copyright (C) 2008-2015 geoSDI Group (CNR IMAA - Potenza - ITALY).
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
// Generated on: 2012.04.18 at 03:12:11 PM CEST 
//


package org.geosdi.geoplatform.xml.iso19139.v20070417.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.AbstractObjectType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.IntegerPropertyType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for MD_GeometricObjects_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_GeometricObjects_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="geometricObjectType" type="{http://www.isotc211.org/2005/gmd}MD_GeometricObjectTypeCode_PropertyType"/>
 *         &lt;element name="geometricObjectCount" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_GeometricObjects_Type", propOrder = {
    "geometricObjectType",
    "geometricObjectCount"
})
public class MDGeometricObjectsType
    extends AbstractObjectType
    implements ToString
{

    @XmlElement(required = true)
    protected MDGeometricObjectTypeCodePropertyType geometricObjectType;
    protected IntegerPropertyType geometricObjectCount;

    /**
     * Gets the value of the geometricObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link MDGeometricObjectTypeCodePropertyType }
     *     
     */
    public MDGeometricObjectTypeCodePropertyType getGeometricObjectType() {
        return geometricObjectType;
    }

    /**
     * Sets the value of the geometricObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDGeometricObjectTypeCodePropertyType }
     *     
     */
    public void setGeometricObjectType(MDGeometricObjectTypeCodePropertyType value) {
        this.geometricObjectType = value;
    }

    public boolean isSetGeometricObjectType() {
        return (this.geometricObjectType!= null);
    }

    /**
     * Gets the value of the geometricObjectCount property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getGeometricObjectCount() {
        return geometricObjectCount;
    }

    /**
     * Sets the value of the geometricObjectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setGeometricObjectCount(IntegerPropertyType value) {
        this.geometricObjectCount = value;
    }

    public boolean isSetGeometricObjectCount() {
        return (this.geometricObjectCount!= null);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            MDGeometricObjectTypeCodePropertyType theGeometricObjectType;
            theGeometricObjectType = this.getGeometricObjectType();
            strategy.appendField(locator, this, "geometricObjectType", buffer, theGeometricObjectType);
        }
        {
            IntegerPropertyType theGeometricObjectCount;
            theGeometricObjectCount = this.getGeometricObjectCount();
            strategy.appendField(locator, this, "geometricObjectCount", buffer, theGeometricObjectCount);
        }
        return buffer;
    }

}