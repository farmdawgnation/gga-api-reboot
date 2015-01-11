
package gov.ga.legis.session;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.ga.legis.session package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LegislativeYear_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "LegislativeYear");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfLegislativeDay_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfLegislativeDay");
    private final static QName _ArrayOfYear_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfYear");
    private final static QName _Year_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Year");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Chamber_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Chamber");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Session_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Session");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfSession_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfSession");
    private final static QName _ArrayOfLegislativeYear_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfLegislativeYear");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _SessionCalendar_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "SessionCalendar");
    private final static QName _LegislativeDay_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "LegislativeDay");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _GetSessionsJsonResponseGetSessionsJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetSessionsJsonResult");
    private final static QName _SessionDescription_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Description");
    private final static QName _SessionLibrary_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Library");
    private final static QName _LegislativeYearDays_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Days");
    private final static QName _GetSessionsXmlResponseGetSessionsXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetSessionsXmlResult");
    private final static QName _GetSessionScheduleJsonSessionId_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "SessionId");
    private final static QName _GetSessionScheduleJsonChamber_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "Chamber");
    private final static QName _GetSessionScheduleResponseGetSessionScheduleResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetSessionScheduleResult");
    private final static QName _GetSessionsResponseGetSessionsResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetSessionsResult");
    private final static QName _GetSessionScheduleXmlResponseGetSessionScheduleXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetSessionScheduleXmlResult");
    private final static QName _GetYearsXmlResponseGetYearsXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetYearsXmlResult");
    private final static QName _GetYearsResponseGetYearsResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetYearsResult");
    private final static QName _GetSessionScheduleJsonResponseGetSessionScheduleJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetSessionScheduleJsonResult");
    private final static QName _GetYearsJsonResponseGetYearsJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetYearsJsonResult");
    private final static QName _SessionCalendarYears_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Years");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.ga.legis.session
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfSession }
     * 
     */
    public ArrayOfSession createArrayOfSession() {
        return new ArrayOfSession();
    }

    /**
     * Create an instance of {@link ArrayOfLegislativeYear }
     * 
     */
    public ArrayOfLegislativeYear createArrayOfLegislativeYear() {
        return new ArrayOfLegislativeYear();
    }

    /**
     * Create an instance of {@link LegislativeYear }
     * 
     */
    public LegislativeYear createLegislativeYear() {
        return new LegislativeYear();
    }

    /**
     * Create an instance of {@link ArrayOfYear }
     * 
     */
    public ArrayOfYear createArrayOfYear() {
        return new ArrayOfYear();
    }

    /**
     * Create an instance of {@link Year }
     * 
     */
    public Year createYear() {
        return new Year();
    }

    /**
     * Create an instance of {@link SessionCalendar }
     * 
     */
    public SessionCalendar createSessionCalendar() {
        return new SessionCalendar();
    }

    /**
     * Create an instance of {@link LegislativeDay }
     * 
     */
    public LegislativeDay createLegislativeDay() {
        return new LegislativeDay();
    }

    /**
     * Create an instance of {@link Session }
     * 
     */
    public Session createSession() {
        return new Session();
    }

    /**
     * Create an instance of {@link ArrayOfLegislativeDay }
     * 
     */
    public ArrayOfLegislativeDay createArrayOfLegislativeDay() {
        return new ArrayOfLegislativeDay();
    }

    /**
     * Create an instance of {@link GetSessionScheduleXml }
     * 
     */
    public GetSessionScheduleXml createGetSessionScheduleXml() {
        return new GetSessionScheduleXml();
    }

    /**
     * Create an instance of {@link GetYearsXmlResponse }
     * 
     */
    public GetYearsXmlResponse createGetYearsXmlResponse() {
        return new GetYearsXmlResponse();
    }

    /**
     * Create an instance of {@link GetSessionScheduleResponse }
     * 
     */
    public GetSessionScheduleResponse createGetSessionScheduleResponse() {
        return new GetSessionScheduleResponse();
    }

    /**
     * Create an instance of {@link GetSessionScheduleJsonResponse }
     * 
     */
    public GetSessionScheduleJsonResponse createGetSessionScheduleJsonResponse() {
        return new GetSessionScheduleJsonResponse();
    }

    /**
     * Create an instance of {@link GetSessionScheduleXmlResponse }
     * 
     */
    public GetSessionScheduleXmlResponse createGetSessionScheduleXmlResponse() {
        return new GetSessionScheduleXmlResponse();
    }

    /**
     * Create an instance of {@link GetYearsJson }
     * 
     */
    public GetYearsJson createGetYearsJson() {
        return new GetYearsJson();
    }

    /**
     * Create an instance of {@link GetSessions }
     * 
     */
    public GetSessions createGetSessions() {
        return new GetSessions();
    }

    /**
     * Create an instance of {@link GetYears }
     * 
     */
    public GetYears createGetYears() {
        return new GetYears();
    }

    /**
     * Create an instance of {@link GetSessionsResponse }
     * 
     */
    public GetSessionsResponse createGetSessionsResponse() {
        return new GetSessionsResponse();
    }

    /**
     * Create an instance of {@link GetYearsResponse }
     * 
     */
    public GetYearsResponse createGetYearsResponse() {
        return new GetYearsResponse();
    }

    /**
     * Create an instance of {@link GetYearsJsonResponse }
     * 
     */
    public GetYearsJsonResponse createGetYearsJsonResponse() {
        return new GetYearsJsonResponse();
    }

    /**
     * Create an instance of {@link GetSessionsXml }
     * 
     */
    public GetSessionsXml createGetSessionsXml() {
        return new GetSessionsXml();
    }

    /**
     * Create an instance of {@link GetSessionScheduleJson }
     * 
     */
    public GetSessionScheduleJson createGetSessionScheduleJson() {
        return new GetSessionScheduleJson();
    }

    /**
     * Create an instance of {@link GetSessionSchedule }
     * 
     */
    public GetSessionSchedule createGetSessionSchedule() {
        return new GetSessionSchedule();
    }

    /**
     * Create an instance of {@link GetSessionsXmlResponse }
     * 
     */
    public GetSessionsXmlResponse createGetSessionsXmlResponse() {
        return new GetSessionsXmlResponse();
    }

    /**
     * Create an instance of {@link GetYearsXml }
     * 
     */
    public GetYearsXml createGetYearsXml() {
        return new GetYearsXml();
    }

    /**
     * Create an instance of {@link GetSessionsJsonResponse }
     * 
     */
    public GetSessionsJsonResponse createGetSessionsJsonResponse() {
        return new GetSessionsJsonResponse();
    }

    /**
     * Create an instance of {@link GetSessionsJson }
     * 
     */
    public GetSessionsJson createGetSessionsJson() {
        return new GetSessionsJson();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislativeYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "LegislativeYear")
    public JAXBElement<LegislativeYear> createLegislativeYear(LegislativeYear value) {
        return new JAXBElement<LegislativeYear>(_LegislativeYear_QNAME, LegislativeYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislativeDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfLegislativeDay")
    public JAXBElement<ArrayOfLegislativeDay> createArrayOfLegislativeDay(ArrayOfLegislativeDay value) {
        return new JAXBElement<ArrayOfLegislativeDay>(_ArrayOfLegislativeDay_QNAME, ArrayOfLegislativeDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfYear")
    public JAXBElement<ArrayOfYear> createArrayOfYear(ArrayOfYear value) {
        return new JAXBElement<ArrayOfYear>(_ArrayOfYear_QNAME, ArrayOfYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Year }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Year")
    public JAXBElement<Year> createYear(Year value) {
        return new JAXBElement<Year>(_Year_QNAME, Year.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Chamber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Chamber")
    public JAXBElement<Chamber> createChamber(Chamber value) {
        return new JAXBElement<Chamber>(_Chamber_QNAME, Chamber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Session }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Session")
    public JAXBElement<Session> createSession(Session value) {
        return new JAXBElement<Session>(_Session_QNAME, Session.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfSession")
    public JAXBElement<ArrayOfSession> createArrayOfSession(ArrayOfSession value) {
        return new JAXBElement<ArrayOfSession>(_ArrayOfSession_QNAME, ArrayOfSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislativeYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfLegislativeYear")
    public JAXBElement<ArrayOfLegislativeYear> createArrayOfLegislativeYear(ArrayOfLegislativeYear value) {
        return new JAXBElement<ArrayOfLegislativeYear>(_ArrayOfLegislativeYear_QNAME, ArrayOfLegislativeYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "SessionCalendar")
    public JAXBElement<SessionCalendar> createSessionCalendar(SessionCalendar value) {
        return new JAXBElement<SessionCalendar>(_SessionCalendar_QNAME, SessionCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislativeDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "LegislativeDay")
    public JAXBElement<LegislativeDay> createLegislativeDay(LegislativeDay value) {
        return new JAXBElement<LegislativeDay>(_LegislativeDay_QNAME, LegislativeDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetSessionsJsonResult", scope = GetSessionsJsonResponse.class)
    public JAXBElement<ArrayOfSession> createGetSessionsJsonResponseGetSessionsJsonResult(ArrayOfSession value) {
        return new JAXBElement<ArrayOfSession>(_GetSessionsJsonResponseGetSessionsJsonResult_QNAME, ArrayOfSession.class, GetSessionsJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Description", scope = Session.class)
    public JAXBElement<String> createSessionDescription(String value) {
        return new JAXBElement<String>(_SessionDescription_QNAME, String.class, Session.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Library", scope = Session.class)
    public JAXBElement<String> createSessionLibrary(String value) {
        return new JAXBElement<String>(_SessionLibrary_QNAME, String.class, Session.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislativeDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Days", scope = LegislativeYear.class)
    public JAXBElement<ArrayOfLegislativeDay> createLegislativeYearDays(ArrayOfLegislativeDay value) {
        return new JAXBElement<ArrayOfLegislativeDay>(_LegislativeYearDays_QNAME, ArrayOfLegislativeDay.class, LegislativeYear.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetSessionsXmlResult", scope = GetSessionsXmlResponse.class)
    public JAXBElement<ArrayOfSession> createGetSessionsXmlResponseGetSessionsXmlResult(ArrayOfSession value) {
        return new JAXBElement<ArrayOfSession>(_GetSessionsXmlResponseGetSessionsXmlResult_QNAME, ArrayOfSession.class, GetSessionsXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetSessionScheduleJson.class)
    public JAXBElement<String> createGetSessionScheduleJsonSessionId(String value) {
        return new JAXBElement<String>(_GetSessionScheduleJsonSessionId_QNAME, String.class, GetSessionScheduleJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Chamber", scope = GetSessionScheduleJson.class)
    public JAXBElement<String> createGetSessionScheduleJsonChamber(String value) {
        return new JAXBElement<String>(_GetSessionScheduleJsonChamber_QNAME, String.class, GetSessionScheduleJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetSessionScheduleResult", scope = GetSessionScheduleResponse.class)
    public JAXBElement<SessionCalendar> createGetSessionScheduleResponseGetSessionScheduleResult(SessionCalendar value) {
        return new JAXBElement<SessionCalendar>(_GetSessionScheduleResponseGetSessionScheduleResult_QNAME, SessionCalendar.class, GetSessionScheduleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetSessionsResult", scope = GetSessionsResponse.class)
    public JAXBElement<ArrayOfSession> createGetSessionsResponseGetSessionsResult(ArrayOfSession value) {
        return new JAXBElement<ArrayOfSession>(_GetSessionsResponseGetSessionsResult_QNAME, ArrayOfSession.class, GetSessionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetSessionScheduleXmlResult", scope = GetSessionScheduleXmlResponse.class)
    public JAXBElement<SessionCalendar> createGetSessionScheduleXmlResponseGetSessionScheduleXmlResult(SessionCalendar value) {
        return new JAXBElement<SessionCalendar>(_GetSessionScheduleXmlResponseGetSessionScheduleXmlResult_QNAME, SessionCalendar.class, GetSessionScheduleXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetYearsXmlResult", scope = GetYearsXmlResponse.class)
    public JAXBElement<ArrayOfYear> createGetYearsXmlResponseGetYearsXmlResult(ArrayOfYear value) {
        return new JAXBElement<ArrayOfYear>(_GetYearsXmlResponseGetYearsXmlResult_QNAME, ArrayOfYear.class, GetYearsXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetYearsResult", scope = GetYearsResponse.class)
    public JAXBElement<ArrayOfYear> createGetYearsResponseGetYearsResult(ArrayOfYear value) {
        return new JAXBElement<ArrayOfYear>(_GetYearsResponseGetYearsResult_QNAME, ArrayOfYear.class, GetYearsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Session }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Session", scope = LegislativeDay.class)
    public JAXBElement<Session> createLegislativeDaySession(Session value) {
        return new JAXBElement<Session>(_Session_QNAME, Session.class, LegislativeDay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetSessionScheduleJsonResult", scope = GetSessionScheduleJsonResponse.class)
    public JAXBElement<SessionCalendar> createGetSessionScheduleJsonResponseGetSessionScheduleJsonResult(SessionCalendar value) {
        return new JAXBElement<SessionCalendar>(_GetSessionScheduleJsonResponseGetSessionScheduleJsonResult_QNAME, SessionCalendar.class, GetSessionScheduleJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetYearsJsonResult", scope = GetYearsJsonResponse.class)
    public JAXBElement<ArrayOfYear> createGetYearsJsonResponseGetYearsJsonResult(ArrayOfYear value) {
        return new JAXBElement<ArrayOfYear>(_GetYearsJsonResponseGetYearsJsonResult_QNAME, ArrayOfYear.class, GetYearsJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetSessionScheduleXml.class)
    public JAXBElement<String> createGetSessionScheduleXmlSessionId(String value) {
        return new JAXBElement<String>(_GetSessionScheduleJsonSessionId_QNAME, String.class, GetSessionScheduleXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Chamber", scope = GetSessionScheduleXml.class)
    public JAXBElement<String> createGetSessionScheduleXmlChamber(String value) {
        return new JAXBElement<String>(_GetSessionScheduleJsonChamber_QNAME, String.class, GetSessionScheduleXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislativeYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Years", scope = SessionCalendar.class)
    public JAXBElement<ArrayOfLegislativeYear> createSessionCalendarYears(ArrayOfLegislativeYear value) {
        return new JAXBElement<ArrayOfLegislativeYear>(_SessionCalendarYears_QNAME, ArrayOfLegislativeYear.class, SessionCalendar.class, value);
    }

}
