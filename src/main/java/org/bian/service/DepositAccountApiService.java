/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface DepositAccountApiService {

	DepositAccountDepositAccountWithIdAndRoot executePost(DepositAccountDepositAccountBase request);
	
	DepositAccountDepositAccountWithIdAndRoot executePut(String crReferenceId, DepositAccountDepositAccountBase request);
	
	DepositAccountDepositAccountWithIdAndRoot initiate(DepositAccountDepositAccountBase request);
	
	DepositAccountRecordResponse record(String crReferenceId, DepositAccountRecordRequest request);
	
	DepositAccountEarlyMaturingWithIdAndRoot requestPostEarlyMaturing(String crReferenceId, DepositAccountEarlyMaturingBase request);
	
	DepositAccountEarlyMaturingWithIdAndRoot requestPutEarlyMaturing(String crReferenceId, String bqReferenceId, DepositAccountEarlyMaturingBase request);
	
	DepositAccountRolloverWithIdAndRoot requestPostRollovers(String crReferenceId, DepositAccountRolloverBase request);
	
	DepositAccountRolloverWithIdAndRoot requestPutRollovers(String crReferenceId, String bqReferenceId, DepositAccountRolloverBase request);
	
	DepositAccountDepositAccountWithIdAndRoot retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	DepositAccountDepositWithIdAndRoot retrieveDeposits(String crReferenceId, String bqReferenceId);
	
	DepositAccountEarlyMaturingWithIdAndRoot retrieveEarlyMaturing(String crReferenceId, String bqReferenceId);
	
	DepositAccountFeesWithIdAndRoot retrieveFees(String crReferenceId, String bqReferenceId);
	
	DepositAccountInterestWithIdAndRoot retrieveInterests(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	DepositAccountReportsWithIdAndRoot retrieveReports(String crReferenceId, String bqReferenceId);
	
	DepositAccountRolloverWithIdAndRoot retrieveRollovers(String crReferenceId, String bqReferenceId);
	
	DepositAccountStatementsWithIdAndRoot retrieveStatements(String crReferenceId, String bqReferenceId);
	
	DepositAccountDepositAccountWithIdAndRoot update(String crReferenceId, DepositAccountDepositAccountBase request);
	
}
