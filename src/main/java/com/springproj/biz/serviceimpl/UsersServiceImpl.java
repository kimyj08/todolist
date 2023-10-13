package com.springproj.biz.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproj.biz.dao.UsersDAOMybatis;
import com.springproj.biz.domain.UsersVO;
import com.springproj.biz.service.UsersService;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDAOMybatis dao;
	
	@Override
	public void insertService(UsersVO vo) {
		dao.insertUsers(vo);
	}

	@Override
	public UsersVO getService(UsersVO vo) {
		UsersVO users = dao.getUsers(vo);
		return users;
	}

	@Override
	public List<UsersVO> getServiceList(UsersVO vo) {
		return dao.getUsersList(vo);
	}

	@Override
	public void updateService(UsersVO vo) {
		dao.updateUsers(vo);
	}

	@Override
	public void deleteService(String seq) {
		dao.deleteUsers(seq);
	}

}
