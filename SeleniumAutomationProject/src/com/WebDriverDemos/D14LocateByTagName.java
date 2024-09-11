package com.WebDriverDemos;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D14LocateByTagName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links: " + links.size());
		
		//System.out.println(links.get(0).getText());
		//System.out.println(links.get(1).getText());
		
		//for(int i = 0; i < links.size(); i++)
			//System.out.println(links.get(i).getText());
		
		for(WebElement l : links)
			System.out.println(l.getText());
		
		/*List<String>students = new ArrayList<>();
		students.add("aaa");
		students.add("Bbb");
		
		//students.get(0) --> Will give you first element
		
		for(String s : students)
			System.out.println(s);*/
		
		driver.close();
	}

}
