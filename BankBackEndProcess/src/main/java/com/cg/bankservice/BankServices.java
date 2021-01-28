package com.cg.bankservice;

import com.cg.bank.entity.BankCustomer;

public interface BankServices {
	
	void addCustomer(BankCustomer bankCustomer);
	void updateCustomer(BankCustomer bankCustomer);
	void removeCustomer(BankCustomer bankCustomer);
	BankCustomer findCustomerById(int id);

}
