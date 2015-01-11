
package gov.ga.legis.legislation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLegislationSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLegislationSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegislationSearchResult" type="{http://www.legis.ga.gov/2009/01/01/data/}LegislationSearchResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLegislationSearchResult", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "legislationSearchResult"
})
public class ArrayOfLegislationSearchResult {

    @XmlElement(name = "LegislationSearchResult", nillable = true)
    protected List<LegislationSearchResult> legislationSearchResult;

    /**
     * Gets the value of the legislationSearchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legislationSearchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegislationSearchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegislationSearchResult }
     * 
     * 
     */
    public List<LegislationSearchResult> getLegislationSearchResult() {
        if (legislationSearchResult == null) {
            legislationSearchResult = new ArrayList<LegislationSearchResult>();
        }
        return this.legislationSearchResult;
    }

}
