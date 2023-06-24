package com.PS20520.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "Products")
public class Product implements Serializable {
	@Id
	Integer id;
	String name;
	String image;
	Double price;
	@Temporal(TemporalType.DATE)
	@Column(name = "create_date")
	Date createDate = new Date();
	int quantity;
	@ManyToOne @JoinColumn(name = "category_id")
	Category category;
	
	Boolean is_delete;
}
