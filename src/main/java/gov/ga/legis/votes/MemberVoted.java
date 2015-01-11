
package gov.ga.legis.votes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberVoted.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MemberVoted">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Yea"/>
 *     &lt;enumeration value="Nay"/>
 *     &lt;enumeration value="Excused"/>
 *     &lt;enumeration value="NotVoting"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MemberVoted", namespace = "http://www.legis.ga.gov/2009/01/01/data/")
@XmlEnum
public enum MemberVoted {

    @XmlEnumValue("Yea")
    YEA("Yea"),
    @XmlEnumValue("Nay")
    NAY("Nay"),
    @XmlEnumValue("Excused")
    EXCUSED("Excused"),
    @XmlEnumValue("NotVoting")
    NOT_VOTING("NotVoting"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    MemberVoted(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MemberVoted fromValue(String v) {
        for (MemberVoted c: MemberVoted.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
