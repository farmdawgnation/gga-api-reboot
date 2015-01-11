
package gov.ga.legis.members;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CommitteeMembership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitteeMembership">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee" type="{http://www.legis.ga.gov/2009/01/01/data/}CommitteeListing" minOccurs="0"/>
 *         &lt;element name="DateVacated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitteeMembership", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "committee",
    "dateVacated",
    "role"
})
public class CommitteeMembership {

    @XmlElementRef(name = "Committee", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<CommitteeListing> committee;
    @XmlElementRef(name = "DateVacated", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateVacated;
    @XmlElementRef(name = "Role", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> role;

    /**
     * Gets the value of the committee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CommitteeListing }{@code >}
     *     
     */
    public JAXBElement<CommitteeListing> getCommittee() {
        return committee;
    }

    /**
     * Sets the value of the committee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CommitteeListing }{@code >}
     *     
     */
    public void setCommittee(JAXBElement<CommitteeListing> value) {
        this.committee = value;
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
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRole(JAXBElement<String> value) {
        this.role = value;
    }

}
