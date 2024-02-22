package com.tcs.project.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.project.resource.Accounts;
import com.tcs.project.services.AccountService;

@RestController
@RequestMapping("/Account/api.1.0/create")
public class AccountResource {

	@Autowired
	AccountService service;
	
	@PostMapping
	@RequestMapping("/addAccount")
	public Accounts createAccounts(@RequestBody Accounts a) {
		
		return service.save(a);
		
	}
	
	@GetMapping
	@RequestMapping("/Accountid/{id}")
	public Accounts fetchAccount(@PathVariable int id) {
		return service.getAccountById(id);
	}
}
