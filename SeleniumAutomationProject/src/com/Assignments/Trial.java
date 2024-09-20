package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trial {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		
		Alert alt;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Aboli Khanorkar");
		//driver.findElement(By.id("input")).sendKeys("Aboli Khanorkar");
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")));

		

	}

}
