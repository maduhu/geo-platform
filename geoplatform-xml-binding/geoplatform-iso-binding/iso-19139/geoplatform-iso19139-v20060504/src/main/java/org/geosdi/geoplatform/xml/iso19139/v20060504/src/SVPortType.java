//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.17 at 04:41:23 PM CEST 
//


package org.geosdi.geoplatform.xml.iso19139.v20060504.src;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gco.AbstractObjectType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for SV_Port_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SV_Port_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="theSV_Interface" type="{http://www.isotc211.org/2005/srv}SV_Interface_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SV_Port_Type", propOrder = {
    "theSVInterface"
})
public class SVPortType
    extends AbstractObjectType
    implements ToString
{

    @XmlElement(name = "theSV_Interface")
    protected List<SVInterfacePropertyType> theSVInterface;

    /**
     * Gets the value of the theSVInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theSVInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheSVInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SVInterfacePropertyType }
     * 
     * 
     */
    public List<SVInterfacePropertyType> getTheSVInterface() {
        if (theSVInterface == null) {
            theSVInterface = new ArrayList<SVInterfacePropertyType>();
        }
        return this.theSVInterface;
    }

    public boolean isSetTheSVInterface() {
        return ((this.theSVInterface!= null)&&(!this.theSVInterface.isEmpty()));
    }

    public void unsetTheSVInterface() {
        this.theSVInterface = null;
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
            List<SVInterfacePropertyType> theTheSVInterface;
            theTheSVInterface = (this.isSetTheSVInterface()?this.getTheSVInterface():null);
            strategy.appendField(locator, this, "theSVInterface", buffer, theTheSVInterface);
        }
        return buffer;
    }

    public void setTheSVInterface(List<SVInterfacePropertyType> value) {
        this.theSVInterface = null;
        List<SVInterfacePropertyType> draftl = this.getTheSVInterface();
        draftl.addAll(value);
    }

}
