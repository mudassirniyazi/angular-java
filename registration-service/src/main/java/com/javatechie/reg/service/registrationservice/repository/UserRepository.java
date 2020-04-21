package com.javatechie.reg.service.registrationservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javatechie.reg.service.registrationservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("SELECT user from User user WHERE user.email=1")
	List<User> findByEmail(String email);

}
