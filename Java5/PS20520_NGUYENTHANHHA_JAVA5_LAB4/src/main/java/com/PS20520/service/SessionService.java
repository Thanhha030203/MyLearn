package com.PS20520.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;


@Service
public class SessionService {

	@Autowired
	HttpSession session;
	
	public <T> T get(String name) { 	
		return session.getAttribute(name)!=null?(T)session.getAttribute(name):null;
	}
	
	public void set(String name, Object value) { 
		session.setAttribute(name,value);
	}
	public void remove(String name) { 
		session.removeAttribute(name);
	}
}
