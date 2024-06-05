package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googletask {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:google.com");
	 driver.manage().window().maximize();
	WebElement element = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	element.sendKeys("Hexaware Technologies",Keys.ENTER);
	}

}
