package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		// WebElement searchBox = driver.findElement(By.className("")); -
		// InvalidSelector
		WebElement searchBox = driver.findElement(By.className("gLFyf"));
		searchBox.sendKeys("Automation jobs");
		searchBox.sendKeys(Keys.ENTER);
		String src = driver.getTitle();
		System.out.println(src);
		if (src.contains("Automation")) {
			System.out.println("correct results");
		}
		else
			System.out.println("Wrong");

	}

}
