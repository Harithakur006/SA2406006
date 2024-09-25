package com.TestNGDemos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D14CreateLoginData {
	String fPath = "ExcelFiles\\LoginData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index = 0;
	
	@Test(dataProvider = "getLoginData")
	public void writeData(String un, String ps) {
		row = sheet.createRow(index);
		cell = row.createCell(0);
		cell.setCellValue(un);
		
		cell = row.createCell(1);
		cell.setCellValue(ps);
		
		cell = row.createCell(2);
		cell.setCellValue("Not Run");
		
		index++;
	}
	
	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "anup", "anup123" },
			new Object[] { "admin", "admin123" },
			new Object[] { "lavanya", "lavanya123" },
			new Object[] { "admin", "admin123" },
			new Object[] { "ruksar", "ruksar123" },
			new Object[] { "vivek", "vivek" }
		};
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("Login Data");
		
		/*row = sheet.createRow(index);
		cell = row.createCell(0);
		cell.setCellValue("User Name");
		
		cell = row.createCell(1);
		cell.setCellValue("Password");
		
		cell = row.createCell(2);
		cell.setCellValue("Result");*/
		
		sheet.createRow(index).createCell(0).setCellValue("User Name");
		sheet.getRow(index).createCell(1).setCellValue("Password");
		sheet.getRow(index).createCell(2).setCellValue("Result");
		
		index++;
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
