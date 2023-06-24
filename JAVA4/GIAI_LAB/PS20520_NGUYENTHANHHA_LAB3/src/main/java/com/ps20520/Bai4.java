package com.ps20520;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class Bai4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        System.out.println("Lỗi tại 15");
        String username = CookieUtils.get("username", req);
        String password = CookieUtils.get("password", req);
        req.setAttribute("username", username);
        req.setAttribute("password", password);
        req.getRequestDispatcher("/views/Login.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //đọc tham số form đăng nhập
        System.out.println("Lỗi 25");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String remember = req.getParameter("remember");
        //Kiểm tra tài khoản đăng nhập
        if (!username.equalsIgnoreCase("thanhha")) {
            req.setAttribute("message", "Sai tên đăng nhập");
        } else if (password.length() < 6) {
            req.setAttribute("message", "Sai mật khẩu");
        } else {
            req.setAttribute("message", "Đăng nhập thành công");
            //ghi nhớ hoặc xoá tài khoản đã ghi nhớ bằng cookie
            int hour = (remember == null) ? 0 : 30 * 24;//0=xoá
            CookieUtils.add("username", username, hour, resp);
            CookieUtils.add("password", password, hour, resp);
        }
        req.getRequestDispatcher("/views/Login.jsp").forward(req, resp);
    }
}
