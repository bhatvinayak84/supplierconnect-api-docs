package com.prgx.sc.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prgx.sc.api.model.InvoiceDetail;

@Service
public class InvoiceService {

  static List<InvoiceDetail> invoiceLines = new ArrayList<InvoiceDetail>();
  static long id = 0;

  public List<InvoiceDetail> findAll() {
    return invoiceLines;
  }
  public InvoiceDetail findById(String id) {
	    return new InvoiceDetail();
	  
  }
}
