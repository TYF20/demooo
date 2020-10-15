package com.zhiyou.service;

import java.util.List;

import com.zhiyou.pojo.User;

public interface UserService {
	void add(User user);
	void delete(int id);
	void update(User user);
	List<User> queryAll();
	User queryById(int id);
}
