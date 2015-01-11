
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
 *         &lt;element name="GetVotesXmlResult" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfVoteListing" minOccurs="0"/>
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
    "getVotesXmlResult"
})
@XmlRootElement(name = "GetVotesXmlResponse")
public class GetVotesXmlResponse {

    @XmlElementRef(name = "GetVotesXmlResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVoteListing> getVotesXmlResult;

    /**
     * Gets the value of the getVotesXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVoteListing }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVoteListing> getGetVotesXmlResult() {
        return getVotesXmlResult;
    }

    /**
     * Sets the value of the getVotesXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVoteListing }{@code >}
     *     
     */
    public void setGetVotesXmlResult(JAXBElement<ArrayOfVoteListing> value) {
        this.getVotesXmlResult = value;
    }

}
