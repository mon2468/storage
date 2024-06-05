package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();
		driver.switchTo().frame("java-content");
		WebElement img = driver.findElement(By.xpath("//div[@class='why learn']"));
		img.click();
	}

}
