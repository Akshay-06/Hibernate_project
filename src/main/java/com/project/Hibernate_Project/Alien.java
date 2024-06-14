package com.project.Hibernate_Project;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
	
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + ", colour=" + colour + "]";
	}

	@Id
	private int aid;
	private String name;
	private String colour;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}