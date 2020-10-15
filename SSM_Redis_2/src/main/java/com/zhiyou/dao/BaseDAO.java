package com.zhiyou.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseDAO<E> {
	void add(E e);
	void delete(int id);
	void update(E e);
	List<E> queryAll();
	E queryById(@Param("id")int id);
}
