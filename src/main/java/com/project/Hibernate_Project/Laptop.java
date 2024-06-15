package com.project.Hibernate_Project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	@Id
	private int lid;
	private String lname;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
}
