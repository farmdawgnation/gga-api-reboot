
package gov.ga.legis.members;

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
 *         &lt;element name="GetMembersBySessionXmlResult" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfMemberListing" minOccurs="0"/>
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
    "getMembersBySessionXmlResult"
})
@XmlRootElement(name = "GetMembersBySessionXmlResponse")
public class GetMembersBySessionXmlResponse {

    @XmlElementRef(name = "GetMembersBySessionXmlResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMemberListing> getMembersBySessionXmlResult;

    /**
     * Gets the value of the getMembersBySessionXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMemberListing }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMemberListing> getGetMembersBySessionXmlResult() {
        return getMembersBySessionXmlResult;
    }

    /**
     * Sets the value of the getMembersBySessionXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMemberListing }{@code >}
     *     
     */
    public void setGetMembersBySessionXmlResult(JAXBElement<ArrayOfMemberListing> value) {
        this.getMembersBySessionXmlResult = value;
    }

}
