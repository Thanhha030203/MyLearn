package com.PS20520.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.PS20520.entity.Product;


@Controller
public class Bai4Controller {
		
	@RequestMapping("/pro/form")
		public String form(Model model) {
			Product p = new Product();
			p.setName("Iphone 30");
			p.setPrice(5000.0);
			model.addAttribute("product", p);
			model.addAttribute("productSave", new Product());
			return "lab2bai4";	
		}
	@PostMapping("pro/save")
	public ModelAndView save (@ModelAttribute("productSave") Product productSave) { 
		Product p = new Product(productSave.getName(), productSave.getPrice());
		ModelAndView modelAndView = new ModelAndView("lab2bai4","pro2",p);
		return modelAndView;
	}
	
	@ModelAttribute("pros")
	public List<Product> getItems(){ 
		return Arrays.asList(new Product("A",1.0), new Product("B",12.0));
	}
}
