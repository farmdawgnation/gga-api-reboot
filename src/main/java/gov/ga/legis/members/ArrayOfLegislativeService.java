
package gov.ga.legis.members;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLegislativeService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLegislativeService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegislativeService" type="{http://www.legis.ga.gov/2009/01/01/data/}LegislativeService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLegislativeService", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "legislativeService"
})
public class ArrayOfLegislativeService {

    @XmlElement(name = "LegislativeService", nillable = true)
    protected List<LegislativeService> legislativeService;

    /**
     * Gets the value of the legislativeService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legislativeService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegislativeService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegislativeService }
     * 
     * 
     */
    public List<LegislativeService> getLegislativeService() {
        if (legislativeService == null) {
            legislativeService = new ArrayList<LegislativeService>();
        }
        return this.legislativeService;
    }

}
