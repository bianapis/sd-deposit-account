/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class DepositAccountApiServiceImpl implements DepositAccountApiService {

	public DepositAccountDepositAccountWithIdAndRoot executePost(DepositAccountDepositAccountBase request){
		return JsonReader.read("executePost-DepositAccountDepositAccountWithIdAndRoot.json",new TypeReference<DepositAccountDepositAccountWithIdAndRoot>(){});
	}
	
	public DepositAccountDepositAccountWithIdAndRoot executePut(String crReferenceId, DepositAccountDepositAccountBase request){
		return JsonReader.read("executePut-DepositAccountDepositAccountWithIdAndRoot.json",new TypeReference<DepositAccountDepositAccountWithIdAndRoot>(){});
	}
	
	public DepositAccountDepositAccountWithIdAndRoot initiate(DepositAccountDepositAccountBase request){
		return JsonReader.read("initiate-DepositAccountDepositAccountWithIdAndRoot.json",new TypeReference<DepositAccountDepositAccountWithIdAndRoot>(){});
	}
	
	public DepositAccountRecordResponse record(String crReferenceId, DepositAccountRecordRequest request){
		return JsonReader.read("record-DepositAccountRecordResponse.json",new TypeReference<DepositAccountRecordResponse>(){});
	}
	
	public DepositAccountEarlyMaturingWithIdAndRoot requestPostEarlyMaturing(String crReferenceId, DepositAccountEarlyMaturingBase request){
		return JsonReader.read("requestPost-DepositAccountEarlyMaturingWithIdAndRoot.json",new TypeReference<DepositAccountEarlyMaturingWithIdAndRoot>(){});
	}
	
	public DepositAccountEarlyMaturingWithIdAndRoot requestPutEarlyMaturing(String crReferenceId, String bqReferenceId, DepositAccountEarlyMaturingBase request){
		return JsonReader.read("requestPut-DepositAccountEarlyMaturingWithIdAndRoot.json",new TypeReference<DepositAccountEarlyMaturingWithIdAndRoot>(){});
	}
	
	public DepositAccountRolloverWithIdAndRoot requestPostRollovers(String crReferenceId, DepositAccountRolloverBase request){
		return JsonReader.read("requestPost-DepositAccountRolloverWithIdAndRoot.json",new TypeReference<DepositAccountRolloverWithIdAndRoot>(){});
	}
	
	public DepositAccountRolloverWithIdAndRoot requestPutRollovers(String crReferenceId, String bqReferenceId, DepositAccountRolloverBase request){
		return JsonReader.read("requestPut-DepositAccountRolloverWithIdAndRoot.json",new TypeReference<DepositAccountRolloverWithIdAndRoot>(){});
	}
	
	public DepositAccountDepositAccountWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-DepositAccountDepositAccountWithIdAndRoot.json",new TypeReference<DepositAccountDepositAccountWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public DepositAccountDepositWithIdAndRoot retrieveDeposits(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DepositAccountDepositWithIdAndRoot.json",new TypeReference<DepositAccountDepositWithIdAndRoot>(){});
	}
	
	public DepositAccountEarlyMaturingWithIdAndRoot retrieveEarlyMaturing(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DepositAccountEarlyMaturingWithIdAndRoot.json",new TypeReference<DepositAccountEarlyMaturingWithIdAndRoot>(){});
	}
	
	public DepositAccountFeesWithIdAndRoot retrieveFees(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DepositAccountFeesWithIdAndRoot.json",new TypeReference<DepositAccountFeesWithIdAndRoot>(){});
	}
	
	public DepositAccountInterestWithIdAndRoot retrieveInterests(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DepositAccountInterestWithIdAndRoot.json",new TypeReference<DepositAccountInterestWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public DepositAccountReportsWithIdAndRoot retrieveReports(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DepositAccountReportsWithIdAndRoot.json",new TypeReference<DepositAccountReportsWithIdAndRoot>(){});
	}
	
	public DepositAccountRolloverWithIdAndRoot retrieveRollovers(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DepositAccountRolloverWithIdAndRoot.json",new TypeReference<DepositAccountRolloverWithIdAndRoot>(){});
	}
	
	public DepositAccountStatementsWithIdAndRoot retrieveStatements(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DepositAccountStatementsWithIdAndRoot.json",new TypeReference<DepositAccountStatementsWithIdAndRoot>(){});
	}
	
	public DepositAccountDepositAccountWithIdAndRoot update(String crReferenceId, DepositAccountDepositAccountBase request){
		return JsonReader.read("update-DepositAccountDepositAccountWithIdAndRoot.json",new TypeReference<DepositAccountDepositAccountWithIdAndRoot>(){});
	}
	
}
