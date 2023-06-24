package com.ps20520;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.Connections.Connections;

/**
 * Servlet implementation class Action
 */
@WebServlet("/delete")
public class Action extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connections con = null;   
    /**
     * @throws ClassNotFoundException 
     * @see HttpServlet#HttpServlet()
     */
    public Action() throws ClassNotFoundException {
    	con = new Connections();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("dels");
		System.out.println("name"+ name);
		del(name);
		response.sendRedirect("bai2");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public void del(String name) { 
		String sql = "delete from INFO_USER  where username =N"+name+"";
		con.delete(sql);
	}
}
