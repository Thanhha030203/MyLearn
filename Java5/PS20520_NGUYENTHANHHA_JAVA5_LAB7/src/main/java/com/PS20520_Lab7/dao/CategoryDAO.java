package com.PS20520_Lab7.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PS20520_Lab7.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, String>{
}
