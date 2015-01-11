
package gov.ga.legis.legislation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://www.legis.ga.gov/2009/01/01/data/}DocumentType" minOccurs="0"/>
 *         &lt;element name="RangeSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "sessionId",
    "documentType",
    "rangeSize"
})
@XmlRootElement(name = "GetLegislationRanges")
public class GetLegislationRanges {

    @XmlElement(name = "SessionId")
    protected Integer sessionId;
    @XmlElement(name = "DocumentType")
    @XmlSchemaType(name = "string")
    protected DocumentType documentType;
    @XmlElement(name = "RangeSize")
    protected Integer rangeSize;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSessionId(Integer value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocumentType(DocumentType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the rangeSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRangeSize() {
        return rangeSize;
    }

    /**
     * Sets the value of the rangeSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRangeSize(Integer value) {
        this.rangeSize = value;
    }

}
