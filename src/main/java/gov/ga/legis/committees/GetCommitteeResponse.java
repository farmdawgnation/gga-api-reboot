
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
 *         &lt;element name="GetCommitteeResult" type="{http://www.legis.ga.gov/2009/01/01/data/}CommitteeDetail" minOccurs="0"/>
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
    "getCommitteeResult"
})
@XmlRootElement(name = "GetCommitteeResponse")
public class GetCommitteeResponse {

    @XmlElementRef(name = "GetCommitteeResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<CommitteeDetail> getCommitteeResult;

    /**
     * Gets the value of the getCommitteeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CommitteeDetail }{@code >}
     *     
     */
    public JAXBElement<CommitteeDetail> getGetCommitteeResult() {
        return getCommitteeResult;
    }

    /**
     * Sets the value of the getCommitteeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CommitteeDetail }{@code >}
     *     
     */
    public void setGetCommitteeResult(JAXBElement<CommitteeDetail> value) {
        this.getCommitteeResult = value;
    }

}
