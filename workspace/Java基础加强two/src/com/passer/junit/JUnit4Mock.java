package com.passer.junit;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class JUnit4Mock {
	
	public static void main(String[] args) throws Exception {
		
		Class <EmployeeDAOTest> clz = EmployeeDAOTest.class;
		Method [] ms = clz.getDeclaredMethods();
		EmployeeDAOTest test = clz.newInstance();
		
		List <Method> testList = new ArrayList<>();
		List <Method> beforeList = new ArrayList<>();
		List <Method> afterList = new ArrayList<>();
		
		for (Method m : ms) {
			if(m.isAnnotationPresent(MyTest.class)) {
				testList.add(m);
			}else if(m.isAnnotationPresent(MyBefore.class)) {
				beforeList.add(m);
			}else if(m.isAnnotationPresent(MyAfter.class)) {
				afterList.add(m);
			}
		}
		
		for (Method m : testList) {
			for(Method m1 : beforeList) {
				m1.invoke(test);
			}
			m.invoke(test);
			for(Method m2 : afterList) {
				m2.invoke(test);
			}
		}
		
/*		EmployeeDAOTest test = EmployeeDAOTest.class.newInstance();
		List <Method> testList = new LinkedList<>();
		List <Method> beforeList = new LinkedList<>();
		List <Method> afterList = new LinkedList<>();
		BeanInfo beanInfo = Introspector.getBeanInfo(EmployeeDAOTest.class);
		MethodDescriptor[] mds = beanInfo.getMethodDescriptors();
		for (MethodDescriptor md : mds) {
			Annotation[] annos = md.getMethod().getAnnotations();
			for (Annotation anno : annos) {
				if(anno.annotationType().equals(MyTest.class)) {
					testList.add(md.getMethod());
				}else if(anno.annotationType().equals(MyBefore.class)) {
					beforeList.add(md.getMethod());
				}else if(anno.annotationType().equals(MyAfter.class)) {
					afterList.add(md.getMethod());
				}
			}
		}
		
		for (Method m : beforeList) {
			m.invoke(test);
		}
		for (Method m : testList) {
			m.invoke(test);
		}
		for (Method m : afterList) {
			m.invoke(test);
		}*/
		
	}
}
