package com.citi.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");    // webdriver.chrome.driver taken from the error snippet
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver(); //WebDriver is an interface here //only method decl will be there // child cls will have the expl
		
		driver.get("https://www.facebook.com/");
		
		//prints title in the console after opening the browser
		String title=driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		driver.quit(); //auto closes the browser
	}

}
