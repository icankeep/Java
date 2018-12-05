package com.passer.tx;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TransactionManager {
	
	public void begin(JoinPoint jp) {
		/*
		 	代理对象:class com.sun.proxy.$Proxy21
			目标对象:class com.passer.service.impl.StudentServiceImpl
			被增强方法的参数:[com.passer.domain.Student@6928f576]
			连接点方法签名:void com.passer.service.IStudentService.save(Student)
			当前连接点的类型:method-execution
		 */
		System.out.println("代理对象:" + jp.getThis().getClass());
		System.out.println("目标对象:" + jp.getTarget().getClass());
		System.out.println("被增强方法的参数:" + Arrays.toString(jp.getArgs()));
		System.out.println("连接点方法签名:" + jp.getSignature());
		System.out.println("当前连接点的类型:" + jp.getKind());
		
		System.out.println("开始事务");
	}
	
	public void commit(JoinPoint jp) {
		System.out.println("提交事务");
	}
	
	public void rollback(JoinPoint jp , Throwable ex) {
		System.out.println("回滚事务");
	}
	
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
