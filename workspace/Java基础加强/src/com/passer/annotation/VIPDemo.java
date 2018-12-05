package com.passer.annotation;

import java.lang.reflect.Method;
import java.util.Arrays;

public class VIPDemo {
	public static void main(String[] args) throws Exception {
		//test1();
		test2();
	}
	
	//获得Employee类中doWork方法的MethodAnnotation注解内容
	private static void test2() throws Exception {
		Class<Employee> clz=Employee.class;
		Method m=clz.getMethod("doWork");
		/*SuppressWarnings sw=m.getAnnotation(SuppressWarnings.class);
		if(sw==null) {
			System.out.println("没有SuppressWarnings注解");
		}else {
			System.out.println(sw.value());
		}*/
		System.out.println(m);
		MethodAnnotation ma=m.getAnnotation(MethodAnnotation.class);
		System.out.println(Arrays.toString(ma.value()));
	}

	//获得Employee类VIP注解的内容
	private static void test1() {
		Class<Employee> clz=Employee.class;
		/*Annotation [] as=clz.getAnnotations();
		for (Annotation a : as) {
			System.out.println(a);
		}*/
		VIP vip=clz.getAnnotation(VIP.class);
		if(vip==null) {
			System.out.println("没有VIP");
		}
		else {
			System.out.println(vip.name());
		    System.out.println(vip.age());
		    System.out.println(Arrays.toString(vip.hobby()));
		}
	}
	
}

