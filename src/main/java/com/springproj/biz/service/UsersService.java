package com.springproj.biz.service;

import java.util.List;

import com.springproj.biz.domain.UsersVO;

public interface UsersService {

	// CRUD 기능 수행을 위한 메서드 호출 가능.
	// 회원 등록
	public void insertService(UsersVO vo);
	// 회원 목록 조회
	public UsersVO getService(String seq);
	public List<UsersVO> getServiceList(UsersVO vo);
	// 회원 정보 수정
	public void updateService(UsersVO vo);
	// 회원 탈퇴
	public void deleteService(String seq);
	
}
