package com.tcs.project.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.project.resource.Transactions;
import com.tcs.project.services.TransactionService;


@RestController
@RequestMapping("/Transaction/api.1.0/by")
public class TransactionResTransactionById {

	
	@Autowired
	TransactionService service;
	@GetMapping
	@RequestMapping("/Transactionid/{id}")
	public Transactions fetchProduct(@PathVariable int id) {
		System.out.println(id);
		return service.getTransactionById(id);
	}
}
