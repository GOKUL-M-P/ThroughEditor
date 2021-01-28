package com.cg.bank.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.cg.bank.entity.Address;
import com.cg.bank.entity.BankCustomer;
import com.cg.bank.entity.CardDetails;
import com.cg.bank.entity.Name;
import com.cg.bankservice.BankServiceImpl;
import com.cg.bankservice.BankServices;


public class MainClass {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bankdb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		Name name=new Name();
		Address address = new Address();
		BankCustomer bankCustomer = new BankCustomer();
		CardDetails card = new CardDetails();
		
		Name name1=new Name();
		Address address1 = new Address();
		BankCustomer bankCustomer1 = new BankCustomer();
		CardDetails card1 = new CardDetails();
		
		
		name.setFirstName("Gokul");
		name.setLastName("M P");
		
		name1.setFirstName("Geetha");
		name1.setLastName("P");
		
		address.setArea("1/11,kk nagar");
		address.setDistrict("Coimbatore");
		address.setState("TamilNadu");
		
		address1.setArea("1/11,kk nagar");
		address1.setDistrict("Coimbatore");
		address1.setState("TamilNadu");
		
		bankCustomer.setAadhaarNo(12345678l);
		bankCustomer.setAddress(address);
		bankCustomer.setCustId(1234);
		bankCustomer.setMobileNo(879564366l);
		bankCustomer.setName(name);
		
		bankCustomer1.setAadhaarNo(8765432111l);
		bankCustomer1.setAddress(address1);
		bankCustomer1.setCustId(1235);
		bankCustomer1.setMobileNo(879564366l);
		bankCustomer1.setName(name1);
		
		card.setBankCustomer(bankCustomer);
		card.setCredit(123456789012l);
		card.setDebit(9876543210l);
		
		card1.setBankCustomer(bankCustomer1);
		card1.setCredit(5678901234l);
		card1.setDebit(8765432189l);
		
		
		em.persist(bankCustomer);
		em.persist(card);
		
		em.persist(bankCustomer1);
		em.persist(card1);
		transaction.commit();
		
		
		
		em.close();
		emf.close();
//BankServices service = new BankServiceImpl();
//	name.setFirstName("Nivedha");
//	name.setLastName("p");
//	
//	bankCustomer.setAadhaarNo(12345678901234l);
//	bankCustomer.setCustId(1236);
//	bankCustomer.setMobileNo(7871889696l);
//	bankCustomer.setName(name);
//	service.addCustomer(bankCustomer);
//	
//	service.findCustomerById(1236);
//		em.close();
//		emf.close();
		

	}

}
