/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class DepositAccountApiController {

	@Autowired
	DepositAccountApiService service;
	
	@Fulfill.ExecutePost
	public BianResponse<DepositAccountDepositAccountWithIdAndRoot> executePost(@RequestBody BianRequest<DepositAccountDepositAccountBase> bianRequest) {
		return BianResponse.forSuccess(service.executePost(bianRequest.getData()));
	}
	
	@Fulfill.ExecutePut
	public BianResponse<DepositAccountDepositAccountWithIdAndRoot> executePut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DepositAccountDepositAccountBase> bianRequest) {
		return BianResponse.forSuccess(service.executePut(crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<DepositAccountDepositAccountWithIdAndRoot> initiate(@RequestBody BianRequest<DepositAccountDepositAccountBase> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@Fulfill.Record
	public BianResponse<DepositAccountRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DepositAccountRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("early-maturing")
	@Fulfill.RequestPost
	public BianResponse<DepositAccountEarlyMaturingWithIdAndRoot> requestPostEarlyMaturing(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DepositAccountEarlyMaturingBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostEarlyMaturing(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("early-maturing")
	@Fulfill.RequestPut
	public BianResponse<DepositAccountEarlyMaturingWithIdAndRoot> requestPutEarlyMaturing(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DepositAccountEarlyMaturingBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutEarlyMaturing(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("rollovers")
	@Fulfill.RequestPost
	public BianResponse<DepositAccountRolloverWithIdAndRoot> requestPostRollovers(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DepositAccountRolloverBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostRollovers(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("rollovers")
	@Fulfill.RequestPut
	public BianResponse<DepositAccountRolloverWithIdAndRoot> requestPutRollovers(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DepositAccountRolloverBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutRollovers(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<DepositAccountDepositAccountWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("deposits")
	@Fulfill.Retrieve
	public BianResponse<DepositAccountDepositWithIdAndRoot> retrieveDeposits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDeposits(crReferenceId, bqReferenceId));
	}
	
	@BQ("early-maturing")
	@Fulfill.Retrieve
	public BianResponse<DepositAccountEarlyMaturingWithIdAndRoot> retrieveEarlyMaturing(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveEarlyMaturing(crReferenceId, bqReferenceId));
	}
	
	@BQ("fees")
	@Fulfill.Retrieve
	public BianResponse<DepositAccountFeesWithIdAndRoot> retrieveFees(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFees(crReferenceId, bqReferenceId));
	}
	
	@BQ("interests")
	@Fulfill.Retrieve
	public BianResponse<DepositAccountInterestWithIdAndRoot> retrieveInterests(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInterests(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("reports")
	@Fulfill.Retrieve
	public BianResponse<DepositAccountReportsWithIdAndRoot> retrieveReports(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReports(crReferenceId, bqReferenceId));
	}
	
	@BQ("rollovers")
	@Fulfill.Retrieve
	public BianResponse<DepositAccountRolloverWithIdAndRoot> retrieveRollovers(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRollovers(crReferenceId, bqReferenceId));
	}
	
	@BQ("statements")
	@Fulfill.Retrieve
	public BianResponse<DepositAccountStatementsWithIdAndRoot> retrieveStatements(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStatements(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<DepositAccountDepositAccountWithIdAndRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DepositAccountDepositAccountBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
