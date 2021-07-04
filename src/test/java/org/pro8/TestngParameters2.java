package org.pro8;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameters2 {

	@Parameters({"username","password"})
	@Test
	private void tc10(String s1, String s2) {
		System.out.println(s1);
		System.out.println(s2);
}
	
	//@optional is used to overcome the case 
	//of mismatching parameters
	@Parameters({"Uname","password"})
	@Test
	private void tc11(@Optional("Priya") String s1, String s2) {
		System.out.println(s1);
		System.out.println(s2);
}

	@Test
	private void tc12() {
		System.out.println("Method 13");
}
	
	@Test
	private void tc13() {
		System.out.println("Method 14");
}
		
	@Test
	private void tc14() {
	  System.out.println("Method 15");
}
}
