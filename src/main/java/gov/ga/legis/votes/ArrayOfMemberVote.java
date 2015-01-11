
package gov.ga.legis.votes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMemberVote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMemberVote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberVote" type="{http://www.legis.ga.gov/2009/01/01/data/}MemberVote" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMemberVote", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "memberVote"
})
public class ArrayOfMemberVote {

    @XmlElement(name = "MemberVote", nillable = true)
    protected List<MemberVote> memberVote;

    /**
     * Gets the value of the memberVote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberVote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberVote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberVote }
     * 
     * 
     */
    public List<MemberVote> getMemberVote() {
        if (memberVote == null) {
            memberVote = new ArrayList<MemberVote>();
        }
        return this.memberVote;
    }

}
