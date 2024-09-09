package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02EchotrakLogin_ClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/");
		
		WebElement userId = driver.findElement(By.className("form-control"));
		userId.sendKeys("basavraj");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("basavraj123");
		WebElement loginBtn = driver.findElement(By.className("btn-primary"));
		loginBtn.click();
		
		//WebElement errMsg = driver.findElement(By.id("lblMsg"));
		//String text = errMsg.getText();
		
		//System.out.println("Error Message: " + text);
		
		//System.out.println("Error Message: " + driver.findElement(By.id("lblMsg")).getText());
		
		String text = driver.findElement(By.id("lblMsg")).getText();
		System.out.println("Error Message: " + text);
		
		if(text.contains("Invalid"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
		
		driver.close();
	}

}
