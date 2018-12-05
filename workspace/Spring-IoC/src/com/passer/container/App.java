package com.passer.container;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	/*
	 结论:BeanFactory有延迟初始化(懒:lazy)的特点,在创建Spring容器的时候,不会立马去创建容器中管理的Bean对象,
	 	而是要等到从容器中去获取对象的时候,才去创建对象.
	---------------
	loading...
	com.passer.container.Person@5c86dbc5
	*/
	@Test
	void testBeanFactory() throws Exception {
		//从classpath中加载配置文件
		Resource resource = new ClassPathResource("com/passer/container/applicationContext.xml");
		//根据配置文件创建IoC容器
		BeanFactory factory = new XmlBeanFactory(resource);
		
		System.out.println("---------------");
		//从IoC容器中获取Bean对象
		Person person = factory.getBean("person",Person.class);
		System.out.println(person);
	}
	/*
	 在创建Spring容器的时候,就会把容器中管理的bean立马初始化,而不会等到获取bean的时候才去初始化.
	loading...
	--------------------
	com.passer.container.Person@6676f6a0
	 */
	@Test
	void testApplicationContext() throws Exception {
		//根据配置文件创建ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/passer/container/applicationContext.xml");
		
		System.out.println("--------------------");
		Person person = ctx.getBean("person",Person.class);
		System.out.println(person);
	}
}
