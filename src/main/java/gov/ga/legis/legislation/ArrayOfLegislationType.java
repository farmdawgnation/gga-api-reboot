
package gov.ga.legis.legislation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLegislationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLegislationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegislationType" type="{http://www.legis.ga.gov/2009/01/01/data/}LegislationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLegislationType", namespace = "http://www.legis.ga.gov/2009/01/01/data/", propOrder = {
    "legislationType"
})
public class ArrayOfLegislationType {

    @XmlElement(name = "LegislationType")
    @XmlSchemaType(name = "string")
    protected List<LegislationType> legislationType;

    /**
     * Gets the value of the legislationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legislationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegislationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegislationType }
     * 
     * 
     */
    public List<LegislationType> getLegislationType() {
        if (legislationType == null) {
            legislationType = new ArrayList<LegislationType>();
        }
        return this.legislationType;
    }

}
