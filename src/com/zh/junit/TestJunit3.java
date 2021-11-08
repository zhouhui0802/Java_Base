package com.zh.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJunit3 {

	static Cat cat=null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		cat=new Cat();
		System.out.println("setUpBeforeClass");
	}
	
	@Test
	public void testCry()
	{
		cat.cry();
	}
	
	@Test
	public void testCount()
	{
		cat.count(20);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("tearDownAfterClass...");
	}
}
