package com.springproj.biz.domain;

import java.sql.Date;

public class TodolistVO {

	private String td_no;
	private String td_content;
	private Date td_date;
	private String complete;
	private String user_seq;
	// 검색 기능 추가
	private String searchCondition;
	private String searchKeyword;
	
	public String getTd_no() {
		return td_no;
	}
	public void setTd_no(String td_no) {
		this.td_no = td_no;
	}
	public String getTd_content() {
		return td_content;
	}
	public void setTd_content(String td_content) {
		this.td_content = td_content;
	}
	public Date getTd_date() {
		return td_date;
	}
	public void setTd_date(Date td_date) {
		this.td_date = td_date;
	}
	public String getComplete() {
		return complete;
	}
	public void setComplete(String complete) {
		this.complete = complete;
	}
	public String getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(String user_seq) {
		this.user_seq = user_seq;
	}
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	
	@Override
	public String toString() {
		return "TodolistVO [td_no=" + td_no + ", td_content=" + td_content + ", td_date=" + td_date + ", complete="
				+ complete + ", user_seq=" + user_seq + ", searchCondition=" + searchCondition + ", searchKeyword="
				+ searchKeyword + "]";
	}
	
}
