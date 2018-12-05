package com.passer.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloWorldTest {
	
	@Test
	void testHello() throws Exception {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setUsername("passer");
		helloWorld.sayHello();
	}
	
	@Test
	void testHelloBySpring() throws Exception {
		//从classpath加载配置文件
		Resource resource = new ClassPathResource("applicationContext.xml");
		//根据配置文件创建IoC容器
		BeanFactory factory = new XmlBeanFactory(resource);
		//从IoC容器中获取对应id的对象
		
		//方式1：通过id名称获取bean对象
		//HelloWorld helloWorld =  (HelloWorld) factory.getBean("helloWorld");
		//方式2：通过class获取对象
		//HelloWorld helloWorld =  factory.getBean(HelloWorld.class);
		//方式3：通过class+id获取对象
		HelloWorld helloWorld = factory.getBean("helloWorld",HelloWorld.class);
		helloWorld.sayHello();
	}
}
