package com.passer.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemeoryError
 * @author passer
 *
 */
public class HeapOOM {

	static class OOMObject{
	}
	
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		
		while(true) {
			list.add(new OOMObject());
		}
	}
}
