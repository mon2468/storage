package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hi {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jiocinema.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//button[text()='TATA IPL']"));
		element.click();
		
		System.out.println("HI");
		
	}

}
