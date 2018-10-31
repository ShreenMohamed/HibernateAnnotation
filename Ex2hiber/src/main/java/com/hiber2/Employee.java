package com.hiber2;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;


@Entity
public class Employee {
	@Id
	@GeneratedValue

	private int id;
	private String name;
	private Address ad;
	private Address adHome;
	
	/*private List<Address> adre=new ArrayList<>();
	
	@JoinTable(name="ad_em",joinColumns = @JoinColumn (name = "em_ed_id"))
	public List<Address> getAdre() {
		return adre;
	}
	public void setAdre(List<Address> adre) {
		this.adre = adre;
	}*/
	@Embedded
	
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="state",column= @Column(name="HomeState")),
	@AttributeOverride(name="city",column= @Column(name="HomeCity" )),
	@AttributeOverride(name="street",column= @Column(name="HomeStreet"))
	})
	public Address getAdHome() {
		return adHome;
	}
	public void setAdHome(Address adHome) {
		this.adHome = adHome;
	}

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
