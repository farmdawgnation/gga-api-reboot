
package gov.ga.legis.legislation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegislationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegislationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GEN"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="LOC"/>
 *     &lt;enumeration value="PRIV"/>
 *     &lt;enumeration value="NP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LegislationType", namespace = "http://www.legis.ga.gov/2009/01/01/data/")
@XmlEnum
public enum LegislationType {

    GEN,
    CA,
    LOC,
    PRIV,
    NP;

    public String value() {
        return name();
    }

    public static LegislationType fromValue(String v) {
        return valueOf(v);
    }

}
