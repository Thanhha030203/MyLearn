package com.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import entity.User;
import entity.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet({"/account/sign-in","/account/sign-up","/account/sendmail","/account/sign-out","/account/forgot-password","/account/change-password","/account/edit-profile","/account/update","/account/delete","/account/com"})
public class inter_bai4 extends HttpServlet {
	UserDao dao ;
	String ma;
	User person;
	List<User> list;
	
//	public void init() throws ServletException {
//	// TODO Auto-generated method stub
//		dao = new UserDao();
//		person = new User();
//		list =new ArrayList<User>();
//		
//	
//	}
		@Override
		protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
			String uri = arg0.getRequestURI();
			if(uri.contains("sign-up")) { 
				this.sign_up(arg0, arg1);
			}
			else if(uri.contains("sign-in")) { 
				this.sign_in(arg0, arg1);
			}

			else if(uri.contains("edit-profile")) { 
				this.edit(arg0, arg1);
			}
			else if(uri.contains("com")) { 
				this.pass(arg0, arg1);
			}
			else if(uri.contains("sendmail")) { 
				this.mail(arg0, arg1);
			}
			
			else if(uri.contains("change-password")) { 
				this.change_pass(arg0, arg1);
			}
			else if(uri.contains("forgot-password")) { 
				this.forgot(arg0, arg1);
			}
			else if(uri.contains("update")) { 
				this.update(arg0, arg1);
			}
			else if(uri.contains("sign-out")) { 
				person = null;
				arg0.getRequestDispatcher("/views/sign-in.jsp").forward(arg0, arg1);
			}	
			 if(uri.contains("delete")) { 
				UserDao.delete(person.getId());
				arg0.getRequestDispatcher("/views/sign-in.jsp").forward(arg0, arg1);
			}
		}
		
		private void mail(HttpServletRequest arg0, HttpServletResponse arg1) {
			// TODO Auto-generated method stub
			person = dao.findById(arg0.getParameter("u"));
			 Properties p = new Properties();
	            p.put("mail.smtp.auth", "true");
	           p.put("mail.smtp.starttls.enable", "true");
	           p.put("mail.smtp.host", "smtp.gmail.com");
	           p.put("mail.smtp.port", 587);
	
	


	String password = "pxyiuhudcbbdtfbw";

 Session s = Session.getInstance(p, new javax.mail.Authenticator(){ 

     @Override
     protected PasswordAuthentication getPasswordAuthentication() {
         return new PasswordAuthentication("hantps20520@fpt.edu.vn",password); //To change body of generated methods, choose Tools | Templates.
     }
     

});
 Message msg = new MimeMessage(s);
 try {
		msg.setFrom(new InternetAddress("hantps20520@fpt.edu.vn"));
		msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(arg0.getParameter("to")));
		 msg.setText("Mã xác nhận của bạn là 7795");
		  msg.setSubject("Xác nhận danh tính");
		  Transport.send(msg);
		  arg0.setAttribute("message","Gửi thành công");
		  arg0.getRequestDispatcher("/views/accept.jsp").forward(arg0, arg1);
		}
 
 	
 catch (Exception e) {
	// TODO: handle exception
}
		}
		private void pass(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String method = arg0.getMethod();
			System.out.println("a"+ method);
			if(method.equalsIgnoreCase("post")) { 
				String password = arg0.getParameter("current_password");
				if(password.equals(person.getPassword())) { 
					arg0.getRequestDispatcher("/views/change-password.jsp").forward(arg0, arg1);
				}
				else { 
					arg0.setAttribute("message_change_password","Password not true");
					arg0.getRequestDispatcher("/views/password.jsp").forward(arg0, arg1);
				}
			}
			else { 
				
				arg0.getRequestDispatcher("/views/password.jsp").forward(arg0, arg1);
			}
			
			
		}
		private void update(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
			// TODO Auto-generated method stub
			System.out.println("full  "+arg0.getParameter("edit_name"));
			person.setFullname(arg0.getParameter("edit_name"));
			person.setEmail(arg0.getParameter("Email_edit"));
			System.out.println("addmin "+arg0.getParameter("admin_edit"));
			person.setAdmin(arg0.getParameter("admin_edit").equals("true")?true:false);
			System.out.println("id person = "+person.getId());
			System.out.println("email  "+arg0.getParameter("edit_name"));

			System.out.println("email"+ person.getEmail());
			UserDao.update(person.getId(), person);
			person = UserDao.findById(person.getId());
			arg0.setAttribute("user", person);
			arg0.setAttribute("Message-edit", "Update Successful");
			arg0.getRequestDispatcher("/views/edit-profile.jsp").forward(arg0, arg1);
		}
		private void forgot(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String method = arg0.getMethod();
			if(method.equalsIgnoreCase("post")) {
				String code = arg0.getParameter("accpet");
				if(code.equals("7795")) { 
					arg0.getRequestDispatcher("/views/change-password.jsp").forward(arg0, arg1);
				}
				else { 
					
					arg0.setAttribute("mess","Code not true");
					arg0.getRequestDispatcher("/views/accept.jsp").forward(arg0, arg1);
				}
			}
			else {
			arg0.getRequestDispatcher("/views/sendmail.jsp").forward(arg0, arg1);
			}
		}
		private void change_pass(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String method = arg0.getMethod();
			if(method.equalsIgnoreCase("post")) { 
				String confirm = arg0.getParameter("change_confirm_password");
				String password = arg0.getParameter("pass_change_password");
				System.out.println("in"+ password);
				if(password.equals(confirm)) { 
					person.setPassword(password);
					UserDao.update(person.getId(), person);
					person = null;
					arg0.getRequestDispatcher("/views/sign-in.jsp").forward(arg0, arg1);
				}
				else { 
					arg0.setAttribute("message_confirm_password","New password and Confirm Password not sample");
					arg0.getRequestDispatcher("/views/change-password.jsp").forward(arg0, arg1);
				}
			}
			else { 
				arg0.getRequestDispatcher("/views/change-password.jsp").forward(arg0, arg1);
			}
			
		}
		protected void sign_up(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String method = arg0.getMethod();
			if(method.equalsIgnoreCase("post")) {
			String id =arg0.getParameter("id");
			String password = arg0.getParameter("password");
			String fullname = arg0.getParameter("fullname");
			String email = arg0.getParameter("Email");
			boolean admin = arg0.getParameter("admin") == "true"?true:false; 
			User usernew = new User(id, password, fullname, email, admin);
			UserDao.create(usernew);
			arg0.setAttribute("Message","Create successful account!!!");
			arg0.setAttribute("icon","checked.png");
			//todo method
			arg0.getRequestDispatcher("/views/sign-up.jsp").forward(arg0, arg1);
			}
			else {
			arg0.getRequestDispatcher("/views/sign-up.jsp").forward(arg0, arg1);
			}
		}
		protected void sign_in(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
			// TODO Auto-generated method stu
			String method = arg0.getMethod();
			if(method.equalsIgnoreCase("post")) {
			String id = arg0.getParameter("user_sign-in");
			String pass = arg0.getParameter("password_sign-in");
			person = UserDao.findOne(id, pass);
			System.out.println(person);
			if(person !=null) {
				HttpSession session = arg0.getSession();
				arg0.setAttribute("idd", person.getId());
				session.setAttribute("user",person);
		
				arg0.getRequestDispatcher("/views/edit-profile.jsp").forward(arg0, arg1);
			}
			else { 
				arg0.setAttribute("message_sign_in", "Not exist account");
				arg0.getRequestDispatcher("/views/sign-in.jsp").forward(arg0, arg1);
			}
			}
			else {
				arg0.getRequestDispatcher("/views/sign-in.jsp").forward(arg0, arg1);
			}
		}
		protected void start(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
			// TODO Auto-generated method stub
			arg0.getRequestDispatcher("/views/sign-up.jsp").forward(arg0, arg1);
		}
		protected void edit(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
			// TODO Auto-generated method stub
			arg0.setAttribute("user", person);

		}
}
