/**
 *
 *    geo-platform
 *    Rich webgis framework
 *    http://geo-platform.org
 *   ====================================================================
 *
 *   Copyright (C) 2008-2016 geoSDI Group (CNR IMAA - Potenza - ITALY).
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
// Generated on: 2012.04.18 at 12:36:36 PM CEST 
//


package org.geosdi.geoplatform.xml.csw.v202;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.w3c.dom.Element;


/**
 * A schema component includes a schema fragment (type
 *          definition) or an entire schema from some target namespace;
 *          the schema language is identified by URI. If the component
 *          is a schema fragment its parent MUST be referenced (parentSchema).
 * 
 * <p>Java class for SchemaComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchemaComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax'/>
 *       &lt;/sequence>
 *       &lt;attribute name="targetNamespace" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="parentSchema" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="schemaLanguage" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchemaComponentType", propOrder = {
    "content"
})
public class SchemaComponentType
    implements ToString
{

    @XmlMixed
    @XmlAnyElement(lax = true)
    protected List<Object> content;
    @XmlAttribute(name = "targetNamespace", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String targetNamespace;
    @XmlAttribute(name = "parentSchema")
    @XmlSchemaType(name = "anyURI")
    protected String parentSchema;
    @XmlAttribute(name = "schemaLanguage", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String schemaLanguage;

    /**
     * A schema component includes a schema fragment (type
     *          definition) or an entire schema from some target namespace;
     *          the schema language is identified by URI. If the component
     *          is a schema fragment its parent MUST be referenced (parentSchema).Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    public boolean isSetContent() {
        return ((this.content!= null)&&(!this.content.isEmpty()));
    }

    public void unsetContent() {
        this.content = null;
    }

    /**
     * Gets the value of the targetNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * Sets the value of the targetNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    public boolean isSetTargetNamespace() {
        return (this.targetNamespace!= null);
    }

    /**
     * Gets the value of the parentSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentSchema() {
        return parentSchema;
    }

    /**
     * Sets the value of the parentSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentSchema(String value) {
        this.parentSchema = value;
    }

    public boolean isSetParentSchema() {
        return (this.parentSchema!= null);
    }

    /**
     * Gets the value of the schemaLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaLanguage() {
        return schemaLanguage;
    }

    /**
     * Sets the value of the schemaLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaLanguage(String value) {
        this.schemaLanguage = value;
    }

    public boolean isSetSchemaLanguage() {
        return (this.schemaLanguage!= null);
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
        {
            List<Object> theContent;
            theContent = (this.isSetContent()?this.getContent():null);
            strategy.appendField(locator, this, "content", buffer, theContent);
        }
        {
            String theTargetNamespace;
            theTargetNamespace = this.getTargetNamespace();
            strategy.appendField(locator, this, "targetNamespace", buffer, theTargetNamespace);
        }
        {
            String theParentSchema;
            theParentSchema = this.getParentSchema();
            strategy.appendField(locator, this, "parentSchema", buffer, theParentSchema);
        }
        {
            String theSchemaLanguage;
            theSchemaLanguage = this.getSchemaLanguage();
            strategy.appendField(locator, this, "schemaLanguage", buffer, theSchemaLanguage);
        }
        return buffer;
    }

    public void setContent(List<Object> value) {
        this.content = null;
        List<Object> draftl = this.getContent();
        draftl.addAll(value);
    }

}
