package com.hiber2;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("Subofprobooks")
public class Headser extends Probooks{
private String pic;

public String getPic() {
	return pic;
}

public void setPic(String pic) {
	this.pic = pic;
}
	
}
