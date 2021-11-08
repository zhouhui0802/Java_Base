package com.zh.dom4j;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Demo03 {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		//1.得到SAXReaer 
		SAXReader reader=new SAXReader();
		Document doc=reader.read(new File("src/users.xml"));
		
		String u="aaa";
		String p="bbbb";
		
		//到xml文件中去验证该用户是否合法
		List list=doc.selectNodes("//user[@username='jjjaaa' and @passwd='bbbb']");
		
		System.out.println(list.size());
	}

}
