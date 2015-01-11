
package gov.ga.legis.legislation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SponsorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SponsorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SenateCoAuthor"/>
 *     &lt;enumeration value="SenateSponsor"/>
 *     &lt;enumeration value="SenateAuthor"/>
 *     &lt;enumeration value="HouseAuthor"/>
 *     &lt;enumeration value="HouseSponsor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SponsorType", namespace = "http://www.legis.ga.gov/2009/01/01/data/")
@XmlEnum
public enum SponsorType {

    @XmlEnumValue("SenateCoAuthor")
    SENATE_CO_AUTHOR("SenateCoAuthor"),
    @XmlEnumValue("SenateSponsor")
    SENATE_SPONSOR("SenateSponsor"),
    @XmlEnumValue("SenateAuthor")
    SENATE_AUTHOR("SenateAuthor"),
    @XmlEnumValue("HouseAuthor")
    HOUSE_AUTHOR("HouseAuthor"),
    @XmlEnumValue("HouseSponsor")
    HOUSE_SPONSOR("HouseSponsor");
    private final String value;

    SponsorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SponsorType fromValue(String v) {
        for (SponsorType c: SponsorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
