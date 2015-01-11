
package gov.ga.legis.votes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberVote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberVote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Member" type="{http://www.legis.ga.gov/2009/01/01/data/}MemberDescription" minOccurs="0"/>
 *         &lt;element name="MemberVoted" type="{http://www.legis.ga.gov/2009/01/01/data/}MemberVoted" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberVote", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "member",
    "memberVoted"
})
public class MemberVote {

    @XmlElementRef(name = "Member", namespace = "http://www.legis.ga.gov/2009/01/01/data/", type = JAXBElement.class, required = false)
    protected JAXBElement<MemberDescription> member;
    @XmlElement(name = "MemberVoted")
    @XmlSchemaType(name = "string")
    protected MemberVoted memberVoted;

    /**
     * Gets the value of the member property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MemberDescription }{@code >}
     *     
     */
    public JAXBElement<MemberDescription> getMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MemberDescription }{@code >}
     *     
     */
    public void setMember(JAXBElement<MemberDescription> value) {
        this.member = value;
    }

    /**
     * Gets the value of the memberVoted property.
     * 
     * @return
     *     possible object is
     *     {@link MemberVoted }
     *     
     */
    public MemberVoted getMemberVoted() {
        return memberVoted;
    }

    /**
     * Sets the value of the memberVoted property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberVoted }
     *     
     */
    public void setMemberVoted(MemberVoted value) {
        this.memberVoted = value;
    }

}
