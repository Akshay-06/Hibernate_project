package com.project.Hibernate_Project;

import jakarta.persistence.Embeddable;

@Embeddable
public class AlienName {
	
	private String fname;
	private String lname;

	@Override
	public String toString() {
		return "AlienName [fname=" + fname + ", lname=" + lname + "]";
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
