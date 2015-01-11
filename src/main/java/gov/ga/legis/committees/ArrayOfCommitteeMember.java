
package gov.ga.legis.committees;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCommitteeMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCommitteeMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommitteeMember" type="{http://www.legis.ga.gov/2009/01/01/data/}CommitteeMember" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCommitteeMember", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "committeeMember"
})
public class ArrayOfCommitteeMember {

    @XmlElement(name = "CommitteeMember", nillable = true)
    protected List<CommitteeMember> committeeMember;

    /**
     * Gets the value of the committeeMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMember }
     * 
     * 
     */
    public List<CommitteeMember> getCommitteeMember() {
        if (committeeMember == null) {
            committeeMember = new ArrayList<CommitteeMember>();
        }
        return this.committeeMember;
    }

}
