package com.springproj.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springproj.biz.domain.TodolistVO;
import com.springproj.biz.service.TodolistService;

@Controller
@SessionAttributes("todolist")
public class TodolistController {

	@Autowired
	TodolistService todolistService;
	
	@GetMapping("/insertTodolist.do")
	public String insertTodolist() {
		return "insertTodolist";
	}
	
	@PostMapping("/insertTodolist.do")
	public String insertTodolist(TodolistVO todolist) throws IOException {
		todolistService.insertService(todolist);
		return "redirect:getTodolistList.do";
	}
	
	// 검색 조건 목록 설정
	@ModelAttribute("conditionMap") // key 자리
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		
		conditionMap.put("내용", "CONTENT");
		
		return conditionMap; // value 자리
	}
	
	@RequestMapping(value="/getTodolistList.do")
	public String getList(TodolistVO vo, Model model) {
		System.out.println("검색 조건: "+vo.getSearchCondition());
		System.out.println("검색 단어: "+vo.getSearchKeyword());
		
		if(vo.getSearchCondition() == null) {
			vo.setSearchCondition("CONTENT");
		}
		
		if(vo.getSearchKeyword() == null) {
			vo.setSearchKeyword("");
		}
		
		List<TodolistVO> list = todolistService.getServiceList(vo);
		
		model.addAttribute("todolistList", list);
		
		return "getTodolistList";
	}
	
	@RequestMapping(value="/updateTodolist.do")
	public String updateTodolistProc(@ModelAttribute("todolist") TodolistVO vo) {
		System.out.println(vo);
		
		todolistService.updateService(vo);
		
		return "redirect:getTodolistList.do";
	}
	
	@RequestMapping(value="/deleteTodolist.do")
	public String deleteTodolist(TodolistVO todolist) {
		todolistService.deleteService(todolist.getTd_no());
		
		return "redirect:getTodolistList.do";
	}
	
}
