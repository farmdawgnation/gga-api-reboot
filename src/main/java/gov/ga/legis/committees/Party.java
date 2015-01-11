
package gov.ga.legis.committees;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Party.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Party">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Democrat"/>
 *     &lt;enumeration value="Republican"/>
 *     &lt;enumeration value="Independent"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Party", namespace = "http://www.legis.ga.gov/2009/01/01/data/")
@XmlEnum
public enum Party {

    @XmlEnumValue("Democrat")
    DEMOCRAT("Democrat"),
    @XmlEnumValue("Republican")
    REPUBLICAN("Republican"),
    @XmlEnumValue("Independent")
    INDEPENDENT("Independent"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    Party(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Party fromValue(String v) {
        for (Party c: Party.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
