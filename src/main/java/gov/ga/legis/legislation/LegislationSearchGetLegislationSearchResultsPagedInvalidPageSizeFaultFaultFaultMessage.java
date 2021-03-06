
package gov.ga.legis.legislation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidPageSizeFault", targetNamespace = "http://www.legis.ga.gov/2009/01/01/data/")
public class LegislationSearchGetLegislationSearchResultsPagedInvalidPageSizeFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidPageSizeFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public LegislationSearchGetLegislationSearchResultsPagedInvalidPageSizeFaultFaultFaultMessage(String message, InvalidPageSizeFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public LegislationSearchGetLegislationSearchResultsPagedInvalidPageSizeFaultFaultFaultMessage(String message, InvalidPageSizeFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: gov.ga.legis.legislation.InvalidPageSizeFault
     */
    public InvalidPageSizeFault getFaultInfo() {
        return faultInfo;
    }

}
