package com.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import static com.StepDef.S05AmazonSearch.driver;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
public class MyHooks {
	
	//@Before
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	}
	//@After
	public void closeBrowser()
	{
		driver.close();
	}
}
