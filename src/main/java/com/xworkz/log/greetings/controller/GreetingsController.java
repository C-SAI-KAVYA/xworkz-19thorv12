package com.xworkz.log.greetings.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.log.greetings.service.GreetingsService;

@Controller
@RequestMapping("/")
public class GreetingsController {
	private static final Logger logger = Logger.getLogger(GreetingsController.class);
	
	@Autowired
	private GreetingsService service;
	
	public GreetingsController() {
		logger.info("Logger: "+"Object Created"+this.getClass().getSimpleName());
	}
	
	@RequestMapping(value = "/greet.do", method = RequestMethod.POST)
	public String greet(@RequestParam String emailid, @RequestParam String password) {
		logger.info("Logger : "+"In Greet()");
		try {
			logger.warn("Might Throw an Exception");
			logger.debug("Debugging");
			logger.info("Logger : "+emailid);
			logger.info("Logger : "+password);
			if(emailid != null && password != null) {
				service.greetingMessage();
				return "greetings";
			}else {
				return "Error";
			}
		}catch(Exception e) {
			logger.error(e.getMessage(), e);
			return "index";
		}
	}
}
