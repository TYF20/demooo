package com.zhiyou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.pojo.User;
import com.zhiyou.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	
	
	@RequestMapping("show")
	public String show(HttpServletRequest request,HttpServletResponse response) {
		List<User> users = userService.queryAll();
		request.setAttribute("users", users);
		return "show";
	}
	
	@RequestMapping("add")
	public String add(User user,HttpServletRequest request,HttpServletResponse response) {
		userService.add(user);
		return "redirect:show";
	}
	
	@RequestMapping("byId")
	public String byId(int id,HttpServletRequest request,HttpServletResponse response) {
		User user = userService.queryById(id);
		request.setAttribute("user", user);
		return "update";
	}
	@RequestMapping("update")
	public String update(User user,HttpServletRequest request,HttpServletResponse response) {
		userService.update(user);
		return "redirect:show";
	}
	@RequestMapping("delete")
	public String delete(int id,HttpServletRequest request,HttpServletResponse response) {
		userService.delete(id);
		return "redirect:show";
	}
	
}
