
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
 *         &lt;element name="GetLegislationSearchResultsPagedJsonResult" type="{http://www.legis.ga.gov/2009/01/01/data/}LegislationSearchResultsPaged" minOccurs="0"/>
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
    "getLegislationSearchResultsPagedJsonResult"
})
@XmlRootElement(name = "GetLegislationSearchResultsPagedJsonResponse")
public class GetLegislationSearchResultsPagedJsonResponse {

    @XmlElementRef(name = "GetLegislationSearchResultsPagedJsonResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<LegislationSearchResultsPaged> getLegislationSearchResultsPagedJsonResult;

    /**
     * Gets the value of the getLegislationSearchResultsPagedJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LegislationSearchResultsPaged }{@code >}
     *     
     */
    public JAXBElement<LegislationSearchResultsPaged> getGetLegislationSearchResultsPagedJsonResult() {
        return getLegislationSearchResultsPagedJsonResult;
    }

    /**
     * Sets the value of the getLegislationSearchResultsPagedJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LegislationSearchResultsPaged }{@code >}
     *     
     */
    public void setGetLegislationSearchResultsPagedJsonResult(JAXBElement<LegislationSearchResultsPaged> value) {
        this.getLegislationSearchResultsPagedJsonResult = value;
    }

}
