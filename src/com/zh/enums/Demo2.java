package com.zh.enums;

public class Demo2 {

	public static void main(String args[])
	{
		Person3 p1=new Person3();
		p1.setSex(Sex1.woman); //�������,�����woman ��ʾ Ů.
		System.out.println("�Ա�"+p1.getSex().getVal());
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
	woman("Ůw"),man("��");
	private String val;
	private Sex1(String val){
		this.val=val;
	}
	public String getVal() {
		return val;
	}
}