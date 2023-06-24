package com.poly.servlet;


import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//
@WebServlet({"/lab8/sign-in", "/lab8/change-password", "/lab8/edit-profile"})
public class bai2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("sign-in")) {
            req.setAttribute("view", "/views/sign-in.jsp");
        } else if (uri.contains("change-password")) {
            req.setAttribute("view", "/views/change-password.jsp");
        } else if (uri.contains("edit-profile")) {
            req.setAttribute("view", "/views/edit-profile.jsp");
        }
        req.getRequestDispatcher("/views/bai2.jsp").forward(req, resp);
        //req.getRequestDispatcher("/views/layout2.jsp").forward(req, resp);
    }
}
