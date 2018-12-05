package com.passer.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class DocumentDemo {
	public static void main(String []args) throws Exception {
		File f=new File("resources/students.xml");
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		Document doc=builder.parse(f);  //Document doc=builder.newDocument();
		System.out.println(doc);
	}
}
