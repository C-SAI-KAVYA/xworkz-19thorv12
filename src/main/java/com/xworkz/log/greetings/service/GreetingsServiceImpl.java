package com.xworkz.log.greetings.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class GreetingsServiceImpl implements GreetingsService{
private static final Logger logger=Logger.getLogger(GreetingsServiceImpl.class);
	
	public GreetingsServiceImpl() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}

	public void greetingMessage() {
		try {
			System.out.println("SYSTEMOUT:: greeting message from service layer using System.out.println");
			logger.info("LOGGERINFO:: greeting message from service layer using logger");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}
}
