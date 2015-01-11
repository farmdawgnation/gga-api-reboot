
package gov.ga.legis.votes;

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
 * generated in the gov.ga.legis.votes package. 
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

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _MemberVote_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "MemberVote");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Vote_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Vote");
    private final static QName _ArrayOfMemberVote_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfMemberVote");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ItemVotedOn_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ItemVotedOn");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Session_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Session");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _MemberDescription_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "MemberDescription");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _MemberVoted_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "MemberVoted");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfVoteListing_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfVoteListing");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _VoteListing_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "VoteListing");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _RollCallNotPublishedFault_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "RollCallNotPublishedFault");
    private final static QName _Branch_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Branch");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfItemVotedOn_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfItemVotedOn");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _GetVotesForLegislationXmlLegislationId_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "LegislationId");
    private final static QName _MemberDescriptionName_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Name");
    private final static QName _GetVotesForLegislationResponseGetVotesForLegislationResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetVotesForLegislationResult");
    private final static QName _GetVoteJsonResponseGetVoteJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetVoteJsonResult");
    private final static QName _GetVoteJsonVoteId_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "VoteId");
    private final static QName _GetVotesXmlBranch_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "Branch");
    private final static QName _GetVotesXmlSessionId_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "SessionId");
    private final static QName _GetVotesXmlResponseGetVotesXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetVotesXmlResult");
    private final static QName _GetVoteXmlResponseGetVoteXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetVoteXmlResult");
    private final static QName _GetVotesForLegislationJsonResponseGetVotesForLegislationJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetVotesForLegislationJsonResult");
    private final static QName _MemberVoteMember_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Member");
    private final static QName _GetVotesJsonResponseGetVotesJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetVotesJsonResult");
    private final static QName _GetVotesForLegislationXmlResponseGetVotesForLegislationXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetVotesForLegislationXmlResult");
    private final static QName _SessionDescription_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Description");
    private final static QName _SessionLibrary_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Library");
    private final static QName _GetVoteResponseGetVoteResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetVoteResult");
    private final static QName _VoteLegislation_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Legislation");
    private final static QName _VoteDay_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Day");
    private final static QName _VoteCaption_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Caption");
    private final static QName _VoteVotes_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Votes");
    private final static QName _VoteTime_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Time");
    private final static QName _VoteTag_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Tag");
    private final static QName _GetVotesResponseGetVotesResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetVotesResult");
    private final static QName _RollCallNotPublishedFaultReason_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Reason");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.ga.legis.votes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfVoteListing }
     * 
     */
    public ArrayOfVoteListing createArrayOfVoteListing() {
        return new ArrayOfVoteListing();
    }

    /**
     * Create an instance of {@link Vote }
     * 
     */
    public Vote createVote() {
        return new Vote();
    }

    /**
     * Create an instance of {@link ArrayOfItemVotedOn }
     * 
     */
    public ArrayOfItemVotedOn createArrayOfItemVotedOn() {
        return new ArrayOfItemVotedOn();
    }

    /**
     * Create an instance of {@link ArrayOfMemberVote }
     * 
     */
    public ArrayOfMemberVote createArrayOfMemberVote() {
        return new ArrayOfMemberVote();
    }

    /**
     * Create an instance of {@link ItemVotedOn }
     * 
     */
    public ItemVotedOn createItemVotedOn() {
        return new ItemVotedOn();
    }

    /**
     * Create an instance of {@link RollCallNotPublishedFault }
     * 
     */
    public RollCallNotPublishedFault createRollCallNotPublishedFault() {
        return new RollCallNotPublishedFault();
    }

    /**
     * Create an instance of {@link MemberVote }
     * 
     */
    public MemberVote createMemberVote() {
        return new MemberVote();
    }

    /**
     * Create an instance of {@link MemberDescription }
     * 
     */
    public MemberDescription createMemberDescription() {
        return new MemberDescription();
    }

    /**
     * Create an instance of {@link VoteListing }
     * 
     */
    public VoteListing createVoteListing() {
        return new VoteListing();
    }

    /**
     * Create an instance of {@link Session }
     * 
     */
    public Session createSession() {
        return new Session();
    }

    /**
     * Create an instance of {@link GetVotesForLegislationJson }
     * 
     */
    public GetVotesForLegislationJson createGetVotesForLegislationJson() {
        return new GetVotesForLegislationJson();
    }

    /**
     * Create an instance of {@link GetVoteXmlResponse }
     * 
     */
    public GetVoteXmlResponse createGetVoteXmlResponse() {
        return new GetVoteXmlResponse();
    }

    /**
     * Create an instance of {@link GetVotesForLegislationResponse }
     * 
     */
    public GetVotesForLegislationResponse createGetVotesForLegislationResponse() {
        return new GetVotesForLegislationResponse();
    }

    /**
     * Create an instance of {@link GetVotesForLegislationJsonResponse }
     * 
     */
    public GetVotesForLegislationJsonResponse createGetVotesForLegislationJsonResponse() {
        return new GetVotesForLegislationJsonResponse();
    }

    /**
     * Create an instance of {@link GetVotesForLegislationXmlResponse }
     * 
     */
    public GetVotesForLegislationXmlResponse createGetVotesForLegislationXmlResponse() {
        return new GetVotesForLegislationXmlResponse();
    }

    /**
     * Create an instance of {@link GetVoteResponse }
     * 
     */
    public GetVoteResponse createGetVoteResponse() {
        return new GetVoteResponse();
    }

    /**
     * Create an instance of {@link GetVotesJsonResponse }
     * 
     */
    public GetVotesJsonResponse createGetVotesJsonResponse() {
        return new GetVotesJsonResponse();
    }

    /**
     * Create an instance of {@link GetVotesForLegislationXml }
     * 
     */
    public GetVotesForLegislationXml createGetVotesForLegislationXml() {
        return new GetVotesForLegislationXml();
    }

    /**
     * Create an instance of {@link GetVoteJsonResponse }
     * 
     */
    public GetVoteJsonResponse createGetVoteJsonResponse() {
        return new GetVoteJsonResponse();
    }

    /**
     * Create an instance of {@link GetVotesResponse }
     * 
     */
    public GetVotesResponse createGetVotesResponse() {
        return new GetVotesResponse();
    }

    /**
     * Create an instance of {@link GetVoteXml }
     * 
     */
    public GetVoteXml createGetVoteXml() {
        return new GetVoteXml();
    }

    /**
     * Create an instance of {@link GetVoteJson }
     * 
     */
    public GetVoteJson createGetVoteJson() {
        return new GetVoteJson();
    }

    /**
     * Create an instance of {@link GetVotesJson }
     * 
     */
    public GetVotesJson createGetVotesJson() {
        return new GetVotesJson();
    }

    /**
     * Create an instance of {@link GetVotes }
     * 
     */
    public GetVotes createGetVotes() {
        return new GetVotes();
    }

    /**
     * Create an instance of {@link GetVotesXmlResponse }
     * 
     */
    public GetVotesXmlResponse createGetVotesXmlResponse() {
        return new GetVotesXmlResponse();
    }

    /**
     * Create an instance of {@link GetVotesForLegislation }
     * 
     */
    public GetVotesForLegislation createGetVotesForLegislation() {
        return new GetVotesForLegislation();
    }

    /**
     * Create an instance of {@link GetVotesXml }
     * 
     */
    public GetVotesXml createGetVotesXml() {
        return new GetVotesXml();
    }

    /**
     * Create an instance of {@link GetVote }
     * 
     */
    public GetVote createGetVote() {
        return new GetVote();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberVote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "MemberVote")
    public JAXBElement<MemberVote> createMemberVote(MemberVote value) {
        return new JAXBElement<MemberVote>(_MemberVote_QNAME, MemberVote.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Vote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Vote")
    public JAXBElement<Vote> createVote(Vote value) {
        return new JAXBElement<Vote>(_Vote_QNAME, Vote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMemberVote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfMemberVote")
    public JAXBElement<ArrayOfMemberVote> createArrayOfMemberVote(ArrayOfMemberVote value) {
        return new JAXBElement<ArrayOfMemberVote>(_ArrayOfMemberVote_QNAME, ArrayOfMemberVote.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemVotedOn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ItemVotedOn")
    public JAXBElement<ItemVotedOn> createItemVotedOn(ItemVotedOn value) {
        return new JAXBElement<ItemVotedOn>(_ItemVotedOn_QNAME, ItemVotedOn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "MemberDescription")
    public JAXBElement<MemberDescription> createMemberDescription(MemberDescription value) {
        return new JAXBElement<MemberDescription>(_MemberDescription_QNAME, MemberDescription.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberVoted }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "MemberVoted")
    public JAXBElement<MemberVoted> createMemberVoted(MemberVoted value) {
        return new JAXBElement<MemberVoted>(_MemberVoted_QNAME, MemberVoted.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVoteListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfVoteListing")
    public JAXBElement<ArrayOfVoteListing> createArrayOfVoteListing(ArrayOfVoteListing value) {
        return new JAXBElement<ArrayOfVoteListing>(_ArrayOfVoteListing_QNAME, ArrayOfVoteListing.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link VoteListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "VoteListing")
    public JAXBElement<VoteListing> createVoteListing(VoteListing value) {
        return new JAXBElement<VoteListing>(_VoteListing_QNAME, VoteListing.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RollCallNotPublishedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "RollCallNotPublishedFault")
    public JAXBElement<RollCallNotPublishedFault> createRollCallNotPublishedFault(RollCallNotPublishedFault value) {
        return new JAXBElement<RollCallNotPublishedFault>(_RollCallNotPublishedFault_QNAME, RollCallNotPublishedFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Branch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Branch")
    public JAXBElement<Branch> createBranch(Branch value) {
        return new JAXBElement<Branch>(_Branch_QNAME, Branch.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItemVotedOn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfItemVotedOn")
    public JAXBElement<ArrayOfItemVotedOn> createArrayOfItemVotedOn(ArrayOfItemVotedOn value) {
        return new JAXBElement<ArrayOfItemVotedOn>(_ArrayOfItemVotedOn_QNAME, ArrayOfItemVotedOn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "LegislationId", scope = GetVotesForLegislationXml.class)
    public JAXBElement<String> createGetVotesForLegislationXmlLegislationId(String value) {
        return new JAXBElement<String>(_GetVotesForLegislationXmlLegislationId_QNAME, String.class, GetVotesForLegislationXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Name", scope = MemberDescription.class)
    public JAXBElement<String> createMemberDescriptionName(String value) {
        return new JAXBElement<String>(_MemberDescriptionName_QNAME, String.class, MemberDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVoteListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetVotesForLegislationResult", scope = GetVotesForLegislationResponse.class)
    public JAXBElement<ArrayOfVoteListing> createGetVotesForLegislationResponseGetVotesForLegislationResult(ArrayOfVoteListing value) {
        return new JAXBElement<ArrayOfVoteListing>(_GetVotesForLegislationResponseGetVotesForLegislationResult_QNAME, ArrayOfVoteListing.class, GetVotesForLegislationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetVoteJsonResult", scope = GetVoteJsonResponse.class)
    public JAXBElement<Vote> createGetVoteJsonResponseGetVoteJsonResult(Vote value) {
        return new JAXBElement<Vote>(_GetVoteJsonResponseGetVoteJsonResult_QNAME, Vote.class, GetVoteJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "VoteId", scope = GetVoteJson.class)
    public JAXBElement<String> createGetVoteJsonVoteId(String value) {
        return new JAXBElement<String>(_GetVoteJsonVoteId_QNAME, String.class, GetVoteJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Branch", scope = GetVotesXml.class)
    public JAXBElement<String> createGetVotesXmlBranch(String value) {
        return new JAXBElement<String>(_GetVotesXmlBranch_QNAME, String.class, GetVotesXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetVotesXml.class)
    public JAXBElement<String> createGetVotesXmlSessionId(String value) {
        return new JAXBElement<String>(_GetVotesXmlSessionId_QNAME, String.class, GetVotesXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVoteListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetVotesXmlResult", scope = GetVotesXmlResponse.class)
    public JAXBElement<ArrayOfVoteListing> createGetVotesXmlResponseGetVotesXmlResult(ArrayOfVoteListing value) {
        return new JAXBElement<ArrayOfVoteListing>(_GetVotesXmlResponseGetVotesXmlResult_QNAME, ArrayOfVoteListing.class, GetVotesXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "LegislationId", scope = GetVotesForLegislationJson.class)
    public JAXBElement<String> createGetVotesForLegislationJsonLegislationId(String value) {
        return new JAXBElement<String>(_GetVotesForLegislationXmlLegislationId_QNAME, String.class, GetVotesForLegislationJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetVoteXmlResult", scope = GetVoteXmlResponse.class)
    public JAXBElement<Vote> createGetVoteXmlResponseGetVoteXmlResult(Vote value) {
        return new JAXBElement<Vote>(_GetVoteXmlResponseGetVoteXmlResult_QNAME, Vote.class, GetVoteXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVoteListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetVotesForLegislationJsonResult", scope = GetVotesForLegislationJsonResponse.class)
    public JAXBElement<ArrayOfVoteListing> createGetVotesForLegislationJsonResponseGetVotesForLegislationJsonResult(ArrayOfVoteListing value) {
        return new JAXBElement<ArrayOfVoteListing>(_GetVotesForLegislationJsonResponseGetVotesForLegislationJsonResult_QNAME, ArrayOfVoteListing.class, GetVotesForLegislationJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Branch", scope = GetVotesJson.class)
    public JAXBElement<String> createGetVotesJsonBranch(String value) {
        return new JAXBElement<String>(_GetVotesXmlBranch_QNAME, String.class, GetVotesJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetVotesJson.class)
    public JAXBElement<String> createGetVotesJsonSessionId(String value) {
        return new JAXBElement<String>(_GetVotesXmlSessionId_QNAME, String.class, GetVotesJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Member", scope = MemberVote.class)
    public JAXBElement<MemberDescription> createMemberVoteMember(MemberDescription value) {
        return new JAXBElement<MemberDescription>(_MemberVoteMember_QNAME, MemberDescription.class, MemberVote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVoteListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetVotesJsonResult", scope = GetVotesJsonResponse.class)
    public JAXBElement<ArrayOfVoteListing> createGetVotesJsonResponseGetVotesJsonResult(ArrayOfVoteListing value) {
        return new JAXBElement<ArrayOfVoteListing>(_GetVotesJsonResponseGetVotesJsonResult_QNAME, ArrayOfVoteListing.class, GetVotesJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVoteListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetVotesForLegislationXmlResult", scope = GetVotesForLegislationXmlResponse.class)
    public JAXBElement<ArrayOfVoteListing> createGetVotesForLegislationXmlResponseGetVotesForLegislationXmlResult(ArrayOfVoteListing value) {
        return new JAXBElement<ArrayOfVoteListing>(_GetVotesForLegislationXmlResponseGetVotesForLegislationXmlResult_QNAME, ArrayOfVoteListing.class, GetVotesForLegislationXmlResponse.class, value);
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
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Library", scope = ItemVotedOn.class)
    public JAXBElement<String> createItemVotedOnLibrary(String value) {
        return new JAXBElement<String>(_SessionLibrary_QNAME, String.class, ItemVotedOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetVoteResult", scope = GetVoteResponse.class)
    public JAXBElement<Vote> createGetVoteResponseGetVoteResult(Vote value) {
        return new JAXBElement<Vote>(_GetVoteResponseGetVoteResult_QNAME, Vote.class, GetVoteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "VoteId", scope = GetVoteXml.class)
    public JAXBElement<String> createGetVoteXmlVoteId(String value) {
        return new JAXBElement<String>(_GetVoteJsonVoteId_QNAME, String.class, GetVoteXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItemVotedOn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Legislation", scope = Vote.class)
    public JAXBElement<ArrayOfItemVotedOn> createVoteLegislation(ArrayOfItemVotedOn value) {
        return new JAXBElement<ArrayOfItemVotedOn>(_VoteLegislation_QNAME, ArrayOfItemVotedOn.class, Vote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Description", scope = Vote.class)
    public JAXBElement<String> createVoteDescription(String value) {
        return new JAXBElement<String>(_SessionDescription_QNAME, String.class, Vote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Day", scope = Vote.class)
    public JAXBElement<String> createVoteDay(String value) {
        return new JAXBElement<String>(_VoteDay_QNAME, String.class, Vote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Caption", scope = Vote.class)
    public JAXBElement<String> createVoteCaption(String value) {
        return new JAXBElement<String>(_VoteCaption_QNAME, String.class, Vote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMemberVote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Votes", scope = Vote.class)
    public JAXBElement<ArrayOfMemberVote> createVoteVotes(ArrayOfMemberVote value) {
        return new JAXBElement<ArrayOfMemberVote>(_VoteVotes_QNAME, ArrayOfMemberVote.class, Vote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Time", scope = Vote.class)
    public JAXBElement<String> createVoteTime(String value) {
        return new JAXBElement<String>(_VoteTime_QNAME, String.class, Vote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Tag", scope = Vote.class)
    public JAXBElement<String> createVoteTag(String value) {
        return new JAXBElement<String>(_VoteTag_QNAME, String.class, Vote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVoteListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetVotesResult", scope = GetVotesResponse.class)
    public JAXBElement<ArrayOfVoteListing> createGetVotesResponseGetVotesResult(ArrayOfVoteListing value) {
        return new JAXBElement<ArrayOfVoteListing>(_GetVotesResponseGetVotesResult_QNAME, ArrayOfVoteListing.class, GetVotesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Reason", scope = RollCallNotPublishedFault.class)
    public JAXBElement<String> createRollCallNotPublishedFaultReason(String value) {
        return new JAXBElement<String>(_RollCallNotPublishedFaultReason_QNAME, String.class, RollCallNotPublishedFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Legislation", scope = VoteListing.class)
    public JAXBElement<String> createVoteListingLegislation(String value) {
        return new JAXBElement<String>(_VoteLegislation_QNAME, String.class, VoteListing.class, value);
    }

}
