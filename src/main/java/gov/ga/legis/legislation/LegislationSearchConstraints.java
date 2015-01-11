
package gov.ga.legis.legislation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegislationSearchConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegislationSearchConstraints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommitteeAssigned" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="DocumentTypes" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfDocumentType" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegislationNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LegislationTypes" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfLegislationType" minOccurs="0"/>
 *         &lt;element name="Session" type="{http://www.legis.ga.gov/2009/01/01/data/}Session" minOccurs="0"/>
 *         &lt;element name="Sponsors" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="StatusConstraints" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfStatusConstraint" minOccurs="0"/>
 *         &lt;element name="Subjects" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegislationSearchConstraints", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "committeeAssigned",
    "documentTypes",
    "keywords",
    "legislationNumber",
    "legislationTypes",
    "session",
    "sponsors",
    "statusConstraints",
    "subjects"
})
public class LegislationSearchConstraints {

    @XmlElementRef(name = "CommitteeAssigned", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> committeeAssigned;
    @XmlElementRef(name = "DocumentTypes", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumentType> documentTypes;
    @XmlElementRef(name = "Keywords", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keywords;
    @XmlElement(name = "LegislationNumber")
    protected Integer legislationNumber;
    @XmlElementRef(name = "LegislationTypes", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLegislationType> legislationTypes;
    @XmlElementRef(name = "Session", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<Session> session;
    @XmlElementRef(name = "Sponsors", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> sponsors;
    @XmlElementRef(name = "StatusConstraints", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStatusConstraint> statusConstraints;
    @XmlElementRef(name = "Subjects", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> subjects;

    /**
     * Gets the value of the committeeAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getCommitteeAssigned() {
        return committeeAssigned;
    }

    /**
     * Sets the value of the committeeAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setCommitteeAssigned(JAXBElement<ArrayOfint> value) {
        this.committeeAssigned = value;
    }

    /**
     * Gets the value of the documentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentType> getDocumentTypes() {
        return documentTypes;
    }

    /**
     * Sets the value of the documentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}
     *     
     */
    public void setDocumentTypes(JAXBElement<ArrayOfDocumentType> value) {
        this.documentTypes = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeywords(JAXBElement<String> value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the legislationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegislationNumber() {
        return legislationNumber;
    }

    /**
     * Sets the value of the legislationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegislationNumber(Integer value) {
        this.legislationNumber = value;
    }

    /**
     * Gets the value of the legislationTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLegislationType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLegislationType> getLegislationTypes() {
        return legislationTypes;
    }

    /**
     * Sets the value of the legislationTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLegislationType }{@code >}
     *     
     */
    public void setLegislationTypes(JAXBElement<ArrayOfLegislationType> value) {
        this.legislationTypes = value;
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
     * Gets the value of the sponsors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getSponsors() {
        return sponsors;
    }

    /**
     * Sets the value of the sponsors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setSponsors(JAXBElement<ArrayOfint> value) {
        this.sponsors = value;
    }

    /**
     * Gets the value of the statusConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatusConstraint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStatusConstraint> getStatusConstraints() {
        return statusConstraints;
    }

    /**
     * Sets the value of the statusConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatusConstraint }{@code >}
     *     
     */
    public void setStatusConstraints(JAXBElement<ArrayOfStatusConstraint> value) {
        this.statusConstraints = value;
    }

    /**
     * Gets the value of the subjects property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getSubjects() {
        return subjects;
    }

    /**
     * Sets the value of the subjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setSubjects(JAXBElement<ArrayOfint> value) {
        this.subjects = value;
    }

}
