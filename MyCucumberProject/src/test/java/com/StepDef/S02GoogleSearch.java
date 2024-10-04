package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02GoogleSearch {
	WebDriver driver;
	@Given("I Open google")
	public void i_open_google() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com");
	}

	@When("I enter text in searchbox")
	public void i_enter_text_in_searchbox() {
	    driver.findElement(By.name("q")).sendKeys("Smruti Mandhana");
	}

	@When("I hit enter")
	public void i_hit_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("Valid search should display")
	public void valid_search_should_display() throws InterruptedException {
		Thread.sleep(1000);
	    Assert.assertTrue(driver.getTitle().contains("Smruti"));
	}
}
