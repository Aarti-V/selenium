package com.citi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBRegister {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//maximising the browser
		driver.manage().window().maximize();
		
		//settimg implicit wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.facebook.com/");
		
		//click on create new account //no id no name //using link text
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(5000);
	
		//enter firstname as john
		driver.findElement(By.name("firstname")).sendKeys("John");
		
		//enter lastname as wick
		driver.findElement(By.name("lastname")).sendKeys("wick");
		
		//20 Dec 2000  //creating an object and using since nonstatic method
		Select selectDay=new Select(driver.findElement(By.id("day")));  //driver.findElement(By.id("day")) is the WeElement
		selectDay.selectByVisibleText("20");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));  //driver.findElement(By.id("day")) is the WeElement
		selectMonth.selectByValue("12");
		
		Select selectYear=new Select(driver.findElement(By.id("year")));  //driver.findElement(By.id("day")) is the WeElement
		selectYear.selectByVisibleText("2000");
		
		//RadioButton
		//click on custom //basic locators are useless here
		//go for advanced locators - xpath //
		
		//label[text()='Custom'] also works
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		//driver.findElement(By.xpath("//label[text()='Custom']")).click();
		
		//click on signup
		
		

	}

}
