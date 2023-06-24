package com.PS20520.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PS20520.database.DB;

@Controller
public class ItemController {
	
	@RequestMapping("/item/index")
	public String list(Model model) { 
		model.addAttribute("items",DB.items.values());
		return "item/index";
	}
}
