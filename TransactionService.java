package com.tcs.project.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.project.repository.AccountRepository;
import com.tcs.project.repository.TransactionsRepository;
import com.tcs.project.resource.Accounts;
import com.tcs.project.resource.Transactions;


@Service
public class TransactionService {

	
	@Autowired
	TransactionsRepository repo;
	
	@Autowired
	AccountRepository rep;
	
	@Autowired
	AccountService acc;
	
	
	public List<Transactions> getTransactions(int id) {
		
		List<Transactions> list=repo.findAll();//jpa is writing as part of dao
		List<Transactions> list1 = new ArrayList<>();
		for(Transactions l:list) {
			if(l.getUserid() == id) {
				list1.add(l);
			}
		}
		return list1;
	}
	
	public Transactions getTransactionById(int id) {
		Optional <Transactions> trans=repo.findById(id);//return type is optional 
		//it doesn't throw null pointer exception
		System.out.println(trans.get());
    	return trans.get();
		
	}
	
	
	public Transactions savedeposit(Transactions t) {
		
		 t.setDate(new Date());
		 t.setRecieverid(0);
		 Accounts a=acc.getAccountById(t.getUserid());
		 a.setAmount(a.getAmount()+t.getAmount());
		 
		 rep.save(a);
		 
	     return repo.save(t);
		
	}
	
	public Transactions savefundtransfer (Transactions t) {
		t.setDate(new Date());
		Accounts a1,a2;
		a1=acc.getAccountById(t.getUserid());
		a2=acc.getAccountById(t.getRecieverid());
		
		if(a1.getAmount()<t.getAmount())return null;
		
		a1.setAmount(a1.getAmount()-t.getAmount());
		a2.setAmount(a2.getAmount()+t.getAmount());
		
		rep.save(a1);
		rep.save(a2);
	
		return repo.save(t);
	}
	
	public Transactions savewithdraw(Transactions t) {

		
		t.setDate(new Date());
		t.setRecieverid(0);
		Accounts a = acc.getAccountById(t.getUserid());
		
		if(a.getAmount()< t.getAmount())return null;
		
		a.setAmount(a.getAmount() - t.getAmount());

		rep.save(a);

		return repo.save(t);
		
	}
	
}
	
















	/*public Transactions update(Transactions t) {
		
		Optional<Transactions> opt=repo.findById(t.getTid());
		Transactions temptrans=opt.get();
		if(temptrans.getDescription().equalsIgnoreCase("upi")) {
			//get object with the help of userid and perform the following
			
			//get recieverid and add amount into that reciever
			//get userid and deduct amount from that user
			
		}
		else {
			//deduct amount from the userid
		}
//		temptrans.setDescription(t.getDescription());
//		temptrans.setAmount(t.getAmount());
		repo.save(temptrans);
		
		return temptrans;
	}*/
