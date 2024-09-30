package com.MyTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.DataProvider;

public class ReadDataFromExcel {
	String fPath = "ExcelFiles\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	static int totalRows;
	
	public static void main(String[] args) throws IOException {
		ReadDataFromExcel r1 = new ReadDataFromExcel();
		String[][] lData = r1.getLoginData();
		
		for(int i = 0; i < totalRows; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.println(lData[i][j]);
			}
		}
	}
	
	@DataProvider
	public String[][] getLoginData() throws IOException
	{
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		
		totalRows = sheet.getPhysicalNumberOfRows();
		String[][]data = new String[totalRows][2];
		
		for(int i = 0; i < totalRows; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return data;
	}
}
