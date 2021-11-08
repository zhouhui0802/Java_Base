package com.zh.reflection;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class clazz=Class.forName("com.zh.reflection.Cat");
		
		Class clazz2=Cat.class;
		
		Class clazz3=new Cat().getClass();
		
		if(clazz==clazz3)
		{
			System.out.println("ok1");
		}
	}

}
