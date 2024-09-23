package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D10KeywordDrivenFramework {
	File file;
	FileInputStream fis;
	Properties prop;
	
	WebDriver driver;
	
	@Test
	public void login() {
		driver.findElement(By.name(prop.getProperty("userNameTxtBoxName"))).sendKeys("vivek");
		driver.findElement(By.xpath(prop.getProperty("passwordTxtBoxXPath"))).sendKeys("vivek123");
		driver.findElement(By.cssSelector(prop.getProperty("submitBtnCss"))).sendKeys(Keys.ENTER);
		
		System.out.println(driver.findElement(By.id(prop.getProperty("errMsgId"))).getText());
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("D:\\StarAgile\\Demos\\SA2406006\\SeleniumAutomationProject\\src\\com\\TestNGDemos\\MyData.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);				//Load all properties from .properties file
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
