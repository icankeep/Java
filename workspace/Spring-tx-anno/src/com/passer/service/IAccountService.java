package com.passer.service;

public interface IAccountService {

	/**
	 * 从指定账户转出指定金额到指定账户
	 * @param inId	 需要转入的账户
	 * @param outId	需要转出的账户
	 * @param money	需要转账的金额
	 */
	void trans(Long inId , Long outId , int money);
}
