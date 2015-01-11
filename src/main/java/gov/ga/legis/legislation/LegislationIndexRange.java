
package gov.ga.legis.legislation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegislationIndexRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegislationIndexRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentType" type="{http://www.legis.ga.gov/2009/01/01/data/}DocumentType" minOccurs="0"/>
 *         &lt;element name="Legislation" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfLegislationIndex" minOccurs="0"/>
 *         &lt;element name="Session" type="{http://www.legis.ga.gov/2009/01/01/data/}Session" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegislationIndexRange", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "documentType",
    "legislation",
    "session"
})
public class LegislationIndexRange {

    @XmlElement(name = "DocumentType")
    @XmlSchemaType(name = "string")
    protected DocumentType documentType;
    @XmlElementRef(name = "Legislation", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLegislationIndex> legislation;
    @XmlElementRef(name = "Session", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<Session> session;

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocumentType(DocumentType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the legislation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLegislationIndex }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLegislationIndex> getLegislation() {
        return legislation;
    }

    /**
     * Sets the value of the legislation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLegislationIndex }{@code >}
     *     
     */
    public void setLegislation(JAXBElement<ArrayOfLegislationIndex> value) {
        this.legislation = value;
    }

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Session }{@code >}
     *     
     */
    public JAXBElement<Session> getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Session }{@code >}
     *     
     */
    public void setSession(JAXBElement<Session> value) {
        this.session = value;
    }

}
