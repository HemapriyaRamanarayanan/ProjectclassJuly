package org.pro11;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertSampleTestng {
	
	@Test
	private void tc0() {
		String s = "qwerty";
		//soft assert is non-static method, so we have to create object, using obj ref 
		//we have to call the methods
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(s, "ASDFG");
		System.out.println(1);
		System.out.println(2);
		
}

	@Test
	private void tc1() {
		System.out.println("Test2");

	}
}

//Output----method executed and also it will execute all the remaining methods
//SoftAssert can be used in unnecessary fields, where there is no much important

