package com.PS20520.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Controller
public class Bai1Controller {

	@Autowired
	HttpServletResponse resp;
	@Autowired
	HttpServletRequest req;

	@RequestMapping("ok")
	@GetMapping("/ok")
	public String ok() {
		return "lab2bai1";
	}

	@PostMapping("/ctrl/ok")
	public String m1() {
		String result = req.getMethod();
		req.setAttribute("result", result);
		return "lab2bai1";
	}
	@GetMapping("/ctrl/ok")
	public String m2() {
		String result = req.getMethod();
		req.setAttribute("result", result);
		return "lab2bai1";
	}
	@RequestMapping("/ctrl/ok?x")
	public String m3() {
		String result = req.getMethod();
		req.setAttribute("result", result);
		return "lab2bai1";
	}
}
