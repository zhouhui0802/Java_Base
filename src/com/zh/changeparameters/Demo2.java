package com.zh.changeparameters;

import java.util.Arrays;
import java.util.*;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]={"aa","bbb","ccc","¥Û∏Á"};
		int [] arr={3,6,8};
		
		List list2=Arrays.asList(str);
		
		System.out.println("asList÷Æ∫Û");
		for(Object obj: list2)
		{
			System.out.println(obj);
		}
	}

}
