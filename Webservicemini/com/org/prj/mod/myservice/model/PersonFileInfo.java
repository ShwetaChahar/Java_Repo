package com.org.prj.mod.myservice.model;

public class PersonFileInfo {
	private String person_id;
	private String person_nm;
	
	public PersonFileInfo(String person_id,String person_nm ) {
		this.person_id = person_id;
		this.person_nm = person_nm;
	}

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

	
}
