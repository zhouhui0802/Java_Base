package com.zh.dom4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import com.zh.utils.*;

public class Demo01 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//ͨ��SAXReader ȥ�ô�xml�ļ���document����
		SAXReader reader=new SAXReader();
		Document doc=reader.read(new File("src/myClass_new.xml"));
		//����
		list(doc.getRootElement());
		//��ȡ
		//read(doc);
		//�õ�����
		readAttriube(doc);
		//��ӱ�ǩ
		add(doc);
		//�������.
		addAttribute(doc);
		del(doc);
		delAttribute(doc);
		//update(doc);
		updateAttribute(doc);
		
		addByPosition(doc);
	}
	
	public static void addByPosition(Document doc) throws Exception
	{
		List list=doc.getRootElement().elements();
		
		Element student=DocumentHelper.createElement("ѧ��");
		student.setText("�ֳ�");
		list.add(2,student);
		
		DocumentTools.updateDocument(doc);
	}
	
	public static void updateAttribute(Document doc) throws Exception
	{
		List<Element> list=doc.getRootElement().elements("ѧ��");
		for(Element e: list)
		{
			e.element("����").addAttribute("С��e", "С��");
		}
		
		DocumentTools.updateDocument(doc);
	}
	
	public static void update(Document doc) throws Exception{
		List<Element> list=doc.getRootElement().elements("ѧ��");
		for(Element e: list){
			Element age=e.element("����");
			String result=Integer.parseInt(age.getText())*2+"";
			age.setText(result);
		}
		DocumentTools.updateDocument(doc);
	}
	
	//ɾ��һ������
		public static void delAttribute(Document doc) throws Exception{
			//�õ���ǩ��Ӧ�Ľڵ����
			//Element name=doc.getRootElement().element("ѧ��").element("����");
			//ʹ��xpathȥ��õ�һ��ѧ��������
			Element name=(Element)doc.selectSingleNode("/�༶/ѧ��[1]/����");
			//�õ����Խڵ����
		   name.remove(name.attribute("С��2"));
		   //����
		   DocumentTools.updateDocument(doc);
		}
	
		//ɾ��xml�ļ���һ���ǩ
		public static void del(Document doc) throws Exception{
			//�õ���ǩ��Ӧ�Ľڵ����
			Element e=(Element) doc.getRootElement().elements("ѧ��").get(1);
			//ͨ�����ڵ�ȥɾ��
			e.getParent().remove(e);
			//����
			DocumentTools.updateDocument(doc);
		}
		
		//4.�������
		public static void addAttribute(Document doc) throws Exception, FileNotFoundException{
			Element e=doc.getRootElement().element("ѧ��").element("����");
			//e.setAttributeValue("С��", "����");
			Attribute att=DocumentHelper.createAttribute(e, "С��2", "����2");
			e.add(att);
			//�����ĵ�.
			DocumentTools.updateDocument(doc);
		}
		
		//3.���xml��ǩ(����һ��ѧ��)
		public static void add(Document doc) throws IOException{
			//1.����һ��Ԫ��
			Element e=DocumentHelper.createElement("ѧ��");
			//e.setText("�ֱ���");
			//��ѧ����ǩ�£���������
			Element name=DocumentHelper.createElement("����");
			name.setText("С��Ů");
			e.add(name);
			//2.�ҵ���Ԫ����
			doc.getRootElement().add(e);
			//3.�����ĵ�.
			OutputFormat output=OutputFormat.createPrettyPrint();
			output.setEncoding("utf-8");
			//����
			//XMLWriter writer=new XMLWriter(new FileWriter("src/myClass.xml"),output);
			//һ�ֽ������ķ���
			/*XMLWriter writer=new XMLWriter(
					new OutputStreamWriter(new FileOutputStream(new File("src/myClass.xml")),"utf-8"),
					output);*/
			//�ڶ��ַ����������
			XMLWriter writer=new XMLWriter(new FileOutputStream(new File("src/myClass.xml")),output);
			writer.write(doc);
			writer.close();
		}
		
		//2.��ȡxml��ǩ��ĳ�����Ե�ֵ(���磬��ȡ�ڶ���ѧ�����Ա�)
		public static void readAttriube(Document doc){
			//�õ��ڶ���ѧ��
			Element student=(Element) doc.getRootElement().elements("ѧ��").get(0);
			//ȡ����
			String val=student.attributeValue("�Ա�");
			System.out.println(val);
		}
		
		//1.��ȡxml��ĳ����ǩ����(���磬��ȡ��һ��ѧ��������)
		public static void read(Document doc){
			Element stu=doc.getRootElement().element("����");//->xpath
			Element name=stu.element("����");
			System.out.println(stu.getText());
		}
		
		
		//1��������xml�ļ�
		public static void list(Element e){
			System.out.println(e.getName()+e.getText().trim());
			//����
			Iterator it=e.elementIterator();
			while(it.hasNext()){
				Element element=(Element) it.next();
				list(element);
			}
		}
}
