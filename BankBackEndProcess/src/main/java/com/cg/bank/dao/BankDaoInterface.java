package com.cg.bank.dao;

import com.cg.bank.entity.BankCustomer;

public interface BankDaoInterface {
	 BankCustomer getBankCustomerById(int id);
	 void addCustomer(BankCustomer bankCustomer);
	 void updateCustomer(BankCustomer bankCustomer);
	 void removeCustomer(BankCustomer bankCustomer);
	 void commitTransaction();
	 void beginTransaction();
}
