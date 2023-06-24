package com.PS20520.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class Bai5Controller {
	@RequestMapping("/a")
	public String m1() { 
		return "lab2bai5";
	}
	@RequestMapping("/b")
	public String m2(Model model) { 
		model.addAttribute("message","I come form b");
		return "forward:/a";
	}
	@RequestMapping("/c")
	public String m3(RedirectAttributes params ) { 
		params.addAttribute("message","I come form c");
		return "redirect:a";
	}
	
	@ResponseBody
	@RequestMapping("/d")
	public String m4() { 
		return "I come form d";
		
	}
}
