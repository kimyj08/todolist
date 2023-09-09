package com.springproj.biz.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springproj.biz.domain.TodolistVO;

@Repository
public class TodolistDAOMybatis {

	@Autowired
	SqlSessionTemplate mybatis;
	
	// 글 등록(insert문)
	public void insertTodolist(TodolistVO vo) {
		mybatis.insert("Todolist.insertTodolist", vo);
	}
	
	// 목록보기(select문)
	public TodolistVO getTodolist(String td_no) {
		return mybatis.selectOne("Todolist.getTodolist", td_no);
	}
	
	public List<TodolistVO> getTodolistList(TodolistVO vo) {
		return mybatis.selectList("Todolist.getTodolistList", vo);
	}
	
	// 글 수정(update문)
	public void updateTodolist(TodolistVO vo) {
		mybatis.update("Todolist.updateTodolist", vo);
	}
	
	// 글 삭제(delete문)
	public void deleteTodolist(String td_no) {
		mybatis.delete("Todolist.deleteTodolist", td_no);
	}
	
}
