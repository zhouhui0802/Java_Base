package com.zh.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestJunit2 {
	
	@Before
	public void setUp() throws Exception
	{
		System.out.println("setUp....");
	}
	
	@Test
	public void testCry()
	{
		Cat cat=new Cat();
		cat.cry();
	}
	
	@Test
	public void testCount()
	{
		Cat cat=new Cat();
		cat.count(20);
	}
	

}
