package com.paul.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paul.dao.UserRepository;
import com.paul.model.User;


@Service
public class UserDetailsService {

	private static final Logger logger = LoggerFactory.getLogger(UserDetailsService.class); 
	
	
	//@Autowired
	private UserRepository repo;
	
	public List<User> findUser(){
		
		
		List<User> users = new ArrayList<>();
		try {
			users = repo.findUsers();
		} catch (NullPointerException e) {
			
			
			
			
			logger.info("Null Pointer exception occured");

		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		 return		users;
	}

}
