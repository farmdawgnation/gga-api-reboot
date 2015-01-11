
package gov.ga.legis.legislation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLegislationIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLegislationIndex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegislationIndex" type="{http://www.legis.ga.gov/2009/01/01/data/}LegislationIndex" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLegislationIndex", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "legislationIndex"
})
public class ArrayOfLegislationIndex {

    @XmlElement(name = "LegislationIndex", nillable = true)
    protected List<LegislationIndex> legislationIndex;

    /**
     * Gets the value of the legislationIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legislationIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegislationIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegislationIndex }
     * 
     * 
     */
    public List<LegislationIndex> getLegislationIndex() {
        if (legislationIndex == null) {
            legislationIndex = new ArrayList<LegislationIndex>();
        }
        return this.legislationIndex;
    }

}
