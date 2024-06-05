package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement txtfirstname = driver.findElement(By.xpath("(//input[@placeholder='First Name'])"));
		txtfirstname.sendKeys("R");
		
		WebElement txtlastname = driver.findElement(By.xpath("(//input[@placeholder='Last Name'])"));
		txtlastname.sendKeys("Deepan");
		
		
		WebElement Address = driver.findElement(By.xpath("(//textarea[@class='form-control ng-pristine ng-untouched ng-valid'])"));
		Address.sendKeys("No:12,Valayapathi Street,DakchanamoorthiNagar,manjakuppam,cuddalore.");
		
		
		WebElement Email = driver.findElement(By.xpath("(//input[@type='email'])"));
		Email.sendKeys("rdeepan1348@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("(//input[@type='tel'])"));
		phone.sendKeys("7904468373");
		
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gender.click();
		
		WebElement hobbies = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		hobbies.click();

		//WebElement language = Select.getFirstSelectedOption();
		//String text=language.getText();
		//System.out.println(text);
		driver.
		
		
		
		
		
	
		
		
		
	
		
		
		
		
		
	} 

}
