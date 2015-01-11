
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
 *         &lt;element name="GetLegislationRangeJsonResult" type="{http://www.legis.ga.gov/2009/01/01/data/}LegislationIndexRange" minOccurs="0"/>
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
    "getLegislationRangeJsonResult"
})
@XmlRootElement(name = "GetLegislationRangeJsonResponse")
public class GetLegislationRangeJsonResponse {

    @XmlElementRef(name = "GetLegislationRangeJsonResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<LegislationIndexRange> getLegislationRangeJsonResult;

    /**
     * Gets the value of the getLegislationRangeJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LegislationIndexRange }{@code >}
     *     
     */
    public JAXBElement<LegislationIndexRange> getGetLegislationRangeJsonResult() {
        return getLegislationRangeJsonResult;
    }

    /**
     * Sets the value of the getLegislationRangeJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LegislationIndexRange }{@code >}
     *     
     */
    public void setGetLegislationRangeJsonResult(JAXBElement<LegislationIndexRange> value) {
        this.getLegislationRangeJsonResult = value;
    }

}
