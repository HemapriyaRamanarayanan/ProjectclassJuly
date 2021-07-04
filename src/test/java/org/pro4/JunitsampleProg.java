package org.pro4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pro2.BaseClass;
import org.pro2.Pom;

public class JunitsampleProg extends BaseClass {
	 static BaseClass b;
	 Pom p;
	 
	 @BeforeClass
	 public static void beforeClass() {
	 b = new BaseClass();
	
	b.getDriver();
	b.launchUrl("https://adactinhotelapp.com/");
	 }
	 
	 @Test
	 public void tc0() {
		p = new Pom();
		WebElement tUser = p.gettUser();
		b.type(tUser, "hhhh");
		WebElement tPass = p.gettPass();
		b.type(tPass, "eeee");

	}
	 
	 @Test
	 public void tc1() {
		WebElement btnLogin = p.getBtnLogin();
		b.buttonLogin(btnLogin);

	}
	 
	 @AfterClass
	 public static void afterClass() {
		driver.close();

	}

	}
	 
	


