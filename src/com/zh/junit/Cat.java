package com.zh.junit;

public class Cat {

	private String name;
	private int age;
	
	public void cry()
	{
		System.out.println("Сè�䣬�нн�");
	}
	
	public void count(int num)
	{
		int result=0;
		for(int i=1;i<=num;i++)
		{
			result+=i;
		}
		
		System.out.println("�����"+result);
	}
}
