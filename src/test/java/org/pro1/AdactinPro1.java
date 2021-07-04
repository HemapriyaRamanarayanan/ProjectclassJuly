package org.pro1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AdactinPro1 {
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91720\\eclipse-workspace\\SeleniumPro1\\DRIVERS\\chromedriver.exe");
	
	File file = new File("C:\\Users\\91720\\eclipse-workspace\\MavenDay1\\Excel workbooks\\Maven Sample Pro 2.xlsx");
	FileInputStream f = new FileInputStream(file);
	
	Workbook w = new XSSFWorkbook(f);
	
	Sheet s = w.createSheet("Adactin Hotel 2");
	
	WebDriver d = new ChromeDriver();
	
	d.get("https://adactinhotelapp.com/");
	d.manage().window().maximize();
	
	WebElement usr = d.findElement(By.name("username"));
	usr.sendKeys("karthi007");
	
	WebElement psw = d.findElement(By.name("password"));
	psw.sendKeys("Karthi@1989");
	
	WebElement btnLog = d.findElement(By.name("login"));
	btnLog.click();
	
	
	WebElement txt1 = d.findElement(By.name("location"));
	txt1.click();
	
	Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	WebElement txt2 = d.findElement(By.name("hotels"));
	txt2.click();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	WebElement txt3 = d.findElement(By.name("room_type"));
	txt3.click();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	WebElement search = d.findElement(By.xpath("//input[@type='submit']"));
	search.click();
	
	WebElement select = d.findElement(By.xpath("//input[@name='radiobutton_0']"));
	select.click();
	
	WebElement btnContinue = d.findElement(By.xpath("//input[@type='submit']"));
	btnContinue.click();
	
	WebElement fName = d.findElement(By.name("first_name"));
	fName.sendKeys("Hema");
	
	WebElement lName = d.findElement(By.name("last_name"));
	lName.sendKeys("Ram");
	
	WebElement add = d.findElement(By.name("address"));
	add.sendKeys("Chennai");
	
	WebElement cNum = d.findElement(By.name("cc_num"));
	cNum.sendKeys("1234567890123456");
	
	WebElement cType = d.findElement(By.name("cc_type"));
	cType.click();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	WebElement expMonth = d.findElement(By.name("cc_exp_month"));
	expMonth.click();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	WebElement expYear = d.findElement(By.name("cc_exp_year"));
	expYear.click();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	WebElement cvv = d.findElement(By.name("cc_cvv"));
	cvv.sendKeys("567");
	
	
	WebElement btnBookNow = d.findElement(By.name("book_now"));
	btnBookNow.click();
	
	Thread.sleep(4000);
	WebElement ordNum = d.findElement(By.xpath("//input[@name='order_no']"));
	
     String attribute = ordNum.getAttribute("value");
	
     
	Row r1 = s.createRow(0);
	
	Cell c = r1.createCell(0);
	
	c.setCellValue(attribute);

    FileOutputStream fo = new FileOutputStream(file);
    w.write(fo);
   

}
}