
package gov.ga.legis.legislation;

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
 * generated in the gov.ga.legis.legislation package. 
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

    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Subject_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Subject");
    private final static QName _DocumentType_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "DocumentType");
    private final static QName _DocumentDescription_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "DocumentDescription");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _LegislationSearchResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "LegislationSearchResult");
    private final static QName _ArrayOfDocumentType_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfDocumentType");
    private final static QName _Session_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Session");
    private final static QName _ArrayOfLegislationSearchResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfLegislationSearchResult");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _StatusListing_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "StatusListing");
    private final static QName _ExistingStatusConstraint_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ExistingStatusConstraint");
    private final static QName _CurrentStatusConstraint_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CurrentStatusConstraint");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ArrayOfSubject_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfSubject");
    private final static QName _ArrayOfLegislationIndex_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfLegislationIndex");
    private final static QName _ArrayOfVoteListing_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfVoteListing");
    private final static QName _CommitteeType_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CommitteeType");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _LegislationIndexRange_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "LegislationIndexRange");
    private final static QName _Branch_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Branch");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _CommitteeListing_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CommitteeListing");
    private final static QName _ArrayOfCommitteeListing_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfCommitteeListing");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _DocumentBase_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "DocumentBase");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _CommitteeBase_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CommitteeBase");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _Legislation_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Legislation");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Status_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Status");
    private final static QName _LegislationIndex_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "LegislationIndex");
    private final static QName _SponsorType_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "SponsorType");
    private final static QName _ArrayOfLegislationType_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfLegislationType");
    private final static QName _ArrayOfStatusConstraint_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfStatusConstraint");
    private final static QName _ArrayOfLegislationIndexRangeSet_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfLegislationIndexRangeSet");
    private final static QName _LegislationDetail_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "LegislationDetail");
    private final static QName _Sponsorship_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Sponsorship");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _InvalidPageSizeFault_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "InvalidPageSizeFault");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _VoteListing_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "VoteListing");
    private final static QName _LegislationType_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "LegislationType");
    private final static QName _StatusConstraint_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "StatusConstraint");
    private final static QName _LegislationSearchResultsPaged_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "LegislationSearchResultsPaged");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfDocumentDescription_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfDocumentDescription");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _StatusBase_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "StatusBase");
    private final static QName _ArrayOfSponsorship_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfSponsorship");
    private final static QName _InvalidSearchConstraintsFault_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "InvalidSearchConstraintsFault");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _LegislationSearchConstraints_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "LegislationSearchConstraints");
    private final static QName _LegislationIndexRangeSet_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "LegislationIndexRangeSet");
    private final static QName _ArrayOfStatusListing_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ArrayOfStatusListing");
    private final static QName _GetLegislationRangesJsonResponseGetLegislationRangesJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationRangesJsonResult");
    private final static QName _GetLegislationRangeXmlResponseGetLegislationRangeXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationRangeXmlResult");
    private final static QName _GetLegislationDetailByDescriptionXmlNumber_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "Number");
    private final static QName _GetLegislationDetailByDescriptionXmlDocumentType_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "DocumentType");
    private final static QName _GetLegislationDetailByDescriptionXmlSessionId_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "SessionId");
    private final static QName _GetLegislationRangeResponseGetLegislationRangeResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationRangeResult");
    private final static QName _GetLegislationSearchResultsPagedXmlResponseGetLegislationSearchResultsPagedXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationSearchResultsPagedXmlResult");
    private final static QName _GetLegislationSearchResultsPagedQuerystringXmlResponseGetLegislationSearchResultsPagedQuerystringXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationSearchResultsPagedQuerystringXmlResult");
    private final static QName _GetLegislationDetailByDescriptionResponseGetLegislationDetailByDescriptionResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationDetailByDescriptionResult");
    private final static QName _InvalidSearchConstraintsFaultReason_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Reason");
    private final static QName _InvalidSearchConstraintsFaultInvalidPropertyName_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "InvalidPropertyName");
    private final static QName _GetLegislationRangesXmlRangeSize_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "RangeSize");
    private final static QName _LegislationSearchResultHouseCommittee_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "HouseCommittee");
    private final static QName _LegislationSearchResultAuthors_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Authors");
    private final static QName _LegislationSearchResultSuffix_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Suffix");
    private final static QName _LegislationSearchResultCaption_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Caption");
    private final static QName _LegislationSearchResultActVetoNumber_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "ActVetoNumber");
    private final static QName _LegislationSearchResultSenateCommittee_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "SenateCommittee");
    private final static QName _GetLegislationDetailByDescriptionXmlResponseGetLegislationDetailByDescriptionXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationDetailByDescriptionXmlResult");
    private final static QName _GetLegislationSearchResultsPagedConstraints_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "Constraints");
    private final static QName _GetTitlesResponseGetTitlesResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetTitlesResult");
    private final static QName _LegislationIndexDescription_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Description");
    private final static QName _GetLegislationDetailByDescriptionJsonResponseGetLegislationDetailByDescriptionJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationDetailByDescriptionJsonResult");
    private final static QName _GetLegislationRangeQuerystringXmlStart_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "Start");
    private final static QName _GetLegislationRangeQuerystringXmlEnd_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "End");
    private final static QName _CommitteeBaseCode_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Code");
    private final static QName _CommitteeBaseName_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Name");
    private final static QName _GetLegislationSearchResultsPagedXmlPageSize_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "PageSize");
    private final static QName _GetLegislationSearchResultsPagedXmlStartIndex_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "StartIndex");
    private final static QName _GetTitlesJsonResponseGetTitlesJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetTitlesJsonResult");
    private final static QName _SubjectParent_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Parent");
    private final static QName _GetLegislationRangeJsonRange_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "Range");
    private final static QName _GetLegislationRangesXmlResponseGetLegislationRangesXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationRangesXmlResult");
    private final static QName _GetLegislationSearchResultsPagedQuerystringJsonResponseGetLegislationSearchResultsPagedQuerystringJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationSearchResultsPagedQuerystringJsonResult");
    private final static QName _GetLegislationRangesResponseGetLegislationRangesResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationRangesResult");
    private final static QName _GetTitlesXmlResponseGetTitlesXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetTitlesXmlResult");
    private final static QName _GetLegislationForSessionResponseGetLegislationForSessionResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationForSessionResult");
    private final static QName _GetLegislationSearchResultsPagedQuerystringXmlStatusDate_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "StatusDate");
    private final static QName _GetLegislationSearchResultsPagedQuerystringXmlKeywords_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "Keywords");
    private final static QName _GetLegislationSearchResultsPagedQuerystringXmlCommitteeId_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "CommitteeId");
    private final static QName _GetLegislationSearchResultsPagedQuerystringXmlMemberId_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "MemberId");
    private final static QName _GetLegislationSearchResultsPagedQuerystringXmlStatusId_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "StatusId");
    private final static QName _GetLegislationSearchResultsPagedQuerystringXmlTitleId_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "TitleId");
    private final static QName _GetLegislationSearchResultsPagedQuerystringXmlCurrentStatusOnly_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "CurrentStatusOnly");
    private final static QName _GetLegislationSearchResultsPagedQuerystringJsonStatus_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "Status");
    private final static QName _GetLegislationForSessionXmlResponseGetLegislationForSessionXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationForSessionXmlResult");
    private final static QName _GetLegislationDetailXmlResponseGetLegislationDetailXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationDetailXmlResult");
    private final static QName _GetLegislationDetailResponseGetLegislationDetailResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationDetailResult");
    private final static QName _LegislationSearchResultsPagedPage_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Page");
    private final static QName _SponsorshipMemberDescription_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "MemberDescription");
    private final static QName _GetLegislationForSessionJsonResponseGetLegislationForSessionJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationForSessionJsonResult");
    private final static QName _GetLegislationDetailXmlLegislationId_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "LegislationId");
    private final static QName _GetLegislationSearchResultsPagedJsonResponseGetLegislationSearchResultsPagedJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationSearchResultsPagedJsonResult");
    private final static QName _GetLegislationSearchResultsPagedResponseGetLegislationSearchResultsPagedResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationSearchResultsPagedResult");
    private final static QName _GetLegislationRangeQuerystringXmlResponseGetLegislationRangeQuerystringXmlResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationRangeQuerystringXmlResult");
    private final static QName _StatusListingAmSub_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "AmSub");
    private final static QName _LegislationDetailFootnotes_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Footnotes");
    private final static QName _LegislationDetailVersions_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Versions");
    private final static QName _LegislationDetailStatusHistory_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "StatusHistory");
    private final static QName _LegislationDetailSponsor_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Sponsor");
    private final static QName _LegislationDetailSummary_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Summary");
    private final static QName _LegislationDetailVotes_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Votes");
    private final static QName _SessionLibrary_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Library");
    private final static QName _GetLegislationRangeJsonResponseGetLegislationRangeJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationRangeJsonResult");
    private final static QName _StatusConstraintDateStart_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "DateStart");
    private final static QName _StatusConstraintDateEnd_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "DateEnd");
    private final static QName _LegislationSearchConstraintsDocumentTypes_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "DocumentTypes");
    private final static QName _LegislationSearchConstraintsStatusConstraints_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "StatusConstraints");
    private final static QName _LegislationSearchConstraintsSponsors_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Sponsors");
    private final static QName _LegislationSearchConstraintsKeywords_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Keywords");
    private final static QName _LegislationSearchConstraintsLegislationTypes_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "LegislationTypes");
    private final static QName _LegislationSearchConstraintsSubjects_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Subjects");
    private final static QName _LegislationSearchConstraintsCommitteeAssigned_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "CommitteeAssigned");
    private final static QName _DocumentBaseUrl_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Url");
    private final static QName _GetLegislationDetailJsonResponseGetLegislationDetailJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationDetailJsonResult");
    private final static QName _GetLegislationRangeQuerystringJsonResponseGetLegislationRangeQuerystringJsonResult_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/services/", "GetLegislationRangeQuerystringJsonResult");
    private final static QName _LegislationLatestVersion_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "LatestVersion");
    private final static QName _LegislationCommittees_QNAME = new QName("http://www.legis.ga.gov/2009/01/01/data/", "Committees");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.ga.legis.legislation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link GetLegislationRangesJson }
     * 
     */
    public GetLegislationRangesJson createGetLegislationRangesJson() {
        return new GetLegislationRangesJson();
    }

    /**
     * Create an instance of {@link GetLegislationForSessionJsonResponse }
     * 
     */
    public GetLegislationForSessionJsonResponse createGetLegislationForSessionJsonResponse() {
        return new GetLegislationForSessionJsonResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLegislationIndex }
     * 
     */
    public ArrayOfLegislationIndex createArrayOfLegislationIndex() {
        return new ArrayOfLegislationIndex();
    }

    /**
     * Create an instance of {@link GetLegislationRange }
     * 
     */
    public GetLegislationRange createGetLegislationRange() {
        return new GetLegislationRange();
    }

    /**
     * Create an instance of {@link LegislationIndexRangeSet }
     * 
     */
    public LegislationIndexRangeSet createLegislationIndexRangeSet() {
        return new LegislationIndexRangeSet();
    }

    /**
     * Create an instance of {@link GetLegislationForSessionXml }
     * 
     */
    public GetLegislationForSessionXml createGetLegislationForSessionXml() {
        return new GetLegislationForSessionXml();
    }

    /**
     * Create an instance of {@link GetTitles }
     * 
     */
    public GetTitles createGetTitles() {
        return new GetTitles();
    }

    /**
     * Create an instance of {@link GetLegislationForSessionJson }
     * 
     */
    public GetLegislationForSessionJson createGetLegislationForSessionJson() {
        return new GetLegislationForSessionJson();
    }

    /**
     * Create an instance of {@link GetTitlesResponse }
     * 
     */
    public GetTitlesResponse createGetTitlesResponse() {
        return new GetTitlesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSubject }
     * 
     */
    public ArrayOfSubject createArrayOfSubject() {
        return new ArrayOfSubject();
    }

    /**
     * Create an instance of {@link GetLegislationSearchResultsPagedQuerystringXmlResponse }
     * 
     */
    public GetLegislationSearchResultsPagedQuerystringXmlResponse createGetLegislationSearchResultsPagedQuerystringXmlResponse() {
        return new GetLegislationSearchResultsPagedQuerystringXmlResponse();
    }

    /**
     * Create an instance of {@link LegislationSearchResultsPaged }
     * 
     */
    public LegislationSearchResultsPaged createLegislationSearchResultsPaged() {
        return new LegislationSearchResultsPaged();
    }

    /**
     * Create an instance of {@link GetLegislationDetailByDescriptionJson }
     * 
     */
    public GetLegislationDetailByDescriptionJson createGetLegislationDetailByDescriptionJson() {
        return new GetLegislationDetailByDescriptionJson();
    }

    /**
     * Create an instance of {@link GetLegislationDetailByDescription }
     * 
     */
    public GetLegislationDetailByDescription createGetLegislationDetailByDescription() {
        return new GetLegislationDetailByDescription();
    }

    /**
     * Create an instance of {@link GetLegislationRangesResponse }
     * 
     */
    public GetLegislationRangesResponse createGetLegislationRangesResponse() {
        return new GetLegislationRangesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLegislationIndexRangeSet }
     * 
     */
    public ArrayOfLegislationIndexRangeSet createArrayOfLegislationIndexRangeSet() {
        return new ArrayOfLegislationIndexRangeSet();
    }

    /**
     * Create an instance of {@link GetLegislationSearchResultsPagedXml }
     * 
     */
    public GetLegislationSearchResultsPagedXml createGetLegislationSearchResultsPagedXml() {
        return new GetLegislationSearchResultsPagedXml();
    }

    /**
     * Create an instance of {@link LegislationSearchConstraints }
     * 
     */
    public LegislationSearchConstraints createLegislationSearchConstraints() {
        return new LegislationSearchConstraints();
    }

    /**
     * Create an instance of {@link GetTitlesXml }
     * 
     */
    public GetTitlesXml createGetTitlesXml() {
        return new GetTitlesXml();
    }

    /**
     * Create an instance of {@link GetLegislationSearchResultsPagedQuerystringXml }
     * 
     */
    public GetLegislationSearchResultsPagedQuerystringXml createGetLegislationSearchResultsPagedQuerystringXml() {
        return new GetLegislationSearchResultsPagedQuerystringXml();
    }

    /**
     * Create an instance of {@link GetLegislationRanges }
     * 
     */
    public GetLegislationRanges createGetLegislationRanges() {
        return new GetLegislationRanges();
    }

    /**
     * Create an instance of {@link GetLegislationDetailXmlResponse }
     * 
     */
    public GetLegislationDetailXmlResponse createGetLegislationDetailXmlResponse() {
        return new GetLegislationDetailXmlResponse();
    }

    /**
     * Create an instance of {@link LegislationDetail }
     * 
     */
    public LegislationDetail createLegislationDetail() {
        return new LegislationDetail();
    }

    /**
     * Create an instance of {@link GetLegislationSearchResultsPaged }
     * 
     */
    public GetLegislationSearchResultsPaged createGetLegislationSearchResultsPaged() {
        return new GetLegislationSearchResultsPaged();
    }

    /**
     * Create an instance of {@link GetTitlesJsonResponse }
     * 
     */
    public GetTitlesJsonResponse createGetTitlesJsonResponse() {
        return new GetTitlesJsonResponse();
    }

    /**
     * Create an instance of {@link GetLegislationSearchResultsPagedJson }
     * 
     */
    public GetLegislationSearchResultsPagedJson createGetLegislationSearchResultsPagedJson() {
        return new GetLegislationSearchResultsPagedJson();
    }

    /**
     * Create an instance of {@link GetLegislationDetailByDescriptionResponse }
     * 
     */
    public GetLegislationDetailByDescriptionResponse createGetLegislationDetailByDescriptionResponse() {
        return new GetLegislationDetailByDescriptionResponse();
    }

    /**
     * Create an instance of {@link GetLegislationRangeXmlResponse }
     * 
     */
    public GetLegislationRangeXmlResponse createGetLegislationRangeXmlResponse() {
        return new GetLegislationRangeXmlResponse();
    }

    /**
     * Create an instance of {@link LegislationIndexRange }
     * 
     */
    public LegislationIndexRange createLegislationIndexRange() {
        return new LegislationIndexRange();
    }

    /**
     * Create an instance of {@link GetLegislationDetailJson }
     * 
     */
    public GetLegislationDetailJson createGetLegislationDetailJson() {
        return new GetLegislationDetailJson();
    }

    /**
     * Create an instance of {@link GetLegislationDetailJsonResponse }
     * 
     */
    public GetLegislationDetailJsonResponse createGetLegislationDetailJsonResponse() {
        return new GetLegislationDetailJsonResponse();
    }

    /**
     * Create an instance of {@link GetLegislationRangeXml }
     * 
     */
    public GetLegislationRangeXml createGetLegislationRangeXml() {
        return new GetLegislationRangeXml();
    }

    /**
     * Create an instance of {@link GetLegislationForSessionXmlResponse }
     * 
     */
    public GetLegislationForSessionXmlResponse createGetLegislationForSessionXmlResponse() {
        return new GetLegislationForSessionXmlResponse();
    }

    /**
     * Create an instance of {@link GetLegislationRangeQuerystringXml }
     * 
     */
    public GetLegislationRangeQuerystringXml createGetLegislationRangeQuerystringXml() {
        return new GetLegislationRangeQuerystringXml();
    }

    /**
     * Create an instance of {@link GetLegislationRangeQuerystringXmlResponse }
     * 
     */
    public GetLegislationRangeQuerystringXmlResponse createGetLegislationRangeQuerystringXmlResponse() {
        return new GetLegislationRangeQuerystringXmlResponse();
    }

    /**
     * Create an instance of {@link GetLegislationDetailByDescriptionXml }
     * 
     */
    public GetLegislationDetailByDescriptionXml createGetLegislationDetailByDescriptionXml() {
        return new GetLegislationDetailByDescriptionXml();
    }

    /**
     * Create an instance of {@link GetLegislationRangeJsonResponse }
     * 
     */
    public GetLegislationRangeJsonResponse createGetLegislationRangeJsonResponse() {
        return new GetLegislationRangeJsonResponse();
    }

    /**
     * Create an instance of {@link GetLegislationSearchResultsPagedJsonResponse }
     * 
     */
    public GetLegislationSearchResultsPagedJsonResponse createGetLegislationSearchResultsPagedJsonResponse() {
        return new GetLegislationSearchResultsPagedJsonResponse();
    }

    /**
     * Create an instance of {@link GetLegislationDetail }
     * 
     */
    public GetLegislationDetail createGetLegislationDetail() {
        return new GetLegislationDetail();
    }

    /**
     * Create an instance of {@link GetLegislationRangeQuerystringJson }
     * 
     */
    public GetLegislationRangeQuerystringJson createGetLegislationRangeQuerystringJson() {
        return new GetLegislationRangeQuerystringJson();
    }

    /**
     * Create an instance of {@link GetLegislationRangeResponse }
     * 
     */
    public GetLegislationRangeResponse createGetLegislationRangeResponse() {
        return new GetLegislationRangeResponse();
    }

    /**
     * Create an instance of {@link GetLegislationSearchResultsPagedQuerystringJson }
     * 
     */
    public GetLegislationSearchResultsPagedQuerystringJson createGetLegislationSearchResultsPagedQuerystringJson() {
        return new GetLegislationSearchResultsPagedQuerystringJson();
    }

    /**
     * Create an instance of {@link GetLegislationForSession }
     * 
     */
    public GetLegislationForSession createGetLegislationForSession() {
        return new GetLegislationForSession();
    }

    /**
     * Create an instance of {@link GetTitlesJson }
     * 
     */
    public GetTitlesJson createGetTitlesJson() {
        return new GetTitlesJson();
    }

    /**
     * Create an instance of {@link GetLegislationRangesXml }
     * 
     */
    public GetLegislationRangesXml createGetLegislationRangesXml() {
        return new GetLegislationRangesXml();
    }

    /**
     * Create an instance of {@link GetTitlesXmlResponse }
     * 
     */
    public GetTitlesXmlResponse createGetTitlesXmlResponse() {
        return new GetTitlesXmlResponse();
    }

    /**
     * Create an instance of {@link GetLegislationSearchResultsPagedXmlResponse }
     * 
     */
    public GetLegislationSearchResultsPagedXmlResponse createGetLegislationSearchResultsPagedXmlResponse() {
        return new GetLegislationSearchResultsPagedXmlResponse();
    }

    /**
     * Create an instance of {@link GetLegislationForSessionResponse }
     * 
     */
    public GetLegislationForSessionResponse createGetLegislationForSessionResponse() {
        return new GetLegislationForSessionResponse();
    }

    /**
     * Create an instance of {@link GetLegislationDetailByDescriptionJsonResponse }
     * 
     */
    public GetLegislationDetailByDescriptionJsonResponse createGetLegislationDetailByDescriptionJsonResponse() {
        return new GetLegislationDetailByDescriptionJsonResponse();
    }

    /**
     * Create an instance of {@link GetLegislationDetailByDescriptionXmlResponse }
     * 
     */
    public GetLegislationDetailByDescriptionXmlResponse createGetLegislationDetailByDescriptionXmlResponse() {
        return new GetLegislationDetailByDescriptionXmlResponse();
    }

    /**
     * Create an instance of {@link GetLegislationRangesJsonResponse }
     * 
     */
    public GetLegislationRangesJsonResponse createGetLegislationRangesJsonResponse() {
        return new GetLegislationRangesJsonResponse();
    }

    /**
     * Create an instance of {@link GetLegislationRangeQuerystringJsonResponse }
     * 
     */
    public GetLegislationRangeQuerystringJsonResponse createGetLegislationRangeQuerystringJsonResponse() {
        return new GetLegislationRangeQuerystringJsonResponse();
    }

    /**
     * Create an instance of {@link GetLegislationDetailResponse }
     * 
     */
    public GetLegislationDetailResponse createGetLegislationDetailResponse() {
        return new GetLegislationDetailResponse();
    }

    /**
     * Create an instance of {@link GetLegislationSearchResultsPagedResponse }
     * 
     */
    public GetLegislationSearchResultsPagedResponse createGetLegislationSearchResultsPagedResponse() {
        return new GetLegislationSearchResultsPagedResponse();
    }

    /**
     * Create an instance of {@link GetLegislationRangesXmlResponse }
     * 
     */
    public GetLegislationRangesXmlResponse createGetLegislationRangesXmlResponse() {
        return new GetLegislationRangesXmlResponse();
    }

    /**
     * Create an instance of {@link GetLegislationRangeJson }
     * 
     */
    public GetLegislationRangeJson createGetLegislationRangeJson() {
        return new GetLegislationRangeJson();
    }

    /**
     * Create an instance of {@link GetLegislationSearchResultsPagedQuerystringJsonResponse }
     * 
     */
    public GetLegislationSearchResultsPagedQuerystringJsonResponse createGetLegislationSearchResultsPagedQuerystringJsonResponse() {
        return new GetLegislationSearchResultsPagedQuerystringJsonResponse();
    }

    /**
     * Create an instance of {@link GetLegislationDetailXml }
     * 
     */
    public GetLegislationDetailXml createGetLegislationDetailXml() {
        return new GetLegislationDetailXml();
    }

    /**
     * Create an instance of {@link ArrayOfVoteListing }
     * 
     */
    public ArrayOfVoteListing createArrayOfVoteListing() {
        return new ArrayOfVoteListing();
    }

    /**
     * Create an instance of {@link ExistingStatusConstraint }
     * 
     */
    public ExistingStatusConstraint createExistingStatusConstraint() {
        return new ExistingStatusConstraint();
    }

    /**
     * Create an instance of {@link CurrentStatusConstraint }
     * 
     */
    public CurrentStatusConstraint createCurrentStatusConstraint() {
        return new CurrentStatusConstraint();
    }

    /**
     * Create an instance of {@link StatusConstraint }
     * 
     */
    public StatusConstraint createStatusConstraint() {
        return new StatusConstraint();
    }

    /**
     * Create an instance of {@link VoteListing }
     * 
     */
    public VoteListing createVoteListing() {
        return new VoteListing();
    }

    /**
     * Create an instance of {@link CommitteeListing }
     * 
     */
    public CommitteeListing createCommitteeListing() {
        return new CommitteeListing();
    }

    /**
     * Create an instance of {@link StatusBase }
     * 
     */
    public StatusBase createStatusBase() {
        return new StatusBase();
    }

    /**
     * Create an instance of {@link ArrayOfCommitteeListing }
     * 
     */
    public ArrayOfCommitteeListing createArrayOfCommitteeListing() {
        return new ArrayOfCommitteeListing();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentDescription }
     * 
     */
    public ArrayOfDocumentDescription createArrayOfDocumentDescription() {
        return new ArrayOfDocumentDescription();
    }

    /**
     * Create an instance of {@link ArrayOfStatusListing }
     * 
     */
    public ArrayOfStatusListing createArrayOfStatusListing() {
        return new ArrayOfStatusListing();
    }

    /**
     * Create an instance of {@link ArrayOfSponsorship }
     * 
     */
    public ArrayOfSponsorship createArrayOfSponsorship() {
        return new ArrayOfSponsorship();
    }

    /**
     * Create an instance of {@link InvalidSearchConstraintsFault }
     * 
     */
    public InvalidSearchConstraintsFault createInvalidSearchConstraintsFault() {
        return new InvalidSearchConstraintsFault();
    }

    /**
     * Create an instance of {@link DocumentBase }
     * 
     */
    public DocumentBase createDocumentBase() {
        return new DocumentBase();
    }

    /**
     * Create an instance of {@link LegislationIndex }
     * 
     */
    public LegislationIndex createLegislationIndex() {
        return new LegislationIndex();
    }

    /**
     * Create an instance of {@link CommitteeBase }
     * 
     */
    public CommitteeBase createCommitteeBase() {
        return new CommitteeBase();
    }

    /**
     * Create an instance of {@link Legislation }
     * 
     */
    public Legislation createLegislation() {
        return new Legislation();
    }

    /**
     * Create an instance of {@link ArrayOfStatusConstraint }
     * 
     */
    public ArrayOfStatusConstraint createArrayOfStatusConstraint() {
        return new ArrayOfStatusConstraint();
    }

    /**
     * Create an instance of {@link ArrayOfLegislationType }
     * 
     */
    public ArrayOfLegislationType createArrayOfLegislationType() {
        return new ArrayOfLegislationType();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Create an instance of {@link Sponsorship }
     * 
     */
    public Sponsorship createSponsorship() {
        return new Sponsorship();
    }

    /**
     * Create an instance of {@link DocumentDescription }
     * 
     */
    public DocumentDescription createDocumentDescription() {
        return new DocumentDescription();
    }

    /**
     * Create an instance of {@link ArrayOfLegislationSearchResult }
     * 
     */
    public ArrayOfLegislationSearchResult createArrayOfLegislationSearchResult() {
        return new ArrayOfLegislationSearchResult();
    }

    /**
     * Create an instance of {@link StatusListing }
     * 
     */
    public StatusListing createStatusListing() {
        return new StatusListing();
    }

    /**
     * Create an instance of {@link InvalidPageSizeFault }
     * 
     */
    public InvalidPageSizeFault createInvalidPageSizeFault() {
        return new InvalidPageSizeFault();
    }

    /**
     * Create an instance of {@link LegislationSearchResult }
     * 
     */
    public LegislationSearchResult createLegislationSearchResult() {
        return new LegislationSearchResult();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentType }
     * 
     */
    public ArrayOfDocumentType createArrayOfDocumentType() {
        return new ArrayOfDocumentType();
    }

    /**
     * Create an instance of {@link Session }
     * 
     */
    public Session createSession() {
        return new Session();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Subject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Subject")
    public JAXBElement<Subject> createSubject(Subject value) {
        return new JAXBElement<Subject>(_Subject_QNAME, Subject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "DocumentType")
    public JAXBElement<DocumentType> createDocumentType(DocumentType value) {
        return new JAXBElement<DocumentType>(_DocumentType_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "DocumentDescription")
    public JAXBElement<DocumentDescription> createDocumentDescription(DocumentDescription value) {
        return new JAXBElement<DocumentDescription>(_DocumentDescription_QNAME, DocumentDescription.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "LegislationSearchResult")
    public JAXBElement<LegislationSearchResult> createLegislationSearchResult(LegislationSearchResult value) {
        return new JAXBElement<LegislationSearchResult>(_LegislationSearchResult_QNAME, LegislationSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfDocumentType")
    public JAXBElement<ArrayOfDocumentType> createArrayOfDocumentType(ArrayOfDocumentType value) {
        return new JAXBElement<ArrayOfDocumentType>(_ArrayOfDocumentType_QNAME, ArrayOfDocumentType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislationSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfLegislationSearchResult")
    public JAXBElement<ArrayOfLegislationSearchResult> createArrayOfLegislationSearchResult(ArrayOfLegislationSearchResult value) {
        return new JAXBElement<ArrayOfLegislationSearchResult>(_ArrayOfLegislationSearchResult_QNAME, ArrayOfLegislationSearchResult.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "StatusListing")
    public JAXBElement<StatusListing> createStatusListing(StatusListing value) {
        return new JAXBElement<StatusListing>(_StatusListing_QNAME, StatusListing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExistingStatusConstraint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ExistingStatusConstraint")
    public JAXBElement<ExistingStatusConstraint> createExistingStatusConstraint(ExistingStatusConstraint value) {
        return new JAXBElement<ExistingStatusConstraint>(_ExistingStatusConstraint_QNAME, ExistingStatusConstraint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentStatusConstraint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "CurrentStatusConstraint")
    public JAXBElement<CurrentStatusConstraint> createCurrentStatusConstraint(CurrentStatusConstraint value) {
        return new JAXBElement<CurrentStatusConstraint>(_CurrentStatusConstraint_QNAME, CurrentStatusConstraint.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfSubject")
    public JAXBElement<ArrayOfSubject> createArrayOfSubject(ArrayOfSubject value) {
        return new JAXBElement<ArrayOfSubject>(_ArrayOfSubject_QNAME, ArrayOfSubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislationIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfLegislationIndex")
    public JAXBElement<ArrayOfLegislationIndex> createArrayOfLegislationIndex(ArrayOfLegislationIndex value) {
        return new JAXBElement<ArrayOfLegislationIndex>(_ArrayOfLegislationIndex_QNAME, ArrayOfLegislationIndex.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationIndexRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "LegislationIndexRange")
    public JAXBElement<LegislationIndexRange> createLegislationIndexRange(LegislationIndexRange value) {
        return new JAXBElement<LegislationIndexRange>(_LegislationIndexRange_QNAME, LegislationIndexRange.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "CommitteeListing")
    public JAXBElement<CommitteeListing> createCommitteeListing(CommitteeListing value) {
        return new JAXBElement<CommitteeListing>(_CommitteeListing_QNAME, CommitteeListing.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "DocumentBase")
    public JAXBElement<DocumentBase> createDocumentBase(DocumentBase value) {
        return new JAXBElement<DocumentBase>(_DocumentBase_QNAME, DocumentBase.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Legislation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Legislation")
    public JAXBElement<Legislation> createLegislation(Legislation value) {
        return new JAXBElement<Legislation>(_Legislation_QNAME, Legislation.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Status")
    public JAXBElement<Status> createStatus(Status value) {
        return new JAXBElement<Status>(_Status_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "LegislationIndex")
    public JAXBElement<LegislationIndex> createLegislationIndex(LegislationIndex value) {
        return new JAXBElement<LegislationIndex>(_LegislationIndex_QNAME, LegislationIndex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SponsorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "SponsorType")
    public JAXBElement<SponsorType> createSponsorType(SponsorType value) {
        return new JAXBElement<SponsorType>(_SponsorType_QNAME, SponsorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfLegislationType")
    public JAXBElement<ArrayOfLegislationType> createArrayOfLegislationType(ArrayOfLegislationType value) {
        return new JAXBElement<ArrayOfLegislationType>(_ArrayOfLegislationType_QNAME, ArrayOfLegislationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusConstraint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfStatusConstraint")
    public JAXBElement<ArrayOfStatusConstraint> createArrayOfStatusConstraint(ArrayOfStatusConstraint value) {
        return new JAXBElement<ArrayOfStatusConstraint>(_ArrayOfStatusConstraint_QNAME, ArrayOfStatusConstraint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislationIndexRangeSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfLegislationIndexRangeSet")
    public JAXBElement<ArrayOfLegislationIndexRangeSet> createArrayOfLegislationIndexRangeSet(ArrayOfLegislationIndexRangeSet value) {
        return new JAXBElement<ArrayOfLegislationIndexRangeSet>(_ArrayOfLegislationIndexRangeSet_QNAME, ArrayOfLegislationIndexRangeSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "LegislationDetail")
    public JAXBElement<LegislationDetail> createLegislationDetail(LegislationDetail value) {
        return new JAXBElement<LegislationDetail>(_LegislationDetail_QNAME, LegislationDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sponsorship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Sponsorship")
    public JAXBElement<Sponsorship> createSponsorship(Sponsorship value) {
        return new JAXBElement<Sponsorship>(_Sponsorship_QNAME, Sponsorship.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidPageSizeFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "InvalidPageSizeFault")
    public JAXBElement<InvalidPageSizeFault> createInvalidPageSizeFault(InvalidPageSizeFault value) {
        return new JAXBElement<InvalidPageSizeFault>(_InvalidPageSizeFault_QNAME, InvalidPageSizeFault.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link VoteListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "VoteListing")
    public JAXBElement<VoteListing> createVoteListing(VoteListing value) {
        return new JAXBElement<VoteListing>(_VoteListing_QNAME, VoteListing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "LegislationType")
    public JAXBElement<LegislationType> createLegislationType(LegislationType value) {
        return new JAXBElement<LegislationType>(_LegislationType_QNAME, LegislationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusConstraint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "StatusConstraint")
    public JAXBElement<StatusConstraint> createStatusConstraint(StatusConstraint value) {
        return new JAXBElement<StatusConstraint>(_StatusConstraint_QNAME, StatusConstraint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationSearchResultsPaged }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "LegislationSearchResultsPaged")
    public JAXBElement<LegislationSearchResultsPaged> createLegislationSearchResultsPaged(LegislationSearchResultsPaged value) {
        return new JAXBElement<LegislationSearchResultsPaged>(_LegislationSearchResultsPaged_QNAME, LegislationSearchResultsPaged.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfDocumentDescription")
    public JAXBElement<ArrayOfDocumentDescription> createArrayOfDocumentDescription(ArrayOfDocumentDescription value) {
        return new JAXBElement<ArrayOfDocumentDescription>(_ArrayOfDocumentDescription_QNAME, ArrayOfDocumentDescription.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "StatusBase")
    public JAXBElement<StatusBase> createStatusBase(StatusBase value) {
        return new JAXBElement<StatusBase>(_StatusBase_QNAME, StatusBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSponsorship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfSponsorship")
    public JAXBElement<ArrayOfSponsorship> createArrayOfSponsorship(ArrayOfSponsorship value) {
        return new JAXBElement<ArrayOfSponsorship>(_ArrayOfSponsorship_QNAME, ArrayOfSponsorship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidSearchConstraintsFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "InvalidSearchConstraintsFault")
    public JAXBElement<InvalidSearchConstraintsFault> createInvalidSearchConstraintsFault(InvalidSearchConstraintsFault value) {
        return new JAXBElement<InvalidSearchConstraintsFault>(_InvalidSearchConstraintsFault_QNAME, InvalidSearchConstraintsFault.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationSearchConstraints }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "LegislationSearchConstraints")
    public JAXBElement<LegislationSearchConstraints> createLegislationSearchConstraints(LegislationSearchConstraints value) {
        return new JAXBElement<LegislationSearchConstraints>(_LegislationSearchConstraints_QNAME, LegislationSearchConstraints.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationIndexRangeSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "LegislationIndexRangeSet")
    public JAXBElement<LegislationIndexRangeSet> createLegislationIndexRangeSet(LegislationIndexRangeSet value) {
        return new JAXBElement<LegislationIndexRangeSet>(_LegislationIndexRangeSet_QNAME, LegislationIndexRangeSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ArrayOfStatusListing")
    public JAXBElement<ArrayOfStatusListing> createArrayOfStatusListing(ArrayOfStatusListing value) {
        return new JAXBElement<ArrayOfStatusListing>(_ArrayOfStatusListing_QNAME, ArrayOfStatusListing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislationIndexRangeSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationRangesJsonResult", scope = GetLegislationRangesJsonResponse.class)
    public JAXBElement<ArrayOfLegislationIndexRangeSet> createGetLegislationRangesJsonResponseGetLegislationRangesJsonResult(ArrayOfLegislationIndexRangeSet value) {
        return new JAXBElement<ArrayOfLegislationIndexRangeSet>(_GetLegislationRangesJsonResponseGetLegislationRangesJsonResult_QNAME, ArrayOfLegislationIndexRangeSet.class, GetLegislationRangesJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationIndexRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationRangeXmlResult", scope = GetLegislationRangeXmlResponse.class)
    public JAXBElement<LegislationIndexRange> createGetLegislationRangeXmlResponseGetLegislationRangeXmlResult(LegislationIndexRange value) {
        return new JAXBElement<LegislationIndexRange>(_GetLegislationRangeXmlResponseGetLegislationRangeXmlResult_QNAME, LegislationIndexRange.class, GetLegislationRangeXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Number", scope = GetLegislationDetailByDescriptionXml.class)
    public JAXBElement<String> createGetLegislationDetailByDescriptionXmlNumber(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlNumber_QNAME, String.class, GetLegislationDetailByDescriptionXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "DocumentType", scope = GetLegislationDetailByDescriptionXml.class)
    public JAXBElement<String> createGetLegislationDetailByDescriptionXmlDocumentType(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlDocumentType_QNAME, String.class, GetLegislationDetailByDescriptionXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetLegislationDetailByDescriptionXml.class)
    public JAXBElement<String> createGetLegislationDetailByDescriptionXmlSessionId(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlSessionId_QNAME, String.class, GetLegislationDetailByDescriptionXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationIndexRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationRangeResult", scope = GetLegislationRangeResponse.class)
    public JAXBElement<LegislationIndexRange> createGetLegislationRangeResponseGetLegislationRangeResult(LegislationIndexRange value) {
        return new JAXBElement<LegislationIndexRange>(_GetLegislationRangeResponseGetLegislationRangeResult_QNAME, LegislationIndexRange.class, GetLegislationRangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationSearchResultsPaged }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationSearchResultsPagedXmlResult", scope = GetLegislationSearchResultsPagedXmlResponse.class)
    public JAXBElement<LegislationSearchResultsPaged> createGetLegislationSearchResultsPagedXmlResponseGetLegislationSearchResultsPagedXmlResult(LegislationSearchResultsPaged value) {
        return new JAXBElement<LegislationSearchResultsPaged>(_GetLegislationSearchResultsPagedXmlResponseGetLegislationSearchResultsPagedXmlResult_QNAME, LegislationSearchResultsPaged.class, GetLegislationSearchResultsPagedXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationSearchResultsPaged }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationSearchResultsPagedQuerystringXmlResult", scope = GetLegislationSearchResultsPagedQuerystringXmlResponse.class)
    public JAXBElement<LegislationSearchResultsPaged> createGetLegislationSearchResultsPagedQuerystringXmlResponseGetLegislationSearchResultsPagedQuerystringXmlResult(LegislationSearchResultsPaged value) {
        return new JAXBElement<LegislationSearchResultsPaged>(_GetLegislationSearchResultsPagedQuerystringXmlResponseGetLegislationSearchResultsPagedQuerystringXmlResult_QNAME, LegislationSearchResultsPaged.class, GetLegislationSearchResultsPagedQuerystringXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationDetailByDescriptionResult", scope = GetLegislationDetailByDescriptionResponse.class)
    public JAXBElement<LegislationDetail> createGetLegislationDetailByDescriptionResponseGetLegislationDetailByDescriptionResult(LegislationDetail value) {
        return new JAXBElement<LegislationDetail>(_GetLegislationDetailByDescriptionResponseGetLegislationDetailByDescriptionResult_QNAME, LegislationDetail.class, GetLegislationDetailByDescriptionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Reason", scope = InvalidSearchConstraintsFault.class)
    public JAXBElement<String> createInvalidSearchConstraintsFaultReason(String value) {
        return new JAXBElement<String>(_InvalidSearchConstraintsFaultReason_QNAME, String.class, InvalidSearchConstraintsFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "InvalidPropertyName", scope = InvalidSearchConstraintsFault.class)
    public JAXBElement<String> createInvalidSearchConstraintsFaultInvalidPropertyName(String value) {
        return new JAXBElement<String>(_InvalidSearchConstraintsFaultInvalidPropertyName_QNAME, String.class, InvalidSearchConstraintsFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislationIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Legislation", scope = LegislationIndexRange.class)
    public JAXBElement<ArrayOfLegislationIndex> createLegislationIndexRangeLegislation(ArrayOfLegislationIndex value) {
        return new JAXBElement<ArrayOfLegislationIndex>(_Legislation_QNAME, ArrayOfLegislationIndex.class, LegislationIndexRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Session }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Session", scope = LegislationIndexRange.class)
    public JAXBElement<Session> createLegislationIndexRangeSession(Session value) {
        return new JAXBElement<Session>(_Session_QNAME, Session.class, LegislationIndexRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "RangeSize", scope = GetLegislationRangesXml.class)
    public JAXBElement<String> createGetLegislationRangesXmlRangeSize(String value) {
        return new JAXBElement<String>(_GetLegislationRangesXmlRangeSize_QNAME, String.class, GetLegislationRangesXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "DocumentType", scope = GetLegislationRangesXml.class)
    public JAXBElement<String> createGetLegislationRangesXmlDocumentType(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlDocumentType_QNAME, String.class, GetLegislationRangesXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetLegislationRangesXml.class)
    public JAXBElement<String> createGetLegislationRangesXmlSessionId(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlSessionId_QNAME, String.class, GetLegislationRangesXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "HouseCommittee", scope = LegislationSearchResult.class)
    public JAXBElement<CommitteeListing> createLegislationSearchResultHouseCommittee(CommitteeListing value) {
        return new JAXBElement<CommitteeListing>(_LegislationSearchResultHouseCommittee_QNAME, CommitteeListing.class, LegislationSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSponsorship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Authors", scope = LegislationSearchResult.class)
    public JAXBElement<ArrayOfSponsorship> createLegislationSearchResultAuthors(ArrayOfSponsorship value) {
        return new JAXBElement<ArrayOfSponsorship>(_LegislationSearchResultAuthors_QNAME, ArrayOfSponsorship.class, LegislationSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Status", scope = LegislationSearchResult.class)
    public JAXBElement<StatusListing> createLegislationSearchResultStatus(StatusListing value) {
        return new JAXBElement<StatusListing>(_Status_QNAME, StatusListing.class, LegislationSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Suffix", scope = LegislationSearchResult.class)
    public JAXBElement<String> createLegislationSearchResultSuffix(String value) {
        return new JAXBElement<String>(_LegislationSearchResultSuffix_QNAME, String.class, LegislationSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Caption", scope = LegislationSearchResult.class)
    public JAXBElement<String> createLegislationSearchResultCaption(String value) {
        return new JAXBElement<String>(_LegislationSearchResultCaption_QNAME, String.class, LegislationSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Session }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Session", scope = LegislationSearchResult.class)
    public JAXBElement<Session> createLegislationSearchResultSession(Session value) {
        return new JAXBElement<Session>(_Session_QNAME, Session.class, LegislationSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ActVetoNumber", scope = LegislationSearchResult.class)
    public JAXBElement<String> createLegislationSearchResultActVetoNumber(String value) {
        return new JAXBElement<String>(_LegislationSearchResultActVetoNumber_QNAME, String.class, LegislationSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "SenateCommittee", scope = LegislationSearchResult.class)
    public JAXBElement<CommitteeListing> createLegislationSearchResultSenateCommittee(CommitteeListing value) {
        return new JAXBElement<CommitteeListing>(_LegislationSearchResultSenateCommittee_QNAME, CommitteeListing.class, LegislationSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationDetailByDescriptionXmlResult", scope = GetLegislationDetailByDescriptionXmlResponse.class)
    public JAXBElement<LegislationDetail> createGetLegislationDetailByDescriptionXmlResponseGetLegislationDetailByDescriptionXmlResult(LegislationDetail value) {
        return new JAXBElement<LegislationDetail>(_GetLegislationDetailByDescriptionXmlResponseGetLegislationDetailByDescriptionXmlResult_QNAME, LegislationDetail.class, GetLegislationDetailByDescriptionXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationSearchConstraints }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Constraints", scope = GetLegislationSearchResultsPaged.class)
    public JAXBElement<LegislationSearchConstraints> createGetLegislationSearchResultsPagedConstraints(LegislationSearchConstraints value) {
        return new JAXBElement<LegislationSearchConstraints>(_GetLegislationSearchResultsPagedConstraints_QNAME, LegislationSearchConstraints.class, GetLegislationSearchResultsPaged.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetTitlesResult", scope = GetTitlesResponse.class)
    public JAXBElement<ArrayOfSubject> createGetTitlesResponseGetTitlesResult(ArrayOfSubject value) {
        return new JAXBElement<ArrayOfSubject>(_GetTitlesResponseGetTitlesResult_QNAME, ArrayOfSubject.class, GetTitlesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Description", scope = LegislationIndex.class)
    public JAXBElement<String> createLegislationIndexDescription(String value) {
        return new JAXBElement<String>(_LegislationIndexDescription_QNAME, String.class, LegislationIndex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Caption", scope = LegislationIndex.class)
    public JAXBElement<String> createLegislationIndexCaption(String value) {
        return new JAXBElement<String>(_LegislationSearchResultCaption_QNAME, String.class, LegislationIndex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationDetailByDescriptionJsonResult", scope = GetLegislationDetailByDescriptionJsonResponse.class)
    public JAXBElement<LegislationDetail> createGetLegislationDetailByDescriptionJsonResponseGetLegislationDetailByDescriptionJsonResult(LegislationDetail value) {
        return new JAXBElement<LegislationDetail>(_GetLegislationDetailByDescriptionJsonResponseGetLegislationDetailByDescriptionJsonResult_QNAME, LegislationDetail.class, GetLegislationDetailByDescriptionJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Start", scope = GetLegislationRangeQuerystringXml.class)
    public JAXBElement<String> createGetLegislationRangeQuerystringXmlStart(String value) {
        return new JAXBElement<String>(_GetLegislationRangeQuerystringXmlStart_QNAME, String.class, GetLegislationRangeQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "End", scope = GetLegislationRangeQuerystringXml.class)
    public JAXBElement<String> createGetLegislationRangeQuerystringXmlEnd(String value) {
        return new JAXBElement<String>(_GetLegislationRangeQuerystringXmlEnd_QNAME, String.class, GetLegislationRangeQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "DocumentType", scope = GetLegislationRangeQuerystringXml.class)
    public JAXBElement<String> createGetLegislationRangeQuerystringXmlDocumentType(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlDocumentType_QNAME, String.class, GetLegislationRangeQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetLegislationRangeQuerystringXml.class)
    public JAXBElement<String> createGetLegislationRangeQuerystringXmlSessionId(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlSessionId_QNAME, String.class, GetLegislationRangeQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetLegislationForSessionJson.class)
    public JAXBElement<String> createGetLegislationForSessionJsonSessionId(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlSessionId_QNAME, String.class, GetLegislationForSessionJson.class, value);
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
        return new JAXBElement<String>(_CommitteeBaseName_QNAME, String.class, CommitteeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationSearchConstraints }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Constraints", scope = GetLegislationSearchResultsPagedXml.class)
    public JAXBElement<LegislationSearchConstraints> createGetLegislationSearchResultsPagedXmlConstraints(LegislationSearchConstraints value) {
        return new JAXBElement<LegislationSearchConstraints>(_GetLegislationSearchResultsPagedConstraints_QNAME, LegislationSearchConstraints.class, GetLegislationSearchResultsPagedXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "PageSize", scope = GetLegislationSearchResultsPagedXml.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedXmlPageSize(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedXmlPageSize_QNAME, String.class, GetLegislationSearchResultsPagedXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "StartIndex", scope = GetLegislationSearchResultsPagedXml.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedXmlStartIndex(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedXmlStartIndex_QNAME, String.class, GetLegislationSearchResultsPagedXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetTitlesJsonResult", scope = GetTitlesJsonResponse.class)
    public JAXBElement<ArrayOfSubject> createGetTitlesJsonResponseGetTitlesJsonResult(ArrayOfSubject value) {
        return new JAXBElement<ArrayOfSubject>(_GetTitlesJsonResponseGetTitlesJsonResult_QNAME, ArrayOfSubject.class, GetTitlesJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Parent", scope = Subject.class)
    public JAXBElement<Integer> createSubjectParent(Integer value) {
        return new JAXBElement<Integer>(_SubjectParent_QNAME, Integer.class, Subject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Code", scope = Subject.class)
    public JAXBElement<String> createSubjectCode(String value) {
        return new JAXBElement<String>(_CommitteeBaseCode_QNAME, String.class, Subject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Name", scope = Subject.class)
    public JAXBElement<String> createSubjectName(String value) {
        return new JAXBElement<String>(_CommitteeBaseName_QNAME, String.class, Subject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationIndexRangeSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Range", scope = GetLegislationRangeJson.class)
    public JAXBElement<LegislationIndexRangeSet> createGetLegislationRangeJsonRange(LegislationIndexRangeSet value) {
        return new JAXBElement<LegislationIndexRangeSet>(_GetLegislationRangeJsonRange_QNAME, LegislationIndexRangeSet.class, GetLegislationRangeJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislationIndexRangeSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationRangesXmlResult", scope = GetLegislationRangesXmlResponse.class)
    public JAXBElement<ArrayOfLegislationIndexRangeSet> createGetLegislationRangesXmlResponseGetLegislationRangesXmlResult(ArrayOfLegislationIndexRangeSet value) {
        return new JAXBElement<ArrayOfLegislationIndexRangeSet>(_GetLegislationRangesXmlResponseGetLegislationRangesXmlResult_QNAME, ArrayOfLegislationIndexRangeSet.class, GetLegislationRangesXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Legislation", scope = VoteListing.class)
    public JAXBElement<String> createVoteListingLegislation(String value) {
        return new JAXBElement<String>(_Legislation_QNAME, String.class, VoteListing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Reason", scope = InvalidPageSizeFault.class)
    public JAXBElement<String> createInvalidPageSizeFaultReason(String value) {
        return new JAXBElement<String>(_InvalidSearchConstraintsFaultReason_QNAME, String.class, InvalidPageSizeFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationSearchResultsPaged }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationSearchResultsPagedQuerystringJsonResult", scope = GetLegislationSearchResultsPagedQuerystringJsonResponse.class)
    public JAXBElement<LegislationSearchResultsPaged> createGetLegislationSearchResultsPagedQuerystringJsonResponseGetLegislationSearchResultsPagedQuerystringJsonResult(LegislationSearchResultsPaged value) {
        return new JAXBElement<LegislationSearchResultsPaged>(_GetLegislationSearchResultsPagedQuerystringJsonResponseGetLegislationSearchResultsPagedQuerystringJsonResult_QNAME, LegislationSearchResultsPaged.class, GetLegislationSearchResultsPagedQuerystringJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationSearchConstraints }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Constraints", scope = GetLegislationSearchResultsPagedJson.class)
    public JAXBElement<LegislationSearchConstraints> createGetLegislationSearchResultsPagedJsonConstraints(LegislationSearchConstraints value) {
        return new JAXBElement<LegislationSearchConstraints>(_GetLegislationSearchResultsPagedConstraints_QNAME, LegislationSearchConstraints.class, GetLegislationSearchResultsPagedJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "PageSize", scope = GetLegislationSearchResultsPagedJson.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedJsonPageSize(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedXmlPageSize_QNAME, String.class, GetLegislationSearchResultsPagedJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "StartIndex", scope = GetLegislationSearchResultsPagedJson.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedJsonStartIndex(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedXmlStartIndex_QNAME, String.class, GetLegislationSearchResultsPagedJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislationIndexRangeSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationRangesResult", scope = GetLegislationRangesResponse.class)
    public JAXBElement<ArrayOfLegislationIndexRangeSet> createGetLegislationRangesResponseGetLegislationRangesResult(ArrayOfLegislationIndexRangeSet value) {
        return new JAXBElement<ArrayOfLegislationIndexRangeSet>(_GetLegislationRangesResponseGetLegislationRangesResult_QNAME, ArrayOfLegislationIndexRangeSet.class, GetLegislationRangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetTitlesXmlResult", scope = GetTitlesXmlResponse.class)
    public JAXBElement<ArrayOfSubject> createGetTitlesXmlResponseGetTitlesXmlResult(ArrayOfSubject value) {
        return new JAXBElement<ArrayOfSubject>(_GetTitlesXmlResponseGetTitlesXmlResult_QNAME, ArrayOfSubject.class, GetTitlesXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislationIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationForSessionResult", scope = GetLegislationForSessionResponse.class)
    public JAXBElement<ArrayOfLegislationIndex> createGetLegislationForSessionResponseGetLegislationForSessionResult(ArrayOfLegislationIndex value) {
        return new JAXBElement<ArrayOfLegislationIndex>(_GetLegislationForSessionResponseGetLegislationForSessionResult_QNAME, ArrayOfLegislationIndex.class, GetLegislationForSessionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "StatusDate", scope = GetLegislationSearchResultsPagedQuerystringXml.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringXmlStatusDate(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedQuerystringXmlStatusDate_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Keywords", scope = GetLegislationSearchResultsPagedQuerystringXml.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringXmlKeywords(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedQuerystringXmlKeywords_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "CommitteeId", scope = GetLegislationSearchResultsPagedQuerystringXml.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringXmlCommitteeId(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedQuerystringXmlCommitteeId_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "MemberId", scope = GetLegislationSearchResultsPagedQuerystringXml.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringXmlMemberId(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedQuerystringXmlMemberId_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "PageSize", scope = GetLegislationSearchResultsPagedQuerystringXml.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringXmlPageSize(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedXmlPageSize_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "StartIndex", scope = GetLegislationSearchResultsPagedQuerystringXml.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringXmlStartIndex(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedXmlStartIndex_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Number", scope = GetLegislationSearchResultsPagedQuerystringXml.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringXmlNumber(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlNumber_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "DocumentType", scope = GetLegislationSearchResultsPagedQuerystringXml.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringXmlDocumentType(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlDocumentType_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "StatusId", scope = GetLegislationSearchResultsPagedQuerystringXml.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringXmlStatusId(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedQuerystringXmlStatusId_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "TitleId", scope = GetLegislationSearchResultsPagedQuerystringXml.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringXmlTitleId(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedQuerystringXmlTitleId_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "CurrentStatusOnly", scope = GetLegislationSearchResultsPagedQuerystringXml.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringXmlCurrentStatusOnly(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedQuerystringXmlCurrentStatusOnly_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetLegislationSearchResultsPagedQuerystringXml.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringXmlSessionId(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlSessionId_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "StatusDate", scope = GetLegislationSearchResultsPagedQuerystringJson.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringJsonStatusDate(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedQuerystringXmlStatusDate_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Keywords", scope = GetLegislationSearchResultsPagedQuerystringJson.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringJsonKeywords(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedQuerystringXmlKeywords_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "CommitteeId", scope = GetLegislationSearchResultsPagedQuerystringJson.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringJsonCommitteeId(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedQuerystringXmlCommitteeId_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Status", scope = GetLegislationSearchResultsPagedQuerystringJson.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringJsonStatus(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedQuerystringJsonStatus_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "MemberId", scope = GetLegislationSearchResultsPagedQuerystringJson.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringJsonMemberId(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedQuerystringXmlMemberId_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "PageSize", scope = GetLegislationSearchResultsPagedQuerystringJson.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringJsonPageSize(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedXmlPageSize_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "StartIndex", scope = GetLegislationSearchResultsPagedQuerystringJson.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringJsonStartIndex(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedXmlStartIndex_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Number", scope = GetLegislationSearchResultsPagedQuerystringJson.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringJsonNumber(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlNumber_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "DocumentType", scope = GetLegislationSearchResultsPagedQuerystringJson.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringJsonDocumentType(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlDocumentType_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "TitleId", scope = GetLegislationSearchResultsPagedQuerystringJson.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringJsonTitleId(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedQuerystringXmlTitleId_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "CurrentStatusOnly", scope = GetLegislationSearchResultsPagedQuerystringJson.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringJsonCurrentStatusOnly(String value) {
        return new JAXBElement<String>(_GetLegislationSearchResultsPagedQuerystringXmlCurrentStatusOnly_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetLegislationSearchResultsPagedQuerystringJson.class)
    public JAXBElement<String> createGetLegislationSearchResultsPagedQuerystringJsonSessionId(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlSessionId_QNAME, String.class, GetLegislationSearchResultsPagedQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislationIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationForSessionXmlResult", scope = GetLegislationForSessionXmlResponse.class)
    public JAXBElement<ArrayOfLegislationIndex> createGetLegislationForSessionXmlResponseGetLegislationForSessionXmlResult(ArrayOfLegislationIndex value) {
        return new JAXBElement<ArrayOfLegislationIndex>(_GetLegislationForSessionXmlResponseGetLegislationForSessionXmlResult_QNAME, ArrayOfLegislationIndex.class, GetLegislationForSessionXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationDetailXmlResult", scope = GetLegislationDetailXmlResponse.class)
    public JAXBElement<LegislationDetail> createGetLegislationDetailXmlResponseGetLegislationDetailXmlResult(LegislationDetail value) {
        return new JAXBElement<LegislationDetail>(_GetLegislationDetailXmlResponseGetLegislationDetailXmlResult_QNAME, LegislationDetail.class, GetLegislationDetailXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationDetailResult", scope = GetLegislationDetailResponse.class)
    public JAXBElement<LegislationDetail> createGetLegislationDetailResponseGetLegislationDetailResult(LegislationDetail value) {
        return new JAXBElement<LegislationDetail>(_GetLegislationDetailResponseGetLegislationDetailResult_QNAME, LegislationDetail.class, GetLegislationDetailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislationSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Page", scope = LegislationSearchResultsPaged.class)
    public JAXBElement<ArrayOfLegislationSearchResult> createLegislationSearchResultsPagedPage(ArrayOfLegislationSearchResult value) {
        return new JAXBElement<ArrayOfLegislationSearchResult>(_LegislationSearchResultsPagedPage_QNAME, ArrayOfLegislationSearchResult.class, LegislationSearchResultsPaged.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "MemberDescription", scope = Sponsorship.class)
    public JAXBElement<String> createSponsorshipMemberDescription(String value) {
        return new JAXBElement<String>(_SponsorshipMemberDescription_QNAME, String.class, Sponsorship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "RangeSize", scope = GetLegislationRangesJson.class)
    public JAXBElement<String> createGetLegislationRangesJsonRangeSize(String value) {
        return new JAXBElement<String>(_GetLegislationRangesXmlRangeSize_QNAME, String.class, GetLegislationRangesJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "DocumentType", scope = GetLegislationRangesJson.class)
    public JAXBElement<String> createGetLegislationRangesJsonDocumentType(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlDocumentType_QNAME, String.class, GetLegislationRangesJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetLegislationRangesJson.class)
    public JAXBElement<String> createGetLegislationRangesJsonSessionId(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlSessionId_QNAME, String.class, GetLegislationRangesJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislationIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationForSessionJsonResult", scope = GetLegislationForSessionJsonResponse.class)
    public JAXBElement<ArrayOfLegislationIndex> createGetLegislationForSessionJsonResponseGetLegislationForSessionJsonResult(ArrayOfLegislationIndex value) {
        return new JAXBElement<ArrayOfLegislationIndex>(_GetLegislationForSessionJsonResponseGetLegislationForSessionJsonResult_QNAME, ArrayOfLegislationIndex.class, GetLegislationForSessionJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "LegislationId", scope = GetLegislationDetailXml.class)
    public JAXBElement<String> createGetLegislationDetailXmlLegislationId(String value) {
        return new JAXBElement<String>(_GetLegislationDetailXmlLegislationId_QNAME, String.class, GetLegislationDetailXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationSearchResultsPaged }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationSearchResultsPagedJsonResult", scope = GetLegislationSearchResultsPagedJsonResponse.class)
    public JAXBElement<LegislationSearchResultsPaged> createGetLegislationSearchResultsPagedJsonResponseGetLegislationSearchResultsPagedJsonResult(LegislationSearchResultsPaged value) {
        return new JAXBElement<LegislationSearchResultsPaged>(_GetLegislationSearchResultsPagedJsonResponseGetLegislationSearchResultsPagedJsonResult_QNAME, LegislationSearchResultsPaged.class, GetLegislationSearchResultsPagedJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationSearchResultsPaged }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationSearchResultsPagedResult", scope = GetLegislationSearchResultsPagedResponse.class)
    public JAXBElement<LegislationSearchResultsPaged> createGetLegislationSearchResultsPagedResponseGetLegislationSearchResultsPagedResult(LegislationSearchResultsPaged value) {
        return new JAXBElement<LegislationSearchResultsPaged>(_GetLegislationSearchResultsPagedResponseGetLegislationSearchResultsPagedResult_QNAME, LegislationSearchResultsPaged.class, GetLegislationSearchResultsPagedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationIndexRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationRangeQuerystringXmlResult", scope = GetLegislationRangeQuerystringXmlResponse.class)
    public JAXBElement<LegislationIndexRange> createGetLegislationRangeQuerystringXmlResponseGetLegislationRangeQuerystringXmlResult(LegislationIndexRange value) {
        return new JAXBElement<LegislationIndexRange>(_GetLegislationRangeQuerystringXmlResponseGetLegislationRangeQuerystringXmlResult_QNAME, LegislationIndexRange.class, GetLegislationRangeQuerystringXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Description", scope = StatusBase.class)
    public JAXBElement<String> createStatusBaseDescription(String value) {
        return new JAXBElement<String>(_LegislationIndexDescription_QNAME, String.class, StatusBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Code", scope = StatusBase.class)
    public JAXBElement<String> createStatusBaseCode(String value) {
        return new JAXBElement<String>(_CommitteeBaseCode_QNAME, String.class, StatusBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationIndexRangeSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Range", scope = GetLegislationRange.class)
    public JAXBElement<LegislationIndexRangeSet> createGetLegislationRangeRange(LegislationIndexRangeSet value) {
        return new JAXBElement<LegislationIndexRangeSet>(_GetLegislationRangeJsonRange_QNAME, LegislationIndexRangeSet.class, GetLegislationRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "AmSub", scope = StatusListing.class)
    public JAXBElement<String> createStatusListingAmSub(String value) {
        return new JAXBElement<String>(_StatusListingAmSub_QNAME, String.class, StatusListing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Start", scope = GetLegislationRangeQuerystringJson.class)
    public JAXBElement<String> createGetLegislationRangeQuerystringJsonStart(String value) {
        return new JAXBElement<String>(_GetLegislationRangeQuerystringXmlStart_QNAME, String.class, GetLegislationRangeQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "End", scope = GetLegislationRangeQuerystringJson.class)
    public JAXBElement<String> createGetLegislationRangeQuerystringJsonEnd(String value) {
        return new JAXBElement<String>(_GetLegislationRangeQuerystringXmlEnd_QNAME, String.class, GetLegislationRangeQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "DocumentType", scope = GetLegislationRangeQuerystringJson.class)
    public JAXBElement<String> createGetLegislationRangeQuerystringJsonDocumentType(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlDocumentType_QNAME, String.class, GetLegislationRangeQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetLegislationRangeQuerystringJson.class)
    public JAXBElement<String> createGetLegislationRangeQuerystringJsonSessionId(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlSessionId_QNAME, String.class, GetLegislationRangeQuerystringJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Footnotes", scope = LegislationDetail.class)
    public JAXBElement<String> createLegislationDetailFootnotes(String value) {
        return new JAXBElement<String>(_LegislationDetailFootnotes_QNAME, String.class, LegislationDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Versions", scope = LegislationDetail.class)
    public JAXBElement<ArrayOfDocumentDescription> createLegislationDetailVersions(ArrayOfDocumentDescription value) {
        return new JAXBElement<ArrayOfDocumentDescription>(_LegislationDetailVersions_QNAME, ArrayOfDocumentDescription.class, LegislationDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "StatusHistory", scope = LegislationDetail.class)
    public JAXBElement<ArrayOfStatusListing> createLegislationDetailStatusHistory(ArrayOfStatusListing value) {
        return new JAXBElement<ArrayOfStatusListing>(_LegislationDetailStatusHistory_QNAME, ArrayOfStatusListing.class, LegislationDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sponsorship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Sponsor", scope = LegislationDetail.class)
    public JAXBElement<Sponsorship> createLegislationDetailSponsor(Sponsorship value) {
        return new JAXBElement<Sponsorship>(_LegislationDetailSponsor_QNAME, Sponsorship.class, LegislationDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Summary", scope = LegislationDetail.class)
    public JAXBElement<String> createLegislationDetailSummary(String value) {
        return new JAXBElement<String>(_LegislationDetailSummary_QNAME, String.class, LegislationDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVoteListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Votes", scope = LegislationDetail.class)
    public JAXBElement<ArrayOfVoteListing> createLegislationDetailVotes(ArrayOfVoteListing value) {
        return new JAXBElement<ArrayOfVoteListing>(_LegislationDetailVotes_QNAME, ArrayOfVoteListing.class, LegislationDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Session }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Session", scope = LegislationIndexRangeSet.class)
    public JAXBElement<Session> createLegislationIndexRangeSetSession(Session value) {
        return new JAXBElement<Session>(_Session_QNAME, Session.class, LegislationIndexRangeSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Number", scope = GetLegislationDetailByDescriptionJson.class)
    public JAXBElement<String> createGetLegislationDetailByDescriptionJsonNumber(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlNumber_QNAME, String.class, GetLegislationDetailByDescriptionJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "DocumentType", scope = GetLegislationDetailByDescriptionJson.class)
    public JAXBElement<String> createGetLegislationDetailByDescriptionJsonDocumentType(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlDocumentType_QNAME, String.class, GetLegislationDetailByDescriptionJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetLegislationDetailByDescriptionJson.class)
    public JAXBElement<String> createGetLegislationDetailByDescriptionJsonSessionId(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlSessionId_QNAME, String.class, GetLegislationDetailByDescriptionJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Description", scope = Session.class)
    public JAXBElement<String> createSessionDescription(String value) {
        return new JAXBElement<String>(_LegislationIndexDescription_QNAME, String.class, Session.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationIndexRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationRangeJsonResult", scope = GetLegislationRangeJsonResponse.class)
    public JAXBElement<LegislationIndexRange> createGetLegislationRangeJsonResponseGetLegislationRangeJsonResult(LegislationIndexRange value) {
        return new JAXBElement<LegislationIndexRange>(_GetLegislationRangeJsonResponseGetLegislationRangeJsonResult_QNAME, LegislationIndexRange.class, GetLegislationRangeJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "DateStart", scope = StatusConstraint.class)
    public JAXBElement<XMLGregorianCalendar> createStatusConstraintDateStart(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StatusConstraintDateStart_QNAME, XMLGregorianCalendar.class, StatusConstraint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "DateEnd", scope = StatusConstraint.class)
    public JAXBElement<XMLGregorianCalendar> createStatusConstraintDateEnd(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StatusConstraintDateEnd_QNAME, XMLGregorianCalendar.class, StatusConstraint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "DocumentTypes", scope = LegislationSearchConstraints.class)
    public JAXBElement<ArrayOfDocumentType> createLegislationSearchConstraintsDocumentTypes(ArrayOfDocumentType value) {
        return new JAXBElement<ArrayOfDocumentType>(_LegislationSearchConstraintsDocumentTypes_QNAME, ArrayOfDocumentType.class, LegislationSearchConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusConstraint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "StatusConstraints", scope = LegislationSearchConstraints.class)
    public JAXBElement<ArrayOfStatusConstraint> createLegislationSearchConstraintsStatusConstraints(ArrayOfStatusConstraint value) {
        return new JAXBElement<ArrayOfStatusConstraint>(_LegislationSearchConstraintsStatusConstraints_QNAME, ArrayOfStatusConstraint.class, LegislationSearchConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Sponsors", scope = LegislationSearchConstraints.class)
    public JAXBElement<ArrayOfint> createLegislationSearchConstraintsSponsors(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_LegislationSearchConstraintsSponsors_QNAME, ArrayOfint.class, LegislationSearchConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Keywords", scope = LegislationSearchConstraints.class)
    public JAXBElement<String> createLegislationSearchConstraintsKeywords(String value) {
        return new JAXBElement<String>(_LegislationSearchConstraintsKeywords_QNAME, String.class, LegislationSearchConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "LegislationTypes", scope = LegislationSearchConstraints.class)
    public JAXBElement<ArrayOfLegislationType> createLegislationSearchConstraintsLegislationTypes(ArrayOfLegislationType value) {
        return new JAXBElement<ArrayOfLegislationType>(_LegislationSearchConstraintsLegislationTypes_QNAME, ArrayOfLegislationType.class, LegislationSearchConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Subjects", scope = LegislationSearchConstraints.class)
    public JAXBElement<ArrayOfint> createLegislationSearchConstraintsSubjects(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_LegislationSearchConstraintsSubjects_QNAME, ArrayOfint.class, LegislationSearchConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "CommitteeAssigned", scope = LegislationSearchConstraints.class)
    public JAXBElement<ArrayOfint> createLegislationSearchConstraintsCommitteeAssigned(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_LegislationSearchConstraintsCommitteeAssigned_QNAME, ArrayOfint.class, LegislationSearchConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Session }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Session", scope = LegislationSearchConstraints.class)
    public JAXBElement<Session> createLegislationSearchConstraintsSession(Session value) {
        return new JAXBElement<Session>(_Session_QNAME, Session.class, LegislationSearchConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "SessionId", scope = GetLegislationForSessionXml.class)
    public JAXBElement<String> createGetLegislationForSessionXmlSessionId(String value) {
        return new JAXBElement<String>(_GetLegislationDetailByDescriptionXmlSessionId_QNAME, String.class, GetLegislationForSessionXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Description", scope = DocumentBase.class)
    public JAXBElement<String> createDocumentBaseDescription(String value) {
        return new JAXBElement<String>(_LegislationIndexDescription_QNAME, String.class, DocumentBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Url", scope = DocumentBase.class)
    public JAXBElement<String> createDocumentBaseUrl(String value) {
        return new JAXBElement<String>(_DocumentBaseUrl_QNAME, String.class, DocumentBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "LegislationId", scope = GetLegislationDetailJson.class)
    public JAXBElement<String> createGetLegislationDetailJsonLegislationId(String value) {
        return new JAXBElement<String>(_GetLegislationDetailXmlLegislationId_QNAME, String.class, GetLegislationDetailJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationDetailJsonResult", scope = GetLegislationDetailJsonResponse.class)
    public JAXBElement<LegislationDetail> createGetLegislationDetailJsonResponseGetLegislationDetailJsonResult(LegislationDetail value) {
        return new JAXBElement<LegislationDetail>(_GetLegislationDetailJsonResponseGetLegislationDetailJsonResult_QNAME, LegislationDetail.class, GetLegislationDetailJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationIndexRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "GetLegislationRangeQuerystringJsonResult", scope = GetLegislationRangeQuerystringJsonResponse.class)
    public JAXBElement<LegislationIndexRange> createGetLegislationRangeQuerystringJsonResponseGetLegislationRangeQuerystringJsonResult(LegislationIndexRange value) {
        return new JAXBElement<LegislationIndexRange>(_GetLegislationRangeQuerystringJsonResponseGetLegislationRangeQuerystringJsonResult_QNAME, LegislationIndexRange.class, GetLegislationRangeQuerystringJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "LatestVersion", scope = Legislation.class)
    public JAXBElement<DocumentDescription> createLegislationLatestVersion(DocumentDescription value) {
        return new JAXBElement<DocumentDescription>(_LegislationLatestVersion_QNAME, DocumentDescription.class, Legislation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSponsorship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Authors", scope = Legislation.class)
    public JAXBElement<ArrayOfSponsorship> createLegislationAuthors(ArrayOfSponsorship value) {
        return new JAXBElement<ArrayOfSponsorship>(_LegislationSearchResultAuthors_QNAME, ArrayOfSponsorship.class, Legislation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitteeListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Committees", scope = Legislation.class)
    public JAXBElement<ArrayOfCommitteeListing> createLegislationCommittees(ArrayOfCommitteeListing value) {
        return new JAXBElement<ArrayOfCommitteeListing>(_LegislationCommittees_QNAME, ArrayOfCommitteeListing.class, Legislation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Status", scope = Legislation.class)
    public JAXBElement<StatusListing> createLegislationStatus(StatusListing value) {
        return new JAXBElement<StatusListing>(_Status_QNAME, StatusListing.class, Legislation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Suffix", scope = Legislation.class)
    public JAXBElement<String> createLegislationSuffix(String value) {
        return new JAXBElement<String>(_LegislationSearchResultSuffix_QNAME, String.class, Legislation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Caption", scope = Legislation.class)
    public JAXBElement<String> createLegislationCaption(String value) {
        return new JAXBElement<String>(_LegislationSearchResultCaption_QNAME, String.class, Legislation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Session }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "Session", scope = Legislation.class)
    public JAXBElement<Session> createLegislationSession(Session value) {
        return new JAXBElement<Session>(_Session_QNAME, Session.class, Legislation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/data/", name = "ActVetoNumber", scope = Legislation.class)
    public JAXBElement<String> createLegislationActVetoNumber(String value) {
        return new JAXBElement<String>(_LegislationSearchResultActVetoNumber_QNAME, String.class, Legislation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislationIndexRangeSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.legis.ga.gov/2009/01/01/services/", name = "Range", scope = GetLegislationRangeXml.class)
    public JAXBElement<LegislationIndexRangeSet> createGetLegislationRangeXmlRange(LegislationIndexRangeSet value) {
        return new JAXBElement<LegislationIndexRangeSet>(_GetLegislationRangeJsonRange_QNAME, LegislationIndexRangeSet.class, GetLegislationRangeXml.class, value);
    }

}
