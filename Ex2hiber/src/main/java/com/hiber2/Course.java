package com.hiber2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
@Entity
public class Course {
	private int id;
	private String name;
	private Center cent;
	
	
/*@ManyToOne(cascade =CascadeType.ALL)
@JoinColumn(name="ce_id")
	public Center getCent() {
		return cent;
	}
	public void setCent(Center cent) {
		this.cent = cent;
	}*/
	
	
	
	/*@ManyToMany(cascade =CascadeType.ALL,targetEntity=Course.class)
	 // here i inverse names
	@JoinTable(name="cen_cor",joinColumns={@JoinColumn(name="cou_id")},inverseJoinColumns={@JoinColumn(name="cen_id")})*/
	
	
	
	
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
