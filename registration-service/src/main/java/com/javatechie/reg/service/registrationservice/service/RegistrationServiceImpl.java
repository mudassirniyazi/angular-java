package com.javatechie.reg.service.registrationservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.reg.service.registrationservice.model.User;
import com.javatechie.reg.service.registrationservice.repository.UserRepository;

@Service
@Transactional
public class RegistrationServiceImpl 
{
	@Autowired
	UserRepository userRepository;

	
	public User saveRegister(User user) {
		return userRepository.save(user);
	}

	public List<User> ListofAllUsers() {
		return userRepository.findAll();
	}

	public List<User> findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

}
