
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
 *         &lt;element name="GetCommitteesBySessionJsonResult" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfCommitteeListing" minOccurs="0"/>
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
    "getCommitteesBySessionJsonResult"
})
@XmlRootElement(name = "GetCommitteesBySessionJsonResponse")
public class GetCommitteesBySessionJsonResponse {

    @XmlElementRef(name = "GetCommitteesBySessionJsonResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCommitteeListing> getCommitteesBySessionJsonResult;

    /**
     * Gets the value of the getCommitteesBySessionJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCommitteeListing }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCommitteeListing> getGetCommitteesBySessionJsonResult() {
        return getCommitteesBySessionJsonResult;
    }

    /**
     * Sets the value of the getCommitteesBySessionJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCommitteeListing }{@code >}
     *     
     */
    public void setGetCommitteesBySessionJsonResult(JAXBElement<ArrayOfCommitteeListing> value) {
        this.getCommitteesBySessionJsonResult = value;
    }

}
