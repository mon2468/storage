package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Omrdragdrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/seleniumtraininginchennaiomr");
		WebElement s= driver.findElement(By.xpath("//a[text()= 'String '  ]"));
		WebElement d=driver.findElement(By.xpath("//li[@class='placeholder'])[1]"));
		Actions actions=new Actions(driver); 
		actions.dragAndDrop(s,d).perform();	
		
		WebElement s1=driver.findElement(By.xpath("//a[text()=' List ']"));
		WebElement d1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions actions1=new Actions(driver); 
		actions1.dragAndDrop(s1,d1).perform();
		
		WebElement s2=driver.findElement(By.xpath("//a[text()=' Actions ']"));
		WebElement d2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		Actions actions2=new Actions(driver); 
		actions2.dragAndDrop(s2,d2).perform();
		
		Thread.sleep(6000);
		
		WebElement s3=driver.findElement(By.xpath("//a[text()=' Webdriver ']"));
		WebElement d3=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Actions actions3=new Actions(driver); 
		actions3.dragAndDrop(s3,d3).perform();
		
		
		
		
		
		
	}
}