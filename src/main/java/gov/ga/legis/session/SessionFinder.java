
package gov.ga.legis.session;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SessionFinder", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SessionFinder {


    /**
     * 
     * @return
     *     returns gov.ga.legis.session.ArrayOfSession
     */
    @WebMethod(operationName = "GetSessions", action = "GetSessions")
    @WebResult(name = "GetSessionsResult", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/")
    @RequestWrapper(localName = "GetSessions", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/", className = "gov.ga.legis.session.GetSessions")
    @ResponseWrapper(localName = "GetSessionsResponse", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/", className = "gov.ga.legis.session.GetSessionsResponse")
    public ArrayOfSession getSessions();

    /**
     * 
     * @param chamber
     * @param sessionId
     * @return
     *     returns gov.ga.legis.session.SessionCalendar
     */
    @WebMethod(operationName = "GetSessionSchedule", action = "GetSessionSchedule")
    @WebResult(name = "GetSessionScheduleResult", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/")
    @RequestWrapper(localName = "GetSessionSchedule", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/", className = "gov.ga.legis.session.GetSessionSchedule")
    @ResponseWrapper(localName = "GetSessionScheduleResponse", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/", className = "gov.ga.legis.session.GetSessionScheduleResponse")
    public SessionCalendar getSessionSchedule(
        @WebParam(name = "SessionId", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/")
        Integer sessionId,
        @WebParam(name = "Chamber", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/")
        Chamber chamber);

    /**
     * 
     * @return
     *     returns gov.ga.legis.session.ArrayOfYear
     */
    @WebMethod(operationName = "GetYears", action = "GetYears")
    @WebResult(name = "GetYearsResult", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/")
    @RequestWrapper(localName = "GetYears", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/", className = "gov.ga.legis.session.GetYears")
    @ResponseWrapper(localName = "GetYearsResponse", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/", className = "gov.ga.legis.session.GetYearsResponse")
    public ArrayOfYear getYears();

}
