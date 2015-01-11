
package gov.ga.legis.session;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLegislativeYear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLegislativeYear">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegislativeYear" type="{http://www.legis.ga.gov/2009/01/01/data/}LegislativeYear" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLegislativeYear", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "legislativeYear"
})
public class ArrayOfLegislativeYear {

    @XmlElement(name = "LegislativeYear", nillable = true)
    protected List<LegislativeYear> legislativeYear;

    /**
     * Gets the value of the legislativeYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legislativeYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegislativeYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegislativeYear }
     * 
     * 
     */
    public List<LegislativeYear> getLegislativeYear() {
        if (legislativeYear == null) {
            legislativeYear = new ArrayList<LegislativeYear>();
        }
        return this.legislativeYear;
    }

}
