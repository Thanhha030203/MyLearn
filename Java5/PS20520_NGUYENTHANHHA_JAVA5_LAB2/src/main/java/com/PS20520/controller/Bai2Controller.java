package com.PS20520.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class Bai2Controller {
	@Autowired
	HttpServletResponse resp;
	@Autowired
	HttpServletRequest req;
	@GetMapping("/tinhtong")
	public String form() { 
	return "lab2bai2";
		
	}
	@GetMapping("/sanpham")
	public String show() { 
	return "lab2bai2phan2";	
	}
	@GetMapping("/sanpham/{tensp}")
	public String form(@PathVariable("tensp") String tensp , Model model) { 
		model.addAttribute("sanpham", tensp);
		String name = tensp;
		System.out.println("Ten sp "+ name );
		return "lab2bai2phan2";
	}
	@PostMapping("/tinhtong/{x}")
	public String save(@PathVariable("x") String operation, @RequestParam("a") Float a, @RequestParam("b") Float b, Model model) {
			switch (operation) {
			case "+": {
				model.addAttribute("kq",a+b);
				break;
			}
			case "-": {
				model.addAttribute("kq",a-b);
				break;
			}
			case "x": {
				model.addAttribute("kq",a*b);
				break;
			}
			case "chia": {
				model.addAttribute("kq",a/b);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + operation);
			}
		return "ketquabai2";	
	}
}
