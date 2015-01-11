
package gov.ga.legis.votes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VoteListing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoteListing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Branch" type="{http://www.legis.ga.gov/2009/01/01/data/}Branch"/>
 *         &lt;element name="Caption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Excused" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Legislation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NotVoting" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Session" type="{http://www.legis.ga.gov/2009/01/01/data/}Session"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VoteId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Yeas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteListing", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "branch",
    "caption",
    "date",
    "day",
    "description",
    "excused",
    "legislation",
    "nays",
    "notVoting",
    "number",
    "session",
    "time",
    "voteId",
    "yeas"
})
public class VoteListing {

    @XmlElement(name = "Branch", required = true)
    @XmlSchemaType(name = "string")
    protected Branch branch;
    @XmlElement(name = "Caption", required = true, nillable = true)
    protected String caption;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Day", required = true, nillable = true)
    protected String day;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "Excused")
    protected int excused;
    @XmlElementRef(name = "Legislation", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legislation;
    @XmlElement(name = "Nays")
    protected int nays;
    @XmlElement(name = "NotVoting")
    protected int notVoting;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "Session", required = true, nillable = true)
    protected Session session;
    @XmlElement(name = "Time", required = true, nillable = true)
    protected String time;
    @XmlElement(name = "VoteId")
    protected int voteId;
    @XmlElement(name = "Yeas")
    protected int yeas;

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link Branch }
     *     
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch }
     *     
     */
    public void setBranch(Branch value) {
        this.branch = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDay(String value) {
        this.day = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the excused property.
     * 
     */
    public int getExcused() {
        return excused;
    }

    /**
     * Sets the value of the excused property.
     * 
     */
    public void setExcused(int value) {
        this.excused = value;
    }

    /**
     * Gets the value of the legislation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegislation() {
        return legislation;
    }

    /**
     * Sets the value of the legislation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegislation(JAXBElement<String> value) {
        this.legislation = value;
    }

    /**
     * Gets the value of the nays property.
     * 
     */
    public int getNays() {
        return nays;
    }

    /**
     * Sets the value of the nays property.
     * 
     */
    public void setNays(int value) {
        this.nays = value;
    }

    /**
     * Gets the value of the notVoting property.
     * 
     */
    public int getNotVoting() {
        return notVoting;
    }

    /**
     * Sets the value of the notVoting property.
     * 
     */
    public void setNotVoting(int value) {
        this.notVoting = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
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
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the voteId property.
     * 
     */
    public int getVoteId() {
        return voteId;
    }

    /**
     * Sets the value of the voteId property.
     * 
     */
    public void setVoteId(int value) {
        this.voteId = value;
    }

    /**
     * Gets the value of the yeas property.
     * 
     */
    public int getYeas() {
        return yeas;
    }

    /**
     * Sets the value of the yeas property.
     * 
     */
    public void setYeas(int value) {
        this.yeas = value;
    }

}
