package com.springproj.biz.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springproj.biz.domain.UsersVO;

@Repository
public class UsersDAOMybatis {

	@Autowired
	SqlSessionTemplate mybatis;
	
	// 회원 등록(insert문)
	public void insertUsers(UsersVO vo) {
		mybatis.insert("Users.insertUsers", vo);
	}
	
	// 목록보기(select문)
	public UsersVO getUsers(String seq) {
		return mybatis.selectOne("Users.getUsers", seq);
	}
	
	public List<UsersVO> getUsersList(UsersVO vo) {
		return mybatis.selectList("Users.getUsersList", vo);
	}
	
	// 회원 정보 수정(update문)
	public void updateUsers(UsersVO vo) {
		mybatis.update("Users.updateUsers", vo);
	}
	
	// 회원 탈퇴(delete문)
	public void deleteUsers(String seq) {
		mybatis.delete("Users.deleteUsers", seq);
	}
	
}