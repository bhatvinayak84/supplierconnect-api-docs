package com.prgx.sc.api.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Promo {

	    	    
	  @JsonProperty("invoiceNumber")
	  @Schema(description = "Invoice Number ",example = "AK-6055237")
	  private String invoiceNumber;
	    
	  @JsonProperty("dealNumber")
	  @Schema(description = "Deal Number ",example = "470718")
	  private String dealNumber;
	  
	  @JsonProperty("contractNumber")
	  @Schema(description = "Contract Number ",example = "X70718")
	  private String contractNumber;
	  
	  
	  @JsonProperty("offerNumber")
	  @Schema(description = "Offer Number ",example = "X70718")
	  private String offerNumber;
	  
	  @JsonProperty("promoID")
	  @Schema(description = "Promo ID ",example = "57177802")
	  private Long promoID;
	  
	  @JsonProperty("promoDivision")
	  @Schema(description = "Promo Divisiox	n ",example = "0016-Columbus Operating Division")
	  private String promoDivision;
	  
	  @JsonProperty("promoInvoiceAmount")
	  @Schema(description = "Promo Invoice Amount ",example = "-463.45")
	  private Long promoInvoiceAmount;
	  
	  
	  @JsonProperty("invoiceDate")
	  @Schema(description = "Invoice Date ",example = "08/29/2023")
	  private Date invoiceDate;
	  
	  @JsonProperty("supplier")
	  @Schema(description = "Supplier Details",example = "")
	  private Supplier supplier;
	  
	  @JsonProperty("noOfPayments")
	  @Schema(description = "Number of Payments ",example = "10")
	  private Long noOfPayments;
	  
	  @JsonProperty("noOfCliams")
	  @Schema(description = "Number of Claims ",example = "10")
	  private Long noOfCliams;
	  
	  @JsonProperty("paidAmount")
	  @Schema(description = "Total Paid Amount ",example = "-47.4")
	  private Long paifAmount;
	  
	  @JsonProperty("currency")
	  @Schema(description = "Currency",example = "USD")
	  private String currency;
	  
	  @JsonProperty("poNumber")
	  @Schema(description = "PO Number",example = "")
	  private String poNumber;
	  
	  @JsonProperty("storeNumber")
	  @Schema(description = "Store Number",example = "")
	  private String storeNumber;
	  
	  @JsonProperty("netInvoiceAmount")
	  @Schema(description = "Net Invoice Amount",example = "")
	  private String netInvoiceAmount;
	  
	  @JsonProperty("freightAmount")
	  @Schema(description = "Freight Amount",example = "")
	  private String freightAmount;
	  
	  @JsonProperty("taxAmount")
	  @Schema(description = "Tax Amount",example = "")
	  private String taxAmount;
	  
	  @JsonProperty("discount")
	  @Schema(description = "discount",example = "")
	  private String discount;
	  
	  @JsonProperty("deductionAmount")
	  @Schema(description = "deductionAmount",example = "")
	  private String deductionAmount;
	  
	  
	}


