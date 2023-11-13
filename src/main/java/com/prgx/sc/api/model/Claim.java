package com.prgx.sc.api.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Claim {

	    	    
	    @JsonProperty("claimID")
	    @Schema(description = "Claim ID",example = "15375")
		private Long claimID;
	    
	    @JsonProperty("claimType")
	    @Schema(description = "Claim Type",example = "LC-List Cost")
		private String claimType;

	    @JsonProperty("claimCreatedBy")
	    @Schema(description = "Claim created by",example = "Donatello")
		private Long claimCreatedBy;

	    @JsonProperty("claimAmount")
	    @Schema(description = "Claim Amount",example = "1000")
		private Long claimAmount;
	    
	    @JsonProperty("currency")
	    @Schema(description = "Currency",example = "USD")
		private String currency;
	   
	    @JsonProperty("claimResolution")
	    @Schema(description = "Claim Resolution ",example = "denied")
		private Date claimResolution;
	    
	    @JsonProperty("claimStatus")
	    @Schema(description = "Claim Status ",example = "Closed")
		private Date claimStatus;
	    
	    @JsonProperty("paymentRefNo")
	    @Schema(description = "Payment Reference Number ",example = "PR041433")
		private Date paymentRefNo;
	    
	    @JsonProperty("paidAmt")
	    @Schema(description = "Paid Amount ",example = "2968.5")
		private Date paidAmt;
	 
	    @JsonProperty("invoiceNumber")
	    @Schema(description = "Invoice Number ",example = "AK-6055237")
		private String invoiceNumber;
	    
	    @JsonProperty("invoiceDate")
	    @Schema(description = "Invoice Date ",example = "10/12/2023")
		private Date invoiceDate;
	    
	    @JsonProperty("division")
	    @Schema(description = "Division ",example = "041-Atlanta Log")
		private Date division;
	    
	    @JsonProperty("totalAmount")
	    @Schema(description = "Total invoice amount",example = "2968.5")
		private Long totalAmount;
	    
	    
	    @JsonProperty("supplier")
	    @Schema(description = "Supplier",example = "")
		private Supplier supplier;
	}


