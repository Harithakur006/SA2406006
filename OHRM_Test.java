package com.OHRMAssignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class OHRM_Test {
	String fEPath = "D:/AViIT/OHRM_Assignment.xlsx";
	String fPPath = "D:\\AViIT\\Demos\\Selenium_Sarvesh\\OrangeHRMAssignment\\src\\com\\OHRMAssignment\\ForOHRM.properties";
	Properties prop;
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	String empIdRead, userNameRead, expUserName;
	int rows, cells, i, j, index = 1;
	
	WebDriver driver;
	
	@Test(dataProvider = "dp")
	public void createUser(String fName, String mName, String lName, String empID, String userName, String password, String nationality, String mStatus, String bDate, String gender) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		driver.findElement(By.name("firstName")).sendKeys(fName);
		driver.findElement(By.name("middleName")).sendKeys(mName);
		driver.findElement(By.name("lastName")).sendKeys(lName);
		empIdRead = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).getAttribute("value");
		//System.out.println("Emp ID: " + empIdRead);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//*[@id="app"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div/span
		
		//Edit Employee
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[9]/div/button[2]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[1]/div[2]/i")).click();
		List<WebElement>nationalities = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div/span"));
		
		int cnt = 1;
		for(WebElement n : nationalities) {
			//System.out.println(n.getText());
			if(n.getText().equals(nationality))
				System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div["+cnt+1+"]/span")).getText());
			cnt++;
		}
		
		//Admin logout
		driver.findElement(By.xpath(prop.getProperty("logoutImage"))).click();
		driver.findElement(By.linkText("Logout")).click();
		
		//user Login
		driver.findElement(By.name(prop.getProperty("userNameTextBox"))).sendKeys(userName);
		driver.findElement(By.name(prop.getProperty("passwordTextBox"))).sendKeys(password);
		driver.findElement(By.xpath(prop.getProperty("loginButtom"))).click();
		
		userNameRead = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).getText();
		System.out.println(userNameRead);
		
		//User Logout
		driver.findElement(By.xpath(prop.getProperty("logoutImage"))).click();
		driver.findElement(By.linkText("Logout")).click();
		
		//Admin Login
		driver.findElement(By.name(prop.getProperty("userNameTextBox"))).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.name(prop.getProperty("passwordTextBox"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("loginButtom"))).click();
		
		//Search
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(userName);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		
		//edit
		
		//Delete
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[6]/div/button[1]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")).click();
		
		expUserName = fName +" " + lName;
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.name(prop.getProperty("userNameTextBox"))).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.name(prop.getProperty("passwordTextBox"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("loginButtom"))).click();
	}

	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.xpath(prop.getProperty("logoutImage"))).click();
		driver.findElement(By.linkText("Logout")).click();
		
		sheet.getRow(index).getCell(3).setCellValue(empIdRead);
		sheet.getRow(index).getCell(10).setCellValue(userNameRead);
		
		System.out.println("Exp " + expUserName);
		
		if(userNameRead.equals(expUserName))
			sheet.getRow(index).getCell(11).setCellValue("Pass");
		else
			sheet.getRow(index).getCell(11).setCellValue("Fail");
	}

	@DataProvider
	public Object[][] dp() {
		rows = sheet.getPhysicalNumberOfRows();
		cells = sheet.getRow(0).getPhysicalNumberOfCells();
		String [][] data = new String[rows-1][cells-2];
		
		for(i = 0; i < rows -1; i++)
		{
			for(j = 0; j < cells -2; j++)
			{
				cell = sheet.getRow(i+1).getCell(j);
				data[i][j] = cell.getStringCellValue();
			}
		}
		
		return data;
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPPath);
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		
		file = new File(fEPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		fos = new FileOutputStream(file);
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		driver.quit();
		wb.close();
		fos.close();
		fis.close();
	}

}
