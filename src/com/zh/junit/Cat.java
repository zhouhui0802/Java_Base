package com.zh.junit;

public class Cat {

	private String name;
	private int age;
	
	public void cry()
	{
		System.out.println("小猫咪，叫叫叫");
	}
	
	public void count(int num)
	{
		int result=0;
		for(int i=1;i<=num;i++)
		{
			result+=i;
		}
		
		System.out.println("结果是"+result);
	}
}
