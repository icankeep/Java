package com.passer.review;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class MotherBoard {
	static Map<String, IUSB> plugins = new HashMap<>();
	static {
		Properties p = new Properties();
		InputStream inStream = Thread.currentThread().
				getContextClassLoader().getResourceAsStream("plugins.properties");
		try {
			p.load(inStream);
			Set<Entry<Object, Object>> entrySet=p.entrySet();
			for(Entry<Object,Object> entry:entrySet) {
				String name=entry.getKey().toString();
				IUSB usb=(IUSB)Class.forName(entry.getValue().toString()).newInstance();
				plugins.put(name, usb);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	/*public void install(IUSB usb) {
		plugins.put(usb.getName(), usb);
		System.out.println(usb.getName() + "已被安装");
	}*/

	public void doWork() {
		for (IUSB usb : plugins.values()) {
			usb.swapData();
		}
	}

/*	public void unstall(String name) {
		plugins.remove(name);
		System.out.println(name + "已被卸载");
	}*/
}
