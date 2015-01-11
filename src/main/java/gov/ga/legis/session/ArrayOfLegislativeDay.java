
package gov.ga.legis.session;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLegislativeDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLegislativeDay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegislativeDay" type="{http://www.legis.ga.gov/2009/01/01/data/}LegislativeDay" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLegislativeDay", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "legislativeDay"
})
public class ArrayOfLegislativeDay {

    @XmlElement(name = "LegislativeDay", nillable = true)
    protected List<LegislativeDay> legislativeDay;

    /**
     * Gets the value of the legislativeDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legislativeDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegislativeDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegislativeDay }
     * 
     * 
     */
    public List<LegislativeDay> getLegislativeDay() {
        if (legislativeDay == null) {
            legislativeDay = new ArrayList<LegislativeDay>();
        }
        return this.legislativeDay;
    }

}
