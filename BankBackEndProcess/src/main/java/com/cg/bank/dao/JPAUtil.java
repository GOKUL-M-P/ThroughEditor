package com.cg.bank.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAUtil {
	 EntityManagerFactory factory = Persistence.createEntityManagerFactory("bankdb");
	 EntityManager em = factory.createEntityManager();
	 EntityTransaction transaction = em.getTransaction();
	

}
