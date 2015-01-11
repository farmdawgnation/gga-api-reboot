
package gov.ga.legis.members;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LegislativeService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegislativeService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommitteeMemberships" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfCommitteeMembership" minOccurs="0"/>
 *         &lt;element name="DateVacated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="District" type="{http://www.legis.ga.gov/2009/01/01/data/}District"/>
 *         &lt;element name="LegId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Party" type="{http://www.legis.ga.gov/2009/01/01/data/}Party" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Session" type="{http://www.legis.ga.gov/2009/01/01/data/}Session"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegislativeService", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "committeeMemberships",
    "dateVacated",
    "district",
    "legId",
    "party",
    "serviceId",
    "session",
    "title"
})
public class LegislativeService {

    @XmlElementRef(name = "CommitteeMemberships", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCommitteeMembership> committeeMemberships;
    @XmlElementRef(name = "DateVacated", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateVacated;
    @XmlElement(name = "District", required = true, nillable = true)
    protected District district;
    @XmlElement(name = "LegId")
    protected Integer legId;
    @XmlElement(name = "Party")
    @XmlSchemaType(name = "string")
    protected Party party;
    @XmlElement(name = "ServiceId")
    protected int serviceId;
    @XmlElement(name = "Session", required = true, nillable = true)
    protected Session session;
    @XmlElementRef(name = "Title", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;

    /**
     * Gets the value of the committeeMemberships property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCommitteeMembership }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCommitteeMembership> getCommitteeMemberships() {
        return committeeMemberships;
    }

    /**
     * Sets the value of the committeeMemberships property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCommitteeMembership }{@code >}
     *     
     */
    public void setCommitteeMemberships(JAXBElement<ArrayOfCommitteeMembership> value) {
        this.committeeMemberships = value;
    }

    /**
     * Gets the value of the dateVacated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateVacated() {
        return dateVacated;
    }

    /**
     * Sets the value of the dateVacated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateVacated(JAXBElement<XMLGregorianCalendar> value) {
        this.dateVacated = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link District }
     *     
     */
    public District getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link District }
     *     
     */
    public void setDistrict(District value) {
        this.district = value;
    }

    /**
     * Gets the value of the legId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegId() {
        return legId;
    }

    /**
     * Sets the value of the legId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegId(Integer value) {
        this.legId = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setParty(Party value) {
        this.party = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     */
    public int getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     */
    public void setServiceId(int value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link Session }
     *     
     */
    public Session getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link Session }
     *     
     */
    public void setSession(Session value) {
        this.session = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

}
