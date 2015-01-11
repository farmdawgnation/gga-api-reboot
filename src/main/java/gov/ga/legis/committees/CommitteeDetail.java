
package gov.ga.legis.committees;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitteeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitteeDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.legis.ga.gov/2009/01/01/data/}CommitteeBase">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.legis.ga.gov/2009/01/01/data/}Address" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Members" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfCommitteeMember" minOccurs="0"/>
 *         &lt;element name="Session" type="{http://www.legis.ga.gov/2009/01/01/data/}Session" minOccurs="0"/>
 *         &lt;element name="SessionContexts" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfSession" minOccurs="0"/>
 *         &lt;element name="Staff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubCommittees" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfSubCommittee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitteeDetail", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "address",
    "description",
    "members",
    "session",
    "sessionContexts",
    "staff",
    "subCommittees"
})
public class CommitteeDetail
    extends CommitteeBase
{

    @XmlElement(name = "Address")
    protected Address address;
    @XmlElementRef(name = "Description", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Members", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCommitteeMember> members;
    @XmlElementRef(name = "Session", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<Session> session;
    @XmlElementRef(name = "SessionContexts", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSession> sessionContexts;
    @XmlElementRef(name = "Staff", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> staff;
    @XmlElementRef(name = "SubCommittees", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSubCommittee> subCommittees;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCommitteeMember }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCommitteeMember> getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCommitteeMember }{@code >}
     *     
     */
    public void setMembers(JAXBElement<ArrayOfCommitteeMember> value) {
        this.members = value;
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
     * Gets the value of the sessionContexts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSession }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSession> getSessionContexts() {
        return sessionContexts;
    }

    /**
     * Sets the value of the sessionContexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSession }{@code >}
     *     
     */
    public void setSessionContexts(JAXBElement<ArrayOfSession> value) {
        this.sessionContexts = value;
    }

    /**
     * Gets the value of the staff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaff() {
        return staff;
    }

    /**
     * Sets the value of the staff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaff(JAXBElement<String> value) {
        this.staff = value;
    }

    /**
     * Gets the value of the subCommittees property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSubCommittee }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSubCommittee> getSubCommittees() {
        return subCommittees;
    }

    /**
     * Sets the value of the subCommittees property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSubCommittee }{@code >}
     *     
     */
    public void setSubCommittees(JAXBElement<ArrayOfSubCommittee> value) {
        this.subCommittees = value;
    }

}
