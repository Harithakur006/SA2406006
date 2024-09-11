package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03GetPageSource {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		//String source = driver.getPageSource();
		//System.out.println(source);
		System.out.println(driver.getPageSource());
		
		driver.findElement(By.cssSelector("textarea[class=\"gLFyf\"]"));
		
		driver.close();
	}

}
