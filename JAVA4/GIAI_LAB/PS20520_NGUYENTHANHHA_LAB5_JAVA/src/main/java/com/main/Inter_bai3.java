package com.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entity.User;
import entity.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Để chạy có C thì phải sử dụng WEB/lib bỏ file jar vô
@WebServlet({ "/user/index.jsp", "/user/edit.jsp", "/user/create.jsp", "/user/update.jsp", "/user/delete.jsp" })
public class Inter_bai3 extends HttpServlet {
	static List<User> list;
	static UserDao dao;
	static User person;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub

		person = new User();
		dao = new UserDao();
		list = new ArrayList<User>();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		list = UserDao.findAll();
		req.setAttribute("list", list);
		String uri = req.getRequestURI();
		if(uri.contains("edit.jsp")) { 
			//todo code for edit user
			System.out.println(uri);
			String id = req.getParameter("edit");
			System.out.println("in id"+id);
			person = UserDao.findById(id);
			req.setAttribute("id", person.getId());
			req.setAttribute("pass", person.getPassword());
			req.setAttribute("fullname", person.getFullname());
			req.setAttribute("mail", person.getEmail());
			req.setAttribute("admin", person.isAdmin());
		}
		if(uri.contains("index.jsp")) { 
			System.out.println("hi");
			//todo code for delete user
			dao.end();
		}
		list = UserDao.findAll();
		req.setAttribute("list", list);
		req.getRequestDispatcher("/views/index.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = req.getRequestURI();
		System.out.println(uri);
		
		if(uri.contains("create.jsp")) { 
			//todo code for create user
			String id = req.getParameter("id");
			String pass = req.getParameter("password");
			String name = req.getParameter("fullname");
			String email = req.getParameter("Email");
			boolean admin = req.getParameter("admin") == "true"?true:false;
			User usernew = new User(id, pass, name, email, admin);
			UserDao.create(usernew);
		}
		if(uri.contains("update.jsp")) { 
			//todo code for update user
			
			person.setPassword(req.getParameter("password"));
			person.setFullname(req.getParameter("fullname"));
			person.setEmail(req.getParameter("Email"));
			person.setAdmin(req.getParameter("admin") =="true"?true:false);
			System.out.println("id person = "+person.getId());
			UserDao.update(req.getParameter("id"), person);
		
		}
		if(uri.contains("delete.jsp")) { 
			String id = req.getParameter("id");
			UserDao.delete(id);
			//todo code for delete user
		}
		if(uri.contains("index.jsp")) { 
			//todo code for delete user
			dao.end();
		}

			
			
		list = UserDao.findAll();
		req.setAttribute("list", list);
		req.getRequestDispatcher("/views/index.jsp").forward(req, resp);
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		dao.end();
		
	}
}
