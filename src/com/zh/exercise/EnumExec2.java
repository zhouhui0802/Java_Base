package com.zh.exercise;

public class EnumExec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeekDay wd=WeekDay.Tue;
		System.out.println(wd.getLocaleDate());
		
		System.out.println(wd.name()+" "+wd.ordinal());
		
		WeekDay wd2=wd.valueOf("Mon");
		System.out.println(wd2.getLocaleDate());
		
		//����ö��ֵ
		WeekDay wds[]=wd.values();
		for(WeekDay t: wds){
			System.out.println(t.getLocaleDate());
		}
	}

}


enum WeekDay{
	Mon{
		@Override
		public String getLocaleDate() {
			// TODO Auto-generated method stub
			return "����һ";
		}
	}
	,Tue{
		@Override
		public String getLocaleDate() {
			// TODO Auto-generated method stub
			return "���ڶ�";
		}
	}
	;
	
	//����һ�����󷽷�
	abstract public String getLocaleDate(); 
}