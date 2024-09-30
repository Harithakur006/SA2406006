package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D04SimpleExtentReport {
	public static void main(String[] args) {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("Reports\\MySimpleReport.html");
		//Generate the Report file with name MySimpleReport.html
		ExtentReports report = new ExtentReports();
		
		report.attachReporter(htmlReport);
		//Help to add the report in html file
		
		ExtentTest test;
		
		//Environment Configuration
		report.setSystemInfo("Laptop Name", "Dell");
		report.setSystemInfo("Processor", "I5");
		report.setSystemInfo("Operating System", "Windows 11");
		report.setSystemInfo("User Name", "Ankush");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Address", "Pattankodoli");
		
		//Configuration of look and feel for the report
		htmlReport.config().setDocumentTitle("My First Extent Report");
		htmlReport.config().setReportName("Google Test");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd-MMM-yyyy");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Star Agile", Keys.ENTER);
		
		driver.close();
		
		test = report.createTest("Google Search");
		test.log(Status.PASS, MarkupHelper.createLabel("Google Search: Pass", ExtentColor.GREEN));
		//You are adding the log in your report.
		
		report.flush();		//Will generate the report
		//Unless and until you are not calling this method, your report will not get generated
	}
}
