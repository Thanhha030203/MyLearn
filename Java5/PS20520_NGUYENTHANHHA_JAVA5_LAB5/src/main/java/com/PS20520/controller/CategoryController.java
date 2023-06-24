	package com.PS20520.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.PS20520.entity.Category;
import com.PS20520.entityDao.CategoryDao;


@Controller
public class CategoryController {

	 @Autowired
	 CategoryDao dao;
	 
	 @RequestMapping("/category/index")
	 public String index(Model model) { 
		 Category item  = new Category();
		 model.addAttribute("item", item);
		 List<Category> items = dao.findAll();
		 model.addAttribute("items", items);
		 return "index";
	 }
	@RequestMapping("/category/edit/{id}")
	public String edit(Model model, @PathVariable("id") String id) { 
		Category item = dao.findById(id).get();
		System.out.println("in id"+ id);
		model.addAttribute("item", item);
		List<Category> items = dao.findAll();
		model.addAttribute("items", items);
		return "index";
	}
	
	@RequestMapping("/category/create")
	public String create(@ModelAttribute("item") Category cate, Model model) {
		cate.setIs_delete(false);
		dao.save(cate);
		List<Category> items = dao.findAll();
		model.addAttribute("items", items);
		return "index";
	}
	@RequestMapping("/category/update")
	public String update(@ModelAttribute("item") Category cate, Model model) {
		cate.setIs_delete(false);
		dao.save(cate);
		List<Category> items = dao.findAll();
		model.addAttribute("items", items);
		return "index";
	}
	@RequestMapping("/category/delete/{id}")
	public String delete(@PathVariable("id") String id) { 
		dao.delete(dao.findById(id).get());
		return "redirect:/category/index";
	}
}
