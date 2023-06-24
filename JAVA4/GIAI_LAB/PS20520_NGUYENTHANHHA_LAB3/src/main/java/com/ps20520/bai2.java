package com.ps20520;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

/**
 * Servlet implementation class bai2
 */
@WebServlet("/Bai2Lab3")

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
        request.getRequestDispatcher("/views/lab3bai2.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        System.out.println("Tên là : " + request.getParameter("username"));
        System.out.println("brith là : " + request.getParameter("brith"));
        System.out.println("password là : " + request.getParameter("password"));
        //In ra giá trị values in
        System.out.println("Giới tính là : " + request.getParameter("gender"));
        System.out.println("Trạng thái kết hôn là : " + request.getParameter("married"));
        System.out.println("Quốc tịch là : " + request.getParameter("nationality"));
        DateTimeConverter dtc = new DateConverter(new Date());
        dtc.setPattern("MM/dd/yyyy");
        ConvertUtils.register(dtc, Date.class);

        try {
            User user = new User();

            BeanUtils.populate(user, request.getParameterMap());
            request.setAttribute("user", user);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String favorite[] = request.getParameterValues("favorites");
//		request.setAttribute("fav",Arrays.toString(favorite));
        System.out.println("Sở thích là : " + Arrays.toString(favorite));
        System.out.println("Ghi chú là : " + request.getParameter("note"));
        request.getRequestDispatcher("/views/lab3bai2_result.jsp").forward(request, response);
    }

}
