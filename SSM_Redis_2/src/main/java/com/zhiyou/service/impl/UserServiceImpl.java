package com.zhiyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.zhiyou.dao.UserDAO;
import com.zhiyou.pojo.User;
import com.zhiyou.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserDAO userDAO;
	
	@CacheEvict(value="userSelect",allEntries=true)
	public void add(User user) {
		userDAO.add(user);
	}

	//���������Ҫ�������ķ���,�Լ�ָ����Ҫ����Ļ���   allEntries:�����Ƿ���������е���������
	@CacheEvict(value="userSelect",allEntries=true)
	public void delete(int id) {
		userDAO.delete(id);
	}
	@CacheEvict(value="userSelect",allEntries=true)
	public void update(User user) {
		userDAO.update(user);
	}

	//ָ���������������Ҫʹ�û���,ʹ�û�������ֽ�userSelect
	@Cacheable(value="userSelect")
	public List<User> queryAll() {
		return userDAO.queryAll();
	}

	//
	@Cacheable(value="userSelect")
	public User queryById(int id) {
		return userDAO.queryById(id);
	}

	
}

























