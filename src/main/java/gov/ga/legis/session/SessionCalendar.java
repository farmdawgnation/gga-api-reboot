
package gov.ga.legis.session;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionCalendar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionCalendar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Branch" type="{http://www.legis.ga.gov/2009/01/01/data/}Chamber" minOccurs="0"/>
 *         &lt;element name="Years" type="{http://www.legis.ga.gov/2009/01/01/data/}ArrayOfLegislativeYear" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionCalendar", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "branch",
    "years"
})
public class SessionCalendar {

    @XmlElement(name = "Branch")
    @XmlSchemaType(name = "string")
    protected Chamber branch;
    @XmlElementRef(name = "Years", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLegislativeYear> years;

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link Chamber }
     *     
     */
    public Chamber getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chamber }
     *     
     */
    public void setBranch(Chamber value) {
        this.branch = value;
    }

    /**
     * Gets the value of the years property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLegislativeYear }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLegislativeYear> getYears() {
        return years;
    }

    /**
     * Sets the value of the years property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLegislativeYear }{@code >}
     *     
     */
    public void setYears(JAXBElement<ArrayOfLegislativeYear> value) {
        this.years = value;
    }

}
