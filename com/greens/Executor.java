package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executor {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		
		js.executeScript("arguments[0].SetAttribute('Value','rdeepan1348@gmail.com')", email);
	     WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		 js.executeScript("arguments[0].SetAttribute('value','2468@+')", password);
		 
		 Thread.sleep(70000);
		 
		 
		 WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		 js.executeScript("arguments[0]. click()",login);
	}

}
