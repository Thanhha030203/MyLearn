package com.PS20520.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.PS20520.entity.Category;
import com.PS20520.entity.Product;
import com.PS20520.entityDao.CategoryDao;
import com.PS20520.entityDao.ProductDao;

@Controller
public class ProductController {
		@Autowired
		ProductDao dao;
		@Autowired
		CategoryDao dao1;
		String fieldd,sortt;
		
		@RequestMapping("/pro/nosort")
		public String NoSort(Model model,@RequestParam("p") Optional<Integer> p) { 
			Sort sort = Sort.by("id");
			List<Category> items1 = dao1.findAll();
			model.addAttribute("items1", items1);
			Pageable page = PageRequest.of(p.orElse(0), 10,sort);
			model.addAttribute("page", dao.findAll(page));
			return "sort";
	}
	@RequestMapping("/pro/sort")
	public String SortPro(@RequestParam("field") String field,@RequestParam("sorts") String sorts,@RequestParam("p") Optional<Integer> p, Model model) {
		Sort sort;
		List<Category> items1 = dao1.findAll();
		model.addAttribute("items1", items1);
		if(sorts.equalsIgnoreCase("ASC")) {
		 sort = Sort.by(field);
		}
		else { 
			 sort = Sort.by(Direction.DESC,field);
		}
		fieldd = field;
		sortt= sorts;
		model.addAttribute("sorts", sorts);
		Pageable page = PageRequest.of(p.orElse(0), 10,sort);
		model.addAttribute("page", dao.findAll(page));
		return "sort";
		
}
	@RequestMapping("/pro/searchbycategory")
	public String SortPro2(@RequestParam("id") String id, @RequestParam("p") Optional<Integer> p, Model model) {
		if(id=="") {
			List<Product> items = dao.findAll();
			model.addAttribute("items", items);
			List<Category> items1 = dao1.findAll();
			model.addAttribute("items1", items1);
		}else {
			Page<Product> items = dao.findByCategoryId(id, PageRequest.of(p.orElse(0), 5));	
			model.addAttribute("items", items);
			List<Category> items1 = dao1.findAll();
			model.addAttribute("items1", items1);
		}	
		return "sort";
	}
	@RequestMapping("/product/price")
	public String price(Model model, @RequestParam("min")double min,
			@RequestParam("max")double max, @RequestParam("p") Optional<Integer> p) {					
		//List<Product> items = dao.findByPriceBetween(min, max);
		Page<Product> items = dao.findByPriceBetween(min, max,PageRequest.of(p.orElse(0), 5));
		model.addAttribute("items", items);			
		return "product/sort";	
	}
	@GetMapping("/pro/page")
	public String page(Model model, @RequestParam("p") Optional<Integer> p) {
		p.equals(-1);
		Sort sort;
		System.out.println("inin"+ sortt);
		System.out.println("inin"+ p);
		if(sortt.equalsIgnoreCase("ASC")) {
		 sort = Sort.by(fieldd);
		}
		else { 
			 sort = Sort.by(Direction.DESC,fieldd);
		}
		Pageable page = PageRequest.of(p.orElse(0), 10,sort);
		model.addAttribute("page", dao.findAll(page));
		return "sort";
	}

}
