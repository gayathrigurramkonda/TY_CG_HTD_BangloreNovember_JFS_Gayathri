package com.cpg.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employeeother")
public class EmployeeOther {
	@Column
	private int id;
	@Column
	private String Fname;
	@Column
	private String pancard;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	@OneToOne(cascade=CascadeType.ALL mappedby="emp")
	@JoinColumn(name="eid")
	private Employee employee;
	
	

}
