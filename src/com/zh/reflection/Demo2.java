package com.zh.reflection;

import java.lang.reflect.Constructor;

public class Demo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		test3();
	}
	
	private static void test3() throws Exception
	{
		Class clazz=Cat.class;
		
		Constructor c=clazz.getConstructor(String [].class);
		
		Cat cat=(Cat)c.newInstance(new Object[]{"Óã",1});
		
		cat.show();
	}
	
	private static void test2() throws Exception
	{
		Class clazz=Cat.class;
		
		Constructor c=clazz.getConstructor(String.class, int.class);
		
		Cat cat=(Cat)c.newInstance("Ð¡°×",2);
		System.out.println(cat.getName());
		cat.show();
	}
	
	private static void test1() throws Exception
	{
		Class clazz=Cat.class;
		
		Cat cat=(Cat)clazz.newInstance();
		
		cat.show();
	}

}
