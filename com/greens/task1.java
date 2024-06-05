package com.greens;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task1 {
	public static void main(String[] args) throws AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https:/omrbranch.com");
	driver.manage().window().maximize();
	
	Robot robot=new Robot();
	//username using robot method.
	
	robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    
    //shift
    
    //robot.keyPress(KeyEvent.VK_SHIFT);
    
    robot.keyPress(KeyEvent.VK_D);
    robot.keyRelease(KeyEvent.VK_D);
    
    robot.keyPress(KeyEvent.VK_E);
    robot.keyRelease(KeyEvent.VK_E);
    
    robot.keyPress(KeyEvent.VK_E);
    robot.keyRelease(KeyEvent.VK_E);
    
    robot.keyPress(KeyEvent.VK_P);
    robot.keyRelease(KeyEvent.VK_P);
    
    
    robot.keyPress(KeyEvent.VK_A);
    robot.keyRelease(KeyEvent.VK_A);
    
    
    robot.keyPress(KeyEvent.VK_N);
    robot.keyRelease(KeyEvent.VK_N);
    
    //
    robot.keyPress(KeyEvent.VK_2);
    robot.keyRelease(KeyEvent.VK_2);
    
    robot.keyPress(KeyEvent.VK_4);
    robot.keyRelease(KeyEvent.VK_4);
    
   
    
    robot.keyPress(KeyEvent.VK_G);
    robot.keyRelease(KeyEvent.VK_G);
    
    robot.keyPress(KeyEvent.VK_M);
    robot.keyRelease(KeyEvent.VK_M);
    
    robot.keyPress(KeyEvent.VK_A);
    robot.keyRelease(KeyEvent.VK_A);
    
    robot.keyPress(KeyEvent.VK_I);
    robot.keyRelease(KeyEvent.VK_I);
    
    robot.keyPress(KeyEvent.VK_L);
    robot.keyRelease(KeyEvent.VK_L);
    
   
    
    
    System.out.println("DEEPAN");
    //password
    
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    
    
    robot.keyPress(KeyEvent.VK_2);
    robot.keyRelease(KeyEvent.VK_2);
    
    robot.keyPress(KeyEvent.VK_4);
    robot.keyRelease(KeyEvent.VK_4);

    robot.keyPress(KeyEvent.VK_6);
    robot.keyRelease(KeyEvent.VK_6);

    robot.keyPress(KeyEvent.VK_8);
    robot.keyRelease(KeyEvent.VK_8);

    robot.keyPress(KeyEvent.VK_9);
    robot.keyRelease(KeyEvent.VK_9);

    
  

	System.out.println("Clicked");
	
	}
}
