package com.prgx.sc.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Builder
@Data
public class Payment {
	@JsonProperty("paymentRefNumber")
	@Schema(description ="Payment Reference Number" , example = "100956996")
	String paymentRefNumber;
	
	@JsonProperty("settlementNumber")
	@Schema(description ="Settlement number" , example = "3709929")
	String settlementNumber;
	
	@JsonProperty("remittanceMethod")
	@Schema(description ="Remittance method like ERP/ORA_AP/AR Netting"  , example = "EFT")
	String remittanceMethod;
	
	@JsonProperty("invoiceNumber")
	@Schema(description ="Invoice number"  , example = "092-A447148-410")
	String invoiceNumber;
	
	@JsonProperty("invoiceDate")
	@Schema(description ="Invoice Date"  , example = "08/27/2023\r\n")
	Date	invoiceDate;
	
	@JsonProperty("paymentCurrency")
	@Schema(description ="Payment Currency"  , example = "USD")
	String paymentCurrency;
	
	@JsonProperty("invoiceCurrency")
	@Schema(description ="Invoice Currency"  , example = "USD")
	String pinvoiceCurrency;

	@JsonProperty("grossInvoiceAmount")
	@Schema(description ="Gross Invoice Amount"  , example = "100")
	Double grossInvoiceAmount;
	
	@JsonProperty("totalDeductionAmount")
	@Schema(description ="Total Deduction Amount"  , example = "100.12")
	Double totalDeductionAmount;
	
	@JsonProperty("totalDiscountAmount")
	@Schema(description ="Total Discount Amount"  , example = "200.90")
	Double totalDiscountAmount;
	
	@JsonProperty("netInvoiceAmount")
	@Schema(description ="Net Invoice Amount"  , example = "200.90")
	Double netInvoiceAmount;
	
	@JsonProperty("paidAmount")
	@Schema(description ="Paid Amount"  , example = "200.90")
	Double paidAmount;
	
	@JsonProperty("checkAmount")
	@Schema(description ="Check Amount"  , example = "7724.39")
	Double checkAmount;
	
	@JsonProperty("CheckStatus")
	@Schema(description ="Check Status"  , example = "CLEARED")
	Double CheckStatus;
	
	@JsonProperty("paymentRefDate")
	@Schema(description ="paymentRefDate"  , example = "08/29/2023")
	Double paymentRefDate;
	
	@JsonProperty("numberOfClaims")
	@Schema(description ="numberOfClaims"  , example = "1")
	Double numberOfClaims;

	@JsonProperty("PONumber")
	@Schema(description ="PO Number"  , example = "")
	Double PONumber;
	
	@JsonProperty("payeeNumber")
	@Schema(description ="Payee Number"  , example = "")
	Double payeeNumber;
	
	@JsonProperty("division")
	@Schema(description ="Division "  , example = "")
	Double division;
	

	@JsonProperty("stroreNumber")
	@Schema(description ="Strore Number "  , example = "")
	Double stroreNumber;
	
	@JsonProperty("legacyStoreNumber")
	@Schema(description ="Legacy Store Number "  , example = "")
	Double legacyStoreNumber;
	
	@JsonProperty("supplierERPID")
	@Schema(description ="Supplier ERP ID "  , example = "")
	Double supplierERPID;
	
	@JsonProperty("supplierName")
	@Schema(description ="Supplier Name "  , example = "")
	Double supplierName;




}
