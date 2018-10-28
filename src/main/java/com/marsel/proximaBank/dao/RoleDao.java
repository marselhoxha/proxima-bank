package com.marsel.proximaBank.dao;

import com.marsel.proximaBank.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Integer> {
    
    Role findByName(String name);
}
