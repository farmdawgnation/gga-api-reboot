
package gov.ga.legis.committees;

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
 *         &lt;element name="GetCommitteesBySessionXmlResult" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfCommitteeListing" minOccurs="0"/>
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
    "getCommitteesBySessionXmlResult"
})
@XmlRootElement(name = "GetCommitteesBySessionXmlResponse")
public class GetCommitteesBySessionXmlResponse {

    @XmlElementRef(name = "GetCommitteesBySessionXmlResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCommitteeListing> getCommitteesBySessionXmlResult;

    /**
     * Gets the value of the getCommitteesBySessionXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCommitteeListing }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCommitteeListing> getGetCommitteesBySessionXmlResult() {
        return getCommitteesBySessionXmlResult;
    }

    /**
     * Sets the value of the getCommitteesBySessionXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCommitteeListing }{@code >}
     *     
     */
    public void setGetCommitteesBySessionXmlResult(JAXBElement<ArrayOfCommitteeListing> value) {
        this.getCommitteesBySessionXmlResult = value;
    }

}
