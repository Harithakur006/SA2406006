package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S01GoogleTitle {
	WebDriver driver;
	String title;
	
	@Given("Open google")
	public void open_google() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com");
	}

	@When("Read the title")
	public void read_the_title() {
	    title = driver.getTitle();
	}

	@Then("Title should be Google")
	public void title_should_be_google() {
		if(title.equals("Google"))
			System.out.println("Title Matching");
		else
			System.out.println("Title Not matching");
		
		driver.close();
	}
}
