package com.zh.dom4j;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Demo02 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//测试xpath的使用
		
		//1.得到SAXReaer 
		SAXReader reader=new SAXReader();
		Document doc=reader.read(new File("src/test.xml"));
		
		//2.
		List nl=doc.selectNodes("/AAA/BBB[1]");
		//Element e=(Element)nl.get(0);
		//System.out.println(e.getText());
		//如果你确认是一个元素，则可以使用
		Element e=(Element) doc.selectSingleNode("/AAA/BBB[last()]");
		System.out.println(e.getText());
		System.out.println(nl.size());
	}

}
