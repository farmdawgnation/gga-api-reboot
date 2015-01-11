
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
 *         &lt;element name="GetLegislationForSessionJsonResult" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfLegislationIndex" minOccurs="0"/>
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
    "getLegislationForSessionJsonResult"
})
@XmlRootElement(name = "GetLegislationForSessionJsonResponse")
public class GetLegislationForSessionJsonResponse {

    @XmlElementRef(name = "GetLegislationForSessionJsonResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLegislationIndex> getLegislationForSessionJsonResult;

    /**
     * Gets the value of the getLegislationForSessionJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLegislationIndex }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLegislationIndex> getGetLegislationForSessionJsonResult() {
        return getLegislationForSessionJsonResult;
    }

    /**
     * Sets the value of the getLegislationForSessionJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLegislationIndex }{@code >}
     *     
     */
    public void setGetLegislationForSessionJsonResult(JAXBElement<ArrayOfLegislationIndex> value) {
        this.getLegislationForSessionJsonResult = value;
    }

}
