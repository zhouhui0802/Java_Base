package com.zh.junit;

import org.junit.Test;

public class TestJunit1 {
	
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
