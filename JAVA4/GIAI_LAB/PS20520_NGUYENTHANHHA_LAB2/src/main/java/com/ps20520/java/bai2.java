package com.ps20520.java;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * Servlet implementation class bai2
 */
@WebServlet("/Bai2Lab2")

public class bai2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public bai2() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.getRequestDispatcher("/views/lab2bai2.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.getRequestDispatcher("/views/lab2bai2_result.jsp").forward(request, response);
        System.out.println("Tên là : " + request.getParameter("username"));
        System.out.println("password là : " + request.getParameter("password"));
        System.out.println("Giới tính là : " + request.getParameter("gender"));
        System.out.println("Trạng thái kết hôn là : " + request.getParameter("married"));
        System.out.println("Quốc tịch là : " + request.getParameter("nationality"));
        System.out.println("Ghi chú là : " + request.getParameter("note"));
    }

}
