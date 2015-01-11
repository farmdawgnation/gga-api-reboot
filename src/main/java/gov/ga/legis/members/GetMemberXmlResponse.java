
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
 *         &lt;element name="GetMemberXmlResult" type="{http://www.legis.ga.gov/2009/01/01/data/}Member" minOccurs="0"/>
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
    "getMemberXmlResult"
})
@XmlRootElement(name = "GetMemberXmlResponse")
public class GetMemberXmlResponse {

    @XmlElementRef(name = "GetMemberXmlResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<Member> getMemberXmlResult;

    /**
     * Gets the value of the getMemberXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Member }{@code >}
     *     
     */
    public JAXBElement<Member> getGetMemberXmlResult() {
        return getMemberXmlResult;
    }

    /**
     * Sets the value of the getMemberXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Member }{@code >}
     *     
     */
    public void setGetMemberXmlResult(JAXBElement<Member> value) {
        this.getMemberXmlResult = value;
    }

}
