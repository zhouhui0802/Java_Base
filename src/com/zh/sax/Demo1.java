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
		//�õ�SAXParserFactory
		SAXParserFactory  spf=SAXParserFactory.newInstance();
		//��sax������
		SAXParser parser=spf.newSAXParser();
		//ָ�������ĸ�xml�ļ��������¼������¼�������
		parser.parse(new File("src/myClass_new.xml"), new MyHandler2());
	}

}

//����Ҫ�󿪷�һ���µ��¼�������,ֻ��ʾѧ�����ֺ�����
class MyHandler2 extends DefaultHandler{
	private boolean isName=false;
	private boolean isAge=false;
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if(isName||isAge){
		//�õ�����
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
		if(name.equals("����")){
			isName=true;
		}else if(name.equals("����")){
			isAge=true;
		}
	}
}
//��������myClass.xml
class MyHandler1 extends DefaultHandler{
	//�����ĵ���ʼ
	@Override
	public void startDocument() throws SAXException {
		System.out.println("�ĵ���ʼ..");
		// TODO Auto-generated method stub
		super.startDocument();
	}
	//����Ԫ��
	@Override
	public void startElement(String uri, String localName, String name,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println(name);
	}
	//�����ı� char[] ch ��ʾ���xml�ĵ�.start ��ʾ���ֵ��ı���xml�еĿ�ʼλ��,length :����
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		String con=new String(ch,start,length);
		if(!con.trim().equals("")){
			System.out.println(con+ " start: "+start+"  len="+length);
		}
	}
	//����Ԫ�ؽ���
	@Override
	public void endElement(String uri, String localName, String name)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, name);
	}
	//�����ĵ�����
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("�ĵ�����");
		super.endDocument();
	}
}

