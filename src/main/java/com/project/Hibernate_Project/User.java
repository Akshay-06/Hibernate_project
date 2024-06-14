package com.project.Hibernate_Project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



/*
 * We usually have 3 layers.
 * Class Name: If there's no entity name or Table name then class name will be default name in DB
 * Entity Name: If there's is entity name and no Table name then entity name will be default in DB
 * Table Name: If there's Table name then table name will be default in DB
 * 
 * */

@Entity
@Table(name="user_table")
public class User {

	@Id
	private int id;
	@Column(name="user_name")
	private String name;
	@Transient
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
