package com.zh.exercise;

public class EnumExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student();
		stu1.setName("С��");
		stu1.setGrade(Grade.a);
		System.out.println("�ɼ�"+stu1.getGrade().getVal());
		
		//�����ڶ���ѧ��
		Student2 stu2=new Student2();
		stu2.setName("С��");
		stu2.setGrade(Grade2.b);
		System.out.println(stu2.getGrade().getInfo());
		
		//��ö����ʹ��switch
		
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

// ��ö��������Grade
enum Grade {
	a("����"), b("����"), c("һ��"), d("����"), e("������");// ���캯��.
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
			return "����";
		}
	}
	,b{
		@Override
		public String getInfo() {
			// TODO Auto-generated method stub
			return "����";
		}
	}
	,c{
		@Override
		public String getInfo() {
			// TODO Auto-generated method stub
			return "һ��";
		}
	}
	,d{
		@Override
		public String getInfo() {
			// TODO Auto-generated method stub
			return "����";
		}
	}
	,e{
		@Override
		public String getInfo() {
			// TODO Auto-generated method stub
			return "������";
		}
	}
	;
	
	
	//�ṩһ������ȥ����a��Ӧ�ľ����ֵ.
	abstract public  String getInfo();
		
}

//ö��ʵ�ֵ�̬
enum Dog{
	a;
}
