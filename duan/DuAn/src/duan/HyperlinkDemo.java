/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan;

/**
 *
 * @author Admin
 */
//import java.net.*;
//
//import java.io.*;
//
//public class URLDemo {
//
//    public static void main(String[] args) {
//
//        try {
//
//            URL url = new URL("http://dotnet.dngaz.com");
//            // lấy tên địa chỉ của website
//            System.out.println("URL is " + url.toString());
//            // Trả về giao thức của URL.
//            System.out.println("protocol is " + url.getProtocol());
//            // trả về quyền của URL
//            System.out.println("authority is "+ url.getAuthority());
//            //Trả về tên tập tin của URL.
//            System.out.println("file name is " + url.getFile());
//            //Trả về máy chủ của URL
//            System.out.println("host is " + url.getHost());
//            //Trả về đường dẫn URL.
//            System.out.println("path is " + url.getPath());
//            // tar về port
//            System.out.println("port is " + url.getPort());
//            //Trả về cổng mặc định cho giao thức của URL.
//            System.out.println("default port is " + url.getDefaultPort());
//            //Trả về phần truy vấn của URL
//            System.out.println("query is " + url.getQuery());
//            //Trả về tham chiếu một phần của URL.
//            System.out.println("ref is " + url.getRef());
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        }
//
//    }
//
//}

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import javax.swing.JFrame;



/**
 * This Java Swing program demonstrates how to create a hyperlink.
 *
 * @author www.codejava.net
 *
 */
public class HyperlinkDemo extends JFrame {
	private String text = "Visit CodeJava";
	private JLabel hyperlink = new JLabel(text);

	public HyperlinkDemo() throws HeadlessException {
		super();
		setTitle("Hyperlink Demo");

		hyperlink.setForeground(Color.BLUE.darker());
		hyperlink.setCursor(new Cursor(Cursor.HAND_CURSOR));

		hyperlink.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("http://www.codejava.net"));
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				hyperlink.setText(text);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				hyperlink.setText("<html><a href=''>" + text + "</a></html>");
			}

		});

		setLayout(new FlowLayout());
		getContentPane().add(hyperlink);


		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new HyperlinkDemo().setVisible(true);;
			}
		});;
	}
}