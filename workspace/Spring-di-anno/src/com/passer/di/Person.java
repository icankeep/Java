package com.passer.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Setter;
import lombok.ToString;

@Setter@ToString
public class Person {
	
	@Autowired
	@Qualifier("cat")
	private Cat cat;
	
}
