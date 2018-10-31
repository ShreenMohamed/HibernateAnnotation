package com.hiber2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	private String name;
	private Compke co;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Id
	public Compke getCo() {
		return co;
	}
	public void setCo(Compke co) {
		this.co = co;
	}
	

}
