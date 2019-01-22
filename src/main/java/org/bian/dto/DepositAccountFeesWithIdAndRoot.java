package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DepositAccountFeesWithIdAndRoot
 */
public class DepositAccountFeesWithIdAndRoot   {
  private String depositAccountFeeApplicationTaskReference = null;

  private String productInstanceReference = null;

  private String feeConfiguration = null;

  private String feeType = null;

  private String feeCharge = null;

  private String feeProjectionsCommitments = null;

  private String feeAccrualAmount = null;

  private Object depositAccountFeeApplicationTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the processing of term deposit fees 
   * @return depositAccountFeeApplicationTaskReference
  **/

  public String getDepositAccountFeeApplicationTaskReference() {
    return depositAccountFeeApplicationTaskReference;
  }

  public void setDepositAccountFeeApplicationTaskReference(String depositAccountFeeApplicationTaskReference) {
    this.depositAccountFeeApplicationTaskReference = depositAccountFeeApplicationTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: customer level fee structure applied to term deopsits 
   * @return feeConfiguration
  **/

  public String getFeeConfiguration() {
    return feeConfiguration;
  }

  public void setFeeConfiguration(String feeConfiguration) {
    this.feeConfiguration = feeConfiguration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Fee Type 
   * @return feeType
  **/

  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Fee Charge 
   * @return feeCharge
  **/

  public String getFeeCharge() {
    return feeCharge;
  }

  public void setFeeCharge(String feeCharge) {
    this.feeCharge = feeCharge;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Fee Projections/Commitments 
   * @return feeProjectionsCommitments
  **/

  public String getFeeProjectionsCommitments() {
    return feeProjectionsCommitments;
  }

  public void setFeeProjectionsCommitments(String feeProjectionsCommitments) {
    this.feeProjectionsCommitments = feeProjectionsCommitments;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Fee Accrual Amount 
   * @return feeAccrualAmount
  **/

  public String getFeeAccrualAmount() {
    return feeAccrualAmount;
  }

  public void setFeeAccrualAmount(String feeAccrualAmount) {
    this.feeAccrualAmount = feeAccrualAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: production record of the deposit account fee application task 
   * @return depositAccountFeeApplicationTaskRecord
  **/

  public Object getDepositAccountFeeApplicationTaskRecord() {
    return depositAccountFeeApplicationTaskRecord;
  }

  public void setDepositAccountFeeApplicationTaskRecord(Object depositAccountFeeApplicationTaskRecord) {
    this.depositAccountFeeApplicationTaskRecord = depositAccountFeeApplicationTaskRecord;
  }


}

