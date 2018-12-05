package com.passer.log;

public class LogUtil {
	
	public void writeLog(String className, String methodName) {
		System.out.println("调用了" + className + "中的" + methodName);
	}
}
