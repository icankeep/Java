package com.passer.mybatis.hello.service.impl;

import com.passer.mybatis.hello.mapper.UserMapper;
import com.passer.mybatis.hello.query.PageResult;
import com.passer.mybatis.hello.query.UserObjectQuery;
import com.passer.mybatis.hello.service.IUserService;
import com.passer.mybatis.util.MyBatisUtil;

public class UserService implements IUserService{

	@Override
	public PageResult query(UserObjectQuery qo) {
		
		UserMapper mapper = MyBatisUtil.getMapper(UserMapper.class);
		int totalCount = mapper.queryForCount(qo);
		PageResult pageResult = new PageResult(mapper.query(qo),totalCount,qo.getPageSize(),qo.getCurrentPage());
		pageResult.setResultList(mapper.query(qo));
		return pageResult;
	}

}
