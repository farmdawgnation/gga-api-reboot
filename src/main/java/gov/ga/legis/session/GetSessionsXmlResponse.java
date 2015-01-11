
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
 *         &lt;element name="GetSessionsXmlResult" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfSession" minOccurs="0"/>
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
    "getSessionsXmlResult"
})
@XmlRootElement(name = "GetSessionsXmlResponse")
public class GetSessionsXmlResponse {

    @XmlElementRef(name = "GetSessionsXmlResult", namespace = "http://www.legis.ga.gov/2009/01/01/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSession> getSessionsXmlResult;

    /**
     * Gets the value of the getSessionsXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSession }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSession> getGetSessionsXmlResult() {
        return getSessionsXmlResult;
    }

    /**
     * Sets the value of the getSessionsXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSession }{@code >}
     *     
     */
    public void setGetSessionsXmlResult(JAXBElement<ArrayOfSession> value) {
        this.getSessionsXmlResult = value;
    }

}
