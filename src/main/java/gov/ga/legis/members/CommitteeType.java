
package gov.ga.legis.members;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitteeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommitteeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="House"/>
 *     &lt;enumeration value="Senate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommitteeType", namespace = "http://www.legis.ga.gov/2009/01/01/data/")
@XmlEnum
public enum CommitteeType {

    @XmlEnumValue("House")
    HOUSE("House"),
    @XmlEnumValue("Senate")
    SENATE("Senate");
    private final String value;

    CommitteeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommitteeType fromValue(String v) {
        for (CommitteeType c: CommitteeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
