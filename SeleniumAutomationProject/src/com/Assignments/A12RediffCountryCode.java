package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A12RediffCountryCode {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		driver.findElement(By.xpath("//*[@id=\"div_mob\"]/table/tbody/tr/td[3]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"country_id\"]/ul/li[2]")).click();
	}

}
