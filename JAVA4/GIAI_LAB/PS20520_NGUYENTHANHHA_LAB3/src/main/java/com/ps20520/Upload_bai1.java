package com.ps20520;

import java.io.File;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@MultipartConfig()
@WebServlet("/upload/file")
public class Upload_bai1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        req.getRequestDispatcher("/views/upload_bai1.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub

//		resp.getWriter().print(req.getServletContext().getRealPath("views"));
        System.out.println("xin chào");
        //Lấy dir là đường dẫn đến files chưa tính file con bên trong nếu không có files thì tạo file theo đường dẫn đó
        File dir = new File(req.getServletContext().getRealPath("/files"));

        if (!dir.exists()) {
            dir.mkdirs();


        }
        // req,getParrt("ffff=name")chỉ đến tham số name của input trong jsp
        Part photo = req.getPart("photo_file");
        //Tạo photoFile = đường dẫn dir/tên của file
        File photoFile = new File(dir, photo.getSubmittedFileName());
        //lấy đường dẫn tuyệt dối đến files/tên file
        //Sau đó lưu cái photo này vào đường dẫn tuyệt đối đó
        photo.write(photoFile.getAbsolutePath());

        Part doc = req.getPart("doc_file");
        System.out.println("getParrt " + doc);
        File docFile = new File(dir, doc.getSubmittedFileName());
        doc.write(docFile.getAbsolutePath());

        // đặt attribute
        req.setAttribute("img", photoFile);
        System.out.println("in phottofile = " + photoFile);
        req.setAttribute("doc", docFile);
        System.out.println("in phottofile.name = " + photoFile.getName());
        req.getRequestDispatcher("/views/upload_result.jsp").forward(req, resp);

    }
}
