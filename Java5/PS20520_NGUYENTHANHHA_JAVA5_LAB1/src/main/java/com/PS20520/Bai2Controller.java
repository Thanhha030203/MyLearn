package com.PS20520;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bai2Controller {

	@RequestMapping("/")
	public String bai2Controller(Model model) { 
		model.addAttribute("messagebai2","Hello Spring boot, That is bai2Lab1");
		return "lab1bai2";
	}
}
