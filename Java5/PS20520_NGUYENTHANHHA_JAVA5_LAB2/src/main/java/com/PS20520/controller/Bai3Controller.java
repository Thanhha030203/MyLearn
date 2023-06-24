package com.PS20520.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.PS20520.entity.Product;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class Bai3Controller {

	
	@Autowired
	HttpServletResponse resp;
	@Autowired
	HttpServletRequest req;
	@RequestMapping("/product/form")
	@GetMapping("/product/form")
	public String form(Model model) { 
		Product p = new Product();
		p.setName("iphone 30");
		p.setPrice(5000.0);
		model.addAttribute("sp1", p);
		return "lab2bai3";
	}
		@PostMapping("/product/save")
		public String save(@RequestParam("name") String name, @RequestParam("price") Double price, Model model) { 
			Product pro = new Product(name, price);
			model.addAttribute("pro", pro);
			System.out.println("naem e: "+ name);
			System.out.println("naem e: "+ price);
			return "bai3_2";
			
		}
	
}
