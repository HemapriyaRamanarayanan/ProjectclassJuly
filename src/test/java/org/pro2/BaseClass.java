package org.pro2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	
	public void  getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91720\\eclipse-workspace\\SeleniumPro1\\DRIVERS\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public void launchUrl(String data) {
		driver.get(data);

	}
	
	public void type(WebElement element, String data) {
		element.sendKeys(data);
		}
	
	public void buttonLogin(WebElement element) {
	  element.click();

	}
	
	public void mouseHoverAction(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();

	}
	
	public void selectByVisibleText(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);

	}
	
	public void enterTextByJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+data+"')", element);

	}
	
	public String excelData(String path, String sheetname, int rowno, int cellno) throws IOException {
		File file = new File(path);
		
		FileInputStream st = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(st);
		
		Sheet s = w.getSheet(sheetname);
		
		Row r = s.getRow(rowno);
		
		Cell c = r.getCell(cellno);
		
		int type = c.getCellType();
		
		String value="";
		
		if (type==1) {
		
			String stringCellValue = c.getStringCellValue();
		
		}else if (DateUtil.isCellDateFormatted(c)) {
			
			Date dateCellValue = c.getDateCellValue();
			
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			
			value = format.format(dateCellValue);
			
		}else {
			double numericCellValue = c.getNumericCellValue();
			
			long l = (long) numericCellValue;
			
			value = String.valueOf(l);
			
		}
		
             return value;
	}
	
		

	}
		
