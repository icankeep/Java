package com.passer.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
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

public class DocTest {
	
	/*
	 * 取出第二个学生的名字
	 */
	@Test
	public void testDoc1() throws Exception {
		File f=new File("resources/students.xml");
		Document doc=DocumentBuilderFactory.newInstance().
				newDocumentBuilder().parse(f);
		Element students=doc.getDocumentElement();
		Element student=(Element) students.getElementsByTagName("student").item(1);
		Element name=(Element) student.getElementsByTagName("name").item(0);
		System.out.println(name.getTextContent());
	}
	/*
	 * 更改第一个学生的邮箱
	 */
	@Test
	public void testDoc2() throws Exception {
		File f=new File("resources/students.xml");
		Document doc=DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
		Element students=doc.getDocumentElement();
		Element student=(Element) students.getElementsByTagName("student").item(0);
		Element email=(Element) student.getElementsByTagName("email").item(0);
		//重新设置邮箱
		email.setTextContent("127@qq.com");
		//获取转换器将内存中的doc同步到f中
		TransformerFactory factory=TransformerFactory.newInstance();
		Transformer trans=factory.newTransformer();
		Source xmlSource=new DOMSource(doc);
		Result outputTarget=new StreamResult(f);
		trans.transform(xmlSource, outputTarget);
	}
	
	/*
	 * 新建一个学生
	 */
	@Test
	public void testDoc3() throws Exception {
		File f=new File("resources/students.xml");
		Document doc=DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
		Element students=doc.getDocumentElement();
		Element student=doc.createElement("student");
		Element name=doc.createElement("name");
		Element email=doc.createElement("email");
		Element age=doc.createElement("age");
		name.setTextContent("zzz");
		email.setTextContent("1227@qq.com");
		age.setTextContent("13");
		student.appendChild(name);
		student.appendChild(email);
		student.appendChild(age);
		students.appendChild(student);
		
		Transformer trans=TransformerFactory.newInstance().newTransformer();
		Source xmlSource=new DOMSource(doc);
		Result outputTarget=new StreamResult(f);
		trans.transform(xmlSource, outputTarget);
	}
	
	/*
	 * 获取和设置元素的属性
	 */
	@Test
	public void testDoc4() throws Exception {
		File f=new File("resources/students.xml");
		Document doc=DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
		Element students=doc.getDocumentElement();
		Element student=(Element) students.getElementsByTagName("student").item(2);
		student.setAttribute("id", "3");
		//student.getAttribute("id");
		Transformer trans=TransformerFactory.newInstance().newTransformer();
		Source xmlSource=new DOMSource(doc);
		Result outputTarget=new StreamResult(f);
		trans.transform(xmlSource, outputTarget);
	}
	
	/*
	 * 删除第三个联系人
	 */
	@Test
	public void testDoc5() throws Exception {
		File f=new File("resources/students.xml");
		Document doc=DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
		Element students=doc.getDocumentElement();
		Element student=(Element) students.getElementsByTagName("student").item(2);
		//Element student=(Element) students.getLastChild();
		students.removeChild(student);
		
		//同步到文件
		Transformer trans=TransformerFactory.newInstance().newTransformer();
		Source xmlSource=new DOMSource(doc);
		Result outputTarget=new StreamResult(f);
		trans.transform(xmlSource, outputTarget);
	}
	
	/*
	 * 创建Document对象
	 */
	@Test
	public void testDoc6() throws Exception {
		File f=new File("resources/student.xml");
		DocumentBuilder builder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc=null;
		//判断文件是否存在
		if(f.exists()) {
			doc=builder.parse(f);
		}else {
			doc=builder.newDocument();
			doc.appendChild(doc.createElement("students"));
			
		}
		Element students=doc.getDocumentElement();
		Element student = doc.createElement("student");
		Element name=doc.createElement("name");
		Element email=doc.createElement("email");
		name.setTextContent("passer");
		email.setTextContent("127@qq.com");
		student.appendChild(name);
		student.appendChild(email);
		students.appendChild(student);

		
		//同步
		Transformer trans=TransformerFactory.newInstance().newTransformer();
		Source xmlSource=new DOMSource(doc);
		Result outputTarget=new StreamResult(f);
		trans.transform(xmlSource, outputTarget);
	}
}
