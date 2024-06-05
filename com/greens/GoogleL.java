package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleL {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement Element = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		Element.sendKeys("Greens Technology",Keys.ENTER);
		
	}

}
