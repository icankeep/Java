package com.passer.xml;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

public class DOM4JTest {
	
	File f = new File("resources/contacts.xml");
	@Test
	public void test1() throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read(f);
		Element root = doc.getRootElement();
		List<Element> eles = root.elements();
		for (Element ele : eles) {
			System.out.println(ele.element("name").getText());
			System.out.println(ele.element("age").getText());
			System.out.println(ele.elementText("email"));
		}
	}
	
	@Test
	public void test2() throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read(f);
		Element root = doc.getRootElement();
		Element linkmanEle = root.addElement("linkman");
		linkmanEle.addElement("name").setText("haha11");
		linkmanEle.addElement("email").setText("hahah@qq.com");
		linkmanEle.addElement("age").setText("14");
		
//		FileWriter out = new FileWriter(f);
//		doc.write(out);
//		out.close();
		
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(new FileWriter(f), format);
		writer.write(doc);
		writer.close();
	}
}
