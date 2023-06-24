/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhuongThuc;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author PhanCảnhKhắcTùng
 */
public class SendGmail {
    public static void main(String args[]) throws AddressException, MessagingException {
    sendText();
  }
 
  public static void sendText() throws AddressException, MessagingException {
    Properties mailServerProperties;
    Session getMailSession;
    MimeMessage mailMessage;
 
    
    mailServerProperties = System.getProperties();
    mailServerProperties.put("mail.smtp.port", "587");
    mailServerProperties.put("mail.smtp.auth", "true");
    mailServerProperties.put("mail.smtp.starttls.enable", "true");
 
    
    getMailSession = Session.getDefaultInstance(mailServerProperties, null);
    mailMessage = new MimeMessage(getMailSession);
 
    mailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress("abc@gmail.com")); 
 
    
 
    mailMessage.setSubject("Demo send gmail from Java");
    mailMessage.setText("Demo send text by gmail from Java");
 
   
    Transport transport = getMailSession.getTransport("smtp");
 
 
    transport.connect("smtp.gmail.com", "your_gmail", "your_password"); 
    transport.sendMessage(mailMessage, mailMessage.getAllRecipients());
    transport.close();
  }
}
