package org.pro1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateFormatAndNum {
public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\91720\\eclipse-workspace\\MavenDay1\\Excel workbooks\\Maven Sample Pro 2.xlsx");
		FileInputStream f = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(f);
		
		Sheet s = w.getSheet("Sheet1");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row row = s.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				int cellType = cell.getCellType();
				
				
				if (cellType==1) {
					
					String stringCellValue = cell.getStringCellValue();
					
					System.out.println(stringCellValue);
				
				} else if (DateUtil.isCellDateFormatted(cell)) {
					
					Date dateCellValue = cell.getDateCellValue();
					
					SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMMM-yyyy");
					
					String format = dateformat.format(dateCellValue);
					
					System.out.println(format);
					
				}else {
					
					double numericCellValue = cell.getNumericCellValue();
					
					long l = (long) numericCellValue;
					
					System.out.println(l);
				}
					
				}
				
				
				

}
}
}
