package com.passer.annotation;

//@VIP({"passer","123"})  //当注解只有一个属性且属性名为value时可以这么写
@VIP(name="passer",age=19,hobby={"java","girl"})
//@Deprecated
@SuppressWarnings("all")
public class Employee {
	
	@SuppressWarnings("all")
	@MethodAnnotation({"all","la"})
	public void doWork() {
		
	}
}
