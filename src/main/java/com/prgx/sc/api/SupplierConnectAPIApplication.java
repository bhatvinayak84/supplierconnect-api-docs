package com.prgx.sc.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.prgx.sc.api.*"})
public class SupplierConnectAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplierConnectAPIApplication.class, args);
	}

}
