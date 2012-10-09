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
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.CharacterStringPropertyType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.TypeNamePropertyType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.UnitOfMeasurePropertyType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

/**
 * Characteristic of a feature type.
 *
 * <p>Java class for FC_FeatureAttribute_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="FC_FeatureAttribute_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gfc}AbstractFC_PropertyType_Type">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="valueMeasurementUnit" type="{http://www.isotc211.org/2005/gco}UnitOfMeasure_PropertyType" minOccurs="0"/>
 *         &lt;element name="valueType" type="{http://www.isotc211.org/2005/gco}TypeName_PropertyType" minOccurs="0"/>
 *         &lt;element name="listedValue" type="{http://www.isotc211.org/2005/gfc}FC_ListedValue_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FC_FeatureAttribute_Type", propOrder = {
    "code",
    "valueMeasurementUnit",
    "valueType",
    "listedValue"
})
public class FCFeatureAttributeType
        extends AbstractFCPropertyTypeType
        implements ToString {

    protected CharacterStringPropertyType code;
    protected UnitOfMeasurePropertyType valueMeasurementUnit;
    protected TypeNamePropertyType valueType;
    protected List<FCListedValuePropertyType> listedValue;

    /**
     * Gets the value of the code property.
     *
     * @return possible object is {@link CharacterStringPropertyType }
     *
     */
    public CharacterStringPropertyType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value allowed object is {@link CharacterStringPropertyType }
     *
     */
    public void setCode(CharacterStringPropertyType value) {
        this.code = value;
    }

    public boolean isSetCode() {
        return (this.code != null);
    }

    /**
     * Gets the value of the valueMeasurementUnit property.
     *
     * @return possible object is {@link UnitOfMeasurePropertyType }
     *
     */
    public UnitOfMeasurePropertyType getValueMeasurementUnit() {
        return valueMeasurementUnit;
    }

    /**
     * Sets the value of the valueMeasurementUnit property.
     *
     * @param value allowed object is {@link UnitOfMeasurePropertyType }
     *
     */
    public void setValueMeasurementUnit(UnitOfMeasurePropertyType value) {
        this.valueMeasurementUnit = value;
    }

    public boolean isSetValueMeasurementUnit() {
        return (this.valueMeasurementUnit != null);
    }

    /**
     * Gets the value of the valueType property.
     *
     * @return possible object is {@link TypeNamePropertyType }
     *
     */
    public TypeNamePropertyType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     *
     * @param value allowed object is {@link TypeNamePropertyType }
     *
     */
    public void setValueType(TypeNamePropertyType value) {
        this.valueType = value;
    }

    public boolean isSetValueType() {
        return (this.valueType != null);
    }

    /**
     * Gets the value of the listedValue property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the listedValue property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getListedValue().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link FCListedValuePropertyType }
     *
     *
     */
    public List<FCListedValuePropertyType> getListedValue() {
        if (listedValue == null) {
            listedValue = new ArrayList<FCListedValuePropertyType>();
        }
        return this.listedValue;
    }

    public boolean isSetListedValue() {
        return ((this.listedValue != null) && (!this.listedValue.isEmpty()));
    }

    public void unsetListedValue() {
        this.listedValue = null;
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
            CharacterStringPropertyType theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            UnitOfMeasurePropertyType theValueMeasurementUnit;
            theValueMeasurementUnit = this.getValueMeasurementUnit();
            strategy.appendField(locator, this, "valueMeasurementUnit", buffer,
                                 theValueMeasurementUnit);
        }
        {
            TypeNamePropertyType theValueType;
            theValueType = this.getValueType();
            strategy.appendField(locator, this, "valueType", buffer,
                                 theValueType);
        }
        {
            List<FCListedValuePropertyType> theListedValue;
            theListedValue = (this.isSetListedValue() ? this.getListedValue() : null);
            strategy.appendField(locator, this, "listedValue", buffer,
                                 theListedValue);
        }
        return buffer;
    }

    public void setListedValue(List<FCListedValuePropertyType> value) {
        this.listedValue = null;
        List<FCListedValuePropertyType> draftl = this.getListedValue();
        draftl.addAll(value);
    }
}
