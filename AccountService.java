package com.tcs.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.project.repository.AccountRepository;
import com.tcs.project.resource.Accounts;



@Service
public class AccountService {

	@Autowired
	AccountRepository repo;
	
	
	
	public Accounts getAccountById(int id) {
		Optional <Accounts> acc=repo.findById(id);//return type is optional 
		//it doesn't throw null pointer exception
		System.out.println(acc.get());
    	return acc.get();
	}
	
	public Accounts save(Accounts a) {

		return repo.save(a);

	}
}
