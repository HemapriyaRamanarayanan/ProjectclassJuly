package org.pro6;

import org.testng.annotations.Test;

public class TestNGSampleForSkipAndRepeat {

	@Test
	private void tco() {
		System.out.println("Method 0");
}
	
	@Test
	private void tc1() {
		System.out.println("Method 1");
}

//avoid/skip this method
	@Test(enabled=false)
	private void tc12() {
		System.out.println("Method 13");
}
//repeat this method again and again
	@Test(invocationCount=3)
	private void tc13() {
		System.out.println("Method 14");
}
		
	@Test
	private void tc4() {
	  System.out.println("Method 5");
}
}






