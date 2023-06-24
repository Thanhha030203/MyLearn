package com.ps20520.java;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.URI;

/**
 * Servlet implementation class bai1
 */
@WebServlet({"/lab2/bai1", "/tinh_dien_tich", "/tinh_chu_vi"})
public class bai1 extends HttpServlet {


    /**
     * @see HttpServlet#HttpServlet()
     */
    public bai1() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.getRequestDispatcher("/views/lab2bai1.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        double canh_a = Double.parseDouble(request.getParameter("canh_a"));
        double canh_b = Double.parseDouble(request.getParameter("canh_b"));
        double canh_c = Double.parseDouble(request.getParameter("canh_c"));

        if ((canh_a + canh_b > canh_c) && (canh_b + canh_c > canh_a) && (canh_a + canh_c > canh_b)) {
            double nua_chu_vi = (canh_a + canh_b + canh_c) / 2;
            String uri = request.getRequestURI();
            if (uri.contains("tinh_dien_tich")) {
                double dien_tich = Math.sqrt(nua_chu_vi * (nua_chu_vi - canh_a) * (nua_chu_vi - canh_b) * (nua_chu_vi - canh_c));
                request.setAttribute("result", "Diện tích của tam giác là : " + dien_tich);

            }
            if (uri.contains("tinh_chu_vi")) {
                double chu_vi = nua_chu_vi * 2;
                request.setAttribute("result", "Chu vi của tam giác là : " + chu_vi);

            }
        } else {
            request.setAttribute("result", "Không thoả mãn điều kiện của 1 tam giác");

            System.out.println("result");
        }
        request.getRequestDispatcher("/views/lab2bai1.jsp").forward(request, response);

    }

}
