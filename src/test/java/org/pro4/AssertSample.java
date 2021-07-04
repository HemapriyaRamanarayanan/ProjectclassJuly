package org.pro4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AssertSample {
	
		@BeforeClass
		public static void beforeClass() {
			System.out.println("Before Class");
			
		}
		
		@AfterClass
		public static void afterClass() {
			System.out.println("After Class");

		}
		
		@Before
		public void beforeMethod() {
		System.out.println("Before Method");

		}
		
		
		@After
		public void afterMethod() {
			System.out.println("After method");

		}
		
		@Ignore
		@Test
		public void test() {
		System.out.println("Test");

		}
		
		@Test
		public void test1() {
		String s = "abcd";
		System.out.println(s);
		org.junit.Assert.assertEquals("ABVF", s);//assert fail,actual not equal to expected
		System.out.println("a");
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