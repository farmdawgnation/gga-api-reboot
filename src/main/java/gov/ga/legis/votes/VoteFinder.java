
package gov.ga.legis.votes;

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
@WebService(name = "VoteFinder", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VoteFinder {


    /**
     * 
     * @param sessionId
     * @param branch
     * @return
     *     returns gov.ga.legis.votes.ArrayOfVoteListing
     */
    @WebMethod(operationName = "GetVotes", action = "http://www.legis.ga.gov/2009/01/01/services/VoteFinder/GetVotes")
    @WebResult(name = "GetVotesResult", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/")
    @RequestWrapper(localName = "GetVotes", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/", className = "gov.ga.legis.votes.GetVotes")
    @ResponseWrapper(localName = "GetVotesResponse", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/", className = "gov.ga.legis.votes.GetVotesResponse")
    public ArrayOfVoteListing getVotes(
        @WebParam(name = "Branch", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/")
        Branch branch,
        @WebParam(name = "SessionId", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/")
        Integer sessionId);

    /**
     * 
     * @param legislationId
     * @return
     *     returns gov.ga.legis.votes.ArrayOfVoteListing
     */
    @WebMethod(operationName = "GetVotesForLegislation", action = "http://www.legis.ga.gov/2009/01/01/services/VoteFinder/GetVotesForLegislation")
    @WebResult(name = "GetVotesForLegislationResult", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/")
    @RequestWrapper(localName = "GetVotesForLegislation", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/", className = "gov.ga.legis.votes.GetVotesForLegislation")
    @ResponseWrapper(localName = "GetVotesForLegislationResponse", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/", className = "gov.ga.legis.votes.GetVotesForLegislationResponse")
    public ArrayOfVoteListing getVotesForLegislation(
        @WebParam(name = "LegislationId", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/")
        Integer legislationId);

    /**
     * 
     * @param voteId
     * @return
     *     returns gov.ga.legis.votes.Vote
     * @throws VoteFinderGetVoteRollCallNotPublishedFaultFaultFaultMessage
     */
    @WebMethod(operationName = "GetVote", action = "http://www.legis.ga.gov/2009/01/01/services/VoteFinder/GetVote")
    @WebResult(name = "GetVoteResult", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/")
    @RequestWrapper(localName = "GetVote", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/", className = "gov.ga.legis.votes.GetVote")
    @ResponseWrapper(localName = "GetVoteResponse", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/", className = "gov.ga.legis.votes.GetVoteResponse")
    public Vote getVote(
        @WebParam(name = "VoteId", targetNamespace = "http://www.legis.ga.gov/2009/01/01/services/")
        Integer voteId)
        throws VoteFinderGetVoteRollCallNotPublishedFaultFaultFaultMessage
    ;

}