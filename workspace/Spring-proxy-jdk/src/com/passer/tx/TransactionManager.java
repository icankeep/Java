package com.passer.tx;

public class TransactionManager {
	
	public void begin() {
		System.out.println("开始事务");
	}
	
	public void commit() {
		System.out.println("提交事务");
	}
	
	public void rollback() {
		System.out.println("回滚事务");
	}
}
