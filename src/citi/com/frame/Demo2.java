package citi.com.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//into the frame
		driver.switchTo().frame(0);
		
		//ctrl f in inspect element and see fif there are any duplicates
		// //input[@name='fldLoginUserId']
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		
		//click on continue
		driver.findElement(By.partialLinkText("CONTINUE")).click();
		
		
		//come out of frame
		driver.switchTo().defaultContent();
		
		
		
		
	}

}

