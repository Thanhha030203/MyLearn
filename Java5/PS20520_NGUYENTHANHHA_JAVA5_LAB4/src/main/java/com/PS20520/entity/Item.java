package com.PS20520.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	Integer id;
	String name;
	double price;
	int qty =1;
	
}
