package com.greens;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Omrgrens {
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https:omrbranch.com/softwaretestingtraininginchennaiomr");
		WebElement monster = driver.findElement(By.xpath("//button[text()='Right click to enter past date']"));
		Actions actions =new Actions(driver);
		actions.contextClick(monster).perform();
		Alert al=driver.switchTo().alert();
		al.sendKeys("Deepan");
		al.accept();
		
		
	    WebElement element = driver.findElement(By.xpath("//h6[text()='You entered as past date and pressed OK!']"));
		 
		String text=element.getText();
		System.out.println(text);
		
		}

}
