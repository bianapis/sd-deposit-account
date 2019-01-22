package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DepositAccountStatementsWithIdAndRoot
 */
public class DepositAccountStatementsWithIdAndRoot   {
  private String depositAccountStatementTaskReference = null;

  private String productInstanceReference = null;

  private String balanceType = null;

  private String balance = null;

  private String statementInstanceReference = null;

  private String statementType = null;

  private String statementTransactionType = null;

  private String statementPeriod = null;

  private String transactionRecordReference = null;

  private String transactionType = null;

  private String transactionPrincipleAmount = null;

  private String transactionCounterparty = null;

  private String transactionObligation = null;

  private String transactionDateTime = null;

  private Object depositAccountStatementTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the processing of term deposit statements 
   * @return depositAccountStatementTaskReference
  **/

  public String getDepositAccountStatementTaskReference() {
    return depositAccountStatementTaskReference;
  }

  public void setDepositAccountStatementTaskReference(String depositAccountStatementTaskReference) {
    this.depositAccountStatementTaskReference = depositAccountStatementTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: term deposit account reference 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. current position, early termination, projected 
   * @return balanceType
  **/

  public String getBalanceType() {
    return balanceType;
  }

  public void setBalanceType(String balanceType) {
    this.balanceType = balanceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: balance amount for selected type 
   * @return balance
  **/

  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Statement Instance Reference 
   * @return statementInstanceReference
  **/

  public String getStatementInstanceReference() {
    return statementInstanceReference;
  }

  public void setStatementInstanceReference(String statementInstanceReference) {
    this.statementInstanceReference = statementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. balance/mini 
   * @return statementType
  **/

  public String getStatementType() {
    return statementType;
  }

  public void setStatementType(String statementType) {
    this.statementType = statementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: content 
   * @return statementTransactionType
  **/

  public String getStatementTransactionType() {
    return statementTransactionType;
  }

  public void setStatementTransactionType(String statementTransactionType) {
    this.statementTransactionType = statementTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: from 
   * @return statementPeriod
  **/

  public String getStatementPeriod() {
    return statementPeriod;
  }

  public void setStatementPeriod(String statementPeriod) {
    this.statementPeriod = statementPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Transaction Record Reference 
   * @return transactionRecordReference
  **/

  public String getTransactionRecordReference() {
    return transactionRecordReference;
  }

  public void setTransactionRecordReference(String transactionRecordReference) {
    this.transactionRecordReference = transactionRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Transaction Type 
   * @return transactionType
  **/

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Transaction Principle Amount 
   * @return transactionPrincipleAmount
  **/

  public String getTransactionPrincipleAmount() {
    return transactionPrincipleAmount;
  }

  public void setTransactionPrincipleAmount(String transactionPrincipleAmount) {
    this.transactionPrincipleAmount = transactionPrincipleAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. payee, merchant 
   * @return transactionCounterparty
  **/

  public String getTransactionCounterparty() {
    return transactionCounterparty;
  }

  public void setTransactionCounterparty(String transactionCounterparty) {
    this.transactionCounterparty = transactionCounterparty;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. purchased service/product 
   * @return transactionObligation
  **/

  public String getTransactionObligation() {
    return transactionObligation;
  }

  public void setTransactionObligation(String transactionObligation) {
    this.transactionObligation = transactionObligation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Transaction Date/Time 
   * @return transactionDateTime
  **/

  public String getTransactionDateTime() {
    return transactionDateTime;
  }

  public void setTransactionDateTime(String transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: production record of the deposit account Statement task 
   * @return depositAccountStatementTaskRecord
  **/

  public Object getDepositAccountStatementTaskRecord() {
    return depositAccountStatementTaskRecord;
  }

  public void setDepositAccountStatementTaskRecord(Object depositAccountStatementTaskRecord) {
    this.depositAccountStatementTaskRecord = depositAccountStatementTaskRecord;
  }


}

