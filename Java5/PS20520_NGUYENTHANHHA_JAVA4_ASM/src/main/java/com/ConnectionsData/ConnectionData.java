package com.ConnectionsData;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionData {
	static EntityManagerFactory entityManagerFactory ;
	static EntityManager entityManager ;
	
	public ConnectionData() { 
		
	}
	public static EntityManager database() { 
		entityManagerFactory = Persistence.createEntityManagerFactory("LINLIN_PROJECT_CONNECTION");
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
}
