
package gov.ga.legis.legislation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegislationSearchResultsPaged complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegislationSearchResultsPaged">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Page" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfLegislationSearchResult" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegislationSearchResultsPaged", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "page",
    "total"
})
public class LegislationSearchResultsPaged {

    @XmlElementRef(name = "Page", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLegislationSearchResult> page;
    @XmlElement(name = "Total")
    protected Integer total;

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLegislationSearchResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLegislationSearchResult> getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLegislationSearchResult }{@code >}
     *     
     */
    public void setPage(JAXBElement<ArrayOfLegislationSearchResult> value) {
        this.page = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

}
