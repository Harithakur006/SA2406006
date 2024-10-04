package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S03PracticeTestLogin {
	WebDriver driver;
	
	@Given("Open Practice Test in browser")
	public void open_practice_test_in_browser() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("Enter valid user name as {string}")
	public void enter_valid_user_name_as(String un) {
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	}

	@When("Enter valid password as {string}")
	public void enter_valid_password_as(String ps) {
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("Home page should display")
	public void home_page_should_display() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("successfully"));
	}
	
	//Invalid data

	@When("Enter invalid user name as {string}")
	public void enter_invalid_user_name_as(String un) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	}

	@When("Enter invalid password as {string}")
	public void enter_invalid_password_as(String ps) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
	}

	@When("Click on Submit button")
	public void click_on_submit_button() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("error message should display")
	public void error_message_should_display() {
	    Assert.assertTrue(driver.getPageSource().contains("Your username is invalid!"));
	}
}
