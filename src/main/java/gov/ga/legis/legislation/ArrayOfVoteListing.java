
package gov.ga.legis.legislation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVoteListing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVoteListing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VoteListing" type="{http://www.legis.ga.gov/2009/01/01/data/}VoteListing" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVoteListing", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "voteListing"
})
public class ArrayOfVoteListing {

    @XmlElement(name = "VoteListing", nillable = true)
    protected List<VoteListing> voteListing;

    /**
     * Gets the value of the voteListing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voteListing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteListing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoteListing }
     * 
     * 
     */
    public List<VoteListing> getVoteListing() {
        if (voteListing == null) {
            voteListing = new ArrayList<VoteListing>();
        }
        return this.voteListing;
    }

}
