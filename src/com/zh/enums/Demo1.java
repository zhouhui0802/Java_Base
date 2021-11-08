package com.zh.enums;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1=new Person1();
		p1.setName("小红");
		p1.setSex(Sex.man);
		System.out.println(p1.getName()+" "+p1.getSex().getVal());
	}

}

class Person1
{
	private String name;
	private Sex sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
}

final class Sex
{
	public static Sex man=new Sex("男");
	public static Sex woman=new Sex("女");
	public static Sex middle=new Sex("ddd");
	
	private String val;
	public String getVal()
	{
		return val;
	}
	private Sex(String val)
	{
		this.val=val;
	}
}

class Person
{
	private String name;
	private String sex;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getSex()
	{
		return sex;
	}
	
	public void setSex(String sex)
	{
		if(!sex.matches("man|woman"))
		{
			throw new RuntimeException("性别值不对");
		}
		
		this.sex=sex;
	}
}
