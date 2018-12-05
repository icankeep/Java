package com.passer.di_setter;

public class Person {
	private Cat cat;
	
	public Person() {
		
	}
	
	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public String toString() {
		return "Person [cat=" + cat + "]";
	}
	
	
}
