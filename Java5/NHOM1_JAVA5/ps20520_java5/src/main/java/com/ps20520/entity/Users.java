package com.ps20520.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class Users {

	@Id
	String id;
	String password;
	String fullname;
	String email;
	boolean Admin;
	
	
}
