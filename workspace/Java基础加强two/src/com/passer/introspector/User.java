package com.passer.introspector;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class User {
	
	public String name;
	public Integer age;
	public boolean man;
	

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", man=" + man + "]";
	}
	
}
