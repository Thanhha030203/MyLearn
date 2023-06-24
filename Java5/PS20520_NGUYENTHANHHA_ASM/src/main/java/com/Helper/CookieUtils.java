package com.Helper;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieUtils {
		public static Cookie add(String name, String value, int hours, HttpServletResponse resq) { 
			Cookie cookie = new Cookie(name, value);
			cookie.setMaxAge(hours*60*60);
			cookie.setPath("/");
			resq.addCookie(cookie);
			return cookie;
		}
		public static String get(String name, HttpServletRequest req) { 
			Cookie [] cookie = req.getCookies();
			if(cookie !=null) { 
				for(Cookie cookies : cookie) { 
					if(cookies.getName().equalsIgnoreCase(name)) { 
						return cookies.getValue();
					}
				}
			
			}
			return "";
		}
}
