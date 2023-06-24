package com.PS20520.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.PS20520.entity.Student;

import jakarta.servlet.ServletContext;

@Controller
public class Bai1Controller {
		@Autowired
		ServletContext app;
	
	@RequestMapping("/student/form")
	public String form(@ModelAttribute("sv") Student dv) { 
		return "form";
	}
	
	@RequestMapping("student/save")
	public String save(@Validated @ModelAttribute("sv") Student sv,@RequestParam("image") MultipartFile file, BindingResult result, Model model) { 
		if(!file.isEmpty()) {
			String fileName = StringUtils.cleanPath(file.getOriginalFilename());
			try {
				Path path = Paths.get(app.getRealPath(fileName));
				Files.copy(file.getInputStream(),path,StandardCopyOption.REPLACE_EXISTING);
				String imga = file.getOriginalFilename();
				System.out.println("in tên hình: "+ imga);

			if(result.hasErrors()) { 
				model.addAttribute("message","Vui lòng sửa các lỗi sau: ");
			}
			else {
				model.addAttribute("dd",imga);
				model.addAttribute("message","Chúc mừng, bạn đã nhập đúng");
			}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		return "form";
	}
	@ModelAttribute("genders")
	public Map<Boolean, String> getGender(){ 
		Map<Boolean,String> map = new HashMap<>();
		map.put(true,"Male");
		map.put(false, "Female");
		return map;
	}
	@ModelAttribute("faculties")
	public List<String> getFaculties(){ 
		
		return Arrays.asList("CNTT","DLNHKS","QTDN");
		
	}
	@ModelAttribute("hobbies")
	public Map<String, String> getHobbies(){ 
		Map<String,String> map = new HashMap<>();
		map.put("T","Travelling");
		map.put("M","Music");
		map.put("F","FOOD");
		map.put("O","Other");
		return map;
	}
}
