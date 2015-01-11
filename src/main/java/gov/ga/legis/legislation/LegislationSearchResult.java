
package gov.ga.legis.legislation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegislationSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegislationSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActVetoNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Authors" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfSponsorship" minOccurs="0"/>
 *         &lt;element name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://www.legis.ga.gov/2009/01/01/data/}DocumentType" minOccurs="0"/>
 *         &lt;element name="HouseCommittee" type="{http://www.legis.ga.gov/2009/01/01/data/}CommitteeListing" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SenateCommittee" type="{http://www.legis.ga.gov/2009/01/01/data/}CommitteeListing" minOccurs="0"/>
 *         &lt;element name="Session" type="{http://www.legis.ga.gov/2009/01/01/data/}Session" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.legis.ga.gov/2009/01/01/data/}StatusListing" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegislationSearchResult", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "actVetoNumber",
    "authors",
    "caption",
    "documentType",
    "houseCommittee",
    "id",
    "number",
    "senateCommittee",
    "session",
    "status",
    "suffix"
})
public class LegislationSearchResult {

    @XmlElementRef(name = "ActVetoNumber", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actVetoNumber;
    @XmlElementRef(name = "Authors", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSponsorship> authors;
    @XmlElementRef(name = "Caption", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caption;
    @XmlElement(name = "DocumentType")
    @XmlSchemaType(name = "string")
    protected DocumentType documentType;
    @XmlElementRef(name = "HouseCommittee", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<CommitteeListing> houseCommittee;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "Number")
    protected Integer number;
    @XmlElementRef(name = "SenateCommittee", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<CommitteeListing> senateCommittee;
    @XmlElementRef(name = "Session", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<Session> session;
    @XmlElementRef(name = "Status", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<StatusListing> status;
    @XmlElementRef(name = "Suffix", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suffix;

    /**
     * Gets the value of the actVetoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActVetoNumber() {
        return actVetoNumber;
    }

    /**
     * Sets the value of the actVetoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActVetoNumber(JAXBElement<String> value) {
        this.actVetoNumber = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSponsorship }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSponsorship> getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSponsorship }{@code >}
     *     
     */
    public void setAuthors(JAXBElement<ArrayOfSponsorship> value) {
        this.authors = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaption(JAXBElement<String> value) {
        this.caption = value;
    }

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
     * Gets the value of the houseCommittee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CommitteeListing }{@code >}
     *     
     */
    public JAXBElement<CommitteeListing> getHouseCommittee() {
        return houseCommittee;
    }

    /**
     * Sets the value of the houseCommittee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CommitteeListing }{@code >}
     *     
     */
    public void setHouseCommittee(JAXBElement<CommitteeListing> value) {
        this.houseCommittee = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Gets the value of the senateCommittee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CommitteeListing }{@code >}
     *     
     */
    public JAXBElement<CommitteeListing> getSenateCommittee() {
        return senateCommittee;
    }

    /**
     * Sets the value of the senateCommittee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CommitteeListing }{@code >}
     *     
     */
    public void setSenateCommittee(JAXBElement<CommitteeListing> value) {
        this.senateCommittee = value;
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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StatusListing }{@code >}
     *     
     */
    public JAXBElement<StatusListing> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StatusListing }{@code >}
     *     
     */
    public void setStatus(JAXBElement<StatusListing> value) {
        this.status = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuffix(JAXBElement<String> value) {
        this.suffix = value;
    }

}
