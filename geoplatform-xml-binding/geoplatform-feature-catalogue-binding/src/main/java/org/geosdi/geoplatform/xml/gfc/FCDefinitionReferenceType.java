//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.09 at 11:58:13 PM CEST 
//
package org.geosdi.geoplatform.xml.gfc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.AbstractObjectType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.CharacterStringPropertyType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

/**
 * Class that links a data instance to the source of its definition.
 *
 * <p>Java class for FC_DefinitionReference_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="FC_DefinitionReference_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="sourceIdentifier" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="definitionSource" type="{http://www.isotc211.org/2005/gfc}FC_DefinitionSource_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FC_DefinitionReference_Type", propOrder = {
    "sourceIdentifier",
    "definitionSource"
})
public class FCDefinitionReferenceType
        extends AbstractObjectType
        implements ToString {

    protected CharacterStringPropertyType sourceIdentifier;
    @XmlElement(required = true)
    protected FCDefinitionSourcePropertyType definitionSource;

    /**
     * Gets the value of the sourceIdentifier property.
     *
     * @return possible object is {@link CharacterStringPropertyType }
     *
     */
    public CharacterStringPropertyType getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * Sets the value of the sourceIdentifier property.
     *
     * @param value allowed object is {@link CharacterStringPropertyType }
     *
     */
    public void setSourceIdentifier(CharacterStringPropertyType value) {
        this.sourceIdentifier = value;
    }

    public boolean isSetSourceIdentifier() {
        return (this.sourceIdentifier != null);
    }

    /**
     * Gets the value of the definitionSource property.
     *
     * @return possible object is {@link FCDefinitionSourcePropertyType }
     *
     */
    public FCDefinitionSourcePropertyType getDefinitionSource() {
        return definitionSource;
    }

    /**
     * Sets the value of the definitionSource property.
     *
     * @param value allowed object is {@link FCDefinitionSourcePropertyType }
     *
     */
    public void setDefinitionSource(FCDefinitionSourcePropertyType value) {
        this.definitionSource = value;
    }

    public boolean isSetDefinitionSource() {
        return (this.definitionSource != null);
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
            CharacterStringPropertyType theSourceIdentifier;
            theSourceIdentifier = this.getSourceIdentifier();
            strategy.appendField(locator, this, "sourceIdentifier", buffer,
                                 theSourceIdentifier);
        }
        {
            FCDefinitionSourcePropertyType theDefinitionSource;
            theDefinitionSource = this.getDefinitionSource();
            strategy.appendField(locator, this, "definitionSource", buffer,
                                 theDefinitionSource);
        }
        return buffer;
    }
}
