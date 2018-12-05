package com.passer.tx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import lombok.Setter;

@SuppressWarnings("all")
public class TransactionManagerAdvice implements InvocationHandler{

	@Setter
	private Object target;
	
	@Setter
	private TransactionManager tx;
	
	public <T> T getProxyObject() {
		return (T) Proxy.newProxyInstance(target.getClass().getClassLoader()
				, target.getClass().getInterfaces()
				, this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object ret = null;
		tx.begin();
		try {
			ret = method.invoke(target, args);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
		return ret;
	}

}
