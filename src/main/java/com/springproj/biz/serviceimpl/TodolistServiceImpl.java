package com.springproj.biz.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproj.biz.dao.TodolistDAOMybatis;
import com.springproj.biz.domain.TodolistVO;
import com.springproj.biz.service.TodolistService;

@Service("todolistService")
public class TodolistServiceImpl implements TodolistService {

	@Autowired
	private TodolistDAOMybatis dao;
	
	@Override
	public void insertService(TodolistVO vo) {
		dao.insertTodolist(vo);
	}

	@Override
	public TodolistVO getService(String td_no) {
		TodolistVO todolist = dao.getTodolist(td_no);
		return todolist;
	}

	@Override
	public List<TodolistVO> getServiceList(TodolistVO vo) {
		return dao.getTodolistList(vo);
	}

	@Override
	public void updateService(TodolistVO vo) {
		dao.updateTodolist(vo);
	}

	@Override
	public void deleteService(String td_no) {
		dao.deleteTodolist(td_no);
	}

}
