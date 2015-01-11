
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
 *         &lt;element name="GetCommitteeForSessionResult" type="{http://www.legis.ga.gov/2009/01/01/data/}CommitteeDetail" minOccurs="0"/>
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
    "getCommitteeForSessionResult"
})
@XmlRootElement(name = "GetCommitteeForSessionResponse")
public class GetCommitteeForSessionResponse {

    @XmlElementRef(name = "GetCommitteeForSessionResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<CommitteeDetail> getCommitteeForSessionResult;

    /**
     * Gets the value of the getCommitteeForSessionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CommitteeDetail }{@code >}
     *     
     */
    public JAXBElement<CommitteeDetail> getGetCommitteeForSessionResult() {
        return getCommitteeForSessionResult;
    }

    /**
     * Sets the value of the getCommitteeForSessionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CommitteeDetail }{@code >}
     *     
     */
    public void setGetCommitteeForSessionResult(JAXBElement<CommitteeDetail> value) {
        this.getCommitteeForSessionResult = value;
    }

}
