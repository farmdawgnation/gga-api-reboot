
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
 *         &lt;element name="GetMembersBySessionResult" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfMemberListing" minOccurs="0"/>
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
    "getMembersBySessionResult"
})
@XmlRootElement(name = "GetMembersBySessionResponse")
public class GetMembersBySessionResponse {

    @XmlElementRef(name = "GetMembersBySessionResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMemberListing> getMembersBySessionResult;

    /**
     * Gets the value of the getMembersBySessionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMemberListing }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMemberListing> getGetMembersBySessionResult() {
        return getMembersBySessionResult;
    }

    /**
     * Sets the value of the getMembersBySessionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMemberListing }{@code >}
     *     
     */
    public void setGetMembersBySessionResult(JAXBElement<ArrayOfMemberListing> value) {
        this.getMembersBySessionResult = value;
    }

}
