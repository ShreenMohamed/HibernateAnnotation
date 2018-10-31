package com.hiber2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class Center {

	private int id;
	private String name;
	private List<Course> corse= new ArrayList<Course>();
	//@ManyToMany(cascade =CascadeType.ALL,targetEntity=Course.class)
	@OneToMany(cascade =CascadeType.ALL,targetEntity=Course.class)
	//@OneToMany(cascade =CascadeType.ALL,targetEntity=Course.class,mappedBy="cent")
	//remove @Join..
	@JoinTable(name="cen_cor",joinColumns={@JoinColumn(name="cen_id")},inverseJoinColumns={@JoinColumn(name="cou_id")})
	public List<Course> getCorse() {
		return corse;
	}
	public void setCorse(List<Course> corse) {
		this.corse = corse;
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
