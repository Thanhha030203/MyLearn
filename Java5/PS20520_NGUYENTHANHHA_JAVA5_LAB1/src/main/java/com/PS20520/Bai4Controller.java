package com.PS20520;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class Bai4Controller {

	@Autowired
	HttpServletRequest request;
	@Autowired
	HttpServletResponse response;
	
	@RequestMapping("/bai4")
	public String bai4() { 
		return "bai4";
		
	}
	
	@RequestMapping("/bai4/create")
	public String bai4create() { 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("Username là : "+ username);
		System.out.println("Password là : "+ password);
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		return "formbai4";
		
	}
}
