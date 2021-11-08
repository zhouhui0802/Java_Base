package com.zh.domain;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Demo1 {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		
		DocumentBuilder db=dbf.newDocumentBuilder();
		
		Document document=db.parse("D:/java_algorithm/DemoProject/src/myClass.xml");
		
		
		readAttr(document);
		
	}
	
	public static void readAttr(Document doc)
	{
		Element root=doc.getDocumentElement();
		
		Element stu2=(Element)root.getElementsByTagName("学生").item(1);
		
		String sexVal=stu2.getAttribute("sex");
		System.out.println(sexVal);
	}
	
	public static void read(Document doc)
	{
		Element e=doc.getDocumentElement();
		Element name=(Element)e.getElementsByTagName("名字").item(1);
		System.out.println(name.getTextContent());
	}
	
	public static void list(Node node)
	{
		if(node.getNodeType()==Node.ELEMENT_NODE)
		{
			System.out.println("该节点的名字是"+node.getNodeName());
		}
		NodeList n1=node.getChildNodes();
		for(int i=0;i<n1.getLength();i++)
		{
			Node node2=n1.item(i);
			list(node2);
		}
	}
	
	

}
