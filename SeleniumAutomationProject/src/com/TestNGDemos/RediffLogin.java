package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLogin {
	WebDriver driver;
	
	@FindBy (xpath = "//input[@id='login1']") WebElement userName;
	@FindBy (name = "proceed") WebElement signInBtn;
	
	public RediffLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void openSite()
	{
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	public void setUserName(String un)
	{
		//driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(un);
		userName.sendKeys(un);
	}
	public void clickOnSignInBtn()
	{
		//driver.findElement(By.name("proceed")).click();
		signInBtn.click();
	}
	public void handleAlert() throws InterruptedException
	{
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(5000);
		alt.accept();
	}
	public void tearDown()
	{
		driver.close();
	}
}
