
package gov.ga.legis.members;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MemberType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Senator"/>
 *     &lt;enumeration value="Representative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MemberType", namespace = "http://www.legis.ga.gov/2009/01/01/data/")
@XmlEnum
public enum MemberType {

    @XmlEnumValue("Senator")
    SENATOR("Senator"),
    @XmlEnumValue("Representative")
    REPRESENTATIVE("Representative");
    private final String value;

    MemberType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MemberType fromValue(String v) {
        for (MemberType c: MemberType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
