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
		//通过SAXReader 去得打xml文件的document对象
		SAXReader reader=new SAXReader();
		Document doc=reader.read(new File("src/myClass_new.xml"));
		//遍历
		list(doc.getRootElement());
		//读取
		//read(doc);
		//得到属性
		readAttriube(doc);
		//添加标签
		add(doc);
		//添加属性.
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
		
		Element student=DocumentHelper.createElement("学生");
		student.setText("林冲");
		list.add(2,student);
		
		DocumentTools.updateDocument(doc);
	}
	
	public static void updateAttribute(Document doc) throws Exception
	{
		List<Element> list=doc.getRootElement().elements("学生");
		for(Element e: list)
		{
			e.element("名字").addAttribute("小名e", "小周");
		}
		
		DocumentTools.updateDocument(doc);
	}
	
	public static void update(Document doc) throws Exception{
		List<Element> list=doc.getRootElement().elements("学生");
		for(Element e: list){
			Element age=e.element("年龄");
			String result=Integer.parseInt(age.getText())*2+"";
			age.setText(result);
		}
		DocumentTools.updateDocument(doc);
	}
	
	//删除一个属性
		public static void delAttribute(Document doc) throws Exception{
			//得到标签对应的节点对象
			//Element name=doc.getRootElement().element("学生").element("名字");
			//使用xpath去获得第一个学生的名字
			Element name=(Element)doc.selectSingleNode("/班级/学生[1]/名字");
			//得到属性节点对象
		   name.remove(name.attribute("小名2"));
		   //更新
		   DocumentTools.updateDocument(doc);
		}
	
		//删除xml文件的一般标签
		public static void del(Document doc) throws Exception{
			//得到标签对应的节点对象
			Element e=(Element) doc.getRootElement().elements("学生").get(1);
			//通过父节点去删除
			e.getParent().remove(e);
			//更新
			DocumentTools.updateDocument(doc);
		}
		
		//4.添加属性
		public static void addAttribute(Document doc) throws Exception, FileNotFoundException{
			Element e=doc.getRootElement().element("学生").element("名字");
			//e.setAttributeValue("小名", "星星");
			Attribute att=DocumentHelper.createAttribute(e, "小名2", "星星2");
			e.add(att);
			//更新文档.
			DocumentTools.updateDocument(doc);
		}
		
		//3.添加xml标签(加入一个学生)
		public static void add(Document doc) throws IOException{
			//1.创建一个元素
			Element e=DocumentHelper.createElement("学生");
			//e.setText("贾宝玉");
			//在学生标签下，加入名字
			Element name=DocumentHelper.createElement("名字");
			name.setText("小龙女");
			e.add(name);
			//2.挂到根元素下
			doc.getRootElement().add(e);
			//3.更新文档.
			OutputFormat output=OutputFormat.createPrettyPrint();
			output.setEncoding("utf-8");
			//分析
			//XMLWriter writer=new XMLWriter(new FileWriter("src/myClass.xml"),output);
			//一种解决乱码的方法
			/*XMLWriter writer=new XMLWriter(
					new OutputStreamWriter(new FileOutputStream(new File("src/myClass.xml")),"utf-8"),
					output);*/
			//第二种方法解决乱码
			XMLWriter writer=new XMLWriter(new FileOutputStream(new File("src/myClass.xml")),output);
			writer.write(doc);
			writer.close();
		}
		
		//2.读取xml标签的某个属性的值(比如，读取第二个学生的性别)
		public static void readAttriube(Document doc){
			//得到第二个学生
			Element student=(Element) doc.getRootElement().elements("学生").get(0);
			//取名字
			String val=student.attributeValue("性别");
			System.out.println(val);
		}
		
		//1.读取xml的某个标签内容(比如，读取第一个学生的名字)
		public static void read(Document doc){
			Element stu=doc.getRootElement().element("名字");//->xpath
			Element name=stu.element("名字");
			System.out.println(stu.getText());
		}
		
		
		//1遍历整个xml文件
		public static void list(Element e){
			System.out.println(e.getName()+e.getText().trim());
			//遍历
			Iterator it=e.elementIterator();
			while(it.hasNext()){
				Element element=(Element) it.next();
				list(element);
			}
		}
}
