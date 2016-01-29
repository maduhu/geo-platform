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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Includes representations of result set members if maxRecords > 0.
 *          The items must conform to one of the csw:Record views or a 
 *          profile-specific representation. 
 *          
 *          resultSetId  - id of the result set (a URI).
 *          elementSet  - The element set that has been returned
 *                        (i.e., "brief", "summary", "full")
 *          recordSchema  - schema reference for included records(URI)
 *          numberOfRecordsMatched  - number of records matched by the query
 *          numberOfRecordsReturned - number of records returned to client
 *          nextRecord - position of next record in the result set
 *                       (0 if no records remain).
 *          expires - the time instant when the result set expires and 
 *                    is discarded (ISO 8601 format)
 * 
 * <p>Java class for SearchResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/cat/csw/2.0.2}AbstractRecord" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="resultSetId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="elementSet" type="{http://www.opengis.net/cat/csw/2.0.2}ElementSetType" />
 *       &lt;attribute name="recordSchema" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="numberOfRecordsMatched" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="numberOfRecordsReturned" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="nextRecord" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="expires" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResultsType", propOrder = {
    "abstractRecord",
    "any"
})
public class SearchResultsType
    implements ToString
{

    @XmlElementRef(name = "AbstractRecord", namespace = "http://www.opengis.net/cat/csw/2.0.2", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractRecordType>> abstractRecord;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "resultSetId")
    @XmlSchemaType(name = "anyURI")
    protected String resultSetId;
    @XmlAttribute(name = "elementSet")
    protected ElementSetType elementSet;
    @XmlAttribute(name = "recordSchema")
    @XmlSchemaType(name = "anyURI")
    protected String recordSchema;
    @XmlAttribute(name = "numberOfRecordsMatched", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfRecordsMatched;
    @XmlAttribute(name = "numberOfRecordsReturned", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfRecordsReturned;
    @XmlAttribute(name = "nextRecord")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nextRecord;
    @XmlAttribute(name = "expires")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expires;

    /**
     * Gets the value of the abstractRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractRecordType }{@code >}
     * {@link JAXBElement }{@code <}{@link SummaryRecordType }{@code >}
     * {@link JAXBElement }{@code <}{@link BriefRecordType }{@code >}
     * {@link JAXBElement }{@code <}{@link RecordType }{@code >}
     * {@link JAXBElement }{@code <}{@link DCMIRecordType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractRecordType>> getAbstractRecord() {
        if (abstractRecord == null) {
            abstractRecord = new ArrayList<JAXBElement<? extends AbstractRecordType>>();
        }
        return this.abstractRecord;
    }

    public boolean isSetAbstractRecord() {
        return ((this.abstractRecord!= null)&&(!this.abstractRecord.isEmpty()));
    }

    public void unsetAbstractRecord() {
        this.abstractRecord = null;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    public boolean isSetAny() {
        return ((this.any!= null)&&(!this.any.isEmpty()));
    }

    public void unsetAny() {
        this.any = null;
    }

    /**
     * Gets the value of the resultSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultSetId() {
        return resultSetId;
    }

    /**
     * Sets the value of the resultSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultSetId(String value) {
        this.resultSetId = value;
    }

    public boolean isSetResultSetId() {
        return (this.resultSetId!= null);
    }

    /**
     * Gets the value of the elementSet property.
     * 
     * @return
     *     possible object is
     *     {@link ElementSetType }
     *     
     */
    public ElementSetType getElementSet() {
        return elementSet;
    }

    /**
     * Sets the value of the elementSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementSetType }
     *     
     */
    public void setElementSet(ElementSetType value) {
        this.elementSet = value;
    }

    public boolean isSetElementSet() {
        return (this.elementSet!= null);
    }

    /**
     * Gets the value of the recordSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordSchema() {
        return recordSchema;
    }

    /**
     * Sets the value of the recordSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordSchema(String value) {
        this.recordSchema = value;
    }

    public boolean isSetRecordSchema() {
        return (this.recordSchema!= null);
    }

    /**
     * Gets the value of the numberOfRecordsMatched property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRecordsMatched() {
        return numberOfRecordsMatched;
    }

    /**
     * Sets the value of the numberOfRecordsMatched property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRecordsMatched(BigInteger value) {
        this.numberOfRecordsMatched = value;
    }

    public boolean isSetNumberOfRecordsMatched() {
        return (this.numberOfRecordsMatched!= null);
    }

    /**
     * Gets the value of the numberOfRecordsReturned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRecordsReturned() {
        return numberOfRecordsReturned;
    }

    /**
     * Sets the value of the numberOfRecordsReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRecordsReturned(BigInteger value) {
        this.numberOfRecordsReturned = value;
    }

    public boolean isSetNumberOfRecordsReturned() {
        return (this.numberOfRecordsReturned!= null);
    }

    /**
     * Gets the value of the nextRecord property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNextRecord() {
        return nextRecord;
    }

    /**
     * Sets the value of the nextRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNextRecord(BigInteger value) {
        this.nextRecord = value;
    }

    public boolean isSetNextRecord() {
        return (this.nextRecord!= null);
    }

    /**
     * Gets the value of the expires property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpires(XMLGregorianCalendar value) {
        this.expires = value;
    }

    public boolean isSetExpires() {
        return (this.expires!= null);
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
            List<JAXBElement<? extends AbstractRecordType>> theAbstractRecord;
            theAbstractRecord = (this.isSetAbstractRecord()?this.getAbstractRecord():null);
            strategy.appendField(locator, this, "abstractRecord", buffer, theAbstractRecord);
        }
        {
            List<Object> theAny;
            theAny = (this.isSetAny()?this.getAny():null);
            strategy.appendField(locator, this, "any", buffer, theAny);
        }
        {
            String theResultSetId;
            theResultSetId = this.getResultSetId();
            strategy.appendField(locator, this, "resultSetId", buffer, theResultSetId);
        }
        {
            ElementSetType theElementSet;
            theElementSet = this.getElementSet();
            strategy.appendField(locator, this, "elementSet", buffer, theElementSet);
        }
        {
            String theRecordSchema;
            theRecordSchema = this.getRecordSchema();
            strategy.appendField(locator, this, "recordSchema", buffer, theRecordSchema);
        }
        {
            BigInteger theNumberOfRecordsMatched;
            theNumberOfRecordsMatched = this.getNumberOfRecordsMatched();
            strategy.appendField(locator, this, "numberOfRecordsMatched", buffer, theNumberOfRecordsMatched);
        }
        {
            BigInteger theNumberOfRecordsReturned;
            theNumberOfRecordsReturned = this.getNumberOfRecordsReturned();
            strategy.appendField(locator, this, "numberOfRecordsReturned", buffer, theNumberOfRecordsReturned);
        }
        {
            BigInteger theNextRecord;
            theNextRecord = this.getNextRecord();
            strategy.appendField(locator, this, "nextRecord", buffer, theNextRecord);
        }
        {
            XMLGregorianCalendar theExpires;
            theExpires = this.getExpires();
            strategy.appendField(locator, this, "expires", buffer, theExpires);
        }
        return buffer;
    }

    public void setAbstractRecord(List<JAXBElement<? extends AbstractRecordType>> value) {
        this.abstractRecord = null;
        List<JAXBElement<? extends AbstractRecordType>> draftl = this.getAbstractRecord();
        draftl.addAll(value);
    }

    public void setAny(List<Object> value) {
        this.any = null;
        List<Object> draftl = this.getAny();
        draftl.addAll(value);
    }

}
