package com.prgx.sc.api.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CouponDeduction {

	    	    
	    @JsonProperty("couponDeductionNumber")
	    @Schema(description = "Coupon Deduction Number ",example = "")
		private String couponDeductionNumber;

	    
	    @JsonProperty("couponIvoiceCnt")
	    @Schema(description = "No of coupon invoices",example = "4")
		private Long couponIvoiceCnt;

	    @JsonProperty("manufacturerNo")
	    @Schema(description = "Coupon manufacturer Number",example = "123")
		private Long manufacturerNo;

	    @JsonProperty("manufacturerName")
	    @Schema(description = "Coupon manufacturer name",example = "AUT120653")
		private Long manufacturerName;
	    
	    @JsonProperty("supplier")
	    @Schema(description = "Supplier Details",example = "")
		private Long supplier;
	    
	    @JsonProperty("reportDate")
	    @Schema(description = "Report Date",example = "")
		private Date reportDate;
	    
	    @JsonProperty("currency")
	    @Schema(description = "Currency",example = "")
		private Date currency;
	    
	    @JsonProperty("deductionAmount")
	    @Schema(description = "Deduction Amount",example = "")
		private Date deductionAmount;
	    
	    
	}


