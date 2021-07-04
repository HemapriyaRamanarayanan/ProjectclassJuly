package org.pro4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitSample{
//1 time usage
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
		
	}
	//1 time usage
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");

	}
	//1 time usage
	@Before
	public void beforeMethod() {
	System.out.println("Before Method");

	}
	
	//1 time usage
	@After
	public void afterMethod() {
		System.out.println("After method");

	}
	//can use n number of times
	@Ignore//Particular test case will not displayed
	@Test
	public void test() {
	System.out.println("Test");

	}
	@Test
	public void test1() {
	System.out.println("Test1");
}
	@Test
	public void test2() {
	System.out.println("Test2");
	}
	@Test
	public void test3() {
	System.out.println("Test3");
	}
	@Test
	public void test4() {
	System.out.println("Test4");
	}
}