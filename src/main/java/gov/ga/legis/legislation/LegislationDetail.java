
package gov.ga.legis.legislation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegislationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegislationDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.legis.ga.gov/2009/01/01/data/}Legislation">
 *       &lt;sequence>
 *         &lt;element name="Footnotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sponsor" type="{http://www.legis.ga.gov/2009/01/01/data/}Sponsorship" minOccurs="0"/>
 *         &lt;element name="StatusHistory" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfStatusListing" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Versions" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfDocumentDescription" minOccurs="0"/>
 *         &lt;element name="Votes" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfVoteListing" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegislationDetail", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "footnotes",
    "sponsor",
    "statusHistory",
    "summary",
    "versions",
    "votes"
})
public class LegislationDetail
    extends Legislation
{

    @XmlElementRef(name = "Footnotes", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> footnotes;
    @XmlElementRef(name = "Sponsor", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<Sponsorship> sponsor;
    @XmlElementRef(name = "StatusHistory", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStatusListing> statusHistory;
    @XmlElementRef(name = "Summary", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> summary;
    @XmlElementRef(name = "Versions", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumentDescription> versions;
    @XmlElementRef(name = "Votes", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVoteListing> votes;

    /**
     * Gets the value of the footnotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFootnotes() {
        return footnotes;
    }

    /**
     * Sets the value of the footnotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFootnotes(JAXBElement<String> value) {
        this.footnotes = value;
    }

    /**
     * Gets the value of the sponsor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Sponsorship }{@code >}
     *     
     */
    public JAXBElement<Sponsorship> getSponsor() {
        return sponsor;
    }

    /**
     * Sets the value of the sponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Sponsorship }{@code >}
     *     
     */
    public void setSponsor(JAXBElement<Sponsorship> value) {
        this.sponsor = value;
    }

    /**
     * Gets the value of the statusHistory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatusListing }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStatusListing> getStatusHistory() {
        return statusHistory;
    }

    /**
     * Sets the value of the statusHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatusListing }{@code >}
     *     
     */
    public void setStatusHistory(JAXBElement<ArrayOfStatusListing> value) {
        this.statusHistory = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSummary(JAXBElement<String> value) {
        this.summary = value;
    }

    /**
     * Gets the value of the versions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentDescription }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentDescription> getVersions() {
        return versions;
    }

    /**
     * Sets the value of the versions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentDescription }{@code >}
     *     
     */
    public void setVersions(JAXBElement<ArrayOfDocumentDescription> value) {
        this.versions = value;
    }

    /**
     * Gets the value of the votes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVoteListing }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVoteListing> getVotes() {
        return votes;
    }

    /**
     * Sets the value of the votes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVoteListing }{@code >}
     *     
     */
    public void setVotes(JAXBElement<ArrayOfVoteListing> value) {
        this.votes = value;
    }

}
