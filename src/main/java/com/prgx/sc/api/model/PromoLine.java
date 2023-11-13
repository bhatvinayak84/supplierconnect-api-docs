package com.prgx.sc.api.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class PromoLine {

	  @JsonProperty("promoHeader")
	  @Schema(description = "Promo  ",example = "")
	  private Promo promoHeader;
	    	    
	  @JsonProperty("supplier")
	  @Schema(description = "Supplier Details ",example = "")
	  private Supplier supplier;
	    
	  @JsonProperty("invoice")
	  @Schema(description = "Invoice details ",example = "")
	  private Invoice invoice;
	  
	  @JsonProperty("fiscalYear")
	  @Schema(description = "Fiscal Year",example = "2023")
	  private String fiscalYear;
	  
	  
	  @JsonProperty("fiscalPeriod")
	  @Schema(description = "Fiscal Period",example = "8")
	  private String fiscalPeriod;
	  
	  @JsonProperty("weekEndingDate")
	  @Schema(description = "Week Ending Date ",example = "08/29/2023")
	  private Date weekEndingDate;
	  
	  @JsonProperty("promoInvoiceAmount")
	  @Schema(description = "Promo Invoice Amount ",example = "-463.45")
	  private Long promoInvoiceAmount;
	  
	  
	  @JsonProperty("accountInvoiceDate")
	  @Schema(description = "Accounting Invoice Date ",example = "08/29/2023")
	  private Date accountInvoiceDate;
	  
		  
	  @JsonProperty("contractDueAmount")
	  @Schema(description = "Contract due amount",example = "10")
	  private Long contractDueAmount;
	  
	  @JsonProperty("dealNumber")
	  @Schema(description = "Deal Number ",example = "10")
	  private Long dealNumber;
	  
	  @JsonProperty("contractNumber")
	  @Schema(description = "Contract Number ",example = "10")
	  private Long contractNumber;
	  
	  @JsonProperty("linePromoDivision")
	  @Schema(description = "Line Promo Division ",example = "")
	  private Long linePromoDivision;
	  
	  @JsonProperty("promoDivision")
	  @Schema(description = "Promo Division ",example = "")
	  private Long promoDivision;
	  
	  @JsonProperty("divisionNumber")
	  @Schema(description = "Division Number ",example = "")
	  private Long divisionNumber;
	  
	  @JsonProperty("divisionName")
	  @Schema(description = "Division Name ",example = "")
	  private Long divisionName;
	  
	  @JsonProperty("contractStartDate")
	  @Schema(description = "Contract Start Date ",example = "08/29/2023")
	  private Date contractStartDate;
	  
	  @JsonProperty("contractEndDate")
	  @Schema(description = "Contract end Date ",example = "08/29/2023")
	  private Date contractEndDate;
	  
	  
	  @JsonProperty("couponNumber")
	  @Schema(description = "Coupon Number",example = "")
	  private String couponNumber;
	  
	  @JsonProperty("couponPercentage")
	  @Schema(description = "Coupon Billing Percentage",example = "")
	  private String couponPercentage;
	  
	  @JsonProperty("offerCode")
	  @Schema(description = "Offer Code",example = "")
	  private String offerCode;
	  
	  @JsonProperty("eventID")
	  @Schema(description = "Event ID",example = "")
	  private String eventID;
	  
	  @JsonProperty("mfgOffer")
	  @Schema(description = "Manufacture Offer",example = "")
	  private String mfgOffer;
	  
	  @JsonProperty("mfgCode")
	  @Schema(description = "Manufacture Code",example = "")
	  private String mfgCode;
	  
	  @JsonProperty("couponDesc")
	  @Schema(description = "Coupon Description",example = "")
	  private String couponDesc;
	  
	  @JsonProperty("userComments")
	  @Schema(description = "User Comments",example = "")
	  private String userComments;
	  
	  @JsonProperty("contractType")
	  @Schema(description = "Contract Type",example = "")
	  private String contractType;
	  
	  @JsonProperty("categoryManager")
	  @Schema(description = "Category Manager ",example = "")
	  private String categoryManager;
	  
	  @JsonProperty("lineNo")
	  @Schema(description = "Line Number ",example = "")
	  private String lineNo;
	  
	  @JsonProperty("upc")
	  @Schema(description = "upc",example = "")
	  private String upc;
	  
	  @JsonProperty("location")
	  @Schema(description = "Location",example = "")
	  private String location;
	  
	  @JsonProperty("itemDescription")
	  @Schema(description = "Item Description",example = "")
	  private String itemDescription;
	}


