package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DepositAccountReportsWithIdAndRoot
 */
public class DepositAccountReportsWithIdAndRoot   {
  private String depositAccountreortingTaskReference = null;

  private String productInstanceReference = null;

  private String depositAccountNumber = null;

  private String customerReference = null;

  private String customerAgreementReference = null;

  private String bankBranchLocationReference = null;

  private String dateType = null;

  private String date = null;

  private String involvedPartyReference = null;

  private String involvedPartyObligationEntitlement = null;

  private String partyReference = null;

  private String depositAccountType = null;

  private String depositAccountCurrency = null;

  private String depositAccountAmount = null;

  private String depositAccountTerm = null;

  private String depositAccountInterestTerms = null;

  private String taxReference = null;

  private String accountStatus = null;

  private String customerCommentary = null;

  private Object depositAccountReportingTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the processing of term deposit fees 
   * @return depositAccountreortingTaskReference
  **/

  public String getDepositAccountreortingTaskReference() {
    return depositAccountreortingTaskReference;
  }

  public void setDepositAccountreortingTaskReference(String depositAccountreortingTaskReference) {
    this.depositAccountreortingTaskReference = depositAccountreortingTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: reference/identifier of the term deposit account 
   * @return depositAccountNumber
  **/

  public String getDepositAccountNumber() {
    return depositAccountNumber;
  }

  public void setDepositAccountNumber(String depositAccountNumber) {
    this.depositAccountNumber = depositAccountNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: the customer associated with the deposit account 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the customer agreement governing the product 
   * @return customerAgreementReference
  **/

  public String getCustomerAgreementReference() {
    return customerAgreementReference;
  }

  public void setCustomerAgreementReference(String customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. account open, closing term, rollover 
   * @return dateType
  **/

  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Date 
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: e.g. guarantor/cosigner 
   * @return involvedPartyReference
  **/

  public String getInvolvedPartyReference() {
    return involvedPartyReference;
  }

  public void setInvolvedPartyReference(String involvedPartyReference) {
    this.involvedPartyReference = involvedPartyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Involved Party Obligation/Entitlement 
   * @return involvedPartyObligationEntitlement
  **/

  public String getInvolvedPartyObligationEntitlement() {
    return involvedPartyObligationEntitlement;
  }

  public void setInvolvedPartyObligationEntitlement(String involvedPartyObligationEntitlement) {
    this.involvedPartyObligationEntitlement = involvedPartyObligationEntitlement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Party Reference 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Deposit Account Type 
   * @return depositAccountType
  **/

  public String getDepositAccountType() {
    return depositAccountType;
  }

  public void setDepositAccountType(String depositAccountType) {
    this.depositAccountType = depositAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: Deposit Account Currency 
   * @return depositAccountCurrency
  **/

  public String getDepositAccountCurrency() {
    return depositAccountCurrency;
  }

  public void setDepositAccountCurrency(String depositAccountCurrency) {
    this.depositAccountCurrency = depositAccountCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: amount deposited to the account 
   * @return depositAccountAmount
  **/

  public String getDepositAccountAmount() {
    return depositAccountAmount;
  }

  public void setDepositAccountAmount(String depositAccountAmount) {
    this.depositAccountAmount = depositAccountAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: the term of the fixed deposit 
   * @return depositAccountTerm
  **/

  public String getDepositAccountTerm() {
    return depositAccountTerm;
  }

  public void setDepositAccountTerm(String depositAccountTerm) {
    this.depositAccountTerm = depositAccountTerm;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: the basis for interest calculations pain to the account 
   * @return depositAccountInterestTerms
  **/

  public String getDepositAccountInterestTerms() {
    return depositAccountInterestTerms;
  }

  public void setDepositAccountInterestTerms(String depositAccountInterestTerms) {
    this.depositAccountInterestTerms = depositAccountInterestTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Tax 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. pre-opened, active, dormant, pending for closing, blocked 
   * @return accountStatus
  **/

  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: record of customer correspondence/feedback 
   * @return customerCommentary
  **/

  public String getCustomerCommentary() {
    return customerCommentary;
  }

  public void setCustomerCommentary(String customerCommentary) {
    this.customerCommentary = customerCommentary;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: production record of the reporting task, includes report contentCRR 
   * @return depositAccountReportingTaskRecord
  **/

  public Object getDepositAccountReportingTaskRecord() {
    return depositAccountReportingTaskRecord;
  }

  public void setDepositAccountReportingTaskRecord(Object depositAccountReportingTaskRecord) {
    this.depositAccountReportingTaskRecord = depositAccountReportingTaskRecord;
  }


}

