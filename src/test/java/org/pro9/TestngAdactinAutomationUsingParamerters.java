package org.pro9;

import org.openqa.selenium.WebElement;
import org.pro2.BaseClass;
import org.pro2.Pom;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestngAdactinAutomationUsingParamerters extends BaseClass {
	 static BaseClass b;
	 Pom p;
	 
	 @BeforeClass
	 public static void beforeClass() {
	 b = new BaseClass();
	
	 b.getDriver();
	 b.launchUrl("https://adactinhotelapp.com/");
 }
	 
	 @Parameters({"username","password"})
	 @Test
	 public void tc0(String s1, String s2) {
	 p = new Pom();
	 WebElement tUser = p.gettUser();
	 b.type(tUser, s1);
	 WebElement tPass = p.gettPass();
	 b.type(tPass, s2);
	 System.out.println(s1);
	 System.out.println(s2);
		
}
	 @Test
	 public void tc1() throws InterruptedException {
		WebElement btnLogin = p.getBtnLogin();
		b.buttonLogin(btnLogin);
		Thread.sleep(3000);
	}
	 
	  
	 @AfterClass
	 public static void afterClass() {
	 driver.close();

}
}
	 
