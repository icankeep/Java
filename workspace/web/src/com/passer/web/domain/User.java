package com.passer.web.domain;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class User {
	
	//用户编号
	private Integer serialNum;
	
	//用户名
	private String username;
	
	//用户密码
	private String password;
	
	//年龄
	private Integer age;
	
	//残疾类型
	private String typeOfDisability;
	
}
