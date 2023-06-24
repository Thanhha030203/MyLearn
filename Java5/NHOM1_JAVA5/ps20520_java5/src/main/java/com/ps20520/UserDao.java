package com.ps20520;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ps20520.entity.Users;

public interface UserDao extends JpaRepository<Users, String>{
	
	List<Users> findByFullnameLike(String name);
	
	@Query("Select u from Users u where u.id like ?1 and u.password like ?2")
	Users user(String a, String b);
}
