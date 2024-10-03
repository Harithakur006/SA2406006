package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jotform.com/form-templates/exam-registration-form");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		
		driver.switchTo().frame(0);
		
		//driver.findElement(By.id("first_9")).sendKeys("Aboli");
		driver.findElement(By.xpath("//*[@id=\"first_9\"]")).sendKeys("Aboli");
		driver.findElement(By.id("last_9")).sendKeys("Khanorkar");
		driver.findElement(By.id("input_10")).sendKeys("1001");

	}

}
