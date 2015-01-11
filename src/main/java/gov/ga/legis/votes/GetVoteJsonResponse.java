
package gov.ga.legis.votes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetVoteJsonResult" type="{http://www.legis.ga.gov/2009/01/01/data/}Vote" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getVoteJsonResult"
})
@XmlRootElement(name = "GetVoteJsonResponse")
public class GetVoteJsonResponse {

    @XmlElementRef(name = "GetVoteJsonResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<Vote> getVoteJsonResult;

    /**
     * Gets the value of the getVoteJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Vote }{@code >}
     *     
     */
    public JAXBElement<Vote> getGetVoteJsonResult() {
        return getVoteJsonResult;
    }

    /**
     * Sets the value of the getVoteJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Vote }{@code >}
     *     
     */
    public void setGetVoteJsonResult(JAXBElement<Vote> value) {
        this.getVoteJsonResult = value;
    }

}
