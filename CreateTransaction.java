package com.tcs.project.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.project.resource.Transactions;
import com.tcs.project.services.TransactionService;


@RestController
@RequestMapping("/Transaction/api.1.0/create")
public class CreateTransaction {

	@Autowired
	TransactionService service;
	
	@PostMapping
	@RequestMapping("/addTransaction")
	public Transactions createTransactions(@RequestBody Transactions t) {
		//three types transactions upi,withdraw,deposit
		if(t.getDescription().equalsIgnoreCase("deposit")) {
			return service.savedeposit(t);
		}
		else if(t.getDescription().equalsIgnoreCase("fundtransfer")) {
			return service.savefundtransfer(t);
		}
			
		return service.savewithdraw(t);
		
	}
}
