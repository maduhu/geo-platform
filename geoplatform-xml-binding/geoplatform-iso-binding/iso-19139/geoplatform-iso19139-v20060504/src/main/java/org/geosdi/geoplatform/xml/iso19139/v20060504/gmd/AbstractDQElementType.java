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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gco.AbstractObjectType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gco.CharacterStringPropertyType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gco.DateTimePropertyType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for AbstractDQ_Element_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractDQ_Element_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="nameOfMeasure" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="measureIdentification" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/>
 *         &lt;element name="measureDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="evaluationMethodType" type="{http://www.isotc211.org/2005/gmd}DQ_EvaluationMethodTypeCode_PropertyType" minOccurs="0"/>
 *         &lt;element name="evaluationMethodDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="evaluationProcedure" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.isotc211.org/2005/gmd}DQ_Result_PropertyType" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDQ_Element_Type", propOrder = {
    "nameOfMeasure",
    "measureIdentification",
    "measureDescription",
    "evaluationMethodType",
    "evaluationMethodDescription",
    "evaluationProcedure",
    "dateTime",
    "result"
})
@XmlSeeAlso({
    AbstractDQThematicAccuracyType.class,
    AbstractDQCompletenessType.class,
    AbstractDQTemporalAccuracyType.class,
    AbstractDQLogicalConsistencyType.class,
    AbstractDQPositionalAccuracyType.class
})
public abstract class AbstractDQElementType
    extends AbstractObjectType
    implements ToString
{

    protected List<CharacterStringPropertyType> nameOfMeasure;
    protected MDIdentifierPropertyType measureIdentification;
    protected CharacterStringPropertyType measureDescription;
    protected DQEvaluationMethodTypeCodePropertyType evaluationMethodType;
    protected CharacterStringPropertyType evaluationMethodDescription;
    protected CICitationPropertyType evaluationProcedure;
    protected List<DateTimePropertyType> dateTime;
    @XmlElement(required = true)
    protected List<DQResultPropertyType> result;

    /**
     * Gets the value of the nameOfMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameOfMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameOfMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getNameOfMeasure() {
        if (nameOfMeasure == null) {
            nameOfMeasure = new ArrayList<CharacterStringPropertyType>();
        }
        return this.nameOfMeasure;
    }

    public boolean isSetNameOfMeasure() {
        return ((this.nameOfMeasure!= null)&&(!this.nameOfMeasure.isEmpty()));
    }

    public void unsetNameOfMeasure() {
        this.nameOfMeasure = null;
    }

    /**
     * Gets the value of the measureIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getMeasureIdentification() {
        return measureIdentification;
    }

    /**
     * Sets the value of the measureIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setMeasureIdentification(MDIdentifierPropertyType value) {
        this.measureIdentification = value;
    }

    public boolean isSetMeasureIdentification() {
        return (this.measureIdentification!= null);
    }

    /**
     * Gets the value of the measureDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMeasureDescription() {
        return measureDescription;
    }

    /**
     * Sets the value of the measureDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMeasureDescription(CharacterStringPropertyType value) {
        this.measureDescription = value;
    }

    public boolean isSetMeasureDescription() {
        return (this.measureDescription!= null);
    }

    /**
     * Gets the value of the evaluationMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link DQEvaluationMethodTypeCodePropertyType }
     *     
     */
    public DQEvaluationMethodTypeCodePropertyType getEvaluationMethodType() {
        return evaluationMethodType;
    }

    /**
     * Sets the value of the evaluationMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DQEvaluationMethodTypeCodePropertyType }
     *     
     */
    public void setEvaluationMethodType(DQEvaluationMethodTypeCodePropertyType value) {
        this.evaluationMethodType = value;
    }

    public boolean isSetEvaluationMethodType() {
        return (this.evaluationMethodType!= null);
    }

    /**
     * Gets the value of the evaluationMethodDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getEvaluationMethodDescription() {
        return evaluationMethodDescription;
    }

    /**
     * Sets the value of the evaluationMethodDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setEvaluationMethodDescription(CharacterStringPropertyType value) {
        this.evaluationMethodDescription = value;
    }

    public boolean isSetEvaluationMethodDescription() {
        return (this.evaluationMethodDescription!= null);
    }

    /**
     * Gets the value of the evaluationProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getEvaluationProcedure() {
        return evaluationProcedure;
    }

    /**
     * Sets the value of the evaluationProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setEvaluationProcedure(CICitationPropertyType value) {
        this.evaluationProcedure = value;
    }

    public boolean isSetEvaluationProcedure() {
        return (this.evaluationProcedure!= null);
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimePropertyType }
     * 
     * 
     */
    public List<DateTimePropertyType> getDateTime() {
        if (dateTime == null) {
            dateTime = new ArrayList<DateTimePropertyType>();
        }
        return this.dateTime;
    }

    public boolean isSetDateTime() {
        return ((this.dateTime!= null)&&(!this.dateTime.isEmpty()));
    }

    public void unsetDateTime() {
        this.dateTime = null;
    }

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DQResultPropertyType }
     * 
     * 
     */
    public List<DQResultPropertyType> getResult() {
        if (result == null) {
            result = new ArrayList<DQResultPropertyType>();
        }
        return this.result;
    }

    public boolean isSetResult() {
        return ((this.result!= null)&&(!this.result.isEmpty()));
    }

    public void unsetResult() {
        this.result = null;
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
            List<CharacterStringPropertyType> theNameOfMeasure;
            theNameOfMeasure = (this.isSetNameOfMeasure()?this.getNameOfMeasure():null);
            strategy.appendField(locator, this, "nameOfMeasure", buffer, theNameOfMeasure);
        }
        {
            MDIdentifierPropertyType theMeasureIdentification;
            theMeasureIdentification = this.getMeasureIdentification();
            strategy.appendField(locator, this, "measureIdentification", buffer, theMeasureIdentification);
        }
        {
            CharacterStringPropertyType theMeasureDescription;
            theMeasureDescription = this.getMeasureDescription();
            strategy.appendField(locator, this, "measureDescription", buffer, theMeasureDescription);
        }
        {
            DQEvaluationMethodTypeCodePropertyType theEvaluationMethodType;
            theEvaluationMethodType = this.getEvaluationMethodType();
            strategy.appendField(locator, this, "evaluationMethodType", buffer, theEvaluationMethodType);
        }
        {
            CharacterStringPropertyType theEvaluationMethodDescription;
            theEvaluationMethodDescription = this.getEvaluationMethodDescription();
            strategy.appendField(locator, this, "evaluationMethodDescription", buffer, theEvaluationMethodDescription);
        }
        {
            CICitationPropertyType theEvaluationProcedure;
            theEvaluationProcedure = this.getEvaluationProcedure();
            strategy.appendField(locator, this, "evaluationProcedure", buffer, theEvaluationProcedure);
        }
        {
            List<DateTimePropertyType> theDateTime;
            theDateTime = (this.isSetDateTime()?this.getDateTime():null);
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime);
        }
        {
            List<DQResultPropertyType> theResult;
            theResult = (this.isSetResult()?this.getResult():null);
            strategy.appendField(locator, this, "result", buffer, theResult);
        }
        return buffer;
    }

    public void setNameOfMeasure(List<CharacterStringPropertyType> value) {
        this.nameOfMeasure = null;
        List<CharacterStringPropertyType> draftl = this.getNameOfMeasure();
        draftl.addAll(value);
    }

    public void setDateTime(List<DateTimePropertyType> value) {
        this.dateTime = null;
        List<DateTimePropertyType> draftl = this.getDateTime();
        draftl.addAll(value);
    }

    public void setResult(List<DQResultPropertyType> value) {
        this.result = null;
        List<DQResultPropertyType> draftl = this.getResult();
        draftl.addAll(value);
    }

}
