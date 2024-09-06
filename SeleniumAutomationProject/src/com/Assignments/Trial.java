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

		WebElement searchbox = driver.findElement(By.className("gLFyf"));
		searchbox.sendKeys("Automation jobs for freshers");
		searchbox.sendKeys(Keys.ENTER);

		String title = driver.getTitle();
		if (title.contains("Automation jobs for freshers")) {
			System.out.println("Correct");
		} else
			System.out.println("Incorect");

	}

}
