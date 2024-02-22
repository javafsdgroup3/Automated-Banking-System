package com.tcs.project.resource;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Accounts {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accid;
	private double amount;
	
	public Accounts() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Accounts [accid=" + accid + ", amount=" + amount + "]";
	}

	public Accounts(int accid, double amount) {
		super();
		this.accid = accid;
		this.amount = amount;
	}

	public int getAccid() {
		return accid;
	}

	public void setAccid(int accid) {
		this.accid = accid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
