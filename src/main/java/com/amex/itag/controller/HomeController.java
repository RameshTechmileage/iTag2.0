package com.amex.itag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	/*
	 * @RequestMapping("/home") public String hello(@RequestParam(value =
	 * "name", required = false, defaultValue = "") String name, Model model) {
	 */
	@RequestMapping("/home")
	public String hello(Model model) {

		// model.addAttribute("name", name);

		return "static/index.html";
	}
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {

		// model.addAttribute("name", name);

		return "static/dashboard.html";
	}
}
