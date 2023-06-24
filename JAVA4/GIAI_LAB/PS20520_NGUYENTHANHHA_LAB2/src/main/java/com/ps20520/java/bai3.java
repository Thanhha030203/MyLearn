package com.ps20520.java;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Servlet implementation class bai2
 */
@WebServlet("/Bai3Lab2")

public class bai3 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public bai3() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.getRequestDispatcher("/views/lab2bai3.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.getRequestDispatcher("/views/lab2bai3_result.jsp").forward(request, response);
        System.out.println("Tên là : " + request.getParameter("username"));
        System.out.println("password là : " + request.getParameter("password"));
        System.out.println("Giới tính là : " + request.getParameter("gender"));
        System.out.println("Trạng thái kết hôn là : " + request.getParameter("married"));
        System.out.println("Quốc tịch là : " + request.getParameter("nationality"));
        String favorite[] = request.getParameterValues("favorites");
//		request.setAttribute("fav",Arrays.toString(favorite));
        System.out.println("Sở thích là : " + Arrays.toString(favorite));
        System.out.println("Ghi chú là : " + request.getParameter("note"));
    }

}
