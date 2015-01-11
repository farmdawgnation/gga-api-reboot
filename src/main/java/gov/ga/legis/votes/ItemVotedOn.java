
package gov.ga.legis.votes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemVotedOn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemVotedOn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LegislationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Library" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VoteId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemVotedOn", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "description",
    "legislationId",
    "library",
    "sessionId",
    "voteId"
})
public class ItemVotedOn {

    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "LegislationId")
    protected int legislationId;
    @XmlElementRef(name = "Library", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> library;
    @XmlElement(name = "SessionId")
    protected int sessionId;
    @XmlElement(name = "VoteId")
    protected int voteId;

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
     * Gets the value of the legislationId property.
     * 
     */
    public int getLegislationId() {
        return legislationId;
    }

    /**
     * Sets the value of the legislationId property.
     * 
     */
    public void setLegislationId(int value) {
        this.legislationId = value;
    }

    /**
     * Gets the value of the library property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLibrary() {
        return library;
    }

    /**
     * Sets the value of the library property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLibrary(JAXBElement<String> value) {
        this.library = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     */
    public int getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     */
    public void setSessionId(int value) {
        this.sessionId = value;
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

}
