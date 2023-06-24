package com.EntityDao;

import java.util.List;

import com.Controller.UserController;
import com.Entity.User;

public class UserDao extends DaoEntity<User,String> {
	UserController userController;
	public void addEntity(User entity) {
		// TODO Auto-generated method stub
		userController = new UserController();
		userController.addUser(entity);
	}

	public void updateEntity(User entity, String id) {
		// TODO Auto-generated method stub
		userController = new UserController();
		userController.updateUser(entity, id);
	}

	public boolean removeEntity(User entity,String id) {
		// TODO Auto-generated method stub
		userController = new UserController();
		return userController.removeUser(entity, id);
	}


	public List<User> findAllEntity() {
		// TODO Auto-generated method stub
		userController = new UserController();
		return userController.findAll_User();
	}
	public User findEntity_ByID(String Id) {
		// TODO Auto-generated method stub
		userController = new UserController();
		return userController.find_User_ByID(Id);
	}
	
	public User findEntity_ByID_PASSWORD(String id,String password) {
		// TODO Auto-generated method stub
		userController = new UserController();
		return userController.find_User_ByID_PASSWORD(id,password);
	}
	
	public User findEntity_ByID_PASSWORD_ADMIN(String id,String password, boolean role) {
		// TODO Auto-generated method stub
		userController = new UserController();
		return userController.find_User_ByID_PASSWORD_ADMIN(id,password, role);
	}
	
}
