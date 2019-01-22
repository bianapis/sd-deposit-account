package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DepositAccountInterestWithIdAndRoot
 */
public class DepositAccountInterestWithIdAndRoot   {
  private String depositAccountInterestApplicationTaskReference = null;

  private String productInstanceReference = null;

  private String applicableInterestRates = null;

  private String rateApplicationSchedule = null;

  private String accruedInterestAmount = null;

  private Object depositAccountInterestApplicationTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the processing of term deposit interest application 
   * @return depositAccountInterestApplicationTaskReference
  **/

  public String getDepositAccountInterestApplicationTaskReference() {
    return depositAccountInterestApplicationTaskReference;
  }

  public void setDepositAccountInterestApplicationTaskReference(String depositAccountInterestApplicationTaskReference) {
    this.depositAccountInterestApplicationTaskReference = depositAccountInterestApplicationTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Applicable Interest Rates 
   * @return applicableInterestRates
  **/

  public String getApplicableInterestRates() {
    return applicableInterestRates;
  }

  public void setApplicableInterestRates(String applicableInterestRates) {
    this.applicableInterestRates = applicableInterestRates;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Rate Application Schedule 
   * @return rateApplicationSchedule
  **/

  public String getRateApplicationSchedule() {
    return rateApplicationSchedule;
  }

  public void setRateApplicationSchedule(String rateApplicationSchedule) {
    this.rateApplicationSchedule = rateApplicationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Accrued Interest Amount 
   * @return accruedInterestAmount
  **/

  public String getAccruedInterestAmount() {
    return accruedInterestAmount;
  }

  public void setAccruedInterestAmount(String accruedInterestAmount) {
    this.accruedInterestAmount = accruedInterestAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: production record of the deposit account interest application task 
   * @return depositAccountInterestApplicationTaskRecord
  **/

  public Object getDepositAccountInterestApplicationTaskRecord() {
    return depositAccountInterestApplicationTaskRecord;
  }

  public void setDepositAccountInterestApplicationTaskRecord(Object depositAccountInterestApplicationTaskRecord) {
    this.depositAccountInterestApplicationTaskRecord = depositAccountInterestApplicationTaskRecord;
  }


}

