package com.zh.enhance;

import java.util.*;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map=new LinkedHashMap();
		
		map.put("aaa", "111");
		map.put("bbb", "宋江");
		map.put("ccc", "贾宝玉");
		
		Set set=map.keySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			String key=(String)it.next();
			String val=(String)map.get(key);
			System.out.println(key+" "+val);
		}
		
		System.out.println("map的第二种传统取法");
		
		Set set2=map.entrySet();
		Iterator it2=set2.iterator();
		while(it2.hasNext())
		{
			Map.Entry me=(Map.Entry)it2.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
		Set set3=map.entrySet();
		for(Object obj: set3)
		{
			Map.Entry me=(Map.Entry)obj;
			System.out.println(me.getKey()+":::"+me.getValue());
		}
		
		
	}

}
