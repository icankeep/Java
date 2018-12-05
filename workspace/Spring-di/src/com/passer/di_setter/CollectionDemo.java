package com.passer.di_setter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Setter;

@Setter
public class CollectionDemo {
	private List<String> list;
	private Map<String,Object> map;
	private Properties properties;
	private char [] array;
	private Set<String> set;
	
	public String toString() {
		return "CollectionDemo [list=" + list + ",\n map=" + map + ",\n properties=" + properties + ",\n array="
				+ Arrays.toString(array) + ",\n set=" + set + "]";
	}
	
	
}
