package org.pro1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateNewSheet {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\91720\\eclipse-workspace\\MavenDay1\\Excel workbooks\\Maven pro sample 1.xlsx");
		FileInputStream f = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(f);
		
		Sheet createSheet = w.createSheet("Java");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("Java Selenium");
		
		FileOutputStream fo = new FileOutputStream(file);
		
		w.write(fo);
		
		
		
	}	
}
