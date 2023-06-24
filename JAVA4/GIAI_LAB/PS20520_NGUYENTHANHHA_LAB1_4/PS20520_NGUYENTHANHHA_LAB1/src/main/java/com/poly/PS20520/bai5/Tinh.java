package com.poly.PS20520.bai5;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 @WebServlet("/form/as")
public class Tinh extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/VIEWS/Information.jsp").forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double height = Double.parseDouble(req.getParameter("height_first"));
		double width = Double.parseDouble(req.getParameter("width_first"));
		double S = height*width;
				double C = (height + width) *2;
			req.setAttribute("S", S);
			req.setAttribute("C", C);
			req.getRequestDispatcher("/VIEWS/Result.jsp").forward(req, resp);
	}
}
