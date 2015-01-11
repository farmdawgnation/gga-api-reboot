
package gov.ga.legis.votes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfItemVotedOn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfItemVotedOn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemVotedOn" type="{http://www.legis.ga.gov/2009/01/01/data/}ItemVotedOn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfItemVotedOn", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "itemVotedOn"
})
public class ArrayOfItemVotedOn {

    @XmlElement(name = "ItemVotedOn", nillable = true)
    protected List<ItemVotedOn> itemVotedOn;

    /**
     * Gets the value of the itemVotedOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemVotedOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemVotedOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemVotedOn }
     * 
     * 
     */
    public List<ItemVotedOn> getItemVotedOn() {
        if (itemVotedOn == null) {
            itemVotedOn = new ArrayList<ItemVotedOn>();
        }
        return this.itemVotedOn;
    }

}
