package com.ps20520.java;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

/**
 * Servlet implementation class bai2
 */
@WebServlet("/Bai4Lab2")

public class bai4 extends HttpServlet {
    int count;
    Path path = Paths.get("D:/FPT Polytechnic/SPR23/JAVA4/GIAI_LAB/PS20520_NGUYENTHANHHA_LAB2/temp/count.txt");

    @Override
    public void init() throws ServletException {
        // TODO Auto-generated method stub
        try {
            count = Integer.parseInt(Files.readAllLines(path).get(0));
            System.out.println(count);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {

        count++;
        System.out.println("in ra count " + count);

        arg0.setAttribute("count", count);
        arg0.getRequestDispatcher("/views/hit-counter.jsp").forward(arg0, arg1);
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        try {
            Files.write(path, String.valueOf(count).getBytes(), StandardOpenOption.WRITE);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
