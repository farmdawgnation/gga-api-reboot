
package gov.ga.legis.session;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Chamber.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Chamber">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Senate"/>
 *     &lt;enumeration value="House"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Chamber", namespace = "http://www.legis.ga.gov/2009/01/01/data/")
@XmlEnum
public enum Chamber {

    @XmlEnumValue("Senate")
    SENATE("Senate"),
    @XmlEnumValue("House")
    HOUSE("House");
    private final String value;

    Chamber(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Chamber fromValue(String v) {
        for (Chamber c: Chamber.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
