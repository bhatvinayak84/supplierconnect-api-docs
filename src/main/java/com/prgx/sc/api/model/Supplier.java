package com.prgx.sc.api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Supplier {

	    	    
	    @JsonProperty("supplierERPID")
		private Long supplierErpId;
	    @JsonProperty("supplierName")
		private String supplierName;
	
	  

	}


