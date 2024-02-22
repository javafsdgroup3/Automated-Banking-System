package com.tcs.project.resource;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Transactions {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	private String description;
	private int userid;
	private int recieverid;
	private double amount;
	Date date;
	
	
	public Transactions() {
		// TODO Auto-generated constructor stub
	}

    
	
	public Transactions(int tid, String description, int userid, int recieverid, double amount, Date date) {
		super();
		this.tid = tid;
		this.description = description;
		this.userid = userid;
		this.recieverid = recieverid;
		this.amount = amount;
		this.date = date;
	}



	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public int getRecieverid() {
		return recieverid;
	}


	public void setRecieverid(int recieverid) {
		this.recieverid = recieverid;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Transactions [tid=" + tid + ", description=" + description + ", userid=" + userid + ", recieverid="
				+ recieverid + ", amount=" + amount + ", date=" + date + "]";
	}
	
	



	
}
