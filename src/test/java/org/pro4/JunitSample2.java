package org.pro4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitSample2 {

	public static WebDriver d;

	
	@Test
	public  void logIn1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91720\\eclipse-workspace\\SeleniumPro1\\DRIVERS\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		
		WebElement findElement = d.findElement(By.id("email"));
		findElement.sendKeys("anitha");
		WebElement findElement2 = d.findElement(By.name("pass"));
		findElement2.sendKeys("1234");
		
	}
	
	
}
