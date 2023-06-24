package com.PS20520.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "OrderDetail")
public class OrderDetail {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	Integer quantity;
	@ManyToOne @JoinColumn(name = "product_id")
	Product product;
	@ManyToOne @JoinColumn(name = "order_id")
	Order order;
}
