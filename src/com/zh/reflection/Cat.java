package com.zh.reflection;

import java.util.List;

public class Cat {
	
	public String name="麦当劳";
	private int age;
	private String []foods;
	public Cat()
	{
		
	}
	
	public Cat(String []foods)
	{
		this.foods=foods;
	}
	
	public void show()
	{
		System.out.println("喵喵叫");
	}
	
	public void show(String name)
	{
		System.out.println("喵喵叫"+name);
	}
	
	public void show(String name,int age){
		System.out.println(name+" 年龄是"+age);
	}
	
	//猫猫数数
	private void count(List list){
		
		for(Object obj: list)
		{
			System.out.println(obj);
		}
	}
	
	public Cat(String name,int age){
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getFoods() {
		return foods;
	}

	public void setFoods(String[] foods) {
		this.foods = foods;
	}
	
	
	
}
