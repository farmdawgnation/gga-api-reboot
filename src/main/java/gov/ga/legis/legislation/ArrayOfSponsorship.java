
package gov.ga.legis.legislation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSponsorship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSponsorship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sponsorship" type="{http://www.legis.ga.gov/2009/01/01/data/}Sponsorship" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSponsorship", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "sponsorship"
})
public class ArrayOfSponsorship {

    @XmlElement(name = "Sponsorship", nillable = true)
    protected List<Sponsorship> sponsorship;

    /**
     * Gets the value of the sponsorship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sponsorship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSponsorship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sponsorship }
     * 
     * 
     */
    public List<Sponsorship> getSponsorship() {
        if (sponsorship == null) {
            sponsorship = new ArrayList<Sponsorship>();
        }
        return this.sponsorship;
    }

}
