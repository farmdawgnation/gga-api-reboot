
package gov.ga.legis.legislation;

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
 *         &lt;element name="GetLegislationDetailByDescriptionJsonResult" type="{http://www.legis.ga.gov/2009/01/01/data/}LegislationDetail" minOccurs="0"/>
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
    "getLegislationDetailByDescriptionJsonResult"
})
@XmlRootElement(name = "GetLegislationDetailByDescriptionJsonResponse")
public class GetLegislationDetailByDescriptionJsonResponse {

    @XmlElementRef(name = "GetLegislationDetailByDescriptionJsonResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<LegislationDetail> getLegislationDetailByDescriptionJsonResult;

    /**
     * Gets the value of the getLegislationDetailByDescriptionJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LegislationDetail }{@code >}
     *     
     */
    public JAXBElement<LegislationDetail> getGetLegislationDetailByDescriptionJsonResult() {
        return getLegislationDetailByDescriptionJsonResult;
    }

    /**
     * Sets the value of the getLegislationDetailByDescriptionJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LegislationDetail }{@code >}
     *     
     */
    public void setGetLegislationDetailByDescriptionJsonResult(JAXBElement<LegislationDetail> value) {
        this.getLegislationDetailByDescriptionJsonResult = value;
    }

}
