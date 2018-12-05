package com.passer.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

public class DOM4JDemo {
	@Test
	public void testDOM4J1() throws Exception {
		File f=new File("resources/students.xml");
		SAXReader reader=new SAXReader();
		Document doc=reader.read(f);
		Element students=doc.getRootElement();
		/*List<Element> studentList=students.elements("student");
		for (Element student : studentList) {
			String id=student.attributeValue("id");
			String name=student.elementText("name");
			System.out.println(id+" "+name);
		}*/
		
		for (Iterator <Element> it=students.elementIterator();it.hasNext();) {
			System.out.println(it.next().elementText("email"));
		}
	}
	
	@Test
	public void testDOM4J2() throws Exception {
		File f=new File("resources/students.xml");
		SAXReader reader=new SAXReader();
		Document doc=reader.read(f);
		Element root=doc.getRootElement();
		Element student=root.addElement("student")
				.addAttribute("id", "3")
				.addAttribute("sex", "female");
		student.addElement("name").setText("lyli");
		student.addElement("email").setText("322@qq.com");
		
		/*//不能以较好的格式保存
		FileWriter out=new FileWriter(f);
		doc.write(out);
		out.close();*/
		
		//OutputFormat format=OutputFormat.createCompactFormat  以一行的形式保存
		OutputFormat format=OutputFormat.createPrettyPrint();
		XMLWriter writer=new XMLWriter(new FileWriter(f),format);
		writer.write(doc);
		writer.close();
	}
}
