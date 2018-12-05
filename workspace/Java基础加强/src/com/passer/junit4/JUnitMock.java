package com.passer.junit4;

import java.lang.reflect.Method;
import java.util.ArrayList;
/*
 * 模拟JUnit
 */
public class JUnitMock {
	public static void main(String []args) throws Exception {
		//获取JUnit4的字节码对象
		Class<JUnit4> clz=JUnit4.class;
		//获取JUnit4的实例对象
		JUnit4 junit4=clz.newInstance();
		//获取出JUnit4的所有方法
		Method [] ms=clz.getDeclaredMethods();
		//迭代出每一个方法，并判断每一个方法分别使用了什么注解，并归类存储
		ArrayList<Method> beforeList=new ArrayList<>();
		ArrayList<Method> testList=new ArrayList<>();
		ArrayList<Method> afterList=new ArrayList<>();
		for (Method m : ms) {
			if(m.isAnnotationPresent(MyBefore.class)) {
				beforeList.add(m);
			}else if(m.isAnnotationPresent(MyTest.class)){
				testList.add(m);
			}else if(m.isAnnotationPresent(MyAfter.class)) {
				afterList.add(m);
			}
			
		}
		//循环迭代出testList中的每一个测试方法，并执行
		for (Method method : testList) {
			for(Method m:beforeList) {
				m.invoke(junit4);
			}
			method.invoke(junit4);
			for (Method m : afterList) {
				m.invoke(junit4);
			}
		}

	}
}
