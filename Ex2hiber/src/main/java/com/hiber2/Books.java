package com.hiber2;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;
@Entity

/*
 //we can remove it
 @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//change name from Dtype to inhertype
@DiscriminatorColumn(name="inhertype",discriminatorType =DiscriminatorType.STRING)
//change name from books to parent
@DiscriminatorValue("Parent")*/

//@Inheritance(strategy=InheritanceType.JOINED)
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
// remove table sequence hibernate to run

public class Books {

	private int id;
	private int isb;
	

	@Id
	@TableGenerator(name="id",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id")
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIsb() {
		return isb;
	}
	public void setIsb(int isb) {
		this.isb = isb;
	}
	
	
	
	
	
}
