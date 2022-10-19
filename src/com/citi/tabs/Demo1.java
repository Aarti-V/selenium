package com.citi.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//maximising the browser
		driver.manage().window().maximize();
		
		//settimg implicit wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//driver.get("https://db4free.net/");
		
		//click on phpmyadmin
		//driver.findElement(By.partialLinkText("phpMy")).click();
		
		//print the session id for the 2 tabs opened
		// getWindowHandles() - returns all the session ids of the tabs opened in the browser
//		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
//		
//		System.out.println(windows);
//		
//		//2 tabs
//		System.out.println(windows.get(0));
//		System.out.println(windows.get(1));
//		
//		//2nd tab automating
//		driver.switchTo().window(windows.get(1));
//		
//		driver.findElement(By.id("input_username")).sendKeys("admin");
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
		
		//click on go
		driver.findElement(By.xpath("//img[@alt='Go']")).click();
		
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();
		
	}

}
