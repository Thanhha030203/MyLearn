package com.model;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class index_user
 */
@WebServlet({"/account/sign-in","/account/sign-up","/account/sendmail","/account/sign-out","/account/forgot-password","/account/change-password","/account/edit-profile","/account/update","/account/delete","/account/com"})
public class index_user extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
        // TODO Auto-generated constructor stub
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resq) throws ServletException, IOException {
		// TODO Auto-generated method stub

		req.getRequestDispatcher("/views/index_user.jsp").forward(req, resq);
		
	}

}
