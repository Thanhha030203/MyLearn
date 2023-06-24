package com.PS20520.entityDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PS20520.entity.Order;

public interface OrderDao extends JpaRepository<Order,Long> {

}
