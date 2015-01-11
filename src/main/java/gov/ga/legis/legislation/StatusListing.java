
package gov.ga.legis.legislation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusListing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusListing">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.legis.ga.gov/2009/01/01/data/}StatusBase">
 *       &lt;sequence>
 *         &lt;element name="AmSub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusListingId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusListing", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "amSub",
    "statusListingId"
})
public class StatusListing
    extends StatusBase
{

    @XmlElementRef(name = "AmSub", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> amSub;
    @XmlElement(name = "StatusListingId")
    protected Integer statusListingId;

    /**
     * Gets the value of the amSub property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmSub() {
        return amSub;
    }

    /**
     * Sets the value of the amSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmSub(JAXBElement<String> value) {
        this.amSub = value;
    }

    /**
     * Gets the value of the statusListingId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusListingId() {
        return statusListingId;
    }

    /**
     * Sets the value of the statusListingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusListingId(Integer value) {
        this.statusListingId = value;
    }

}
