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

import com.PS20520.entity.Product;
import com.PS20520.entityDao.ProductDao;

@Controller
public class ProductController {
		@Autowired
		ProductDao dao;
		
		String fieldd,sortt;
		
		@RequestMapping("/pro/nosort")
		public String NoSort(Model model,@RequestParam("p") Optional<Integer> p) { 
			Sort sort = Sort.by("id");

			Pageable page = PageRequest.of(p.orElse(0), 10,sort);
			model.addAttribute("page", dao.findAll(page));
		
			return "sort";
	}
	@RequestMapping("/pro/sort")
	public String SortPro(@RequestParam("field") String field,@RequestParam("sorts") String sorts,@RequestParam("p") Optional<Integer> p, Model model) {
		Sort sort;
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
