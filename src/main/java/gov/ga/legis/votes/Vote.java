
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
 * <p>Java class for Vote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Branch" type="{http://www.legis.ga.gov/2009/01/01/data/}Branch"/>
 *         &lt;element name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Excused" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Legislation" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfItemVotedOn" minOccurs="0"/>
 *         &lt;element name="Nays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NotVoting" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Session" type="{http://www.legis.ga.gov/2009/01/01/data/}Session"/>
 *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VoteId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Votes" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfMemberVote" minOccurs="0"/>
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
@XmlType(name = "Vote", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
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
    "tag",
    "time",
    "voteId",
    "votes",
    "yeas"
})
public class Vote {

    @XmlElement(name = "Branch", required = true)
    @XmlSchemaType(name = "string")
    protected Branch branch;
    @XmlElementRef(name = "Caption", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caption;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElementRef(name = "Day", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> day;
    @XmlElementRef(name = "Description", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "Excused")
    protected int excused;
    @XmlElementRef(name = "Legislation", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfItemVotedOn> legislation;
    @XmlElement(name = "Nays")
    protected int nays;
    @XmlElement(name = "NotVoting")
    protected int notVoting;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "Session", required = true, nillable = true)
    protected Session session;
    @XmlElementRef(name = "Tag", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tag;
    @XmlElementRef(name = "Time", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> time;
    @XmlElement(name = "VoteId")
    protected int voteId;
    @XmlElementRef(name = "Votes", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMemberVote> votes;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDay(JAXBElement<String> value) {
        this.day = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfItemVotedOn }{@code >}
     *     
     */
    public JAXBElement<ArrayOfItemVotedOn> getLegislation() {
        return legislation;
    }

    /**
     * Sets the value of the legislation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItemVotedOn }{@code >}
     *     
     */
    public void setLegislation(JAXBElement<ArrayOfItemVotedOn> value) {
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
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTag(JAXBElement<String> value) {
        this.tag = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTime(JAXBElement<String> value) {
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
     * Gets the value of the votes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMemberVote }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMemberVote> getVotes() {
        return votes;
    }

    /**
     * Sets the value of the votes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMemberVote }{@code >}
     *     
     */
    public void setVotes(JAXBElement<ArrayOfMemberVote> value) {
        this.votes = value;
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
