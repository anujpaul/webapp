package com.paul.homecontroller;

import java.util.List;

import com.paul.dao.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paul.model.User;
import com.paul.service.UserDetailsService;

@RestController
public class Controller {
	
	
	private static Logger logger = LoggerFactory.getLogger(Controller.class);
	
	@Autowired
	UserDetailsService service;

	@GetMapping("/")
	public List<User> home()
	{

		logger.info("Hola");

		return service.findUser();

		
	}

}
