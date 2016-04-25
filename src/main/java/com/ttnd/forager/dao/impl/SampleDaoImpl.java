package com.ttnd.forager.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.ttnd.forager.dao.SampleDao;
import com.ttnd.forager.entites.Greeting;

@Repository
public class SampleDaoImpl implements SampleDao{
	
	
	EntityManager entityManager;
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void saveUser(Greeting user) {
		System.out.println("Saving the user....");
		entityManager.persist(user);
		System.out.println("User saved");
		
	}

}
