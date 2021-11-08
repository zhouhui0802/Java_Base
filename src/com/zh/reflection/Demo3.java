package com.zh.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Demo3 {
	
	public static void main(String[] args[]) throws Exception
	{
		test3();
	}
	
	//反射private void count(List list)
	private static void test4() throws Exception {
		
		Class clazz = Class.forName("com.zh.reflection.Cat");
		//Method m=clazz.getMethod("count", List.class);//当一个函数是私有的，则不能使用 getMethod
		Method m=clazz.getDeclaredMethod("count", List.class);
		m.setAccessible(true);//暴力访问.
		List al=new ArrayList();
		al.add(1);
		al.add(3);
		m.invoke(clazz.newInstance(), al);
	}
	
	//反射 public void show(String name,int age)
	private static void test3() throws Exception {
		
		Class clazz = Class.forName("com.zh.reflection.Cat");
		Method m=clazz.getMethod("show", String.class,int.class);
		m.invoke(clazz.newInstance(), "贾宝玉",12);
	}
	
	////反射public void show(String name)
	private static void test2() throws Exception {
		//反射public void show(String name)
		Class clazz = Class.forName("com.zh.reflection.Cat");
		//得到show(String name)
		Method m=clazz.getMethod("show",String.class);
		//调用
		m.invoke(clazz.newInstance(), "宋江"); // show("宋江");
	}
	
	//反射  public void show()，并调用.
	private static void test1() throws Exception {
		
		//1.得到Class对象
		Class clazz = Class.forName("com.zh.reflection.Cat");
		//2.得到show方法
		Method m=clazz.getMethod("show",null);
		//3.调用
		m.invoke(clazz.newInstance(),null); //同学会不好理解 clazz.newInstance().invoke(m,"");
	}
	
	
}
