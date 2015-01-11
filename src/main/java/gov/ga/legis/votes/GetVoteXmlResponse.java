
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
 *         &lt;element name="GetVoteXmlResult" type="{http://www.legis.ga.gov/2009/01/01/data/}Vote" minOccurs="0"/>
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
    "getVoteXmlResult"
})
@XmlRootElement(name = "GetVoteXmlResponse")
public class GetVoteXmlResponse {

    @XmlElementRef(name = "GetVoteXmlResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<Vote> getVoteXmlResult;

    /**
     * Gets the value of the getVoteXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Vote }{@code >}
     *     
     */
    public JAXBElement<Vote> getGetVoteXmlResult() {
        return getVoteXmlResult;
    }

    /**
     * Sets the value of the getVoteXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Vote }{@code >}
     *     
     */
    public void setGetVoteXmlResult(JAXBElement<Vote> value) {
        this.getVoteXmlResult = value;
    }

}
