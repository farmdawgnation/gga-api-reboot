
package gov.ga.legis.members;

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
 * generated in the gov.ga.legis.members package. 
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
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _CommitteeBase_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CommitteeBase");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _MemberType_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "MemberType");
    private final static QName _CommitteeMembership_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CommitteeMembership");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _District_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "District");
    private final static QName _Person_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Person");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Session_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Session");
    private final static QName _MemberListing_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "MemberListing");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _Address_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Address");
    private final static QName _ArrayOfLegislativeService_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfLegislativeService");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _CommitteeType_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CommitteeType");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Name_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Name");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfCommitteeMembership_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfCommitteeMembership");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _CommitteeListing_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CommitteeListing");
    private final static QName _Party_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Party");
    private final static QName _Member_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Member");
    private final static QName _LegislativeService_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "LegislativeService");
    private final static QName _ArrayOfMemberListing_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfMemberListing");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _GetMembersByTypeAndSessionJsonType_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "Type");
    private final static QName _GetMembersByTypeAndSessionJsonSessionId_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "SessionId");
    private final static QName _DistrictPost_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Post");
    private final static QName _DistrictCoverage_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Coverage");
    private final static QName _MemberListingDateVacated_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "DateVacated");
    private final static QName _MemberListingResidence_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Residence");
    private final static QName _CommitteeMembershipRole_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Role");
    private final static QName _CommitteeMembershipCommittee_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Committee");
    private final static QName _GetMemberJsonMemberId_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "MemberId");
    private final static QName _GetMemberJsonResponseGetMemberJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetMemberJsonResult");
    private final static QName _NameLast_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Last");
    private final static QName _NameMiddle_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Middle");
    private final static QName _NameNickname_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Nickname");
    private final static QName _NameFirst_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "First");
    private final static QName _GetMembersBySessionJsonResponseGetMembersBySessionJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetMembersBySessionJsonResult");
    private final static QName _GetMembersByTypeAndSessionJsonResponseGetMembersByTypeAndSessionJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetMembersByTypeAndSessionJsonResult");
    private final static QName _GetMembersJsonResponseGetMembersJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetMembersJsonResult");
    private final static QName _SessionDescription_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Description");
    private final static QName _SessionLibrary_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Library");
    private final static QName _GetMembersBySessionResponseGetMembersBySessionResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetMembersBySessionResult");
    private final static QName _GetMemberResponseGetMemberResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetMemberResult");
    private final static QName _GetMembersBySessionXmlResponseGetMembersBySessionXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetMembersBySessionXmlResult");
    private final static QName _GetMemberXmlResponseGetMemberXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetMemberXmlResult");
    private final static QName _GetMembersByTypeAndSessionResponseGetMembersByTypeAndSessionResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetMembersByTypeAndSessionResult");
    private final static QName _PersonEducation_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Education");
    private final static QName _PersonSpouse_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Spouse");
    private final static QName _PersonOccupation_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Occupation");
    private final static QName _PersonReligion_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Religion");
    private final static QName _PersonBirthday_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Birthday");
    private final static QName _CommitteeBaseCode_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Code");
    private final static QName _GetMembersByTypeAndSessionXmlResponseGetMembersByTypeAndSessionXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetMembersByTypeAndSessionXmlResult");
    private final static QName _MemberHomePhone_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "HomePhone");
    private final static QName _MemberStaff_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Staff");
    private final static QName _MemberCellPhone_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CellPhone");
    private final static QName _MemberFreeForm1_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "FreeForm1");
    private final static QName _MemberSessionsInService_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "SessionsInService");
    private final static QName _MemberLegislativeComments_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "LegislativeComments");
    private final static QName _MemberFreeForm2_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "FreeForm2");
    private final static QName _AddressPhone_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Phone");
    private final static QName _AddressState_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "State");
    private final static QName _AddressZip_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Zip");
    private final static QName _AddressEmail_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Email");
    private final static QName _AddressFax_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Fax");
    private final static QName _AddressStreet_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Street");
    private final static QName _AddressCity_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "City");
    private final static QName _GetMembersXmlResponseGetMembersXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetMembersXmlResult");
    private final static QName _LegislativeServiceCommitteeMemberships_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CommitteeMemberships");
    private final static QName _LegislativeServiceTitle_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Title");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.ga.legis.members
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMemberResponse }
     * 
     */
    public GetMemberResponse createGetMemberResponse() {
        return new GetMemberResponse();
    }

    /**
     * Create an instance of {@link Member }
     * 
     */
    public Member createMember() {
        return new Member();
    }

    /**
     * Create an instance of {@link GetMembersByTypeAndSessionJson }
     * 
     */
    public GetMembersByTypeAndSessionJson createGetMembersByTypeAndSessionJson() {
        return new GetMembersByTypeAndSessionJson();
    }

    /**
     * Create an instance of {@link GetMemberJsonResponse }
     * 
     */
    public GetMemberJsonResponse createGetMemberJsonResponse() {
        return new GetMemberJsonResponse();
    }

    /**
     * Create an instance of {@link GetMembersByTypeAndSessionXml }
     * 
     */
    public GetMembersByTypeAndSessionXml createGetMembersByTypeAndSessionXml() {
        return new GetMembersByTypeAndSessionXml();
    }

    /**
     * Create an instance of {@link GetMemberXmlResponse }
     * 
     */
    public GetMemberXmlResponse createGetMemberXmlResponse() {
        return new GetMemberXmlResponse();
    }

    /**
     * Create an instance of {@link GetMembersXmlResponse }
     * 
     */
    public GetMembersXmlResponse createGetMembersXmlResponse() {
        return new GetMembersXmlResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMemberListing }
     * 
     */
    public ArrayOfMemberListing createArrayOfMemberListing() {
        return new ArrayOfMemberListing();
    }

    /**
     * Create an instance of {@link GetMembersJson }
     * 
     */
    public GetMembersJson createGetMembersJson() {
        return new GetMembersJson();
    }

    /**
     * Create an instance of {@link GetMembersXml }
     * 
     */
    public GetMembersXml createGetMembersXml() {
        return new GetMembersXml();
    }

    /**
     * Create an instance of {@link GetMembersBySessionXml }
     * 
     */
    public GetMembersBySessionXml createGetMembersBySessionXml() {
        return new GetMembersBySessionXml();
    }

    /**
     * Create an instance of {@link GetMembersBySessionJson }
     * 
     */
    public GetMembersBySessionJson createGetMembersBySessionJson() {
        return new GetMembersBySessionJson();
    }

    /**
     * Create an instance of {@link GetMembersBySession }
     * 
     */
    public GetMembersBySession createGetMembersBySession() {
        return new GetMembersBySession();
    }

    /**
     * Create an instance of {@link GetMembersBySessionXmlResponse }
     * 
     */
    public GetMembersBySessionXmlResponse createGetMembersBySessionXmlResponse() {
        return new GetMembersBySessionXmlResponse();
    }

    /**
     * Create an instance of {@link GetMembersBySessionJsonResponse }
     * 
     */
    public GetMembersBySessionJsonResponse createGetMembersBySessionJsonResponse() {
        return new GetMembersBySessionJsonResponse();
    }

    /**
     * Create an instance of {@link GetMembersByTypeAndSessionResponse }
     * 
     */
    public GetMembersByTypeAndSessionResponse createGetMembersByTypeAndSessionResponse() {
        return new GetMembersByTypeAndSessionResponse();
    }

    /**
     * Create an instance of {@link GetMembersByTypeAndSessionJsonResponse }
     * 
     */
    public GetMembersByTypeAndSessionJsonResponse createGetMembersByTypeAndSessionJsonResponse() {
        return new GetMembersByTypeAndSessionJsonResponse();
    }

    /**
     * Create an instance of {@link GetMemberJson }
     * 
     */
    public GetMemberJson createGetMemberJson() {
        return new GetMemberJson();
    }

    /**
     * Create an instance of {@link GetMembersBySessionResponse }
     * 
     */
    public GetMembersBySessionResponse createGetMembersBySessionResponse() {
        return new GetMembersBySessionResponse();
    }

    /**
     * Create an instance of {@link GetMembersByTypeAndSessionXmlResponse }
     * 
     */
    public GetMembersByTypeAndSessionXmlResponse createGetMembersByTypeAndSessionXmlResponse() {
        return new GetMembersByTypeAndSessionXmlResponse();
    }

    /**
     * Create an instance of {@link GetMembersJsonResponse }
     * 
     */
    public GetMembersJsonResponse createGetMembersJsonResponse() {
        return new GetMembersJsonResponse();
    }

    /**
     * Create an instance of {@link GetMember }
     * 
     */
    public GetMember createGetMember() {
        return new GetMember();
    }

    /**
     * Create an instance of {@link GetMembersByTypeAndSession }
     * 
     */
    public GetMembersByTypeAndSession createGetMembersByTypeAndSession() {
        return new GetMembersByTypeAndSession();
    }

    /**
     * Create an instance of {@link GetMemberXml }
     * 
     */
    public GetMemberXml createGetMemberXml() {
        return new GetMemberXml();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ArrayOfLegislativeService }
     * 
     */
    public ArrayOfLegislativeService createArrayOfLegislativeService() {
        return new ArrayOfLegislativeService();
    }

    /**
     * Create an instance of {@link CommitteeBase }
     * 
     */
    public CommitteeBase createCommitteeBase() {
        return new CommitteeBase();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link CommitteeListing }
     * 
     */
    public CommitteeListing createCommitteeListing() {
        return new CommitteeListing();
    }

    /**
     * Create an instance of {@link ArrayOfCommitteeMembership }
     * 
     */
    public ArrayOfCommitteeMembership createArrayOfCommitteeMembership() {
        return new ArrayOfCommitteeMembership();
    }

    /**
     * Create an instance of {@link CommitteeMembership }
     * 
     */
    public CommitteeMembership createCommitteeMembership() {
        return new CommitteeMembership();
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
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link LegislativeService }
     * 
     */
    public LegislativeService createLegislativeService() {
        return new LegislativeService();
    }

    /**
     * Create an instance of {@link Session }
     * 
     */
    public Session createSession() {
        return new Session();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "MemberType")
    public JAXBElement<MemberType> createMemberType(MemberType value) {
        return new JAXBElement<MemberType>(_MemberType_QNAME, MemberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeMembership }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "CommitteeMembership")
    public JAXBElement<CommitteeMembership> createCommitteeMembership(CommitteeMembership value) {
        return new JAXBElement<CommitteeMembership>(_CommitteeMembership_QNAME, CommitteeMembership.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link District }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "District")
    public JAXBElement<District> createDistrict(District value) {
        return new JAXBElement<District>(_District_QNAME, District.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislativeService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfLegislativeService")
    public JAXBElement<ArrayOfLegislativeService> createArrayOfLegislativeService(ArrayOfLegislativeService value) {
        return new JAXBElement<ArrayOfLegislativeService>(_ArrayOfLegislativeService_QNAME, ArrayOfLegislativeService.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitteeMembership }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfCommitteeMembership")
    public JAXBElement<ArrayOfCommitteeMembership> createArrayOfCommitteeMembership(ArrayOfCommitteeMembership value) {
        return new JAXBElement<ArrayOfCommitteeMembership>(_ArrayOfCommitteeMembership_QNAME, ArrayOfCommitteeMembership.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "CommitteeListing")
    public JAXBElement<CommitteeListing> createCommitteeListing(CommitteeListing value) {
        return new JAXBElement<CommitteeListing>(_CommitteeListing_QNAME, CommitteeListing.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Member }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Member")
    public JAXBElement<Member> createMember(Member value) {
        return new JAXBElement<Member>(_Member_QNAME, Member.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislativeService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "LegislativeService")
    public JAXBElement<LegislativeService> createLegislativeService(LegislativeService value) {
        return new JAXBElement<LegislativeService>(_LegislativeService_QNAME, LegislativeService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMemberListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfMemberListing")
    public JAXBElement<ArrayOfMemberListing> createArrayOfMemberListing(ArrayOfMemberListing value) {
        return new JAXBElement<ArrayOfMemberListing>(_ArrayOfMemberListing_QNAME, ArrayOfMemberListing.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Type", scope = GetMembersByTypeAndSessionJson.class)
    public JAXBElement<String> createGetMembersByTypeAndSessionJsonType(String value) {
        return new JAXBElement<String>(_GetMembersByTypeAndSessionJsonType_QNAME, String.class, GetMembersByTypeAndSessionJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetMembersByTypeAndSessionJson.class)
    public JAXBElement<String> createGetMembersByTypeAndSessionJsonSessionId(String value) {
        return new JAXBElement<String>(_GetMembersByTypeAndSessionJsonSessionId_QNAME, String.class, GetMembersByTypeAndSessionJson.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "DateVacated", scope = CommitteeMembership.class)
    public JAXBElement<XMLGregorianCalendar> createCommitteeMembershipDateVacated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MemberListingDateVacated_QNAME, XMLGregorianCalendar.class, CommitteeMembership.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Role", scope = CommitteeMembership.class)
    public JAXBElement<String> createCommitteeMembershipRole(String value) {
        return new JAXBElement<String>(_CommitteeMembershipRole_QNAME, String.class, CommitteeMembership.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Committee", scope = CommitteeMembership.class)
    public JAXBElement<CommitteeListing> createCommitteeMembershipCommittee(CommitteeListing value) {
        return new JAXBElement<CommitteeListing>(_CommitteeMembershipCommittee_QNAME, CommitteeListing.class, CommitteeMembership.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "MemberId", scope = GetMemberJson.class)
    public JAXBElement<String> createGetMemberJsonMemberId(String value) {
        return new JAXBElement<String>(_GetMemberJsonMemberId_QNAME, String.class, GetMemberJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Member }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetMemberJsonResult", scope = GetMemberJsonResponse.class)
    public JAXBElement<Member> createGetMemberJsonResponseGetMemberJsonResult(Member value) {
        return new JAXBElement<Member>(_GetMemberJsonResponseGetMemberJsonResult_QNAME, Member.class, GetMemberJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "MemberId", scope = GetMemberXml.class)
    public JAXBElement<String> createGetMemberXmlMemberId(String value) {
        return new JAXBElement<String>(_GetMemberJsonMemberId_QNAME, String.class, GetMemberXml.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMemberListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetMembersBySessionJsonResult", scope = GetMembersBySessionJsonResponse.class)
    public JAXBElement<ArrayOfMemberListing> createGetMembersBySessionJsonResponseGetMembersBySessionJsonResult(ArrayOfMemberListing value) {
        return new JAXBElement<ArrayOfMemberListing>(_GetMembersBySessionJsonResponseGetMembersBySessionJsonResult_QNAME, ArrayOfMemberListing.class, GetMembersBySessionJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetMembersBySessionXml.class)
    public JAXBElement<String> createGetMembersBySessionXmlSessionId(String value) {
        return new JAXBElement<String>(_GetMembersByTypeAndSessionJsonSessionId_QNAME, String.class, GetMembersBySessionXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetMembersBySessionJson.class)
    public JAXBElement<String> createGetMembersBySessionJsonSessionId(String value) {
        return new JAXBElement<String>(_GetMembersByTypeAndSessionJsonSessionId_QNAME, String.class, GetMembersBySessionJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMemberListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetMembersByTypeAndSessionJsonResult", scope = GetMembersByTypeAndSessionJsonResponse.class)
    public JAXBElement<ArrayOfMemberListing> createGetMembersByTypeAndSessionJsonResponseGetMembersByTypeAndSessionJsonResult(ArrayOfMemberListing value) {
        return new JAXBElement<ArrayOfMemberListing>(_GetMembersByTypeAndSessionJsonResponseGetMembersByTypeAndSessionJsonResult_QNAME, ArrayOfMemberListing.class, GetMembersByTypeAndSessionJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMemberListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetMembersJsonResult", scope = GetMembersJsonResponse.class)
    public JAXBElement<ArrayOfMemberListing> createGetMembersJsonResponseGetMembersJsonResult(ArrayOfMemberListing value) {
        return new JAXBElement<ArrayOfMemberListing>(_GetMembersJsonResponseGetMembersJsonResult_QNAME, ArrayOfMemberListing.class, GetMembersJsonResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMemberListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetMembersBySessionResult", scope = GetMembersBySessionResponse.class)
    public JAXBElement<ArrayOfMemberListing> createGetMembersBySessionResponseGetMembersBySessionResult(ArrayOfMemberListing value) {
        return new JAXBElement<ArrayOfMemberListing>(_GetMembersBySessionResponseGetMembersBySessionResult_QNAME, ArrayOfMemberListing.class, GetMembersBySessionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Member }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetMemberResult", scope = GetMemberResponse.class)
    public JAXBElement<Member> createGetMemberResponseGetMemberResult(Member value) {
        return new JAXBElement<Member>(_GetMemberResponseGetMemberResult_QNAME, Member.class, GetMemberResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMemberListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetMembersBySessionXmlResult", scope = GetMembersBySessionXmlResponse.class)
    public JAXBElement<ArrayOfMemberListing> createGetMembersBySessionXmlResponseGetMembersBySessionXmlResult(ArrayOfMemberListing value) {
        return new JAXBElement<ArrayOfMemberListing>(_GetMembersBySessionXmlResponseGetMembersBySessionXmlResult_QNAME, ArrayOfMemberListing.class, GetMembersBySessionXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Member }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetMemberXmlResult", scope = GetMemberXmlResponse.class)
    public JAXBElement<Member> createGetMemberXmlResponseGetMemberXmlResult(Member value) {
        return new JAXBElement<Member>(_GetMemberXmlResponseGetMemberXmlResult_QNAME, Member.class, GetMemberXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMemberListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetMembersByTypeAndSessionResult", scope = GetMembersByTypeAndSessionResponse.class)
    public JAXBElement<ArrayOfMemberListing> createGetMembersByTypeAndSessionResponseGetMembersByTypeAndSessionResult(ArrayOfMemberListing value) {
        return new JAXBElement<ArrayOfMemberListing>(_GetMembersByTypeAndSessionResponseGetMembersByTypeAndSessionResult_QNAME, ArrayOfMemberListing.class, GetMembersByTypeAndSessionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Education", scope = Person.class)
    public JAXBElement<String> createPersonEducation(String value) {
        return new JAXBElement<String>(_PersonEducation_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Spouse", scope = Person.class)
    public JAXBElement<String> createPersonSpouse(String value) {
        return new JAXBElement<String>(_PersonSpouse_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Occupation", scope = Person.class)
    public JAXBElement<String> createPersonOccupation(String value) {
        return new JAXBElement<String>(_PersonOccupation_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Religion", scope = Person.class)
    public JAXBElement<String> createPersonReligion(String value) {
        return new JAXBElement<String>(_PersonReligion_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Birthday", scope = Person.class)
    public JAXBElement<String> createPersonBirthday(String value) {
        return new JAXBElement<String>(_PersonBirthday_QNAME, String.class, Person.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMemberListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetMembersByTypeAndSessionXmlResult", scope = GetMembersByTypeAndSessionXmlResponse.class)
    public JAXBElement<ArrayOfMemberListing> createGetMembersByTypeAndSessionXmlResponseGetMembersByTypeAndSessionXmlResult(ArrayOfMemberListing value) {
        return new JAXBElement<ArrayOfMemberListing>(_GetMembersByTypeAndSessionXmlResponseGetMembersByTypeAndSessionXmlResult_QNAME, ArrayOfMemberListing.class, GetMembersByTypeAndSessionXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Type", scope = GetMembersByTypeAndSessionXml.class)
    public JAXBElement<String> createGetMembersByTypeAndSessionXmlType(String value) {
        return new JAXBElement<String>(_GetMembersByTypeAndSessionJsonType_QNAME, String.class, GetMembersByTypeAndSessionXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetMembersByTypeAndSessionXml.class)
    public JAXBElement<String> createGetMembersByTypeAndSessionXmlSessionId(String value) {
        return new JAXBElement<String>(_GetMembersByTypeAndSessionJsonSessionId_QNAME, String.class, GetMembersByTypeAndSessionXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "HomePhone", scope = Member.class)
    public JAXBElement<String> createMemberHomePhone(String value) {
        return new JAXBElement<String>(_MemberHomePhone_QNAME, String.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Staff", scope = Member.class)
    public JAXBElement<String> createMemberStaff(String value) {
        return new JAXBElement<String>(_MemberStaff_QNAME, String.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "CellPhone", scope = Member.class)
    public JAXBElement<String> createMemberCellPhone(String value) {
        return new JAXBElement<String>(_MemberCellPhone_QNAME, String.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "FreeForm1", scope = Member.class)
    public JAXBElement<String> createMemberFreeForm1(String value) {
        return new JAXBElement<String>(_MemberFreeForm1_QNAME, String.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislativeService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "SessionsInService", scope = Member.class)
    public JAXBElement<ArrayOfLegislativeService> createMemberSessionsInService(ArrayOfLegislativeService value) {
        return new JAXBElement<ArrayOfLegislativeService>(_MemberSessionsInService_QNAME, ArrayOfLegislativeService.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "LegislativeComments", scope = Member.class)
    public JAXBElement<String> createMemberLegislativeComments(String value) {
        return new JAXBElement<String>(_MemberLegislativeComments_QNAME, String.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Residence", scope = Member.class)
    public JAXBElement<String> createMemberResidence(String value) {
        return new JAXBElement<String>(_MemberListingResidence_QNAME, String.class, Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "FreeForm2", scope = Member.class)
    public JAXBElement<String> createMemberFreeForm2(String value) {
        return new JAXBElement<String>(_MemberFreeForm2_QNAME, String.class, Member.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMemberListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetMembersXmlResult", scope = GetMembersXmlResponse.class)
    public JAXBElement<ArrayOfMemberListing> createGetMembersXmlResponseGetMembersXmlResult(ArrayOfMemberListing value) {
        return new JAXBElement<ArrayOfMemberListing>(_GetMembersXmlResponseGetMembersXmlResult_QNAME, ArrayOfMemberListing.class, GetMembersXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "DateVacated", scope = LegislativeService.class)
    public JAXBElement<XMLGregorianCalendar> createLegislativeServiceDateVacated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MemberListingDateVacated_QNAME, XMLGregorianCalendar.class, LegislativeService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitteeMembership }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "CommitteeMemberships", scope = LegislativeService.class)
    public JAXBElement<ArrayOfCommitteeMembership> createLegislativeServiceCommitteeMemberships(ArrayOfCommitteeMembership value) {
        return new JAXBElement<ArrayOfCommitteeMembership>(_LegislativeServiceCommitteeMemberships_QNAME, ArrayOfCommitteeMembership.class, LegislativeService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Title", scope = LegislativeService.class)
    public JAXBElement<String> createLegislativeServiceTitle(String value) {
        return new JAXBElement<String>(_LegislativeServiceTitle_QNAME, String.class, LegislativeService.class, value);
    }

}
