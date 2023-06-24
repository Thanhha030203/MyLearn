package com.ps20520;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Enumeration;
import java.util.List;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;


@WebListener
public class AppListener  implements HttpSessionListener,ServletContextListener{
	

	@Override
	public void contextDestroyed(ServletContextEvent e)  { 
		 ServletContext application = e.getServletContext();
		 Integer visitors = (Integer) application.getAttribute("visitors");
		 try {
			String path = application.getRealPath("/visitors.txt");
			System.out.println(path);
			byte[] data = String.valueOf(visitors).getBytes();
			Files.write(Paths.get(path), data, StandardOpenOption.CREATE);
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
	@Override
	public void contextInitialized(ServletContextEvent e ) { 
		ServletContext application= e.getServletContext();
		Integer visitors =0;
		
		try {
			String path = application.getRealPath("/visitor.txt");
			List<String> lines = Files.readAllLines(Paths.get(path));
			visitors = Integer.parseInt(lines.get(0));
		} catch (Exception e2) {
			// TODO: handle exception
			visitors= 100000;
		}
		application.setAttribute("visitors", visitors);
	}
	@Override
	public void sessionCreated(HttpSessionEvent e ) { 
		HttpSession session = e.getSession();
		ServletContext application = session.getServletContext();
		Integer visitors =  (Integer) application.getAttribute("visitors");
		application.setAttribute("visitors", visitors+1);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent e ) { 
		
	}

}
