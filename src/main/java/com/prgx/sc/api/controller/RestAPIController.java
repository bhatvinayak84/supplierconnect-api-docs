package com.prgx.sc.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prgx.sc.api.model.Claim;
import com.prgx.sc.api.model.CouponDeductionLine;
import com.prgx.sc.api.model.CouponDeduction;
import com.prgx.sc.api.model.Invoice;
import com.prgx.sc.api.model.InvoiceDetail;
import com.prgx.sc.api.model.Payment;
import com.prgx.sc.api.model.Promo;
import com.prgx.sc.api.model.PromoLine;
import com.prgx.sc.api.service.InvoiceService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;



@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class RestAPIController {
  @Autowired
  InvoiceService invoiceService;

 

  @Operation(summary = "Retrieve all Invoices", tags = { "Invoice" })
  @ApiResponses({
      @ApiResponse(responseCode = "200", content = {
          @Content(schema = @Schema(implementation = Invoice.class), mediaType = "application/json") }),
      @ApiResponse(responseCode = "204", description = "There are no Invoices to report for given filter criteria", content = {
          @Content(schema = @Schema()) }),
      @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
  @GetMapping("/invoices")
	public ResponseEntity<List<InvoiceDetail>> getAllInvoices(@RequestParam(required = true) String startDate,
			@RequestParam(required = true) String endDate, @RequestParam(required = true) String supplierName,
			@RequestParam(required = false) String invoiceStatus,@RequestParam(required = false) String storeNumber,
			@RequestParam(required = false) String invoiceCategory,@RequestParam(required = false) String associtaedDeductions) {
		try {
			List<InvoiceDetail> invoices = new ArrayList<InvoiceDetail>();

			return new ResponseEntity<>(invoices, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
  
	
	  
	  @Operation( summary = "Retrieve Invoice Details by Invoice Number", description =
	  "Get a Invoice object by specifying its id. The response is InvoiceHeader object with InvoiceLines."
	  , tags = { "Invoice" })
	  
	  @ApiResponses({
	  
	  @ApiResponse(responseCode = "200", content = { @Content(schema
	  = @Schema(implementation = InvoiceDetail.class), mediaType = "application/json")
	  }),
	  
	  @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema())
	  }),
	  
	  @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema())
	  }) })
	  
	  @GetMapping("/invoices/{invoiceNumber}") public ResponseEntity<InvoiceDetail> getInvoiceById(@PathVariable("invoiceNumber") String id) { 
		  InvoiceDetail details = new InvoiceDetail();
	
	  if (details != null) { return new ResponseEntity<>(details, HttpStatus.OK);
	  } else { return new ResponseEntity<>(HttpStatus.NOT_FOUND); } }
	 
  /**
   * Payment API 
   */
  

	  @Operation(summary = "Retrieve all payments", tags = { "Payment" })
	  @ApiResponses({
	      @ApiResponse(responseCode = "200", content = {
	          @Content(schema = @Schema(implementation = Payment.class), mediaType = "application/json") }),
	      @ApiResponse(responseCode = "204", description = "There are no payments to report", content = {
	          @Content(schema = @Schema()) }),
	      @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
	  @GetMapping("/payments")
	  public ResponseEntity<List<Payment>> getAllPayments(@RequestParam(required = true) String startDate,
				@RequestParam(required = true) String endDate, @RequestParam(required = true) String supplierName) {
	    try {
	      List<Payment> payments = new ArrayList<Payment>();

	      return new ResponseEntity<>(payments, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  
	  
	  /**
	   * Coupon API 
	   */
	  

		  @Operation(summary = "Retrieve all Coupon Deductions", tags = { "Coupon Deductions" })
		  @ApiResponses({
		      @ApiResponse(responseCode = "200", content = {
		          @Content(schema = @Schema(implementation = CouponDeductionLine.class), mediaType = "application/json") }),
		      @ApiResponse(responseCode = "204", description = "There are no coupon deductions to report", content = {
		          @Content(schema = @Schema()) }),
		      @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
		  @GetMapping("/coupons")
		  public ResponseEntity<List<CouponDeductionLine>> getAllCoupons(@RequestParam(required = true) String startDate,
					@RequestParam(required = true) String endDate, @RequestParam(required = true) String supplierName) {
		    try {
		      List<CouponDeductionLine> coupons = new ArrayList<CouponDeductionLine>();

		      return new ResponseEntity<>(coupons, HttpStatus.OK);
		    } catch (Exception e) {
		      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		    }
		  }
		  
		  /**
		   * Coupon Deduction Lines API 
		   */
		  
		  
		  @Operation( summary = "Retrieve Coupon Deduction Line Details by ID", description =
		  "Get a Deduction Line object by specifying its id. The response is CouponDeductionLine object."
		  , tags = { "Coupon Deductions" })
		  
		  @ApiResponses({
		  
		  @ApiResponse(responseCode = "200", content = { @Content(schema
		  = @Schema(implementation = CouponDeduction.class), mediaType = "application/json")
		  }),
		  
		  @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema())
		  }),
		  
		  @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema())
		  }) })
		  
		  @GetMapping("/coupons/{couponDeductionNo}") public ResponseEntity<CouponDeduction> getCouponById(@PathVariable("couponDeductionNo") String id) { 
			  CouponDeduction details = new CouponDeduction();
		
		  if (details != null) { return new ResponseEntity<>(details, HttpStatus.OK);
		  } else { return new ResponseEntity<>(HttpStatus.NOT_FOUND); } }
		 
		  
		  /**
		   * Claims API 
		   */
		  

			  @Operation(summary = "Retrieve all Claims", tags = { "Claims" })
			  @ApiResponses({
			      @ApiResponse(responseCode = "200", content = {
			          @Content(schema = @Schema(implementation = Claim.class), mediaType = "application/json") }),
			      @ApiResponse(responseCode = "204", description = "There are no claims to report", content = {
			          @Content(schema = @Schema()) }),
			      @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
			  @GetMapping("/claims")
			  public ResponseEntity<List<Claim>> getAllClaims(@RequestParam(required = true) String startDate,
						@RequestParam(required = true) String endDate, @RequestParam(required = true) String supplierName) {
			    try {
			      List<Claim> claims = new ArrayList<Claim>();

			      return new ResponseEntity<>(claims, HttpStatus.OK);
			    } catch (Exception e) {
			      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			    }
			  }
			  
			  
			  /**
			   * Promo Allowances API 
			   */
			  

				  @Operation(summary = "Retrieve all Promo Allowances", tags = { "Promo Allowances" })
				  @ApiResponses({
				      @ApiResponse(responseCode = "200", content = {
				          @Content(schema = @Schema(implementation = Promo.class), mediaType = "application/json") }),
				      @ApiResponse(responseCode = "204", description = "There are no promo allowances to report", content = {
				          @Content(schema = @Schema()) }),
				      @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
				  @GetMapping("/promos")
				  public ResponseEntity<List<Promo>> getAllPromo(@RequestParam(required = true) String startDate,
							@RequestParam(required = true) String endDate, @RequestParam(required = true) String supplierName) {
				    try {
				      List<Promo> promos = new ArrayList<Promo>();

				      return new ResponseEntity<>(promos, HttpStatus.OK);
				    } catch (Exception e) {
				      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
				    }
				  }
				  /**
				   * Promo Lines API 
				   */
				  
				  
				  @Operation( summary = "Retrieve Promo Line Details by Promo ID", description =
				  "Get a Promo Line object by specifying its id. The response is PromoLine object."
				  , tags = { "Promo Allowances" })
				  
				  @ApiResponses({
				  
				  @ApiResponse(responseCode = "200", content = { @Content(schema
				  = @Schema(implementation = PromoLine.class), mediaType = "application/json")
				  }),
				  
				  @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema())
				  }),
				  
				  @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema())
				  }) })
				  
				  @GetMapping("/promos/{promoID}") public ResponseEntity<PromoLine> getPromoById(@PathVariable("promoID") String id) { 
					  PromoLine details = new PromoLine();
				
				  if (details != null) { return new ResponseEntity<>(details, HttpStatus.OK);
				  } else { return new ResponseEntity<>(HttpStatus.NOT_FOUND); } }
				 
}
