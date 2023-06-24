package com.PS20520.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.PS20520.database.DB;
import com.PS20520.entity.Item;
import com.PS20520.service.ShoppingCartService;



@Controller
public class ShoppingCartController {

		@Autowired
		ShoppingCartService cart;
		
		@RequestMapping("/cart/view")
		public String view(Model model) { 
			model.addAttribute("items", DB.items.values());
			model.addAttribute("cart", cart.getItems());
			return "cart";
		}
		@RequestMapping("/cart/add/{id}")
		public String add(@PathVariable("id") Integer id, Model model) { 
			boolean ct = false;
			for(Item item:cart.getItems()) {
				if(item.getId()==id) {
					cart.update(id, item.getQty()+1);
					ct = true;
					break;
				}
			}
			if(!ct)
				cart.add(id);
			model.addAttribute("items", DB.items.values());
			model.addAttribute("cart",cart.getItems());
			return "cart";
		}
		@GetMapping("/cart/update")
		public String update(Model model, @RequestParam("id") int id, @RequestParam("qty") int qty) {
			cart.update(id, qty);
			model.addAttribute("items", DB.items.values());
			model.addAttribute("cart", cart.getItems());
			return "cart";
		}
		@GetMapping("/cart/remove/{id}")
		public String remove(Model model, @PathVariable("id") int id) {
			cart.remove(id);
			model.addAttribute("items", DB.items.values());
			model.addAttribute("cart", cart.getItems());
			return "cart";
		}
		@RequestMapping("/cart/clear")
		public String clear(Model model) { 
			cart.clear();
			model.addAttribute("items", DB.items.values());
			model.addAttribute("cart", cart.getItems());
			return "cart";
		}
}
