package com.tcs.project.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.project.services.TransactionService;



@RestController
@RequestMapping("/Transaction/api.1.0")
public class TransactionResource {

	@Autowired
	TransactionService service;
	
	
	@GetMapping
	public String check() {
		return "/Transaction/api.1.0";
	}
	
}
