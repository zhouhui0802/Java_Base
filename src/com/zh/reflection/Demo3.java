package com.zh.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Demo3 {
	
	public static void main(String[] args[]) throws Exception
	{
		test3();
	}
	
	//����private void count(List list)
	private static void test4() throws Exception {
		
		Class clazz = Class.forName("com.zh.reflection.Cat");
		//Method m=clazz.getMethod("count", List.class);//��һ��������˽�еģ�����ʹ�� getMethod
		Method m=clazz.getDeclaredMethod("count", List.class);
		m.setAccessible(true);//��������.
		List al=new ArrayList();
		al.add(1);
		al.add(3);
		m.invoke(clazz.newInstance(), al);
	}
	
	//���� public void show(String name,int age)
	private static void test3() throws Exception {
		
		Class clazz = Class.forName("com.zh.reflection.Cat");
		Method m=clazz.getMethod("show", String.class,int.class);
		m.invoke(clazz.newInstance(), "�ֱ���",12);
	}
	
	////����public void show(String name)
	private static void test2() throws Exception {
		//����public void show(String name)
		Class clazz = Class.forName("com.zh.reflection.Cat");
		//�õ�show(String name)
		Method m=clazz.getMethod("show",String.class);
		//����
		m.invoke(clazz.newInstance(), "�ν�"); // show("�ν�");
	}
	
	//����  public void show()��������.
	private static void test1() throws Exception {
		
		//1.�õ�Class����
		Class clazz = Class.forName("com.zh.reflection.Cat");
		//2.�õ�show����
		Method m=clazz.getMethod("show",null);
		//3.����
		m.invoke(clazz.newInstance(),null); //ͬѧ�᲻����� clazz.newInstance().invoke(m,"");
	}
	
	
}
