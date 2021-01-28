package com.cg.bank.dao;



import java.util.Scanner;

import com.cg.bank.entity.BankCustomer;

public class BankDaoImpl extends JPAUtil implements BankDaoInterface {
	
	//private int id=0;

	@Override
	public BankCustomer getBankCustomerById(int id) {
		
		BankCustomer bankCustomer=em.find(BankCustomer.class,id );
		
		return bankCustomer;
	}

	@Override
	public void addCustomer(BankCustomer bankCustomer) {
		em.persist(bankCustomer);
		
		
	}

	@Override
	public void updateCustomer(BankCustomer bankCustomer) {
		 
		em.merge(bankCustomer);
	}

	@Override
	public void removeCustomer(BankCustomer bankCustomer) {
		em.remove(bankCustomer);
		
	}

	@Override
	public void commitTransaction() {
		transaction.commit();
		
	}

	@Override
	public void beginTransaction() {
		
		transaction.begin();
	}
	

}
