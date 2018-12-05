package com.passer.log;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import lombok.Setter;

@SuppressWarnings("all")
public class LogAdvice implements MethodInterceptor{

	@Setter
	private LogUtil logUtil;
	@Setter
	private Object target;
	public <T> T getProxyObject() {
		return (T) new Enhancer().create(target.getClass(), this);
	}
	
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) 
			throws Throwable {
		logUtil.writeLog(method.getDeclaringClass().getName(),method.getName());
		return method.invoke(target, args);
	}

	
}
