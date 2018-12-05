package com.passer.dao;

public interface IAccountDAO {
	
	/**
	 * 转入指定账户指定金额
	 * @param inId	 需要转入金额的账户
	 * @param money	需要转入的金额
	 */
	void transIn (Long inId , int money);
	
	/**
	 * 从指定账户转出指定金额
	 * @param outId	 需要转出金额的账户
	 * @param money	需要转出的金额
	 */
	void transOut(Long outId, int money);	
}
