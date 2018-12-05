package com.passer.service.impl;

import com.passer.dao.IAccountDAO;
import com.passer.service.IAccountService;

import lombok.Setter;

public class AccountServiceImpl implements IAccountService{
	@Setter
	private IAccountDAO dao;
	public void trans(Long inId, Long outId, int money) {
		dao.transOut(outId, money);
		//int ret = 1/0 ;
		dao.transIn(inId, money);
	}

}
