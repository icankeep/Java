package com.passer.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SomeBean {
	
	public SomeBean() {
		System.out.println("创建SomeBean...");
	}
	
	@PostConstruct
	public void open() {
		System.out.println("初始化...");
	}
	
	@PreDestroy
	public void close() {
		System.out.println("关闭资源");
	}
	
	public void doWork() {
		System.out.println("doWork...");
	}
}
