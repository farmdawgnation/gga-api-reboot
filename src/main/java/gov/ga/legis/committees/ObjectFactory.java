
package gov.ga.legis.committees;

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
 * generated in the gov.ga.legis.committees package. 
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

    private final static QName _DistrictType_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "DistrictType");
    private final static QName _CommitteeBase_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CommitteeBase");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfSubCommittee_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfSubCommittee");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _SubCommittee_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "SubCommittee");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _District_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "District");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Session_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Session");
    private final static QName _ArrayOfCommitteeMember_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfCommitteeMember");
    private final static QName _CommitteeMember_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CommitteeMember");
    private final static QName _MemberListing_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "MemberListing");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _Address_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Address");
    private final static QName _ArrayOfSession_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfSession");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _CommitteeType_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CommitteeType");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Name_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Name");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfCommitteeListing_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfCommitteeListing");
    private final static QName _CommitteeListing_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CommitteeListing");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Party_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Party");
    private final static QName _CommitteeDetail_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CommitteeDetail");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _DistrictPost_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Post");
    private final static QName _DistrictCoverage_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Coverage");
    private final static QName _MemberListingDateVacated_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "DateVacated");
    private final static QName _MemberListingResidence_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Residence");
    private final static QName _GetCommitteesByTypeAndSessionXmlResponseGetCommitteesByTypeAndSessionXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetCommitteesByTypeAndSessionXmlResult");
    private final static QName _GetCommitteesBySessionXmlResponseGetCommitteesBySessionXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetCommitteesBySessionXmlResult");
    private final static QName _AddressPhone_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Phone");
    private final static QName _AddressState_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "State");
    private final static QName _AddressZip_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Zip");
    private final static QName _AddressEmail_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Email");
    private final static QName _AddressFax_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Fax");
    private final static QName _AddressStreet_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Street");
    private final static QName _AddressCity_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "City");
    private final static QName _GetCommitteesBySessionResponseGetCommitteesBySessionResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetCommitteesBySessionResult");
    private final static QName _GetCommitteeXmlCommitteeId_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "CommitteeId");
    private final static QName _GetCommitteeForSessionJsonSessionId_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "SessionId");
    private final static QName _GetCommitteesJsonResponseGetCommitteesJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetCommitteesJsonResult");
    private final static QName _GetCommitteesByTypeAndSessionJsonType_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "Type");
    private final static QName _NameLast_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Last");
    private final static QName _NameMiddle_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Middle");
    private final static QName _NameNickname_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Nickname");
    private final static QName _NameFirst_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "First");
    private final static QName _GetCommitteesXmlResponseGetCommitteesXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetCommitteesXmlResult");
    private final static QName _GetCommitteeJsonResponseGetCommitteeJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetCommitteeJsonResult");
    private final static QName _GetCommitteesBySessionJsonResponseGetCommitteesBySessionJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetCommitteesBySessionJsonResult");
    private final static QName _GetCommitteeForSessionXmlResponseGetCommitteeForSessionXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetCommitteeForSessionXmlResult");
    private final static QName _GetCommitteesByTypeAndSessionResponseGetCommitteesByTypeAndSessionResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetCommitteesByTypeAndSessionResult");
    private final static QName _GetCommitteeForSessionJsonResponseGetCommitteeForSessionJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetCommitteeForSessionJsonResult");
    private final static QName _SessionDescription_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Description");
    private final static QName _SessionLibrary_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Library");
    private final static QName _GetCommitteeXmlResponseGetCommitteeXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetCommitteeXmlResult");
    private final static QName _CommitteeBaseCode_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Code");
    private final static QName _GetCommitteeResponseGetCommitteeResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetCommitteeResult");
    private final static QName _CommitteeMemberRole_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Role");
    private final static QName _CommitteeMemberMember_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Member");
    private final static QName _CommitteeMemberSubCommittees_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "SubCommittees");
    private final static QName _CommitteeDetailStaff_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Staff");
    private final static QName _CommitteeDetailMembers_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Members");
    private final static QName _CommitteeDetailSessionContexts_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "SessionContexts");
    private final static QName _GetCommitteesByTypeAndSessionJsonResponseGetCommitteesByTypeAndSessionJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetCommitteesByTypeAndSessionJsonResult");
    private final static QName _GetCommitteeForSessionResponseGetCommitteeForSessionResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetCommitteeForSessionResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.ga.legis.committees
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ArrayOfSession }
     * 
     */
    public ArrayOfSession createArrayOfSession() {
        return new ArrayOfSession();
    }

    /**
     * Create an instance of {@link CommitteeBase }
     * 
     */
    public CommitteeBase createCommitteeBase() {
        return new CommitteeBase();
    }

    /**
     * Create an instance of {@link ArrayOfSubCommittee }
     * 
     */
    public ArrayOfSubCommittee createArrayOfSubCommittee() {
        return new ArrayOfSubCommittee();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link SubCommittee }
     * 
     */
    public SubCommittee createSubCommittee() {
        return new SubCommittee();
    }

    /**
     * Create an instance of {@link ArrayOfCommitteeListing }
     * 
     */
    public ArrayOfCommitteeListing createArrayOfCommitteeListing() {
        return new ArrayOfCommitteeListing();
    }

    /**
     * Create an instance of {@link CommitteeListing }
     * 
     */
    public CommitteeListing createCommitteeListing() {
        return new CommitteeListing();
    }

    /**
     * Create an instance of {@link CommitteeDetail }
     * 
     */
    public CommitteeDetail createCommitteeDetail() {
        return new CommitteeDetail();
    }

    /**
     * Create an instance of {@link ArrayOfCommitteeMember }
     * 
     */
    public ArrayOfCommitteeMember createArrayOfCommitteeMember() {
        return new ArrayOfCommitteeMember();
    }

    /**
     * Create an instance of {@link CommitteeMember }
     * 
     */
    public CommitteeMember createCommitteeMember() {
        return new CommitteeMember();
    }

    /**
     * Create an instance of {@link MemberListing }
     * 
     */
    public MemberListing createMemberListing() {
        return new MemberListing();
    }

    /**
     * Create an instance of {@link District }
     * 
     */
    public District createDistrict() {
        return new District();
    }

    /**
     * Create an instance of {@link Session }
     * 
     */
    public Session createSession() {
        return new Session();
    }

    /**
     * Create an instance of {@link GetCommitteesBySessionResponse }
     * 
     */
    public GetCommitteesBySessionResponse createGetCommitteesBySessionResponse() {
        return new GetCommitteesBySessionResponse();
    }

    /**
     * Create an instance of {@link GetCommitteesByTypeAndSessionJsonResponse }
     * 
     */
    public GetCommitteesByTypeAndSessionJsonResponse createGetCommitteesByTypeAndSessionJsonResponse() {
        return new GetCommitteesByTypeAndSessionJsonResponse();
    }

    /**
     * Create an instance of {@link GetCommitteeXmlResponse }
     * 
     */
    public GetCommitteeXmlResponse createGetCommitteeXmlResponse() {
        return new GetCommitteeXmlResponse();
    }

    /**
     * Create an instance of {@link GetCommitteesXml }
     * 
     */
    public GetCommitteesXml createGetCommitteesXml() {
        return new GetCommitteesXml();
    }

    /**
     * Create an instance of {@link GetCommitteesByTypeAndSession }
     * 
     */
    public GetCommitteesByTypeAndSession createGetCommitteesByTypeAndSession() {
        return new GetCommitteesByTypeAndSession();
    }

    /**
     * Create an instance of {@link GetCommitteesXmlResponse }
     * 
     */
    public GetCommitteesXmlResponse createGetCommitteesXmlResponse() {
        return new GetCommitteesXmlResponse();
    }

    /**
     * Create an instance of {@link GetCommitteesBySessionXmlResponse }
     * 
     */
    public GetCommitteesBySessionXmlResponse createGetCommitteesBySessionXmlResponse() {
        return new GetCommitteesBySessionXmlResponse();
    }

    /**
     * Create an instance of {@link GetCommitteeXml }
     * 
     */
    public GetCommitteeXml createGetCommitteeXml() {
        return new GetCommitteeXml();
    }

    /**
     * Create an instance of {@link GetCommitteeJson }
     * 
     */
    public GetCommitteeJson createGetCommitteeJson() {
        return new GetCommitteeJson();
    }

    /**
     * Create an instance of {@link GetCommitteeForSession }
     * 
     */
    public GetCommitteeForSession createGetCommitteeForSession() {
        return new GetCommitteeForSession();
    }

    /**
     * Create an instance of {@link GetCommitteesBySession }
     * 
     */
    public GetCommitteesBySession createGetCommitteesBySession() {
        return new GetCommitteesBySession();
    }

    /**
     * Create an instance of {@link GetCommitteesByTypeAndSessionXml }
     * 
     */
    public GetCommitteesByTypeAndSessionXml createGetCommitteesByTypeAndSessionXml() {
        return new GetCommitteesByTypeAndSessionXml();
    }

    /**
     * Create an instance of {@link GetCommitteeResponse }
     * 
     */
    public GetCommitteeResponse createGetCommitteeResponse() {
        return new GetCommitteeResponse();
    }

    /**
     * Create an instance of {@link GetCommitteeForSessionJson }
     * 
     */
    public GetCommitteeForSessionJson createGetCommitteeForSessionJson() {
        return new GetCommitteeForSessionJson();
    }

    /**
     * Create an instance of {@link GetCommitteesByTypeAndSessionResponse }
     * 
     */
    public GetCommitteesByTypeAndSessionResponse createGetCommitteesByTypeAndSessionResponse() {
        return new GetCommitteesByTypeAndSessionResponse();
    }

    /**
     * Create an instance of {@link GetCommitteesJsonResponse }
     * 
     */
    public GetCommitteesJsonResponse createGetCommitteesJsonResponse() {
        return new GetCommitteesJsonResponse();
    }

    /**
     * Create an instance of {@link GetCommitteeForSessionJsonResponse }
     * 
     */
    public GetCommitteeForSessionJsonResponse createGetCommitteeForSessionJsonResponse() {
        return new GetCommitteeForSessionJsonResponse();
    }

    /**
     * Create an instance of {@link GetCommitteesByTypeAndSessionXmlResponse }
     * 
     */
    public GetCommitteesByTypeAndSessionXmlResponse createGetCommitteesByTypeAndSessionXmlResponse() {
        return new GetCommitteesByTypeAndSessionXmlResponse();
    }

    /**
     * Create an instance of {@link GetCommitteeForSessionXml }
     * 
     */
    public GetCommitteeForSessionXml createGetCommitteeForSessionXml() {
        return new GetCommitteeForSessionXml();
    }

    /**
     * Create an instance of {@link GetCommitteeJsonResponse }
     * 
     */
    public GetCommitteeJsonResponse createGetCommitteeJsonResponse() {
        return new GetCommitteeJsonResponse();
    }

    /**
     * Create an instance of {@link GetCommittee }
     * 
     */
    public GetCommittee createGetCommittee() {
        return new GetCommittee();
    }

    /**
     * Create an instance of {@link GetCommitteesJson }
     * 
     */
    public GetCommitteesJson createGetCommitteesJson() {
        return new GetCommitteesJson();
    }

    /**
     * Create an instance of {@link GetCommitteesBySessionJson }
     * 
     */
    public GetCommitteesBySessionJson createGetCommitteesBySessionJson() {
        return new GetCommitteesBySessionJson();
    }

    /**
     * Create an instance of {@link GetCommitteeForSessionXmlResponse }
     * 
     */
    public GetCommitteeForSessionXmlResponse createGetCommitteeForSessionXmlResponse() {
        return new GetCommitteeForSessionXmlResponse();
    }

    /**
     * Create an instance of {@link GetCommitteesByTypeAndSessionJson }
     * 
     */
    public GetCommitteesByTypeAndSessionJson createGetCommitteesByTypeAndSessionJson() {
        return new GetCommitteesByTypeAndSessionJson();
    }

    /**
     * Create an instance of {@link GetCommitteesBySessionJsonResponse }
     * 
     */
    public GetCommitteesBySessionJsonResponse createGetCommitteesBySessionJsonResponse() {
        return new GetCommitteesBySessionJsonResponse();
    }

    /**
     * Create an instance of {@link GetCommitteeForSessionResponse }
     * 
     */
    public GetCommitteeForSessionResponse createGetCommitteeForSessionResponse() {
        return new GetCommitteeForSessionResponse();
    }

    /**
     * Create an instance of {@link GetCommitteesBySessionXml }
     * 
     */
    public GetCommitteesBySessionXml createGetCommitteesBySessionXml() {
        return new GetCommitteesBySessionXml();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistrictType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "DistrictType")
    public JAXBElement<DistrictType> createDistrictType(DistrictType value) {
        return new JAXBElement<DistrictType>(_DistrictType_QNAME, DistrictType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "CommitteeBase")
    public JAXBElement<CommitteeBase> createCommitteeBase(CommitteeBase value) {
        return new JAXBElement<CommitteeBase>(_CommitteeBase_QNAME, CommitteeBase.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubCommittee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfSubCommittee")
    public JAXBElement<ArrayOfSubCommittee> createArrayOfSubCommittee(ArrayOfSubCommittee value) {
        return new JAXBElement<ArrayOfSubCommittee>(_ArrayOfSubCommittee_QNAME, ArrayOfSubCommittee.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubCommittee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "SubCommittee")
    public JAXBElement<SubCommittee> createSubCommittee(SubCommittee value) {
        return new JAXBElement<SubCommittee>(_SubCommittee_QNAME, SubCommittee.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link District }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "District")
    public JAXBElement<District> createDistrict(District value) {
        return new JAXBElement<District>(_District_QNAME, District.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitteeMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfCommitteeMember")
    public JAXBElement<ArrayOfCommitteeMember> createArrayOfCommitteeMember(ArrayOfCommitteeMember value) {
        return new JAXBElement<ArrayOfCommitteeMember>(_ArrayOfCommitteeMember_QNAME, ArrayOfCommitteeMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "CommitteeMember")
    public JAXBElement<CommitteeMember> createCommitteeMember(CommitteeMember value) {
        return new JAXBElement<CommitteeMember>(_CommitteeMember_QNAME, CommitteeMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "MemberListing")
    public JAXBElement<MemberListing> createMemberListing(MemberListing value) {
        return new JAXBElement<MemberListing>(_MemberListing_QNAME, MemberListing.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "CommitteeType")
    public JAXBElement<CommitteeType> createCommitteeType(CommitteeType value) {
        return new JAXBElement<CommitteeType>(_CommitteeType_QNAME, CommitteeType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Name")
    public JAXBElement<Name> createName(Name value) {
        return new JAXBElement<Name>(_Name_QNAME, Name.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfCommitteeListing")
    public JAXBElement<ArrayOfCommitteeListing> createArrayOfCommitteeListing(ArrayOfCommitteeListing value) {
        return new JAXBElement<ArrayOfCommitteeListing>(_ArrayOfCommitteeListing_QNAME, ArrayOfCommitteeListing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "CommitteeListing")
    public JAXBElement<CommitteeListing> createCommitteeListing(CommitteeListing value) {
        return new JAXBElement<CommitteeListing>(_CommitteeListing_QNAME, CommitteeListing.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Party }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Party")
    public JAXBElement<Party> createParty(Party value) {
        return new JAXBElement<Party>(_Party_QNAME, Party.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "CommitteeDetail")
    public JAXBElement<CommitteeDetail> createCommitteeDetail(CommitteeDetail value) {
        return new JAXBElement<CommitteeDetail>(_CommitteeDetail_QNAME, CommitteeDetail.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Post", scope = District.class)
    public JAXBElement<Integer> createDistrictPost(Integer value) {
        return new JAXBElement<Integer>(_DistrictPost_QNAME, Integer.class, District.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Coverage", scope = District.class)
    public JAXBElement<String> createDistrictCoverage(String value) {
        return new JAXBElement<String>(_DistrictCoverage_QNAME, String.class, District.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "DateVacated", scope = MemberListing.class)
    public JAXBElement<XMLGregorianCalendar> createMemberListingDateVacated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MemberListingDateVacated_QNAME, XMLGregorianCalendar.class, MemberListing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link District }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "District", scope = MemberListing.class)
    public JAXBElement<District> createMemberListingDistrict(District value) {
        return new JAXBElement<District>(_District_QNAME, District.class, MemberListing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Residence", scope = MemberListing.class)
    public JAXBElement<String> createMemberListingResidence(String value) {
        return new JAXBElement<String>(_MemberListingResidence_QNAME, String.class, MemberListing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetCommitteesByTypeAndSessionXmlResult", scope = GetCommitteesByTypeAndSessionXmlResponse.class)
    public JAXBElement<ArrayOfCommitteeListing> createGetCommitteesByTypeAndSessionXmlResponseGetCommitteesByTypeAndSessionXmlResult(ArrayOfCommitteeListing value) {
        return new JAXBElement<ArrayOfCommitteeListing>(_GetCommitteesByTypeAndSessionXmlResponseGetCommitteesByTypeAndSessionXmlResult_QNAME, ArrayOfCommitteeListing.class, GetCommitteesByTypeAndSessionXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetCommitteesBySessionXmlResult", scope = GetCommitteesBySessionXmlResponse.class)
    public JAXBElement<ArrayOfCommitteeListing> createGetCommitteesBySessionXmlResponseGetCommitteesBySessionXmlResult(ArrayOfCommitteeListing value) {
        return new JAXBElement<ArrayOfCommitteeListing>(_GetCommitteesBySessionXmlResponseGetCommitteesBySessionXmlResult_QNAME, ArrayOfCommitteeListing.class, GetCommitteesBySessionXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Phone", scope = Address.class)
    public JAXBElement<String> createAddressPhone(String value) {
        return new JAXBElement<String>(_AddressPhone_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "State", scope = Address.class)
    public JAXBElement<String> createAddressState(String value) {
        return new JAXBElement<String>(_AddressState_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Zip", scope = Address.class)
    public JAXBElement<String> createAddressZip(String value) {
        return new JAXBElement<String>(_AddressZip_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Email", scope = Address.class)
    public JAXBElement<String> createAddressEmail(String value) {
        return new JAXBElement<String>(_AddressEmail_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Fax", scope = Address.class)
    public JAXBElement<String> createAddressFax(String value) {
        return new JAXBElement<String>(_AddressFax_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Street", scope = Address.class)
    public JAXBElement<String> createAddressStreet(String value) {
        return new JAXBElement<String>(_AddressStreet_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "City", scope = Address.class)
    public JAXBElement<String> createAddressCity(String value) {
        return new JAXBElement<String>(_AddressCity_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetCommitteesBySessionResult", scope = GetCommitteesBySessionResponse.class)
    public JAXBElement<ArrayOfCommitteeListing> createGetCommitteesBySessionResponseGetCommitteesBySessionResult(ArrayOfCommitteeListing value) {
        return new JAXBElement<ArrayOfCommitteeListing>(_GetCommitteesBySessionResponseGetCommitteesBySessionResult_QNAME, ArrayOfCommitteeListing.class, GetCommitteesBySessionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "CommitteeId", scope = GetCommitteeXml.class)
    public JAXBElement<String> createGetCommitteeXmlCommitteeId(String value) {
        return new JAXBElement<String>(_GetCommitteeXmlCommitteeId_QNAME, String.class, GetCommitteeXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "CommitteeId", scope = GetCommitteeForSessionJson.class)
    public JAXBElement<String> createGetCommitteeForSessionJsonCommitteeId(String value) {
        return new JAXBElement<String>(_GetCommitteeXmlCommitteeId_QNAME, String.class, GetCommitteeForSessionJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetCommitteeForSessionJson.class)
    public JAXBElement<String> createGetCommitteeForSessionJsonSessionId(String value) {
        return new JAXBElement<String>(_GetCommitteeForSessionJsonSessionId_QNAME, String.class, GetCommitteeForSessionJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetCommitteesJsonResult", scope = GetCommitteesJsonResponse.class)
    public JAXBElement<ArrayOfCommitteeListing> createGetCommitteesJsonResponseGetCommitteesJsonResult(ArrayOfCommitteeListing value) {
        return new JAXBElement<ArrayOfCommitteeListing>(_GetCommitteesJsonResponseGetCommitteesJsonResult_QNAME, ArrayOfCommitteeListing.class, GetCommitteesJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Type", scope = GetCommitteesByTypeAndSessionJson.class)
    public JAXBElement<String> createGetCommitteesByTypeAndSessionJsonType(String value) {
        return new JAXBElement<String>(_GetCommitteesByTypeAndSessionJsonType_QNAME, String.class, GetCommitteesByTypeAndSessionJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetCommitteesByTypeAndSessionJson.class)
    public JAXBElement<String> createGetCommitteesByTypeAndSessionJsonSessionId(String value) {
        return new JAXBElement<String>(_GetCommitteeForSessionJsonSessionId_QNAME, String.class, GetCommitteesByTypeAndSessionJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Last", scope = Name.class)
    public JAXBElement<String> createNameLast(String value) {
        return new JAXBElement<String>(_NameLast_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Middle", scope = Name.class)
    public JAXBElement<String> createNameMiddle(String value) {
        return new JAXBElement<String>(_NameMiddle_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Nickname", scope = Name.class)
    public JAXBElement<String> createNameNickname(String value) {
        return new JAXBElement<String>(_NameNickname_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "First", scope = Name.class)
    public JAXBElement<String> createNameFirst(String value) {
        return new JAXBElement<String>(_NameFirst_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetCommitteesXmlResult", scope = GetCommitteesXmlResponse.class)
    public JAXBElement<ArrayOfCommitteeListing> createGetCommitteesXmlResponseGetCommitteesXmlResult(ArrayOfCommitteeListing value) {
        return new JAXBElement<ArrayOfCommitteeListing>(_GetCommitteesXmlResponseGetCommitteesXmlResult_QNAME, ArrayOfCommitteeListing.class, GetCommitteesXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetCommitteeJsonResult", scope = GetCommitteeJsonResponse.class)
    public JAXBElement<CommitteeDetail> createGetCommitteeJsonResponseGetCommitteeJsonResult(CommitteeDetail value) {
        return new JAXBElement<CommitteeDetail>(_GetCommitteeJsonResponseGetCommitteeJsonResult_QNAME, CommitteeDetail.class, GetCommitteeJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetCommitteesBySessionJsonResult", scope = GetCommitteesBySessionJsonResponse.class)
    public JAXBElement<ArrayOfCommitteeListing> createGetCommitteesBySessionJsonResponseGetCommitteesBySessionJsonResult(ArrayOfCommitteeListing value) {
        return new JAXBElement<ArrayOfCommitteeListing>(_GetCommitteesBySessionJsonResponseGetCommitteesBySessionJsonResult_QNAME, ArrayOfCommitteeListing.class, GetCommitteesBySessionJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetCommitteesBySessionXml.class)
    public JAXBElement<String> createGetCommitteesBySessionXmlSessionId(String value) {
        return new JAXBElement<String>(_GetCommitteeForSessionJsonSessionId_QNAME, String.class, GetCommitteesBySessionXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Name", scope = SubCommittee.class)
    public JAXBElement<String> createSubCommitteeName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, SubCommittee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetCommitteeForSessionXmlResult", scope = GetCommitteeForSessionXmlResponse.class)
    public JAXBElement<CommitteeDetail> createGetCommitteeForSessionXmlResponseGetCommitteeForSessionXmlResult(CommitteeDetail value) {
        return new JAXBElement<CommitteeDetail>(_GetCommitteeForSessionXmlResponseGetCommitteeForSessionXmlResult_QNAME, CommitteeDetail.class, GetCommitteeForSessionXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetCommitteesByTypeAndSessionResult", scope = GetCommitteesByTypeAndSessionResponse.class)
    public JAXBElement<ArrayOfCommitteeListing> createGetCommitteesByTypeAndSessionResponseGetCommitteesByTypeAndSessionResult(ArrayOfCommitteeListing value) {
        return new JAXBElement<ArrayOfCommitteeListing>(_GetCommitteesByTypeAndSessionResponseGetCommitteesByTypeAndSessionResult_QNAME, ArrayOfCommitteeListing.class, GetCommitteesByTypeAndSessionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetCommitteeForSessionJsonResult", scope = GetCommitteeForSessionJsonResponse.class)
    public JAXBElement<CommitteeDetail> createGetCommitteeForSessionJsonResponseGetCommitteeForSessionJsonResult(CommitteeDetail value) {
        return new JAXBElement<CommitteeDetail>(_GetCommitteeForSessionJsonResponseGetCommitteeForSessionJsonResult_QNAME, CommitteeDetail.class, GetCommitteeForSessionJsonResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "CommitteeId", scope = GetCommitteeForSessionXml.class)
    public JAXBElement<String> createGetCommitteeForSessionXmlCommitteeId(String value) {
        return new JAXBElement<String>(_GetCommitteeXmlCommitteeId_QNAME, String.class, GetCommitteeForSessionXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetCommitteeForSessionXml.class)
    public JAXBElement<String> createGetCommitteeForSessionXmlSessionId(String value) {
        return new JAXBElement<String>(_GetCommitteeForSessionJsonSessionId_QNAME, String.class, GetCommitteeForSessionXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetCommitteeXmlResult", scope = GetCommitteeXmlResponse.class)
    public JAXBElement<CommitteeDetail> createGetCommitteeXmlResponseGetCommitteeXmlResult(CommitteeDetail value) {
        return new JAXBElement<CommitteeDetail>(_GetCommitteeXmlResponseGetCommitteeXmlResult_QNAME, CommitteeDetail.class, GetCommitteeXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Code", scope = CommitteeBase.class)
    public JAXBElement<String> createCommitteeBaseCode(String value) {
        return new JAXBElement<String>(_CommitteeBaseCode_QNAME, String.class, CommitteeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Name", scope = CommitteeBase.class)
    public JAXBElement<String> createCommitteeBaseName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, CommitteeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "CommitteeId", scope = GetCommitteeJson.class)
    public JAXBElement<String> createGetCommitteeJsonCommitteeId(String value) {
        return new JAXBElement<String>(_GetCommitteeXmlCommitteeId_QNAME, String.class, GetCommitteeJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetCommitteeResult", scope = GetCommitteeResponse.class)
    public JAXBElement<CommitteeDetail> createGetCommitteeResponseGetCommitteeResult(CommitteeDetail value) {
        return new JAXBElement<CommitteeDetail>(_GetCommitteeResponseGetCommitteeResult_QNAME, CommitteeDetail.class, GetCommitteeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "DateVacated", scope = CommitteeMember.class)
    public JAXBElement<XMLGregorianCalendar> createCommitteeMemberDateVacated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MemberListingDateVacated_QNAME, XMLGregorianCalendar.class, CommitteeMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Role", scope = CommitteeMember.class)
    public JAXBElement<String> createCommitteeMemberRole(String value) {
        return new JAXBElement<String>(_CommitteeMemberRole_QNAME, String.class, CommitteeMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Member", scope = CommitteeMember.class)
    public JAXBElement<MemberListing> createCommitteeMemberMember(MemberListing value) {
        return new JAXBElement<MemberListing>(_CommitteeMemberMember_QNAME, MemberListing.class, CommitteeMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubCommittee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "SubCommittees", scope = CommitteeMember.class)
    public JAXBElement<ArrayOfSubCommittee> createCommitteeMemberSubCommittees(ArrayOfSubCommittee value) {
        return new JAXBElement<ArrayOfSubCommittee>(_CommitteeMemberSubCommittees_QNAME, ArrayOfSubCommittee.class, CommitteeMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetCommitteesBySessionJson.class)
    public JAXBElement<String> createGetCommitteesBySessionJsonSessionId(String value) {
        return new JAXBElement<String>(_GetCommitteeForSessionJsonSessionId_QNAME, String.class, GetCommitteesBySessionJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Staff", scope = CommitteeDetail.class)
    public JAXBElement<String> createCommitteeDetailStaff(String value) {
        return new JAXBElement<String>(_CommitteeDetailStaff_QNAME, String.class, CommitteeDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Description", scope = CommitteeDetail.class)
    public JAXBElement<String> createCommitteeDetailDescription(String value) {
        return new JAXBElement<String>(_SessionDescription_QNAME, String.class, CommitteeDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitteeMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Members", scope = CommitteeDetail.class)
    public JAXBElement<ArrayOfCommitteeMember> createCommitteeDetailMembers(ArrayOfCommitteeMember value) {
        return new JAXBElement<ArrayOfCommitteeMember>(_CommitteeDetailMembers_QNAME, ArrayOfCommitteeMember.class, CommitteeDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "SessionContexts", scope = CommitteeDetail.class)
    public JAXBElement<ArrayOfSession> createCommitteeDetailSessionContexts(ArrayOfSession value) {
        return new JAXBElement<ArrayOfSession>(_CommitteeDetailSessionContexts_QNAME, ArrayOfSession.class, CommitteeDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Session }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Session", scope = CommitteeDetail.class)
    public JAXBElement<Session> createCommitteeDetailSession(Session value) {
        return new JAXBElement<Session>(_Session_QNAME, Session.class, CommitteeDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubCommittee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "SubCommittees", scope = CommitteeDetail.class)
    public JAXBElement<ArrayOfSubCommittee> createCommitteeDetailSubCommittees(ArrayOfSubCommittee value) {
        return new JAXBElement<ArrayOfSubCommittee>(_CommitteeMemberSubCommittees_QNAME, ArrayOfSubCommittee.class, CommitteeDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetCommitteesByTypeAndSessionJsonResult", scope = GetCommitteesByTypeAndSessionJsonResponse.class)
    public JAXBElement<ArrayOfCommitteeListing> createGetCommitteesByTypeAndSessionJsonResponseGetCommitteesByTypeAndSessionJsonResult(ArrayOfCommitteeListing value) {
        return new JAXBElement<ArrayOfCommitteeListing>(_GetCommitteesByTypeAndSessionJsonResponseGetCommitteesByTypeAndSessionJsonResult_QNAME, ArrayOfCommitteeListing.class, GetCommitteesByTypeAndSessionJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Type", scope = GetCommitteesByTypeAndSessionXml.class)
    public JAXBElement<String> createGetCommitteesByTypeAndSessionXmlType(String value) {
        return new JAXBElement<String>(_GetCommitteesByTypeAndSessionJsonType_QNAME, String.class, GetCommitteesByTypeAndSessionXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetCommitteesByTypeAndSessionXml.class)
    public JAXBElement<String> createGetCommitteesByTypeAndSessionXmlSessionId(String value) {
        return new JAXBElement<String>(_GetCommitteeForSessionJsonSessionId_QNAME, String.class, GetCommitteesByTypeAndSessionXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetCommitteeForSessionResult", scope = GetCommitteeForSessionResponse.class)
    public JAXBElement<CommitteeDetail> createGetCommitteeForSessionResponseGetCommitteeForSessionResult(CommitteeDetail value) {
        return new JAXBElement<CommitteeDetail>(_GetCommitteeForSessionResponseGetCommitteeForSessionResult_QNAME, CommitteeDetail.class, GetCommitteeForSessionResponse.class, value);
    }

}
