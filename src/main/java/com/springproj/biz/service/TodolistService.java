package com.springproj.biz.service;

import java.util.List;

import com.springproj.biz.domain.TodolistVO;

public interface TodolistService {

	// CRUD 기능 수행을 위한 메서드 호출 가능.
	// 글 등록
	public void insertService(TodolistVO vo);
	// 글 목록 조회
	public TodolistVO getService(String td_no);
	public List<TodolistVO> getServiceList(TodolistVO vo);
	// 글 수정
	public void updateService(TodolistVO vo);
	// 글 삭제
	public void deleteService(String td_no);

}
