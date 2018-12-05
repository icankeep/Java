package com.passer.lifecycle;

public class MyDataSource {
	public MyDataSource() {
		System.out.println("MyDataSource...");
	}
	
	public void open() {
		System.out.println("open...");
	}
	
	public void close() {
		System.out.println("close...");
	}
	
	public void doWork() {
		System.out.println("working...");
	}
}
