package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailId = driver.findElement(By.name("email"));
		emailId.sendKeys("ankushvankore@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("1234567890");
		//WebElement loginBtn = driver.findElement(By.name("login"));
		//loginBtn.click();
		//driver.findElement(By.cssSelector("button[class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
		driver.findElement(By.cssSelector("button[value=\"1\"]")).click(); 

	}

}
