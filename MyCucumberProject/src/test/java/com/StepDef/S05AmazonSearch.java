package com.StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class S05AmazonSearch {
	public static WebDriver driver;
	@Given("Open amazon")
	public void open_amazon() {
	    System.out.println("Launcing amazon");
	}

	@When("I search for {string}")
	public void i_search_for(String product) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
	}

	@When("I click on Search button")
	public void i_click_on_search_button() {
	    driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("Search result should display")
	public void search_result_should_display() throws InterruptedException {
	    Assert.assertTrue(driver.getTitle().contains("iPhone"));
	    
	    Thread.sleep(5000);
	}
}
