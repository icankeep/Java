package com.passer.mybatis.hello.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Teacher implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
}
