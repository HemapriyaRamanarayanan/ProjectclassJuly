package org.pro3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pro2.BaseClass;

public class BaseClassExmpPro extends BaseClass{
	public static void main(String[] args) throws IOException {
		BaseClass b = new BaseClass();
		b.getDriver();
		b.launchUrl("http://www.facebook.com/");
		WebElement tUser = driver.findElement(By.name("email"));
	    b.type(tUser, b.excelData("C:\\Users\\91720\\eclipse-workspace\\MavenDay1\\Excel workbooks\\Maven pro sample 4.xlsx", "Login Details", 0, 0));
	    WebElement tPass = driver.findElement(By.id("pass"));
	    b.type(tPass, b.excelData("C:\\Users\\91720\\eclipse-workspace\\MavenDay1\\Excel workbooks\\Maven pro sample 4.xlsx", "Login Details", 1, 0));
	
	
	}
}
			/*
		BaseClass b = new BaseClass();
		b.getDriver();
		b.launchUrl("http://www.facebook.com/");
		WebElement tUser = driver.findElement(By.id("email"));
		b.type(tUser, "Hems");
		WebElement tPass = driver.findElement(By.id("pass"));
		b.type(tPass, "1234");
		WebElement btnLogin = driver.findElement(By.name("login"));
		b.buttonLogin(btnLogin);
		
	}

}
*/