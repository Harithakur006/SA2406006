package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S04GoogleLinks {
	WebDriver driver;
	
	@Given("Open google application")
	public void open_google_application() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com");
	}

	@When("Click on Gmail link")
	public void click_on_gmail_link() {
	    driver.findElement(By.linkText("Gmail")).click();
	}

	@Then("Gmail page should display")
	public void gmail_page_should_display() {
	    Assert.assertTrue(driver.getTitle().contains("Gmail"));
	}

	@When("Click on Images Link")
	public void click_on_images_link() {
		driver.findElement(By.linkText("Images")).click();
	}

	@Then("Images Page should display")
	public void images_page_should_display() {
		Assert.assertTrue(driver.getTitle().contains("Images"));
	}

	@When("Click on Advt Link")
	public void click_on_advt_link() {
		driver.findElement(By.partialLinkText("Adve")).click();
	}

	@Then("Advt page should display")
	public void advt_page_should_display() {
		Assert.assertTrue(driver.getTitle().contains("Adve"));
	}

	@When("Click on Business link")
	public void click_on_business_link() {
		driver.findElement(By.linkText("Business")).click();
	}

	@Then("Business page should display")
	public void business_page_should_display() {
		Assert.assertTrue(driver.getTitle().contains("Business"));
	}

}
