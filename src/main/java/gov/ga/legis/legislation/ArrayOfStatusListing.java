
package gov.ga.legis.legislation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatusListing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatusListing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusListing" type="{http://www.legis.ga.gov/2009/01/01/data/}StatusListing" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatusListing", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "statusListing"
})
public class ArrayOfStatusListing {

    @XmlElement(name = "StatusListing", nillable = true)
    protected List<StatusListing> statusListing;

    /**
     * Gets the value of the statusListing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusListing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusListing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusListing }
     * 
     * 
     */
    public List<StatusListing> getStatusListing() {
        if (statusListing == null) {
            statusListing = new ArrayList<StatusListing>();
        }
        return this.statusListing;
    }

}
