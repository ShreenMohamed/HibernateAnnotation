package com.hiber2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Book {

	private int id;
	private String bookname;
	//if i want object from student2
	/*private Student2 st;
	 //bo is object of book in student2
	@OneToOne(cascade =CascadeType.ALL,mappedBy="bo")
	public Student2 getSt() {
		return st;
	}
	public void setSt(Student2 st) {
		this.st = st;
	}*/
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	
}
