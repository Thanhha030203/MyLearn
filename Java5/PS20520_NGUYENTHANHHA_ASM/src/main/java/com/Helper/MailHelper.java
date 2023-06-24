package com.Helper;

import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailHelper {
	
	public static int SendMail(String recievePerson) {
		int randomNumber = new Random().nextInt(9000) + 1000;
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
	msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(recievePerson));
	 msg.setText("hello ! This is your code confirm! Pleas don't share code with anyone \n "+ randomNumber);
	  msg.setSubject("Xác nhận danh tính");
	  Transport.send(msg);
	  System.out.println("random number : "+ randomNumber);
	  return randomNumber;
	}


catch (Exception e) {
	System.out.println("Lỗi không thể random và gửi "+ e);
	return 0;
// TODO: handle exception
}
	}
}
