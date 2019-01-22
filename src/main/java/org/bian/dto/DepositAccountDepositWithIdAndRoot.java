package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DepositAccountDepositWithIdAndRoot
 */
public class DepositAccountDepositWithIdAndRoot   {
  private String depositAccountDepositHandlingTaskReference = null;

  private String productInstanceReference = null;

  private String depositAccountNumber = null;

  private String depositTransactionReference = null;

  private String payeeReference = null;

  private String payeeProductInstanceReference = null;

  private String payeeBankReference = null;

  private String amount = null;

  private String currency = null;

  private String valueDate = null;

  private Object depositAccountDepositHandlingTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: task to handle the initial deposit Transaction Reference 
   * @return depositAccountDepositHandlingTaskReference
  **/

  public String getDepositAccountDepositHandlingTaskReference() {
    return depositAccountDepositHandlingTaskReference;
  }

  public void setDepositAccountDepositHandlingTaskReference(String depositAccountDepositHandlingTaskReference) {
    this.depositAccountDepositHandlingTaskReference = depositAccountDepositHandlingTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the deposit transaction 
   * @return depositTransactionReference
  **/

  public String getDepositTransactionReference() {
    return depositTransactionReference;
  }

  public void setDepositTransactionReference(String depositTransactionReference) {
    this.depositTransactionReference = depositTransactionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to source of funds for the deposit 
   * @return payeeReference
  **/

  public String getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: account from where the deposit is paid 
   * @return payeeProductInstanceReference
  **/

  public String getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(String payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Payee Bank Reference 
   * @return payeeBankReference
  **/

  public String getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(String payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Amount 
   * @return amount
  **/

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: Currency 
   * @return currency
  **/

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Value Date 
   * @return valueDate
  **/

  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: production record of the deposit processing task   
   * @return depositAccountDepositHandlingTaskRecord
  **/

  public Object getDepositAccountDepositHandlingTaskRecord() {
    return depositAccountDepositHandlingTaskRecord;
  }

  public void setDepositAccountDepositHandlingTaskRecord(Object depositAccountDepositHandlingTaskRecord) {
    this.depositAccountDepositHandlingTaskRecord = depositAccountDepositHandlingTaskRecord;
  }


}

