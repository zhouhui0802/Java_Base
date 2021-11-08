package com.zh.changeparameters;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum("˳ƽ",new Dog(),1,65,-1);
	}
	
	public static void sum(String name,Dog g,int ... arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}

class Dog{
	
}
