package com.PS20520.entityDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PS20520.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
