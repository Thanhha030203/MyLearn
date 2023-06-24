package com.PS20520.entityDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PS20520.entity.OrderDetail;

public interface OrderDetailDao extends JpaRepository<OrderDetail,Long> {

}
