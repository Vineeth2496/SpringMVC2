package com.jspiders.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspiders.springmvc.service.PersonService;

@Autowired
private personService service;

@Controller
public class personController {
	@GetMapping("/insert")
	public String insertRecord() {
		return "insert";
	}
	
	
	@PostMapping("/insert")
	public String insertPerson(@RequestParam String name,
								@RequestParam String email,
								ModelMap map) {
		pojo = service.insertPerson
				(name, email, mobile, address);
		//Success
		if (pojo != null) {
			map.addAttribute("msg", "Data inserted successfully. ");
			return "insert";
		}
		//Failure
		map.addAttribute("msg", "Data not inserted. ");
		return "insert";
	}

	
	@GetMapping("/search")
	public String searchPage() {
		return "search";
	}
	 
	@PostMapping("/search")
	public String searchPerson(@RequestParam int id,
			ModelMap map) {
		personpojo pojo=service.searchperson(id);
		//success
		if(pojo != null) {
			map.addAttribute("person",pojo);
			map.addAttribute("msg","person record found.");
			return "search";
		}
		
		//failure
		
		map.addAttribute("msg", "person data does not exist");
		return "search";
	}
	

	
	

}
