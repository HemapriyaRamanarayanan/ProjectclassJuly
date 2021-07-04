package org.pro6;

import org.testng.annotations.Test;

public class TestNGSampleUsingPriority {

	@Test(priority=10)
	private void tco() {
		System.out.println("Method 0");
}
	
	@Test(priority=-5)
	private void tc1() {
		System.out.println("Method 1");
}

	@Test(enabled= false)
	private void tc2() {
		System.out.println("Method 2");
}
	
	@Test(priority=0)
	private void tc3() {
		System.out.println("Method 3");
}
		
	@Test(priority=-10)
	private void tc4() {
	  System.out.println("Method 5");
}
}






