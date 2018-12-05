package com.passer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.passer.dao.IAccountDAO;
import com.passer.service.IAccountService;

@Service
@Transactional(transactionManager="txManager") //去IoC容器中寻找这个名字的事务管理器
public class AccountServiceImpl implements IAccountService{
	@Autowired
	private IAccountDAO dao;
	public void trans(Long inId, Long outId, int money) {
		dao.transOut(outId, money);
		int ret = 1/0 ;
		dao.transIn(inId, money);
	}

}
