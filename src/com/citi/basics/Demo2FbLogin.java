package com.citi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FbLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Elaborate step by step method
//		By loc = By.id("email");
//		WebElement ele = driver.findElement(loc);
//		ele.sendKeys("hello@gmail.com");
		
		//single line
		driver.findElement(By.id("email")).sendKeys("bala123456@gmail.com");  //check for id (email) 
		driver.findElement(By.id("pass")).sendKeys("test123");
		
		//click on login
		driver.findElement(By.name("login")).click();
		

	}

}
