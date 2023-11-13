package com.prgx.sc.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Builder
@Data
public class Invoice {

		@JsonProperty("invoiceNumber")
	    @Schema(name = "Invoice Number", example = "092-A447148-410")
	    @Getter @Setter
		private String invoiceNumber;
  
		@JsonProperty ("supplier")
		Supplier supplier;
		
	    @JsonProperty("invoiceDate")
		private String invoiceDate;
	    
	    @JsonProperty("division")
		private String division;
	    
	    @JsonProperty("storeNumber")
		private String storeNumber;
	    
	    @JsonProperty("legacyStoreNumber")
		private String legacyStoreNumber;
	  
		@JsonProperty("netInvoiceAmount")
		private Double netInvoiceAmount;
		
		@JsonProperty("taxAmount")
		private Double taxAmount;
		
		@JsonProperty("freightAmount")
		private Double freightAmount;
		
		 
		
	    @JsonProperty("totalDeductionAmount")
		private Long totalDeductionAmount;
	    
	    @JsonProperty("grossInvoiceAmount")
		private Double grossInvoiceAmount;
	    
	    @JsonProperty("totalPaidAmount")
		private Double totalPaidAmount;
	    
	    @JsonProperty("currency")
		private String currency;
	    
	    @JsonProperty("invoiceStatus")
		private String invoiceStatus;
	    
	    @JsonProperty ("invoiceType")
		private String invoiceType;
	    
	    @JsonProperty ("invoiceRecievedDate")
		private String invoiceRecievedDate;
	    
	    @JsonProperty ("poNumber")
		private String poNumber;
		
	    @JsonProperty ("createDate")
		private String createDate;
	    
	    @JsonProperty ("updateDate")
		private String updateDate;
}
