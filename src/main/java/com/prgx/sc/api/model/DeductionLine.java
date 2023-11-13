package com.prgx.sc.api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

public class DeductionLine {

	    	    
	    
	    @JsonProperty("supplier")
	    @Schema(description = "Supplier details", example = "")
		private Supplier supplier;
	    
	    @JsonProperty("paymentRefNo")
	    @Schema(description = "Payment reference number", example = "")
		private Long paymentRefNo;
	    
	    @JsonProperty("invoice Number")
		private Long invoiceNumber;
	    @JsonProperty("totalInvoiceAmount")
		private Long totalInvoiceAmount;
	    @JsonProperty("deductionAmount")
		private Long deductionAmount;
	    @JsonProperty("discountAmountt")
		private Double discountAmount;
	    @JsonProperty("paidAmount")
		private Double paidAmount;
	    @JsonProperty("currency")
		private String currency;
	    @JsonProperty("paymentRefDate")
		private String paymentRefDate;
	    
	    @JsonProperty("payeeNumber")
		private String payeeNumber;
	    
	    @JsonProperty("netInvoiceAmount")
		private Double netInvoiceAmount;
	    
	    @JsonProperty("poNumber")
		private Long poNumber;
	    
	    @JsonProperty("division")
		private String division;
	    
	    @JsonProperty("invoiceDate")
		private String invoiceDate;
	    
	    @JsonProperty("invoiceLocation")
		private String invoiceLocation;
	    
	    @JsonProperty("upc")
		private Long upc;
	    
	    @JsonProperty("itemDescription")
		private String itemDescription;
	    
	    @JsonProperty("adjQty")
		private String adjQty;
	    
	    @JsonProperty("unitPrice")
		private Double unitPrice;
	    
	    @JsonProperty("adjAmt")
		private Long adjAmt;
	    
	    @JsonProperty("code")
		private String code;
	    
	    @JsonProperty("adjustmentReason")
		private String adjustmentReason;
	    
	    @JsonProperty("poCreationDate")
		private String poCreationDate;
	    
	    @JsonProperty("originalInvoiceNumber")
		private String originalInvoiceNumber;
	    
	    @JsonProperty("sourcePoNumber")
		private String sourcePoNumber;
	    
	    @JsonProperty("storeName")
		private String storeName;
	    
	    @JsonProperty("legacyStoreName")
		private String legacyStoreName;
	    
	    @JsonProperty ("invoiceType")
		private String invoiceType;
		    
		@JsonProperty ("invoiceRecievedDate")
		private String invoiceRecievedDate;

		
	}


