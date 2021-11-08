package com.zh.sax;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Demo1 {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		//得到SAXParserFactory
		SAXParserFactory  spf=SAXParserFactory.newInstance();
		//的sax解析器
		SAXParser parser=spf.newSAXParser();
		//指定解析哪个xml文件，并把事件交给事件处理器
		parser.parse(new File("src/myClass_new.xml"), new MyHandler2());
	}

}

//需求，要求开发一个新的事件处理器,只显示学生名字和年龄
class MyHandler2 extends DefaultHandler{
	private boolean isName=false;
	private boolean isAge=false;
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if(isName||isAge){
		//得到内容
		String con=new String(ch,start,length);
		System.out.println(con);
		}
		isName=false;
		isAge=false;
	}
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
	}
	@Override
	public void endElement(String uri, String localName, String name)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, name);
	}
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
	}
	@Override
	public void startElement(String uri, String localName, String name,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		if(name.equals("名字")){
			isName=true;
		}else if(name.equals("年龄")){
			isAge=true;
		}
	}
}
//遍历整个myClass.xml
class MyHandler1 extends DefaultHandler{
	//发现文档开始
	@Override
	public void startDocument() throws SAXException {
		System.out.println("文档开始..");
		// TODO Auto-generated method stub
		super.startDocument();
	}
	//发现元素
	@Override
	public void startElement(String uri, String localName, String name,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println(name);
	}
	//发现文本 char[] ch 表示你的xml文档.start 表示发现的文本在xml中的开始位置,length :长度
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		String con=new String(ch,start,length);
		if(!con.trim().equals("")){
			System.out.println(con+ " start: "+start+"  len="+length);
		}
	}
	//发现元素结束
	@Override
	public void endElement(String uri, String localName, String name)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, name);
	}
	//发现文档结束
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("文档结束");
		super.endDocument();
	}
}

