package com.zh.dom4j;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Demo03 {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		//1.�õ�SAXReaer 
		SAXReader reader=new SAXReader();
		Document doc=reader.read(new File("src/users.xml"));
		
		String u="aaa";
		String p="bbbb";
		
		//��xml�ļ���ȥ��֤���û��Ƿ�Ϸ�
		List list=doc.selectNodes("//user[@username='jjjaaa' and @passwd='bbbb']");
		
		System.out.println(list.size());
	}

}
