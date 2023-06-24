package com.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.ConnectionsData.ConnectionData;
import com.Entity.User;

public class UserController {
	public void addUser(User entity) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
			System.out.println("Thêm entity user thành công");

		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("Thêm entity user thất bại");
			// TODO: handle exception
		}
	}

	public User updateUser(User entity, String id) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		try {
			entityManager.getTransaction().begin();
			User findedUser = entityManager.find(User.class, id);
			findedUser = entity;
			entityManager.merge(findedUser);
			entityManager.getTransaction().commit();
			System.out.println("Update entity user thành công");
			return findedUser;
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("Update entity user thất bại");
			System.out.println("lỗi không update : "+ e);
			// TODO: handle exception
			return entity;
		}
	}

	public boolean removeUser(User entity, String id) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		try {
			entityManager.getTransaction().begin();
			User findedUser = entityManager.find(User.class, id);
			findedUser = entity;
			entityManager.remove(findedUser);
			entityManager.getTransaction().commit();
			System.out.println("remove entity user thành công");
			return true;
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("remove entity user thất bại");
			System.out.println("lỗi không remove : "+ e);
			return false;
			// TODO: handle exception
		}
	}

	public List<User> findAll_User() {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		String jsql = "Select o from User o";
		List<User> list_user = new ArrayList<User>();
		TypedQuery<User> query_findAll_User = entityManager.createQuery(jsql, User.class);
		list_user = query_findAll_User.getResultList();
		if (list_user.isEmpty()) {
			System.out.println("List user to finAllUser empty!!");
			return null;
		}
		return list_user;
	}

	public User find_User_ByID(String id) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		TypedQuery<User> query_findUser_ByID = entityManager.createNamedQuery("User.find_User_ByID", User.class);
		query_findUser_ByID.setParameter("id", id);
		User user = new User();
		user = query_findUser_ByID.getSingleResult();
		if (user == null) {
			System.out.println(" find_User_ByID = null ");
			return null;

		}
		System.out.println(" find_User_ByID = 1 ");
		return user;
	}

	public User find_User_ByID_PASSWORD(String id, String password) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
		TypedQuery<User> query_findUser_ByID_PASSWORD = entityManager.createNamedQuery("User.find_User_ByID_PASSWORD",
				User.class);
		query_findUser_ByID_PASSWORD.setParameter("id", id);
		query_findUser_ByID_PASSWORD.setParameter("password", password);
		User user = new User();
		user = query_findUser_ByID_PASSWORD.getSingleResult();
		if (user == null) {
			System.out.println(" find_User_ByID_PASSWORD = null ");
			return null;

		}
		System.out.println(" find_User_ByID_PASSWORD = 1 ");
		return user;
	}
	public User find_User_ByID_PASSWORD_ADMIN(String id, String password, boolean role) {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
	try {
		TypedQuery<User> query_findUser_ByID_PASSWORD_ADMIN = entityManager.createNamedQuery("User.find_User_ByID_PASSWORD_ADMIN",
				User.class);
		query_findUser_ByID_PASSWORD_ADMIN.setParameter("id", id);
		query_findUser_ByID_PASSWORD_ADMIN.setParameter("password", password);
		query_findUser_ByID_PASSWORD_ADMIN.setParameter("role", role);
		User user = new User();
		user = query_findUser_ByID_PASSWORD_ADMIN.getSingleResult();
		if (user == null) {
			System.out.println(" find_User_ByID_PASSWORD_ADMIN = null ");
			return null;
		}
		System.out.println(" find_User_ByID_PASSWORD_ADMIN = 1 ");
		return user;
	} catch (Exception e) {
		// TODO: handle exception
		return null;
	}
	}
	public List<User> findUserByFavorite() {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
	
		List<User> list_user = new ArrayList<User>();
		TypedQuery<User> findUserByFavorite = entityManager.createQuery("User.find_User_Byfavorite", User.class);
		list_user = findUserByFavorite.getResultList();
		if (list_user.isEmpty()) {
			System.out.println("List user to findUserByFavorite empty!!");
			return null;
		}
		return list_user;
	}
	public List<User> findUserByShare() {
		EntityManager entityManager;
		entityManager = ConnectionData.database();
	
		List<User> list_user = new ArrayList<User>();
		TypedQuery<User> findUserByFavorite = entityManager.createQuery("User.find_User_ByShare", User.class);
		list_user = findUserByFavorite.getResultList();
		if (list_user.isEmpty()) {
			System.out.println("List user to findUserByShare empty!!");
			return null;
		}
		return list_user;
	}

}
