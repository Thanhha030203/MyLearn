package com.ps20520;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entity.User;

public class UserDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("LAB8");
	EntityManager em  = emf.createEntityManager();
	
	public static User create() {
		return null; 
		// todo your code here
	}
	public static void update() { 
		// todo your code here
	}
	public static void delete() { 
		// todo your code here
	}
	public static void findAll() { 
		// todo your code here
	}
	public static void findByID() { 
		// todo your code here
	}
}
