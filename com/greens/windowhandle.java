package com.greens;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.amazon.in");
		driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("twotabsearchtextbox"));
	username.sendKeys("iphone",Keys.ENTER);
	WebElement lnkiphone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
	lnkiphone.click();
	String parentwindowId = driver.getWindowHandle();
	System.out.println(parentwindowId);
	
	Set  <String> allwindowsId=driver.getWindowHandles();
	List<String> li=new ArrayList<String>(allwindowsId);
		
	String x=li.get(1);
	driver.switchTo().window(x);
	WebElement btnAddcart = driver.findElement(By.id("add-to-cart-button"));
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",btnAddcart);
	
	
	driver.switchTo().window(li.get(0));
	driver.close();
		
	}

}
