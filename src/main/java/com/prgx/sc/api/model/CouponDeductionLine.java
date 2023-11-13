package com.prgx.sc.api.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CouponDeductionLine {

	    	    
	    @JsonProperty("couponDeduction")
	    @Schema(description = "Coupon Deduction",example = "")
		private CouponDeduction couponDeduction;
	    
	    @JsonProperty("supplier")
	    @Schema(description = "supplier Details",example = "")
		private Supplier  supplier;
	    
	    @JsonProperty("invoice")
	    @Schema(description = "Invoice Details",example = "")
		private Invoice invoice;
	    
	    @JsonProperty("adjustmentCode")
	    @Schema(description = "Adjustment Code",example = "")
		private String adjustmentCode;
	    
	    @JsonProperty("adjustmentDescription")
	    @Schema(description = "Adjustment Description",example = "")
		private String adjustmentDescription;
	    
	}


