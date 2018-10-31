package com.hiber2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Student2 {
	private int id;
	private String name;
	//if i want object from book
	private Book bo;
	@OneToOne(cascade =CascadeType.ALL)
	public Book getBo() {
		return bo;
	}
	public void setBo(Book bo) {
		this.bo = bo;
	}
	@Id
	@GeneratedValue
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
	

}
