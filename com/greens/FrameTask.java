package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTask {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//p[contains(text(),'We undertake ')]"));
	    System.out.println(element.getText());
	    
	    
	    
	    WebElement automation = driver.findElement(By.xpath("(//iframe[@src='https://omrbranch.com/public/html/automation.html'])"));
	    driver.switchTo().frame(automation);
	    
	    
	    
	    WebElement auto = driver.findElement(By.xpath("(//h2[text()='Automation'])"));
	    System.out.println(auto.getText());
	    
	    driver.switchTo().frame("core-java");
	    
	    
	    
	    
	   WebElement java = driver.findElement(By.xpath("//h4[text()='Core Java']"));
	    System.out.println(java.getText());
	    
	   driver.switchTo().frame("oops");
	   
	    
	    WebElement oops = driver.findElement(By.xpath("(//p[text()='1.1 OOPS'])"));
	    System.out.println(oops.getText());
	    
	   
	    
	    
	    WebElement element4 = driver.findElement(By.xpath("(//li[text()='Inheritance'])"));
	    System.out.println(element4.getText());
	    
	    WebElement element5 = driver.findElement(By.xpath("(//li[text()='Abstraction'])"));
	    System.out.println(element5.getText());
	    
	    WebElement element6 = driver.findElement(By.xpath("(//li[text()='Polymorphism'])"));
	    System.out.println(element6.getText());
	    
	    WebElement element7 = driver.findElement(By.xpath("(//li[text()='Encapsulation'])"));
	    System.out.println(element7.getText());
	    
	    driver.switchTo().parentFrame();
	    
	    
	    
	    
	    driver.switchTo().frame("collections");
	    
	    
	    WebElement collections = driver.findElement(By.xpath("//p[text()='1.2 Collections']"));
	    System.out.println(collections.getText());
	    
	    WebElement list = driver.findElement(By.xpath("//li[text()='List']"));
	    System.out.println(list.getText());
	    
	    WebElement set = driver.findElement(By.xpath("//li[text()='Set']"));
	    System.out.println(set.getText());
	    
	    
	    WebElement map = driver.findElement(By.xpath("//li[text()='Map']"));
	    System.out.println(map.getText());
	    
	    driver.switchTo().parentFrame();
	    driver.switchTo().parentFrame();
	    
	    driver.switchTo().frame("selenium");
	    
	    WebElement selenium = driver.findElement(By.xpath("(//h4[text()='Selenium'])"));
	    System.out.println(selenium.getText());
	    
	    
	    driver.switchTo().frame("actions");
	    WebElement actions = driver.findElement(By.xpath("(//p[text()='Actions'])"));
	    System.out.println(actions.getText());
	    
	    
	   WebElement findElement = driver.findElement(By.xpath("//li[text()='Move to Ele']"));
	    System.out.println(findElement.getText());
	    
	    WebElement findElement2 = driver.findElement(By.xpath("//li[text()='Click']"));
	    System.out.println(findElement2.getText());
	    
	    WebElement findElement3 = driver.findElement(By.xpath("//li[text()='Double Click']"));
	    System.out.println(findElement3.getText());
	    
	    
	    
	    WebElement findElement4 = driver.findElement(By.xpath("//li[text()='Right Click']"));
	    System.out.println(findElement4.getText());
	    
	    System.out.println("==============================");
	    
	    
	    System.out.println(findElement4.getText());
	    
	     System.out.println(findElement3.getText());
	     
	     System.out.println(findElement2.getText());
	     
	     System.out.println(findElement.getText());
	     
	     System.out.println(actions.getText());
	     
	     driver.switchTo().parentFrame();
	     
	     System.out.println(selenium.getText());
	     
	     driver.switchTo().parentFrame();
	     driver.switchTo().frame("core-java");
	     
		     
	   
	     
	     driver.switchTo().frame("collections");
	     
	     System.out.println(map.getText());
	     
	     System.out.println(set.getText());
	     
	     System.out.println(list.getText());
	     
	     System.out.println(collections.getText());
	     
	     
	     driver.switchTo().parentFrame();
	     
	     driver.switchTo().frame("oops");
		   
	     
		    System.out.println(element7.getText());

		    
		    System.out.println(element6.getText());
		    
		    System.out.println(element5.getText());
		    
		    
          System.out.println(element4.getText());
          
		    
          System.out.println(oops.getText());
		    
        driver.switchTo().parentFrame();
        
        System.out.println(java.getText());
	    
        driver.switchTo().parentFrame();
        
        System.out.println(auto.getText());
        
        driver.switchTo().defaultContent();
        
		    
        System.out.println(element.getText());   
		    
		    
		    
	     System.out.println("========================");
	     
	     
		    
	     
	    
	    
	    
	}

}
