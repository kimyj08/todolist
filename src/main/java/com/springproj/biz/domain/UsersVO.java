package com.springproj.biz.domain;

public class UsersVO {
	
	private String seq;
	private String id;
	private String password;
	private String name;
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "UsersVO [seq=" + seq + ", id=" + id + ", password=" + password + ", name=" + name + "]";
	}

}
