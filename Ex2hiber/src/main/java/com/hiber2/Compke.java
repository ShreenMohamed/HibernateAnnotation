package com.hiber2;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Compke implements Serializable {
	private int id;
	private int useracc;
	
	public Compke() {
	}
	public Compke(int id, int useracc) {
		super();
		this.id = id;
		this.useracc = useracc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUseracc() {
		return useracc;
	}
	public void setUseracc(int useracc) {
		this.useracc = useracc;
	}

}
