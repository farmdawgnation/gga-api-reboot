
package gov.ga.legis.session;

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
 *         &lt;element name="GetYearsXmlResult" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfYear" minOccurs="0"/>
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
    "getYearsXmlResult"
})
@XmlRootElement(name = "GetYearsXmlResponse")
public class GetYearsXmlResponse {

    @XmlElementRef(name = "GetYearsXmlResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfYear> getYearsXmlResult;

    /**
     * Gets the value of the getYearsXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfYear }{@code >}
     *     
     */
    public JAXBElement<ArrayOfYear> getGetYearsXmlResult() {
        return getYearsXmlResult;
    }

    /**
     * Sets the value of the getYearsXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfYear }{@code >}
     *     
     */
    public void setGetYearsXmlResult(JAXBElement<ArrayOfYear> value) {
        this.getYearsXmlResult = value;
    }

}
