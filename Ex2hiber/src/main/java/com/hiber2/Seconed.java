package com.hiber2;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OrderBy;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.Transient;

@Entity
@Table(name ="person")
@SecondaryTable(name = "jobs")
public class Seconed {
	
	private int id;
	private String name;
	private Date hiredate;
	private Date time;
	private byte[] icons;
	private int cal;
	private String position;
	private String jobTitle;
	@Id
	@TableGenerator(name="de",pkColumnName ="pk",pkColumnValue="pkv",initialValue = 1,allocationSize=1)
	@GeneratedValue(strategy =GenerationType.TABLE ,generator="de")
	@Column(name = "pk", length =225, nullable =false, unique =true)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "name", length =225)
	@OrderBy("name asc")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "hire", length =225, nullable =true, unique =false)
	@Temporal(javax.persistence.TemporalType.DATE)
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	@Column(name = "time", length =225, nullable =true, unique =false)
	@Temporal(javax.persistence.TemporalType.TIME)
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	@Lob
	@Basic(fetch=FetchType.LAZY)
	public byte[] getIcons() {
		return icons;
	}
	public void setIcons(byte[] icons) {
		this.icons = icons;
	}
	
	@Transient
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	@Column(table ="jobs")
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Column(table ="jobs")
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
	
	
	
	

}