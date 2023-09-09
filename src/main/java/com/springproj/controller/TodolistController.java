package com.springproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springproj.biz.service.TodolistService;

@Controller
@SessionAttributes("todolist")
public class TodolistController {

	@Autowired
	TodolistService tosolistService;
	
	@GetMapping("/insertTodolist.do")
	public String insertTodolist() {
		return "";
	}
	
	
}
