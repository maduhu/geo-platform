//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.06.18 alle 12:52:42 AM CEST 
//


package org.geosdi.geoplatform.xml.gml.v320;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom;
import org.jvnet.jaxb2_commons.lang.MergeStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Classe Java per SurfaceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSurfaceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}patches"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceType", propOrder = {
    "patches"
})
@XmlSeeAlso({
    PolyhedralSurfaceType.class,
    TriangulatedSurfaceType.class
})
public class SurfaceType
    extends AbstractSurfaceType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElementRef(name = "patches", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected JAXBElement<? extends SurfacePatchArrayPropertyType> patches;

    /**
     * Recupera il valore della proprietà patches.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrianglePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonPatchArrayPropertyType }{@code >}
     *     
     */
    public JAXBElement<? extends SurfacePatchArrayPropertyType> getPatches() {
        return patches;
    }

    /**
     * Imposta il valore della proprietà patches.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrianglePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonPatchArrayPropertyType }{@code >}
     *     
     */
    public void setPatches(JAXBElement<? extends SurfacePatchArrayPropertyType> value) {
        this.patches = value;
    }

    public boolean isSetPatches() {
        return (this.patches!= null);
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
            JAXBElement<? extends SurfacePatchArrayPropertyType> thePatches;
            thePatches = this.getPatches();
            strategy.appendField(locator, this, "patches", buffer, thePatches);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SurfaceType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SurfaceType that = ((SurfaceType) object);
        {
            JAXBElement<? extends SurfacePatchArrayPropertyType> lhsPatches;
            lhsPatches = this.getPatches();
            JAXBElement<? extends SurfacePatchArrayPropertyType> rhsPatches;
            rhsPatches = that.getPatches();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "patches", lhsPatches), LocatorUtils.property(thatLocator, "patches", rhsPatches), lhsPatches, rhsPatches)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            JAXBElement<? extends SurfacePatchArrayPropertyType> thePatches;
            thePatches = this.getPatches();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "patches", thePatches), currentHashCode, thePatches);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof SurfaceType) {
            final SurfaceType copy = ((SurfaceType) draftCopy);
            if (this.isSetPatches()) {
                JAXBElement<? extends SurfacePatchArrayPropertyType> sourcePatches;
                sourcePatches = this.getPatches();
                @SuppressWarnings("unchecked")
                JAXBElement<? extends SurfacePatchArrayPropertyType> copyPatches = ((JAXBElement<? extends SurfacePatchArrayPropertyType> ) strategy.copy(LocatorUtils.property(locator, "patches", sourcePatches), sourcePatches));
                copy.setPatches(copyPatches);
            } else {
                copy.patches = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SurfaceType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof SurfaceType) {
            final SurfaceType target = this;
            final SurfaceType leftObject = ((SurfaceType) left);
            final SurfaceType rightObject = ((SurfaceType) right);
            {
                JAXBElement<? extends SurfacePatchArrayPropertyType> lhsPatches;
                lhsPatches = leftObject.getPatches();
                JAXBElement<? extends SurfacePatchArrayPropertyType> rhsPatches;
                rhsPatches = rightObject.getPatches();
                target.setPatches(((JAXBElement<? extends SurfacePatchArrayPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "patches", lhsPatches), LocatorUtils.property(rightLocator, "patches", rhsPatches), lhsPatches, rhsPatches)));
            }
        }
    }

    public SurfaceType withPatches(JAXBElement<? extends SurfacePatchArrayPropertyType> value) {
        setPatches(value);
        return this;
    }

    @Override
    public SurfaceType withSrsName(String value) {
        setSrsName(value);
        return this;
    }

    @Override
    public SurfaceType withSrsDimension(BigInteger value) {
        setSrsDimension(value);
        return this;
    }

    @Override
    public SurfaceType withAxisLabels(String... values) {
        if (values!= null) {
            for (String value: values) {
                getAxisLabels().add(value);
            }
        }
        return this;
    }

    @Override
    public SurfaceType withAxisLabels(Collection<String> values) {
        if (values!= null) {
            getAxisLabels().addAll(values);
        }
        return this;
    }

    @Override
    public SurfaceType withUomLabels(String... values) {
        if (values!= null) {
            for (String value: values) {
                getUomLabels().add(value);
            }
        }
        return this;
    }

    @Override
    public SurfaceType withUomLabels(Collection<String> values) {
        if (values!= null) {
            getUomLabels().addAll(values);
        }
        return this;
    }

    @Override
    public SurfaceType withAxisLabels(List<String> value) {
        setAxisLabels(value);
        return this;
    }

    @Override
    public SurfaceType withUomLabels(List<String> value) {
        setUomLabels(value);
        return this;
    }

    @Override
    public SurfaceType withMetaDataProperty(MetaDataPropertyType... values) {
        if (values!= null) {
            for (MetaDataPropertyType value: values) {
                getMetaDataProperty().add(value);
            }
        }
        return this;
    }

    @Override
    public SurfaceType withMetaDataProperty(Collection<MetaDataPropertyType> values) {
        if (values!= null) {
            getMetaDataProperty().addAll(values);
        }
        return this;
    }

    @Override
    public SurfaceType withDescription(StringOrRefType value) {
        setDescription(value);
        return this;
    }

    @Override
    public SurfaceType withDescriptionReference(ReferenceType value) {
        setDescriptionReference(value);
        return this;
    }

    @Override
    public SurfaceType withIdentifier(CodeWithAuthorityType value) {
        setIdentifier(value);
        return this;
    }

    @Override
    public SurfaceType withName(CodeType... values) {
        if (values!= null) {
            for (CodeType value: values) {
                getName().add(value);
            }
        }
        return this;
    }

    @Override
    public SurfaceType withName(Collection<CodeType> values) {
        if (values!= null) {
            getName().addAll(values);
        }
        return this;
    }

    @Override
    public SurfaceType withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public SurfaceType withMetaDataProperty(List<MetaDataPropertyType> value) {
        setMetaDataProperty(value);
        return this;
    }

    @Override
    public SurfaceType withName(List<CodeType> value) {
        setName(value);
        return this;
    }

}