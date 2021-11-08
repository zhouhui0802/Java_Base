package com.zh.reflection;

import java.lang.reflect.Field;

public class Demo4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class clazz=Cat.class;
		Field f=clazz.getDeclaredField("age");
		f.setAccessible(true);
		
		Cat cat=(Cat)clazz.newInstance();
		f.set(cat, 13);
		System.out.println(f.get(cat));
	}
	
	private static void test1() throws Exception
	{
		Class clazz=Cat.class;
		Field f=clazz.getDeclaredField("name");
		
		String name=(String)f.get(clazz.newInstance());
		System.out.println(name);
	}

}
