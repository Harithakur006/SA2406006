package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A11IPL_Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.iplt20.com/points-table/men/2024");
		
		List<WebElement>allTeams = driver.findElements(By.xpath("//*[@id=\"pointsdata\"]/tr/td[3]/div/h2"));
		//List<WebElement>result = driver.findElements(By.xpath("//*[@id=\"pointsdata\"]/tr[1]/td[12]/div/span"));
		
		for(int i = 0; i < allTeams.size(); i++)
		{
			int nCount = 0, lCount = 0, wCount = 0;
			System.out.print(allTeams.get(i).getText() + "\t");
			
			List<WebElement>result = driver.findElements(By.xpath("//*[@id=\"pointsdata\"]/tr["+(i+1)+"]/td[12]/div/span"));
			for(int j = 0; j < result.size(); j++)
			{
				String rs = result.get(j).getText();
				System.out.print(rs + "");
				if(rs.equals("N"))
					nCount++;
				else if(rs.equals("L"))
					lCount++;
				else if(rs.equals("W"))
					wCount++;
			}
			System.out.print("\tN: " + nCount + " L: " + lCount + " W: " + wCount);
			
			System.out.println();
		}
		
		driver.close();
	}

}
