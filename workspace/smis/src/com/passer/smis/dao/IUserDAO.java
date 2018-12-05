package com.passer.smis.dao;

import com.passer.smis.domain.User;

/**
 * 管理员用户的dao操作接口<p>
 * 
 * @author passer
 */
public interface IUserDAO {
	
	/**
	 * 通过用户id查询该用户<p>
	 * @param id    需要查询的id
	 * @return	            返回对应id的用户对象
	 */
	User getUser(Long id);
	
	/**
	 *	通过用户username查询对应的password<p>
	 * @param username	需要查询的username
	 * @return			返回对应username的password
	 */
	String getPasswordByUsername(String username);
	
}
