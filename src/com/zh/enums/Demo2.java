package com.zh.enums;

public class Demo2 {

	public static void main(String args[])
	{
		Person3 p1=new Person3();
		p1.setSex(Sex1.woman); //提出问题,如何让woman 显示 女.
		System.out.println("性别"+p1.getSex().getVal());
	}
}

class Person3{
	private String name;
	private Sex1 sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sex1 getSex() {
		return sex;
	}
	public void setSex(Sex1 sex) {
		this.sex = sex;
	}
	
	
}

enum Sex1{
	woman("女w"),man("男");
	private String val;
	private Sex1(String val){
		this.val=val;
	}
	public String getVal() {
		return val;
	}
}