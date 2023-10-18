package com.springproj.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springproj.biz.domain.UsersVO;
import com.springproj.biz.service.UsersService;

@Controller
@SessionAttributes("users")
public class UsersController {

	@Autowired
	UsersService usersService;
	
	@GetMapping("/insertUsers.me")
	public String insertUsers() {
		return "insertUsers";
	}
	
	@PostMapping("/insertUsers.me")
	public String insertUsers(UsersVO users) throws IOException {
		usersService.insertService(users);
		return "redirect:getUsersList.me";
	}
	
	@GetMapping("/login.me")
	public String loginForm(@ModelAttribute("user") UsersVO vo) {
		return "login";
	}
	
	@PostMapping("login.me")
	public String loginProc(UsersVO users, HttpSession session) {
		
		if(users.getId() == null || users.getId().equals("")) {
			throw new IllegalArgumentException("아이디는 반드시 입력해야 합니다.");
		}
		
		String retVal = null;
		
		// 1. users의 id 존재 여부를 db에서 가져오기.
		UsersVO vo = usersService.loginService(users);
		
		if((vo!=null) && vo.getPassword().equals(users.getPassword())) {
			session.setAttribute("userName", vo.getName());
			
			retVal = "redirct:getTodolistList.do";
		} else {
			retVal = "redirect:login.me";
		}
		return retVal;
	}
	
	@RequestMapping("/logout.me")
	public String logoutProc(HttpSession session) {
		System.out.println("로그아웃 처리.");
		
		session.invalidate();
		
		return "redirect:login.me";
	}
	
	@RequestMapping(value="/getUsers.me")
	public String getUsers(UsersVO users, Model model) {
		UsersVO vo = usersService.getService(users);
		
		model.addAttribute("users", vo);  // command 객체로 이용 가능하다.
		
		return "getUsers";
	}
	
	@RequestMapping(value="/getUsersList.me")
	public String getList(UsersVO vo, Model model) {
		List<UsersVO> list = usersService.getServiceList(vo);
		
		model.addAttribute("usersList", list);
		
		return "getUsersList";
	}
	
	@RequestMapping(value="/updateUsers.me")
	public String updateUsersProc(@ModelAttribute("users") UsersVO vo) {
		System.out.println(vo);
		
		usersService.updateService(vo);
		
		return "redirect:getUsersList.me";
	}
	
	@RequestMapping(value="/deleteUsers.me")
	public String deleteUsers(UsersVO users) {
		usersService.deleteService(users.getSeq());
		
		return "redirect:getUsersList.me";
	}
}
