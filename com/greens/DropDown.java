package com.greens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement ddnskills = driver.findElement(By.id("skills"));
		Select select=new Select(ddnskills);
		
		
		      //multivalue:
			Select select1=new Select(ddnskills);
			boolean b=select.isMultiple();
			System.out.println(b);
			
		}
	}


