
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
 *         &lt;element name="GetMemberJsonResult" type="{http://www.legis.ga.gov/2009/01/01/data/}Member" minOccurs="0"/>
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
    "getMemberJsonResult"
})
@XmlRootElement(name = "GetMemberJsonResponse")
public class GetMemberJsonResponse {

    @XmlElementRef(name = "GetMemberJsonResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<Member> getMemberJsonResult;

    /**
     * Gets the value of the getMemberJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Member }{@code >}
     *     
     */
    public JAXBElement<Member> getGetMemberJsonResult() {
        return getMemberJsonResult;
    }

    /**
     * Sets the value of the getMemberJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Member }{@code >}
     *     
     */
    public void setGetMemberJsonResult(JAXBElement<Member> value) {
        this.getMemberJsonResult = value;
    }

}
