
package gov.ga.legis.legislation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="HB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentType", namespace = "http://www.legis.ga.gov/2009/01/01/data/")
@XmlEnum
public enum DocumentType {

    SB,
    SR,
    HR,
    HB;

    public String value() {
        return name();
    }

    public static DocumentType fromValue(String v) {
        return valueOf(v);
    }

}
