package com.ps20520;

import java.io.File;

import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@MultipartConfig()
@WebServlet("/sendmail")
public class bai5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        req.getRequestDispatcher("/views/sendmail.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        Properties p = new Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", 587);
        String accountName = req.getParameter("from");
        String accountNameTo = req.getParameter("to");
        String CC = req.getParameter("cc");
        String Bcc = req.getParameter("bcc");
        String password = "pxyiuhudcbbdtfbw";
        String subject = req.getParameter("subject");
        String body = req.getParameter("body");
        Session s = Session.getInstance(p, new javax.mail.Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(accountName, password); //To change body of generated methods, choose Tools | Templates.
            }


        });
        Message msg = new MimeMessage(s);
        try {
            msg.setFrom(new InternetAddress(accountName));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(accountNameTo));
            msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(CC));
            msg.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(Bcc));
            msg.setSubject(subject);
            Part part = req.getPart("file_mail");
            File file = new File(req.getServletContext().getRealPath("/files"));
            if (!file.exists()) {
                file.mkdirs();
            }
            File File_mail = new File(file, part.getSubmittedFileName());
            part.write(File_mail.getAbsolutePath());
            msg.setText(body);
            if (part.getName() != null) {
                MimeBodyPart contentPart = new MimeBodyPart();
                contentPart.setContent(body, "text/plain");
                Multipart mp = new MimeMultipart();
                mp.addBodyPart(contentPart);
                MimeBodyPart filePart = new MimeBodyPart();

                FileDataSource source = new FileDataSource(File_mail.getAbsoluteFile());
                filePart.setDataHandler(new DataHandler(source));
                filePart.setFileName(source.getName());

                mp.addBodyPart(filePart);
                msg.setContent(mp);
            }
            Transport.send(msg);
            req.setAttribute("message", "Gửi thành công");
        } catch (MessagingException e) {
            // TODO Auto-generated catch block

            req.setAttribute("message", "Gửi thất bại");
            System.out.println("Lỗi :" + e);
        }
        req.getRequestDispatcher("/views/sendmail.jsp").forward(req, resp);
    }
}
