package org.pro10;

import org.testng.annotations.DataProvider;

public class DataProviderMantainsample {

	@DataProvider(name="Sample 1")
	public static Object[][] method1() {
		return new Object[][] {{"HiJava","JavaHi"},{"SeleniumJava","JavaSelenium"},
			{"WelcomeJava","JavaWelcome"}};
	
		}
		
	@DataProvider(name="Sample 2")
	public static Object[][] method2() {
		return new Object[][] {{"HiJava","JavaHi"},{"SeleniumJava","JavaSelenium"},
			{"WelcomeJava","JavaWelcome"}};

	}

	@DataProvider(name="Sample 3")
	public static Object[][] method3() {
		return new Object[][] {{"Hema","Priya"},{"Dhiya","Atarah"},
			{"Hemapriya","DhiyaAtarah"}};
			
	}		
	
	@DataProvider(name="Sample 4")
	public static Object[][] method4() {
		return new Object[][] {{"HiJava","JavaHi"},{"SeleniumJava","JavaSelenium"},
					{"WelcomeJava","JavaWelcome"}};
					
	}
}
					