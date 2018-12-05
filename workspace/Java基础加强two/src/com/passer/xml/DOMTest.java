package com.passer.xml;

import static org.junit.Assert.*;

import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMTest {

	File file = new File("resources/contacts.xml");
	@Test
	public void test1() throws Exception {
		
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
		Element root = doc.getDocumentElement();
		Element linkmanEle = (Element) root.getElementsByTagName("linkman").item(1);
		Element nameEle = (Element) linkmanEle.getElementsByTagName("name").item(0);
		System.out.println(nameEle.getTextContent());
	}
	
	@Test
	public void test2() throws Exception {
		
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
		Element root = doc.getDocumentElement();
		Element linkmanEle = (Element) root.getElementsByTagName("linkman").item(0);
		Element emailEle = (Element) root.getElementsByTagName("email").item(0);
		emailEle.setTextContent("5273@qq.com");
		
		Transformer trans = TransformerFactory.newInstance().newTransformer();
		Source xmlSource = new DOMSource(doc);
		Result outputTarget = new StreamResult(file);
		trans.transform(xmlSource, outputTarget);
	}
	
	@Test
	public void test3() throws Exception {
		
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
		Element root = doc.getDocumentElement();
		
		Element linkmanEle = doc.createElement("linkman");
		Element nameEle = doc.createElement("name");
		Element emailEle = doc.createElement("email");
		Element ageEle = doc.createElement("age");
		
		nameEle.setTextContent("name");
		emailEle.setTextContent("email");
		ageEle.setTextContent("21");
		
		linkmanEle.appendChild(nameEle);
		linkmanEle.appendChild(emailEle);
		linkmanEle.appendChild(ageEle);
		
		root.appendChild(linkmanEle);
		
		Transformer trans = TransformerFactory.newInstance().newTransformer();
		Source xmlSource = new DOMSource(doc);
		Result outputTarget = new StreamResult(file);
		trans.transform(xmlSource, outputTarget);
		
	}
	
	@Test
	public void test4() throws Exception {
		
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
		Element root = doc.getDocumentElement();
		
		Element linkmanEle = (Element) root.getElementsByTagName("linkman").item(2);
		root.removeChild(linkmanEle);
		
		Transformer trans = TransformerFactory.newInstance().newTransformer();
		Source xmlSource = new DOMSource(doc);
		Result outputTarget = new StreamResult(file);
		trans.transform(xmlSource, outputTarget);
	}
	
	
}
