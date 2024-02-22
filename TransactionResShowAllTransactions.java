package com.tcs.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.project.resource.Transactions;
import com.tcs.project.services.TransactionService;


@RestController
@RequestMapping("/Transaction/api.1.0/show")
public class TransactionResShowAllTransactions {

	@Autowired
	TransactionService service;
	
	@GetMapping
	@RequestMapping("/allTransactions/{uid}")
	public List<Transactions> showAllTransacrtions(@PathVariable int uid){
		return service.getTransactions(uid);
	}
	
}
