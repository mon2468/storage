package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement s = driver.findElement(By.xpath(""));
		WebElement d=driver.findElement(By.id("fourth"));
		 Actions actions=new Actions(driver);
		 actions.dragAndDrop(s,d).perform();
		
	}

}
