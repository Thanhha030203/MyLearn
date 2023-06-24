package com.poly.PS20520.bai234;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/bai3")
public class Bai3 extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
			req.setAttribute("helo","HelloWorld");
			req.getRequestDispatcher("/VIEWS/index.jsp").forward(req, resp);
			
		}
}

