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
// Generated on: 2015.06.17 at 04:41:23 PM CEST 
//


package org.geosdi.geoplatform.xml.iso19139.v20060504.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gco.AbstractObjectType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gco.CharacterStringPropertyType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gco.DatePropertyType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gts.TMPeriodDurationPropertyType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Information about the scope and frequency of updating
 * 
 * <p>Java class for MD_MaintenanceInformation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_MaintenanceInformation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="maintenanceAndUpdateFrequency" type="{http://www.isotc211.org/2005/gmd}MD_MaintenanceFrequencyCode_PropertyType"/>
 *         &lt;element name="dateOfNextUpdate" type="{http://www.isotc211.org/2005/gco}Date_PropertyType" minOccurs="0"/>
 *         &lt;element name="userDefinedMaintenanceFrequency" type="{http://www.isotc211.org/2005/gts}TM_PeriodDuration_PropertyType" minOccurs="0"/>
 *         &lt;element name="updateScope" type="{http://www.isotc211.org/2005/gmd}MD_ScopeCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="updateScopeDescription" type="{http://www.isotc211.org/2005/gmd}MD_ScopeDescription_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maintenanceNote" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_MaintenanceInformation_Type", propOrder = {
    "maintenanceAndUpdateFrequency",
    "dateOfNextUpdate",
    "userDefinedMaintenanceFrequency",
    "updateScope",
    "updateScopeDescription",
    "maintenanceNote",
    "contact"
})
public class MDMaintenanceInformationType
    extends AbstractObjectType
    implements ToString
{

    @XmlElement(required = true)
    protected MDMaintenanceFrequencyCodePropertyType maintenanceAndUpdateFrequency;
    protected DatePropertyType dateOfNextUpdate;
    protected TMPeriodDurationPropertyType userDefinedMaintenanceFrequency;
    protected List<MDScopeCodePropertyType> updateScope;
    protected List<MDScopeDescriptionPropertyType> updateScopeDescription;
    protected List<CharacterStringPropertyType> maintenanceNote;
    protected List<CIResponsiblePartyPropertyType> contact;

    /**
     * Gets the value of the maintenanceAndUpdateFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link MDMaintenanceFrequencyCodePropertyType }
     *     
     */
    public MDMaintenanceFrequencyCodePropertyType getMaintenanceAndUpdateFrequency() {
        return maintenanceAndUpdateFrequency;
    }

    /**
     * Sets the value of the maintenanceAndUpdateFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMaintenanceFrequencyCodePropertyType }
     *     
     */
    public void setMaintenanceAndUpdateFrequency(MDMaintenanceFrequencyCodePropertyType value) {
        this.maintenanceAndUpdateFrequency = value;
    }

    public boolean isSetMaintenanceAndUpdateFrequency() {
        return (this.maintenanceAndUpdateFrequency!= null);
    }

    /**
     * Gets the value of the dateOfNextUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePropertyType }
     *     
     */
    public DatePropertyType getDateOfNextUpdate() {
        return dateOfNextUpdate;
    }

    /**
     * Sets the value of the dateOfNextUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePropertyType }
     *     
     */
    public void setDateOfNextUpdate(DatePropertyType value) {
        this.dateOfNextUpdate = value;
    }

    public boolean isSetDateOfNextUpdate() {
        return (this.dateOfNextUpdate!= null);
    }

    /**
     * Gets the value of the userDefinedMaintenanceFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link TMPeriodDurationPropertyType }
     *     
     */
    public TMPeriodDurationPropertyType getUserDefinedMaintenanceFrequency() {
        return userDefinedMaintenanceFrequency;
    }

    /**
     * Sets the value of the userDefinedMaintenanceFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMPeriodDurationPropertyType }
     *     
     */
    public void setUserDefinedMaintenanceFrequency(TMPeriodDurationPropertyType value) {
        this.userDefinedMaintenanceFrequency = value;
    }

    public boolean isSetUserDefinedMaintenanceFrequency() {
        return (this.userDefinedMaintenanceFrequency!= null);
    }

    /**
     * Gets the value of the updateScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeCodePropertyType }
     * 
     * 
     */
    public List<MDScopeCodePropertyType> getUpdateScope() {
        if (updateScope == null) {
            updateScope = new ArrayList<MDScopeCodePropertyType>();
        }
        return this.updateScope;
    }

    public boolean isSetUpdateScope() {
        return ((this.updateScope!= null)&&(!this.updateScope.isEmpty()));
    }

    public void unsetUpdateScope() {
        this.updateScope = null;
    }

    /**
     * Gets the value of the updateScopeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateScopeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateScopeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeDescriptionPropertyType }
     * 
     * 
     */
    public List<MDScopeDescriptionPropertyType> getUpdateScopeDescription() {
        if (updateScopeDescription == null) {
            updateScopeDescription = new ArrayList<MDScopeDescriptionPropertyType>();
        }
        return this.updateScopeDescription;
    }

    public boolean isSetUpdateScopeDescription() {
        return ((this.updateScopeDescription!= null)&&(!this.updateScopeDescription.isEmpty()));
    }

    public void unsetUpdateScopeDescription() {
        this.updateScopeDescription = null;
    }

    /**
     * Gets the value of the maintenanceNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maintenanceNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaintenanceNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getMaintenanceNote() {
        if (maintenanceNote == null) {
            maintenanceNote = new ArrayList<CharacterStringPropertyType>();
        }
        return this.maintenanceNote;
    }

    public boolean isSetMaintenanceNote() {
        return ((this.maintenanceNote!= null)&&(!this.maintenanceNote.isEmpty()));
    }

    public void unsetMaintenanceNote() {
        this.maintenanceNote = null;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getContact() {
        if (contact == null) {
            contact = new ArrayList<CIResponsiblePartyPropertyType>();
        }
        return this.contact;
    }

    public boolean isSetContact() {
        return ((this.contact!= null)&&(!this.contact.isEmpty()));
    }

    public void unsetContact() {
        this.contact = null;
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
            MDMaintenanceFrequencyCodePropertyType theMaintenanceAndUpdateFrequency;
            theMaintenanceAndUpdateFrequency = this.getMaintenanceAndUpdateFrequency();
            strategy.appendField(locator, this, "maintenanceAndUpdateFrequency", buffer, theMaintenanceAndUpdateFrequency);
        }
        {
            DatePropertyType theDateOfNextUpdate;
            theDateOfNextUpdate = this.getDateOfNextUpdate();
            strategy.appendField(locator, this, "dateOfNextUpdate", buffer, theDateOfNextUpdate);
        }
        {
            TMPeriodDurationPropertyType theUserDefinedMaintenanceFrequency;
            theUserDefinedMaintenanceFrequency = this.getUserDefinedMaintenanceFrequency();
            strategy.appendField(locator, this, "userDefinedMaintenanceFrequency", buffer, theUserDefinedMaintenanceFrequency);
        }
        {
            List<MDScopeCodePropertyType> theUpdateScope;
            theUpdateScope = (this.isSetUpdateScope()?this.getUpdateScope():null);
            strategy.appendField(locator, this, "updateScope", buffer, theUpdateScope);
        }
        {
            List<MDScopeDescriptionPropertyType> theUpdateScopeDescription;
            theUpdateScopeDescription = (this.isSetUpdateScopeDescription()?this.getUpdateScopeDescription():null);
            strategy.appendField(locator, this, "updateScopeDescription", buffer, theUpdateScopeDescription);
        }
        {
            List<CharacterStringPropertyType> theMaintenanceNote;
            theMaintenanceNote = (this.isSetMaintenanceNote()?this.getMaintenanceNote():null);
            strategy.appendField(locator, this, "maintenanceNote", buffer, theMaintenanceNote);
        }
        {
            List<CIResponsiblePartyPropertyType> theContact;
            theContact = (this.isSetContact()?this.getContact():null);
            strategy.appendField(locator, this, "contact", buffer, theContact);
        }
        return buffer;
    }

    public void setUpdateScope(List<MDScopeCodePropertyType> value) {
        this.updateScope = null;
        List<MDScopeCodePropertyType> draftl = this.getUpdateScope();
        draftl.addAll(value);
    }

    public void setUpdateScopeDescription(List<MDScopeDescriptionPropertyType> value) {
        this.updateScopeDescription = null;
        List<MDScopeDescriptionPropertyType> draftl = this.getUpdateScopeDescription();
        draftl.addAll(value);
    }

    public void setMaintenanceNote(List<CharacterStringPropertyType> value) {
        this.maintenanceNote = null;
        List<CharacterStringPropertyType> draftl = this.getMaintenanceNote();
        draftl.addAll(value);
    }

    public void setContact(List<CIResponsiblePartyPropertyType> value) {
        this.contact = null;
        List<CIResponsiblePartyPropertyType> draftl = this.getContact();
        draftl.addAll(value);
    }

}
