package com.javatechie.reg.service.registrationservice.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.reg.service.registrationservice.model.User;
import com.javatechie.reg.service.registrationservice.service.RegistrationServiceImpl;
import com.javatechie.reg.service.registrationservice.utility.BasicConstants;

	@RestController
	@CrossOrigin(origins="*")
	public class RegistrationServiceController {

		private final static Logger log = Logger.getLogger(RegistrationServiceController.class.getName());
		
		@Autowired
		RegistrationServiceImpl service;
		
		@Autowired
		BasicConstants constants;
		
		@PostMapping("/save")
		public String register(@RequestBody User user) {	
			log.info(" register || starts ");			
			service.saveRegister(user);
			log.info("register || ends");
			return BasicConstants.SUCCESS;
		}

		@GetMapping("/getAllUsers")
		public List<User> findAllUsers(){
			log.info(" findAllUsers || starts ");
			return service.ListofAllUsers();
		}
		
		@GetMapping("/findUser/{email}")
		public List<User> findUserByEmailId(@PathVariable String email){
			log.info(" findUserByEmailId || starts ");
			return service.findUserByEmail(email);
		}
		
//		@DeleteMapping("/cancel/{id}")
//		public List<User> cancelRegistration(@PathVariable int id)
//		{
//					repo.deleteById(id);
//					return repo.findAll();
//								
//		}
		
		
	}
