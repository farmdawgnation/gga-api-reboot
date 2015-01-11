
package gov.ga.legis.legislation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="Prefiled"/>
 *     &lt;enumeration value="FirstReadInHouse"/>
 *     &lt;enumeration value="FirstReadInSenate"/>
 *     &lt;enumeration value="SignedByGovernor"/>
 *     &lt;enumeration value="HouseAction"/>
 *     &lt;enumeration value="SenateAction"/>
 *     &lt;enumeration value="HouseOrSenateAction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Status", namespace = "http://www.legis.ga.gov/2009/01/01/data/")
@XmlEnum
public enum Status {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Prefiled")
    PREFILED("Prefiled"),
    @XmlEnumValue("FirstReadInHouse")
    FIRST_READ_IN_HOUSE("FirstReadInHouse"),
    @XmlEnumValue("FirstReadInSenate")
    FIRST_READ_IN_SENATE("FirstReadInSenate"),
    @XmlEnumValue("SignedByGovernor")
    SIGNED_BY_GOVERNOR("SignedByGovernor"),
    @XmlEnumValue("HouseAction")
    HOUSE_ACTION("HouseAction"),
    @XmlEnumValue("SenateAction")
    SENATE_ACTION("SenateAction"),
    @XmlEnumValue("HouseOrSenateAction")
    HOUSE_OR_SENATE_ACTION("HouseOrSenateAction");
    private final String value;

    Status(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Status fromValue(String v) {
        for (Status c: Status.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
