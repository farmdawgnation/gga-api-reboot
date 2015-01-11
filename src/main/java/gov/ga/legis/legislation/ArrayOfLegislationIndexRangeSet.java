
package gov.ga.legis.legislation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLegislationIndexRangeSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLegislationIndexRangeSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegislationIndexRangeSet" type="{http://www.legis.ga.gov/2009/01/01/data/}LegislationIndexRangeSet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLegislationIndexRangeSet", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "legislationIndexRangeSet"
})
public class ArrayOfLegislationIndexRangeSet {

    @XmlElement(name = "LegislationIndexRangeSet", nillable = true)
    protected List<LegislationIndexRangeSet> legislationIndexRangeSet;

    /**
     * Gets the value of the legislationIndexRangeSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legislationIndexRangeSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegislationIndexRangeSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegislationIndexRangeSet }
     * 
     * 
     */
    public List<LegislationIndexRangeSet> getLegislationIndexRangeSet() {
        if (legislationIndexRangeSet == null) {
            legislationIndexRangeSet = new ArrayList<LegislationIndexRangeSet>();
        }
        return this.legislationIndexRangeSet;
    }

}
