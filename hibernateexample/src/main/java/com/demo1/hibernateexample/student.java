package com.demo1.hibernateexample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
	@Id
	private int sid;
	private String sname;
	private String sbranch;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", sbranch=" + sbranch + "]";
	}
	

}
