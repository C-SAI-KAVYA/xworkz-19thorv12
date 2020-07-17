package com.xworkz.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.springmvc.dto.NaturalCalamitiesDto;
import com.xworkz.springmvc.service.NaturalCalamitiesService;

@Controller
@RequestMapping("/")
public class NaturalCalamitiesController {

	@Autowired
	private NaturalCalamitiesService service;

	public NaturalCalamitiesController() {
		System.out.println("Created Object \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public String register(NaturalCalamitiesDto dto, Model model) {
		System.out.println(dto);
		System.out.println("In Controller Register Method");
		System.out.println("Checking the entered data is valid or not");
		boolean valid = this.service.validatePersist(dto);
		if (valid == true) {
			model.addAttribute(dto);
			System.out.println("Directing to Success Page");
			return "success";
		} else {
			System.out.println("User Entered Data Is Not Valid");
			model.addAttribute("Error", "Data Entered Is Invalid Please Check");
			return "index";
		}
	}
}
