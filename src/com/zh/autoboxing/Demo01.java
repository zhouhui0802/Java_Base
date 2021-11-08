package com.zh.autoboxing;

import java.util.*;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d=45.6;
		double d2=d;
		
		System.out.println("d="+d+": d2="+d2);
		
		List list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		for(int i=0;i<list.size();i++)
		{
			int a=(Integer)list.get(i);
			System.out.println(a);
		}
	}

}
