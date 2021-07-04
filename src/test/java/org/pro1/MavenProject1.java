package org.pro1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenProject1 {
public static void main(String[] args) throws IOException {
	
	File file = new File("C:\\Users\\91720\\eclipse-workspace\\MavenDay1\\Excel workbooks\\Maven pro sample 1.xlsx");
	FileInputStream f = new FileInputStream(file);
	
	Workbook w = new XSSFWorkbook(f);
	
	Sheet s = w.getSheet("Sheet1");
	
	Row r = s.getRow(0);
	
	Cell c = r.getCell(0);
	
	String stringCellValue = c.getStringCellValue();
	
	System.out.println(stringCellValue);
}
}
