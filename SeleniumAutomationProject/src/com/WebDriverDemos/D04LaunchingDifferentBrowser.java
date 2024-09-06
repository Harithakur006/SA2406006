package com.WebDriverDemos;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D04LaunchingDifferentBrowser {

	public static void main(String[] args) {
		WebDriver driver = null;
		Scanner scn = new Scanner(System.in);
		int ch;
		
		System.out.print("Select your browser\n1. Chrome\n2. Edge\n3. Firefox\nEnter Choice: ");
		ch = scn.nextInt();
		
		switch(ch)
		{
		case 1:
			driver = new ChromeDriver();
			break;
		case 2:
			driver = new EdgeDriver();
			break;
		case 3:
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		driver.close();
	}

}
