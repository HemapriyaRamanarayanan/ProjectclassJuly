package org.pro11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HartAssertSampleTestng {
	
	@Test
	private void tc0() {
		String s = "qwerty";
		//classname.methodname, since hard assert is a static method
		Assert.assertEquals(s, "ASDFG");
		System.out.println(1);
		System.out.println(2);
		
}

	@Test
	private void tc1() {
		System.out.println("Test2");

	}
}

//Output----method fails and will not execute the remaining methods too
//HardAssert can be used for mandatory fields, for eg., In application form 
//where some fields with astrix symbol(*).
