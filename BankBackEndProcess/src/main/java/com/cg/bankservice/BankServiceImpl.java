package com.cg.bankservice;

import com.cg.bank.dao.BankDaoImpl;
import com.cg.bank.dao.BankDaoInterface;
import com.cg.bank.entity.BankCustomer;

public class BankServiceImpl implements BankServices{
	
	private BankDaoInterface dao;
	
	public BankServiceImpl()
	{
		dao= new BankDaoImpl();
	}

	@Override
	public void addCustomer(BankCustomer bankCustomer) {
		dao.beginTransaction();
		dao.addCustomer(bankCustomer);
		dao.commitTransaction();
		
	}

	@Override
	public void updateCustomer(BankCustomer bankCustomer) {
		dao.beginTransaction();
		dao.updateCustomer(bankCustomer);
		dao.commitTransaction();
		
	}

	@Override
	public void removeCustomer(BankCustomer bankCustomer) {
		dao.beginTransaction();
		dao.removeCustomer(bankCustomer);
		dao.commitTransaction();
		
	}

	@Override
	public BankCustomer findCustomerById(int id) {
		
		return dao.getBankCustomerById(id);
	}

}
