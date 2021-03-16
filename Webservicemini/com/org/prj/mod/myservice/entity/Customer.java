package com.org.prj.mod.myservice.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "customer_I", schema = "springbootdb")
public class Customer {
	
	private Long cust_id;
	private String cust_fname;
	private String cust_lname;
	//private List<Integer> cust_trans ;
	private String cust_trans;
	private Integer cust_sum;
	
	
	@Id
	@Column(name = "id")
	public Long getCust_id() {
		return cust_id;
	}
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
	
	 @Column(name = "fname")
	public String getCust_fname() {
		return cust_fname;
	}
	public void setCust_fname(String cust_fname) {
		this.cust_fname = cust_fname;
	}
	
	 @Column(name = "lname")	
	public String getCust_lname() {
		return cust_lname;
	}
	public void setCust_lname(String cust_lname) {
		this.cust_lname = cust_lname;
	}
//	public List<Integer> getCust_trans() {
//		return cust_trans;
//	}
//	public void setCust_trans(List<Integer> cust_trans) {
//		this.cust_trans = cust_trans;
//	}
	 @Column(name = "tranxlist")
	public String getCust_trans() {
		return cust_trans;
	}
	public void setCust_trans(String cust_trans) {
		this.cust_trans = cust_trans;
	}
	
	 @Column(name = "sum")
	public Integer getCust_sum() {
		return cust_sum;
	}
	public void setCust_sum(Integer cust_sum) {
		this.cust_sum = cust_sum;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_fname=" + cust_fname + ", cust_lname=" + cust_lname
				+ ", cust_trans=" + cust_trans + ", cust_sum=" + cust_sum + "]";
	}
	
	
	
	
	
	

	
	
	
	

}
