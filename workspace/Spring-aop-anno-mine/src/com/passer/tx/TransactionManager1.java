package com.passer.tx;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class TransactionManager1 {
	
	@Pointcut("execution(* com.passer.service.*Service.*(..))")
	public void txPoint() {
		
	}
	
	@Before("txPoint()")
	public void begin(JoinPoint jp) {
		System.out.println("开始事务");
	}
	
	@AfterReturning("txPoint()")
	public void commit(JoinPoint jp) {
		System.out.println("提交事务");
	}
	
	@AfterThrowing("txPoint()")
	public void rollback(JoinPoint jp , Throwable ex) {
		System.out.println("回滚事务");
	}
	
	@After("txPoint()")
	public void close(JoinPoint jp) {
		System.out.println("关闭资源");
	}
	
	public Object aroundMethod(ProceedingJoinPoint pjp) {
		Object ret = null;
		System.out.println("开始事务");
		try {
			pjp.proceed();
			System.out.println("提交事务");
		} catch (Throwable e) {
			System.out.println("回滚事务   异常信息:"+e.getMessage());
		}finally {
			System.out.println("关闭资源");
		}
		return ret;
	}
}
