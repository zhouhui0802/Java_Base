package com.zh.enhance;
import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={5,7,9,90};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i: arr)
		{
			System.out.println(i);
		}
		
		List list=new ArrayList();
		list.add("abc");
		list.add("ddd");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("================");
		
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(Object obj: list)
		{
			System.out.println("增强取: "+obj);
		}
		
		System.out.println("==========对set操作============");
		
		Set set=new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		Iterator it2=set.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
		for(Object obj: set)
		{
			System.out.println(obj);
		}
	}

}
