package com.passer.review;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class App {

	public static void main(String[] args) throws Exception {
		
		MotherBoard motherBoard = new MotherBoard();
		Properties p = new Properties();
		try {
			InputStream inStream = Thread.currentThread().
					getContextClassLoader().getResourceAsStream("plugins.properties");
			p.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set<Entry<Object,Object>> entrys = p.entrySet();
		for (Entry<Object, Object> entry : entrys) {
			String name = (String) entry.getKey();
			IUSB usb = (IUSB) Class.forName((String)entry.getValue()).newInstance();
			motherBoard.install(name, usb);
		}
	}
}
