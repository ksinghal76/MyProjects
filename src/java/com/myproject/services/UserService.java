package com.myproject.services;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import com.myproject.models.User;

@Controller
public class UserService {
	
	private Logger log = Logger.getLogger(UserService.class);
	
	public void saveOrUpdate(User user) {
		log.info(user.toString());
	}
}
