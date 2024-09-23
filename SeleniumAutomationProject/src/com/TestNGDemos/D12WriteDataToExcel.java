package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D12WriteDataToExcel {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
	public void writeData() {
		row = sheet.createRow(0);		//Create 1st row
		cell = row.createCell(0);		//Creates 1st cell inside 1st row
		
		cell.setCellValue("Lavanya");
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("MyFirstExcelFile.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("FirstSheet");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos); 				//Will write the data to file
		System.out.println("Data Added in the file");
		wb.close();
		fos.close();
	}
	

}
