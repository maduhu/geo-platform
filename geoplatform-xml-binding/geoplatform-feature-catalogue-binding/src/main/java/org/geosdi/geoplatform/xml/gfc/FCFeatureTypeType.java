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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.AbstractObjectType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.BooleanPropertyType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.CharacterStringPropertyType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.LocalNamePropertyType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

/**
 * Class of real world phenomena with common properties - - [ocl] - typeName
 * realizes GF_FeatureType::typeName; - isAbstract realizes
 * GF_FeatureType::isAbstract; - constrainedBy realizes
 * GF_FeatureType::constrainedBy - [/ocl]
 *
 * <p>Java class for FC_FeatureType_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="FC_FeatureType_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="typeName" type="{http://www.isotc211.org/2005/gco}LocalName_PropertyType"/>
 *         &lt;element name="definition" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="isAbstract" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *         &lt;element name="aliases" type="{http://www.isotc211.org/2005/gco}LocalName_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inheritsFrom" type="{http://www.isotc211.org/2005/gfc}FC_InheritanceRelation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inheritsTo" type="{http://www.isotc211.org/2005/gfc}FC_InheritanceRelation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="featureCatalogue" type="{http://www.isotc211.org/2005/gfc}FC_FeatureCatalogue_PropertyType"/>
 *         &lt;element name="constrainedBy" type="{http://www.isotc211.org/2005/gfc}FC_Constraint_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="definitionReference" type="{http://www.isotc211.org/2005/gfc}FC_DefinitionReference_PropertyType" minOccurs="0"/>
 *         &lt;element name="carrierOfCharacteristics" type="{http://www.isotc211.org/2005/gfc}FC_CarrierOfCharacteristics_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FC_FeatureType_Type", propOrder = {
    "typeName",
    "definition",
    "code",
    "isAbstract",
    "aliases",
    "inheritsFrom",
    "inheritsTo",
    "featureCatalogue",
    "constrainedBy",
    "definitionReference",
    "carrierOfCharacteristics"
})
@XmlSeeAlso({
    FCFeatureAssociationType.class
})
public class FCFeatureTypeType
        extends AbstractObjectType
        implements ToString {

    @XmlElement(required = true)
    protected LocalNamePropertyType typeName;
    protected CharacterStringPropertyType definition;
    protected CharacterStringPropertyType code;
    @XmlElement(required = true)
    protected BooleanPropertyType isAbstract;
    protected List<LocalNamePropertyType> aliases;
    protected List<FCInheritanceRelationPropertyType> inheritsFrom;
    protected List<FCInheritanceRelationPropertyType> inheritsTo;
    @XmlElement(required = true)
    protected FCFeatureCataloguePropertyType featureCatalogue;
    protected List<FCConstraintPropertyType> constrainedBy;
    protected FCDefinitionReferencePropertyType definitionReference;
    protected List<FCCarrierOfCharacteristicsPropertyType> carrierOfCharacteristics;

    /**
     * Gets the value of the typeName property.
     *
     * @return possible object is {@link LocalNamePropertyType }
     *
     */
    public LocalNamePropertyType getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     *
     * @param value allowed object is {@link LocalNamePropertyType }
     *
     */
    public void setTypeName(LocalNamePropertyType value) {
        this.typeName = value;
    }

    public boolean isSetTypeName() {
        return (this.typeName != null);
    }

    /**
     * Gets the value of the definition property.
     *
     * @return possible object is {@link CharacterStringPropertyType }
     *
     */
    public CharacterStringPropertyType getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     *
     * @param value allowed object is {@link CharacterStringPropertyType }
     *
     */
    public void setDefinition(CharacterStringPropertyType value) {
        this.definition = value;
    }

    public boolean isSetDefinition() {
        return (this.definition != null);
    }

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
     * Gets the value of the isAbstract property.
     *
     * @return possible object is {@link BooleanPropertyType }
     *
     */
    public BooleanPropertyType getIsAbstract() {
        return isAbstract;
    }

    /**
     * Sets the value of the isAbstract property.
     *
     * @param value allowed object is {@link BooleanPropertyType }
     *
     */
    public void setIsAbstract(BooleanPropertyType value) {
        this.isAbstract = value;
    }

    public boolean isSetIsAbstract() {
        return (this.isAbstract != null);
    }

    /**
     * Gets the value of the aliases property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the aliases property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getAliases().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link LocalNamePropertyType }
     *
     *
     */
    public List<LocalNamePropertyType> getAliases() {
        if (aliases == null) {
            aliases = new ArrayList<LocalNamePropertyType>();
        }
        return this.aliases;
    }

    public boolean isSetAliases() {
        return ((this.aliases != null) && (!this.aliases.isEmpty()));
    }

    public void unsetAliases() {
        this.aliases = null;
    }

    /**
     * Gets the value of the inheritsFrom property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the inheritsFrom property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getInheritsFrom().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link FCInheritanceRelationPropertyType }
     *
     *
     */
    public List<FCInheritanceRelationPropertyType> getInheritsFrom() {
        if (inheritsFrom == null) {
            inheritsFrom = new ArrayList<FCInheritanceRelationPropertyType>();
        }
        return this.inheritsFrom;
    }

    public boolean isSetInheritsFrom() {
        return ((this.inheritsFrom != null) && (!this.inheritsFrom.isEmpty()));
    }

    public void unsetInheritsFrom() {
        this.inheritsFrom = null;
    }

    /**
     * Gets the value of the inheritsTo property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the inheritsTo property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getInheritsTo().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link FCInheritanceRelationPropertyType }
     *
     *
     */
    public List<FCInheritanceRelationPropertyType> getInheritsTo() {
        if (inheritsTo == null) {
            inheritsTo = new ArrayList<FCInheritanceRelationPropertyType>();
        }
        return this.inheritsTo;
    }

    public boolean isSetInheritsTo() {
        return ((this.inheritsTo != null) && (!this.inheritsTo.isEmpty()));
    }

    public void unsetInheritsTo() {
        this.inheritsTo = null;
    }

    /**
     * Gets the value of the featureCatalogue property.
     *
     * @return possible object is {@link FCFeatureCataloguePropertyType }
     *
     */
    public FCFeatureCataloguePropertyType getFeatureCatalogue() {
        return featureCatalogue;
    }

    /**
     * Sets the value of the featureCatalogue property.
     *
     * @param value allowed object is {@link FCFeatureCataloguePropertyType }
     *
     */
    public void setFeatureCatalogue(FCFeatureCataloguePropertyType value) {
        this.featureCatalogue = value;
    }

    public boolean isSetFeatureCatalogue() {
        return (this.featureCatalogue != null);
    }

    /**
     * Gets the value of the constrainedBy property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the constrainedBy property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getConstrainedBy().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link FCConstraintPropertyType }
     *
     *
     */
    public List<FCConstraintPropertyType> getConstrainedBy() {
        if (constrainedBy == null) {
            constrainedBy = new ArrayList<FCConstraintPropertyType>();
        }
        return this.constrainedBy;
    }

    public boolean isSetConstrainedBy() {
        return ((this.constrainedBy != null) && (!this.constrainedBy.isEmpty()));
    }

    public void unsetConstrainedBy() {
        this.constrainedBy = null;
    }

    /**
     * Gets the value of the definitionReference property.
     *
     * @return possible object is {@link FCDefinitionReferencePropertyType }
     *
     */
    public FCDefinitionReferencePropertyType getDefinitionReference() {
        return definitionReference;
    }

    /**
     * Sets the value of the definitionReference property.
     *
     * @param value allowed object is {@link FCDefinitionReferencePropertyType }
     *
     */
    public void setDefinitionReference(FCDefinitionReferencePropertyType value) {
        this.definitionReference = value;
    }

    public boolean isSetDefinitionReference() {
        return (this.definitionReference != null);
    }

    /**
     * Gets the value of the carrierOfCharacteristics property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the carrierOfCharacteristics property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierOfCharacteristics().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link FCCarrierOfCharacteristicsPropertyType }
     *
     *
     */
    public List<FCCarrierOfCharacteristicsPropertyType> getCarrierOfCharacteristics() {
        if (carrierOfCharacteristics == null) {
            carrierOfCharacteristics = new ArrayList<FCCarrierOfCharacteristicsPropertyType>();
        }
        return this.carrierOfCharacteristics;
    }

    public boolean isSetCarrierOfCharacteristics() {
        return ((this.carrierOfCharacteristics != null) && (!this.carrierOfCharacteristics.isEmpty()));
    }

    public void unsetCarrierOfCharacteristics() {
        this.carrierOfCharacteristics = null;
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
            LocalNamePropertyType theTypeName;
            theTypeName = this.getTypeName();
            strategy.appendField(locator, this, "typeName", buffer, theTypeName);
        }
        {
            CharacterStringPropertyType theDefinition;
            theDefinition = this.getDefinition();
            strategy.appendField(locator, this, "definition", buffer,
                                 theDefinition);
        }
        {
            CharacterStringPropertyType theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            BooleanPropertyType theIsAbstract;
            theIsAbstract = this.getIsAbstract();
            strategy.appendField(locator, this, "isAbstract", buffer,
                                 theIsAbstract);
        }
        {
            List<LocalNamePropertyType> theAliases;
            theAliases = (this.isSetAliases() ? this.getAliases() : null);
            strategy.appendField(locator, this, "aliases", buffer, theAliases);
        }
        {
            List<FCInheritanceRelationPropertyType> theInheritsFrom;
            theInheritsFrom = (this.isSetInheritsFrom() ? this.getInheritsFrom() : null);
            strategy.appendField(locator, this, "inheritsFrom", buffer,
                                 theInheritsFrom);
        }
        {
            List<FCInheritanceRelationPropertyType> theInheritsTo;
            theInheritsTo = (this.isSetInheritsTo() ? this.getInheritsTo() : null);
            strategy.appendField(locator, this, "inheritsTo", buffer,
                                 theInheritsTo);
        }
        {
            FCFeatureCataloguePropertyType theFeatureCatalogue;
            theFeatureCatalogue = this.getFeatureCatalogue();
            strategy.appendField(locator, this, "featureCatalogue", buffer,
                                 theFeatureCatalogue);
        }
        {
            List<FCConstraintPropertyType> theConstrainedBy;
            theConstrainedBy = (this.isSetConstrainedBy() ? this.getConstrainedBy() : null);
            strategy.appendField(locator, this, "constrainedBy", buffer,
                                 theConstrainedBy);
        }
        {
            FCDefinitionReferencePropertyType theDefinitionReference;
            theDefinitionReference = this.getDefinitionReference();
            strategy.appendField(locator, this, "definitionReference", buffer,
                                 theDefinitionReference);
        }
        {
            List<FCCarrierOfCharacteristicsPropertyType> theCarrierOfCharacteristics;
            theCarrierOfCharacteristics = (this.isSetCarrierOfCharacteristics() ? this.getCarrierOfCharacteristics() : null);
            strategy.appendField(locator, this, "carrierOfCharacteristics",
                                 buffer, theCarrierOfCharacteristics);
        }
        return buffer;
    }

    public void setAliases(List<LocalNamePropertyType> value) {
        this.aliases = null;
        List<LocalNamePropertyType> draftl = this.getAliases();
        draftl.addAll(value);
    }

    public void setInheritsFrom(List<FCInheritanceRelationPropertyType> value) {
        this.inheritsFrom = null;
        List<FCInheritanceRelationPropertyType> draftl = this.getInheritsFrom();
        draftl.addAll(value);
    }

    public void setInheritsTo(List<FCInheritanceRelationPropertyType> value) {
        this.inheritsTo = null;
        List<FCInheritanceRelationPropertyType> draftl = this.getInheritsTo();
        draftl.addAll(value);
    }

    public void setConstrainedBy(List<FCConstraintPropertyType> value) {
        this.constrainedBy = null;
        List<FCConstraintPropertyType> draftl = this.getConstrainedBy();
        draftl.addAll(value);
    }

    public void setCarrierOfCharacteristics(
            List<FCCarrierOfCharacteristicsPropertyType> value) {
        this.carrierOfCharacteristics = null;
        List<FCCarrierOfCharacteristicsPropertyType> draftl = this.getCarrierOfCharacteristics();
        draftl.addAll(value);
    }
}
