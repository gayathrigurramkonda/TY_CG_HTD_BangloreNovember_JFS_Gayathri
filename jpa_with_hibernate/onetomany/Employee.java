package com.cpg.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cpg.manytoone.EmployeeExperience;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column
	private int eid;
	@Column(name="ename")
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Exclude
	@OneToOne(cascade=CascadeType.ALL,mappedBy="emp")
	private EmployeeExperience experience;
	
	

}
