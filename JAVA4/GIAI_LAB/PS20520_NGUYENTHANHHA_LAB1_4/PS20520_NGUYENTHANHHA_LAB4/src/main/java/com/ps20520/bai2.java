package com.ps20520;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.apache.commons.beanutils.BeanUtils;

import com.Connections.Connections;

/**
 * Servlet implementation class bai2
 */
@WebServlet("/bai2/lab4")
public class bai2 extends HttpServlet {
	public List<User> list = new ArrayList<User>();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	Connections con = null;

	public bai2() {

		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		try {
			con = new Connections();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		list.clear();
	

		
		list = selectAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/views/index2.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean remember = false;
		if (request.getParameter("remember") != null) {
			remember = true;
		}
		action(request.getParameter("username"),request.getParameter("password"), remember);
		list = selectAll();
		request.setAttribute("list", list);


	
	request.setAttribute("list", list);
		request.getRequestDispatcher("/views/index2.jsp").forward(request, response);

	}

	@Override
	public void destroy() {

		// TODO Auto-generated method stub

	}

	public List<User> selectAll() {
		List<User> list_user = new ArrayList<User>();
		String sql = "Select * from INFO_USER";
		list_user = con.getResult(sql);
		
		return list_user;
	}
	public void action(String username, String password, boolean remember) { 
		String remem = (remember?"true":"false");
		con.insert(username, password, remem);
	}


}
