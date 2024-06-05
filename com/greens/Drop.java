package com.greens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement ddncountry = driver.findElement(By.id("country-list"));
		Select select=new Select(ddncountry);
		select.selectByIndex(30);
		
		//print all options count:
		
		List<WebElement>options=select.getOptions();
		//count:
	   int size=options.size();
		System.out.println(size);
		
		//get the 6th index option:
		WebElement element=options.get(6);
		//get the text:
		String text=element.getText();
		System.out.println(text);
		//print the All options selected text:
		List<WebElement> allselectedoptions=select.getAllSelectedOptions();
	}

}
