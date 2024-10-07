package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S06PracticeLogin_DDF {
	WebDriver driver;
	JavascriptExecutor js;
	@Given("Open {string}")
	public void open(String url) {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(url);
	    
	    js = (JavascriptExecutor) driver;
	}

	@When("Enter the user name as {string}")
	public void enter_the_user_name_as(String un) {
	    driver.findElement(By.name("username")).sendKeys(un);
	}

	@When("Enter the password as {string}")
	public void enter_the_password_as(String ps) {
	    driver.findElement(By.id("password")).sendKeys(ps);
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
		js.executeScript("window.scrollBy(0, 500)", "");
	    driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
	}

	@Then("Home page should be display")
	public void home_page_should_be_display() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("secure"));
	}
}
