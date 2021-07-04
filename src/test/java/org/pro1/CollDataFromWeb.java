package org.pro1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollDataFromWeb {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91720\\eclipse-workspace\\SeleniumPro1\\DRIVERS\\chromedriver.exe");
		
		File file = new File("C:\\Users\\91720\\eclipse-workspace\\MavenDay1\\Excel workbooks\\Maven pro sample 1.xlsx");
		
		FileInputStream f = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(f);
		
		Sheet creatSheet = w.createSheet("Amazon");
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		
		WebElement txtBox = d.findElement(By.id("twotabsearchtextbox"));
		
		txtBox.sendKeys("Iphone",Keys.ENTER);
		
		List<WebElement> allProducts = d.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for (int i = 0; i < allProducts.size(); i++) {
			String text = allProducts.get(i).getText();
			
			Row createRow = creatSheet.createRow(i);
			
			Cell createCell = createRow.createCell(0);
			
			createCell.setCellValue(text);
			
		}
		
		FileOutputStream fo = new FileOutputStream(file);
		w.write(fo);
	
}
}
