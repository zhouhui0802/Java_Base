package com.zh.exercise;

public class EnumExec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeekDay wd=WeekDay.Tue;
		System.out.println(wd.getLocaleDate());
		
		System.out.println(wd.name()+" "+wd.ordinal());
		
		WeekDay wd2=wd.valueOf("Mon");
		System.out.println(wd2.getLocaleDate());
		
		//遍历枚举值
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
			return "星期一";
		}
	}
	,Tue{
		@Override
		public String getLocaleDate() {
			// TODO Auto-generated method stub
			return "星期二";
		}
	}
	;
	
	//声明一个抽象方法
	abstract public String getLocaleDate(); 
}