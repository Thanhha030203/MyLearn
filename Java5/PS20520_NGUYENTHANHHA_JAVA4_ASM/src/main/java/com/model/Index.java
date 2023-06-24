package com.model;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/asm/sign-in","/asm/sign-up","/asm/sendmail","/asm/sign-out","/asm/forgot-password","/asm/change-password","/asm/edit-profile","/asm/update"})
public class Index extends HttpServlet {
		
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resq) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		String uri = req.getRequestURI();
//		String link = uri.substring(uri.lastIndexOf('/')+1, uri.length());
//		System.out.println(link);
//		
//	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/views/sign-in.jsp").forward(req, resp);	
	}
}
