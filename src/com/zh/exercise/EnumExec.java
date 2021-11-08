package com.zh.exercise;

public class EnumExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student();
		stu1.setName("小明");
		stu1.setGrade(Grade.a);
		System.out.println("成绩"+stu1.getGrade().getVal());
		
		//创建第二个学生
		Student2 stu2=new Student2();
		stu2.setName("小红");
		stu2.setGrade(Grade2.b);
		System.out.println(stu2.getGrade().getInfo());
		
		//用枚举来使用switch
		
		Grade g=Grade.a;
		
		switch(g){
		case a:
			System.out.println("aaa");
			break;
		case b:
			System.out.println("bbb");
			break;
			
		}
	}

}

class Student2{
	private String name;
	private Grade2 grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Grade2 getGrade() {
		return grade;
	}
	public void setGrade(Grade2 grade) {
		this.grade = grade;
	}
}

class Student{
	private String name;
	private Grade grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
}

// 用枚举类型来Grade
enum Grade {
	a("优秀"), b("良好"), c("一般"), d("及格"), e("不及格");// 构造函数.
	private String val;

	public String getVal() {
		return val;
	}

	private Grade(String val) {
		this.val = val;
	}
}

enum Grade2{
	a{
		@Override
		public String getInfo() {
			// TODO Auto-generated method stub
			return "优秀";
		}
	}
	,b{
		@Override
		public String getInfo() {
			// TODO Auto-generated method stub
			return "良好";
		}
	}
	,c{
		@Override
		public String getInfo() {
			// TODO Auto-generated method stub
			return "一般";
		}
	}
	,d{
		@Override
		public String getInfo() {
			// TODO Auto-generated method stub
			return "及格";
		}
	}
	,e{
		@Override
		public String getInfo() {
			// TODO Auto-generated method stub
			return "不及格";
		}
	}
	;
	
	
	//提供一个函数去返回a对应的具体的值.
	abstract public  String getInfo();
		
}

//枚举实现单态
enum Dog{
	a;
}
