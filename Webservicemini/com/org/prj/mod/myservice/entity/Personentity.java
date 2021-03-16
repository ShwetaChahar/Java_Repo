package com.org.prj.mod.myservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "mintest", schema = "springbootdb")
public class Personentity {
	@Id
	private String person_id;
	private String person_nm;
	//private String person_skl;
	public String getPerson_id() {
		return person_id;
	}
	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}
	public String getPerson_nm() {
		return person_nm;
	}
	public void setPerson_nm(String person_nm) {
		this.person_nm = person_nm;
	}
//	public String getPerson_skl() {
//		return person_skl;
//	}
//	public void setPerson_skl(String person_skl) {
//		this.person_skl = person_skl;
//	}
	@Override
	public String toString() {
		return "Personentity [person_id=" + person_id + ", person_nm=" + person_nm + "]";
	}

	
	
	
	

}
