//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.09 at 11:58:13 PM CEST 
//
package org.geosdi.geoplatform.xml.gfc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.CharacterStringPropertyType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

/**
 * Operation that every instance of an associated feature type must implement. -
 * [ocl] - triggeredByValuesOf realizes GF_Operation::triggeredByValuesOf; -
 * observesValuesOf realizes GF_Operation::observesValuesOf; - affectsValuesOf
 * realizes GF_Operation::affectsValuesOf - [/ocl]
 *
 * <p>Java class for FC_FeatureOperation_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="FC_FeatureOperation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gfc}AbstractFC_PropertyType_Type">
 *       &lt;sequence>
 *         &lt;element name="signature" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="formalDefinition" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="triggeredByValuesOf" type="{http://www.isotc211.org/2005/gfc}FC_CarrierOfCharacteristics_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="affectsValuesOf" type="{http://www.isotc211.org/2005/gfc}FC_CarrierOfCharacteristics_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="observesValuesOf" type="{http://www.isotc211.org/2005/gfc}FC_CarrierOfCharacteristics_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FC_FeatureOperation_Type", propOrder = {
    "signature",
    "formalDefinition",
    "triggeredByValuesOf",
    "affectsValuesOf",
    "observesValuesOf"
})
public class FCFeatureOperationType
        extends AbstractFCPropertyTypeType
        implements ToString {

    @XmlElement(required = true)
    protected CharacterStringPropertyType signature;
    protected CharacterStringPropertyType formalDefinition;
    protected List<FCCarrierOfCharacteristicsPropertyType> triggeredByValuesOf;
    protected List<FCCarrierOfCharacteristicsPropertyType> affectsValuesOf;
    protected List<FCCarrierOfCharacteristicsPropertyType> observesValuesOf;

    /**
     * Gets the value of the signature property.
     *
     * @return possible object is {@link CharacterStringPropertyType }
     *
     */
    public CharacterStringPropertyType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     *
     * @param value allowed object is {@link CharacterStringPropertyType }
     *
     */
    public void setSignature(CharacterStringPropertyType value) {
        this.signature = value;
    }

    public boolean isSetSignature() {
        return (this.signature != null);
    }

    /**
     * Gets the value of the formalDefinition property.
     *
     * @return possible object is {@link CharacterStringPropertyType }
     *
     */
    public CharacterStringPropertyType getFormalDefinition() {
        return formalDefinition;
    }

    /**
     * Sets the value of the formalDefinition property.
     *
     * @param value allowed object is {@link CharacterStringPropertyType }
     *
     */
    public void setFormalDefinition(CharacterStringPropertyType value) {
        this.formalDefinition = value;
    }

    public boolean isSetFormalDefinition() {
        return (this.formalDefinition != null);
    }

    /**
     * Gets the value of the triggeredByValuesOf property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the triggeredByValuesOf property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getTriggeredByValuesOf().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link FCCarrierOfCharacteristicsPropertyType }
     *
     *
     */
    public List<FCCarrierOfCharacteristicsPropertyType> getTriggeredByValuesOf() {
        if (triggeredByValuesOf == null) {
            triggeredByValuesOf = new ArrayList<FCCarrierOfCharacteristicsPropertyType>();
        }
        return this.triggeredByValuesOf;
    }

    public boolean isSetTriggeredByValuesOf() {
        return ((this.triggeredByValuesOf != null) && (!this.triggeredByValuesOf.isEmpty()));
    }

    public void unsetTriggeredByValuesOf() {
        this.triggeredByValuesOf = null;
    }

    /**
     * Gets the value of the affectsValuesOf property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the affectsValuesOf property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getAffectsValuesOf().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link FCCarrierOfCharacteristicsPropertyType }
     *
     *
     */
    public List<FCCarrierOfCharacteristicsPropertyType> getAffectsValuesOf() {
        if (affectsValuesOf == null) {
            affectsValuesOf = new ArrayList<FCCarrierOfCharacteristicsPropertyType>();
        }
        return this.affectsValuesOf;
    }

    public boolean isSetAffectsValuesOf() {
        return ((this.affectsValuesOf != null) && (!this.affectsValuesOf.isEmpty()));
    }

    public void unsetAffectsValuesOf() {
        this.affectsValuesOf = null;
    }

    /**
     * Gets the value of the observesValuesOf property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the observesValuesOf property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getObservesValuesOf().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link FCCarrierOfCharacteristicsPropertyType }
     *
     *
     */
    public List<FCCarrierOfCharacteristicsPropertyType> getObservesValuesOf() {
        if (observesValuesOf == null) {
            observesValuesOf = new ArrayList<FCCarrierOfCharacteristicsPropertyType>();
        }
        return this.observesValuesOf;
    }

    public boolean isSetObservesValuesOf() {
        return ((this.observesValuesOf != null) && (!this.observesValuesOf.isEmpty()));
    }

    public void unsetObservesValuesOf() {
        this.observesValuesOf = null;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer,
            ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator,
            StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            CharacterStringPropertyType theSignature;
            theSignature = this.getSignature();
            strategy.appendField(locator, this, "signature", buffer,
                                 theSignature);
        }
        {
            CharacterStringPropertyType theFormalDefinition;
            theFormalDefinition = this.getFormalDefinition();
            strategy.appendField(locator, this, "formalDefinition", buffer,
                                 theFormalDefinition);
        }
        {
            List<FCCarrierOfCharacteristicsPropertyType> theTriggeredByValuesOf;
            theTriggeredByValuesOf = (this.isSetTriggeredByValuesOf() ? this.getTriggeredByValuesOf() : null);
            strategy.appendField(locator, this, "triggeredByValuesOf", buffer,
                                 theTriggeredByValuesOf);
        }
        {
            List<FCCarrierOfCharacteristicsPropertyType> theAffectsValuesOf;
            theAffectsValuesOf = (this.isSetAffectsValuesOf() ? this.getAffectsValuesOf() : null);
            strategy.appendField(locator, this, "affectsValuesOf", buffer,
                                 theAffectsValuesOf);
        }
        {
            List<FCCarrierOfCharacteristicsPropertyType> theObservesValuesOf;
            theObservesValuesOf = (this.isSetObservesValuesOf() ? this.getObservesValuesOf() : null);
            strategy.appendField(locator, this, "observesValuesOf", buffer,
                                 theObservesValuesOf);
        }
        return buffer;
    }

    public void setTriggeredByValuesOf(
            List<FCCarrierOfCharacteristicsPropertyType> value) {
        this.triggeredByValuesOf = null;
        List<FCCarrierOfCharacteristicsPropertyType> draftl = this.getTriggeredByValuesOf();
        draftl.addAll(value);
    }

    public void setAffectsValuesOf(
            List<FCCarrierOfCharacteristicsPropertyType> value) {
        this.affectsValuesOf = null;
        List<FCCarrierOfCharacteristicsPropertyType> draftl = this.getAffectsValuesOf();
        draftl.addAll(value);
    }

    public void setObservesValuesOf(
            List<FCCarrierOfCharacteristicsPropertyType> value) {
        this.observesValuesOf = null;
        List<FCCarrierOfCharacteristicsPropertyType> draftl = this.getObservesValuesOf();
        draftl.addAll(value);
    }
}
