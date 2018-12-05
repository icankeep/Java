package com.passer.review;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class LombokDemo {
	private String name;
	private int age;
	public void doWork() {
		System.out.println(1);
	}
	public static void main(String []args) {
		new LombokDemo() {
			public void doWork() {
				System.out.println(2);
			}
		}.doWork();;
	}
}
