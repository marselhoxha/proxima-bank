package com.marsel.proximaBank.dao;

import java.util.List;

import com.marsel.proximaBank.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {
    
	User findByUsername(String username);
	
    User findByEmail(String email);
    
    List<User> findAll();
}
