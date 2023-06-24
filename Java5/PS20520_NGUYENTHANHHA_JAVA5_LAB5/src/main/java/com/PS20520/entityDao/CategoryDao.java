package com.PS20520.entityDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PS20520.entity.Category;

public interface CategoryDao extends JpaRepository<Category, String> {
	
}
