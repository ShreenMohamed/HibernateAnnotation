package com.hiber2;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("Subofbooks")
public class Probooks extends Books{
private String lan;

public String getLan() {
	return lan;
}

public void setLan(String lan) {
	this.lan = lan;
}

}
