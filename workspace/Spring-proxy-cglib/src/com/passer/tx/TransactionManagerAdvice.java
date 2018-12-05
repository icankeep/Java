package com.passer.tx;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import lombok.Setter;

@SuppressWarnings("all")
public class TransactionManagerAdvice implements InvocationHandler{

	@Setter
	private Object target;
	
	@Setter
	private TransactionManager tx;
	
	public <T> T getProxyObject() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());//将继承于哪一个类,去做增强
		enhancer.setCallback(this);//设置增强的对象
		return (T) enhancer.create();//创建代理对象
	}
	
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
