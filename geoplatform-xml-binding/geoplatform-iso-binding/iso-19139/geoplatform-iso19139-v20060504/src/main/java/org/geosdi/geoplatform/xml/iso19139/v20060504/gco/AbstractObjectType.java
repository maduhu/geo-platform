//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.17 at 04:41:23 PM CEST 
//


package org.geosdi.geoplatform.xml.iso19139.v20060504.gco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.AbstractDQElementType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.AbstractDQResultType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.AbstractDSAggregateType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.AbstractEXGeographicExtentType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.AbstractMDContentInformationType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.AbstractMDIdentificationType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.AbstractMDSpatialRepresentationType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.AbstractRSReferenceSystemType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.CIAddressType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.CICitationType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.CIContactType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.CIDateType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.CIOnlineResourceType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.CIResponsiblePartyType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.CISeriesType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.CITelephoneType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.DQDataQualityType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.DQScopeType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.DSAssociationType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.DSDataSetType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.EXExtentType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.EXTemporalExtentType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.EXVerticalExtentType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.LILineageType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.LIProcessStepType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.LISourceType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDAggregateInformationType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDApplicationSchemaInformationType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDBrowseGraphicType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDConstraintsType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDDigitalTransferOptionsType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDDimensionType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDDistributionType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDDistributorType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDExtendedElementInformationType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDFormatType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDGeometricObjectsType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDIdentifierType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDKeywordsType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDMaintenanceInformationType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDMediumType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDMetadataExtensionInformationType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDMetadataType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDPortrayalCatalogueReferenceType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDRangeDimensionType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDReferenceSystemType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDRepresentativeFractionType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDStandardOrderProcessType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.MDUsageType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.PTFreeTextType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.PTLocaleType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmx.AbstractCTCatalogueType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmx.AbstractMXFileType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.src.SVCoupledResourceType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.src.SVInterfaceType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.src.SVOperationChainMetadataType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.src.SVOperationChainType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.src.SVOperationMetadataType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.src.SVOperationType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.src.SVParameterType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.src.SVPortSpecificationType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.src.SVPortType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.src.SVServiceSpecificationType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.src.SVServiceType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.src.SVServiceTypeType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for AbstractObject_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractObject_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.isotc211.org/2005/gco}ObjectIdentification"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractObject_Type")
@XmlSeeAlso({
    TypeNameType.class,
    MultiplicityType.class,
    MultiplicityRangeType.class,
    MemberNameType.class,
    DQDataQualityType.class,
    MDBrowseGraphicType.class,
    MDDimensionType.class,
    MDUsageType.class,
    MDIdentifierType.class,
    MDMediumType.class,
    MDExtendedElementInformationType.class,
    CIOnlineResourceType.class,
    DSAssociationType.class,
    MDStandardOrderProcessType.class,
    MDDistributorType.class,
    EXVerticalExtentType.class,
    CISeriesType.class,
    MDKeywordsType.class,
    PTLocaleType.class,
    MDMaintenanceInformationType.class,
    MDDistributionType.class,
    CIResponsiblePartyType.class,
    MDConstraintsType.class,
    CIAddressType.class,
    LIProcessStepType.class,
    AbstractRSReferenceSystemType.class,
    EXExtentType.class,
    AbstractMDContentInformationType.class,
    MDFormatType.class,
    CICitationType.class,
    LISourceType.class,
    PTFreeTextType.class,
    LILineageType.class,
    MDRepresentativeFractionType.class,
    MDMetadataType.class,
    MDMetadataExtensionInformationType.class,
    MDApplicationSchemaInformationType.class,
    DQScopeType.class,
    MDReferenceSystemType.class,
    MDRangeDimensionType.class,
    EXTemporalExtentType.class,
    AbstractEXGeographicExtentType.class,
    CITelephoneType.class,
    MDPortrayalCatalogueReferenceType.class,
    MDDigitalTransferOptionsType.class,
    AbstractDQResultType.class,
    AbstractMDSpatialRepresentationType.class,
    MDGeometricObjectsType.class,
    MDAggregateInformationType.class,
    CIDateType.class,
    AbstractDQElementType.class,
    CIContactType.class,
    SVParameterType.class,
    SVServiceSpecificationType.class,
    SVPortType.class,
    SVInterfaceType.class,
    AbstractMDIdentificationType.class,
    SVServiceType.class,
    SVOperationChainMetadataType.class,
    SVOperationChainType.class,
    SVPortSpecificationType.class,
    SVCoupledResourceType.class,
    SVOperationType.class,
    SVOperationMetadataType.class,
    SVServiceTypeType.class,
    DSDataSetType.class,
    AbstractDSAggregateType.class,
    AbstractMXFileType.class,
    AbstractCTCatalogueType.class
})
public abstract class AbstractObjectType implements ToString
{

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    public boolean isSetUuid() {
        return (this.uuid!= null);
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
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theUuid;
            theUuid = this.getUuid();
            strategy.appendField(locator, this, "uuid", buffer, theUuid);
        }
        return buffer;
    }

}
