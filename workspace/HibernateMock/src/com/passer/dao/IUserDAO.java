package com.passer.dao;

import java.util.List;

import com.passer.domain.User;

public interface IUserDAO {
	/**
	 * 保存操作
	 * @param user	需要保存的用户
	 */
	public void save(User user);
	
	/**
	 * 修改操作
	 * @param id		需要修改用户的id
	 * @param newUser	需要修改的新用户信息
	 */
	public void update(Long id , User newUser);
	
	/**
	 * 修改操作
	 * @param id	需要删除用户的id
	 */
	public void delete(Long id);
	
	/**
	 * 查询单个用户
	 * @param id	需要查询的用户id
	 * @return		返回查询的用户对象
	 */
	public User get(Long id);
	
	/**
	 * 查询多个用户
	 * @return		返回查询的所有用户
	 */
	public List<User> listAll();
	
	
}
