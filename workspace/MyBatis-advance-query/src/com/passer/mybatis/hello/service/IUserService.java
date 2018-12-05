package com.passer.mybatis.hello.service;

import com.passer.mybatis.hello.query.PageResult;
import com.passer.mybatis.hello.query.UserObjectQuery;

public interface IUserService {
	//高级查询和分页查询
	PageResult query(UserObjectQuery qo);
}
