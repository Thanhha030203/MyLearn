package com.PS20520.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.NhanVanStore_ASM.Service.CookieService;
import com.PS20520.service.ParamService;
import com.PS20520.service.SessionService;

import jakarta.servlet.ServletContext;

@Controller
public class AccountController {

	 @Autowired
	 CookieService cookieService;
	 @Autowired
	 ParamService paramService;
	 @Autowired
	 SessionService sessionService;
	 	
	@Autowired
	ServletContext app;
	@RequestMapping("/")
	
	public String index(Model model) { 
		return "home";
	}
	 @RequestMapping("/account/login")
		@GetMapping("/account/login")
		public String login1(Model model) { 
		 model.addAttribute("username", cookieService.getValue("username"));
			model.addAttribute("password", cookieService.getValue("password"));
			return "login";
		}
		@PostMapping("/account/login")
		public String login2(@RequestParam(name = "file", required = false) MultipartFile file,Model model) throws RuntimeException, IOException {
			String un = paramService.getString("username", "");
			String pw = paramService.getString("password", "");
			Boolean rm = paramService.getBoolean("remember", false);
			System.out.println("in " +un+ pw+rm);
			if(un.equals("poly") && pw.equals("123")) { 
				sessionService.set(un, pw);
				if(rm) { 	
					cookieService.add("password", pw, 1);
					cookieService.add("username", un, 1);
					model.addAttribute("username", cookieService.getValue("username"));
					model.addAttribute("password", cookieService.getValue("password"));
				}
				else { 
					cookieService.remove(un);
				}
				System.out.println("file : "+ file);
				paramService.save(file,app.getRealPath("/file/"));
				model.addAttribute("anhupload",file.getOriginalFilename());
				System.out.println("Trả về cookie poly "+ cookieService.getValue("username"));
			}
			return "login";
		}
}
