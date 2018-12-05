package com.passer.di;

import org.springframework.beans.factory.annotation.Value;

import lombok.ToString;

@ToString
public class ValueBean {

	@Value("100")
	private int port;
	
	@Value("${value.num}")
	private int num;
}
