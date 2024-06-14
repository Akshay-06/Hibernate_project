package com.project.Hibernate_Project;


import javax.persistence.Id;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@javax.persistence.Entity
@javax.persistence.Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien {
	
	@Id
	private int aid;
	private AlienName name;
	private String colour;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	

	public AlienName getName() {
		return name;
	}

	public void setName(AlienName name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + ", colour=" + colour + "]";
	}

}