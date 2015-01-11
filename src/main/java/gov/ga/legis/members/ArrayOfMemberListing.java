
package gov.ga.legis.members;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMemberListing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMemberListing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberListing" type="{http://www.legis.ga.gov/2009/01/01/data/}MemberListing" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMemberListing", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "memberListing"
})
public class ArrayOfMemberListing {

    @XmlElement(name = "MemberListing", nillable = true)
    protected List<MemberListing> memberListing;

    /**
     * Gets the value of the memberListing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberListing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberListing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberListing }
     * 
     * 
     */
    public List<MemberListing> getMemberListing() {
        if (memberListing == null) {
            memberListing = new ArrayList<MemberListing>();
        }
        return this.memberListing;
    }

}
