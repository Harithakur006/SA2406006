package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
	public static void main(String[] args) {
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		//driver.findElement(By.linkText("radio buttons")).click();
		
		WebElement rediobutton1=driver.findElement(By.xpath("//form [@action='dummy']//input[@value='Milk']"));
		System.out.println("Befor clicking");
		System.out.println("Milk is selected : " +rediobutton1.isSelected());
		System.out.println("Milk is Displayed : " +rediobutton1.isDisplayed());
		System.out.println("Milk is Displayed : " +rediobutton1.isEnabled());
		
		
		if(rediobutton1.isSelected() == false) {
			rediobutton1.click();
		}
		System.out.println("After clicking");
		System.out.println("Milk is selected : " +rediobutton1.isSelected());
		System.out.println("Milk is Displayed : " +rediobutton1.isDisplayed());
		System.out.println("Milk is Displayed : " +rediobutton1.isEnabled());

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&s_kwcid=AL!1631!3!!e!!o!!makemytrip%5C&ef_id=:G:s");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        //to ignore login
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/section/span")).click();
		
		//from city
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("bang");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/ul/li[1]/div/div/p[1]/span[1]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div[2]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")).sendKeys("Del");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/div/div/ul/li[1]/div/div/p[2]")).click();
		
		//calander
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div[3]/label")).click();
		
		//date
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[2]")).click();
		//new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div[3]/label"))).selectByVisibleText("30");

		*/
		
		String str1 = "Anup", str2 = "Anup";
		
		if(str1 == str2)
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		

	}

}
