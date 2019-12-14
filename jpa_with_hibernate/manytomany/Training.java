package com.cpg.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.cpg.onetomany.EmployeeOther;

@Entity
@Table(name="training_info")
public class Training {
	@Id
	private int tid;
	@Column    
	private String tname;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="training_employee",
	joinColumns =@JoinColumn(name="tid"),
	inverseJoinColumns=@JoinColumn(name="eid"))
private List<EmployeeOther>eList;

	

}
