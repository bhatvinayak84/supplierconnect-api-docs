package com.prgx.sc.api.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;


public class InvoiceDetail {
@JsonProperty("invoiceSummary")
Invoice invoicesummary;

@JsonProperty("deductions ")
ArrayList<DeductionLine> deductions;

@JsonProperty("payments")
@Schema(description = "Payments associated to Invoice")
ArrayList<Payment> payments;

@JsonProperty("promos")
@Schema( description = "Promo allowances associated to Invoice ")
ArrayList<Promo> promos;

@JsonProperty("claims")
@Schema( description = "Claims associated to Invoice ")
ArrayList<Claim> claims;

}
