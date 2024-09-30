package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01TestDemoQAState {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/automation-practice-form");
		System.out.println("Title: " + driver.getTitle());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 800)", "");
		
		driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]")).sendKeys("H");
		driver.findElement(By.xpath("//*[@id=\"react-select-2-option-0\"]")).click();
		js.executeScript("arguments[0].click()",driver.findElement(By.id("hobbies-checkbox-1")));
		//driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[2]/div")).click();
		//driver.findElement(By.xpath("//*[@id=\"react-select-3-option-2\"]")).click();		
		
		//driver.close();
	}

}
