package com.Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://www.facebook.com/");
//		
//		Thread.sleep(4000);
//		
//		WebElement username = driver.findElement(By.name("email"));
//		username.sendKeys("Dinesh");
		
		// Implicit wait
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys("12345");
//		
//		System.out.println("Done");
		
		driver.get("https://letcode.in/signin");
		
		WebElement name = driver.findElement(By.name("email"));
		name.sendKeys("Dinesh");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("234567");
		
		WebElement login = driver.findElement(By.xpath("//button[text()='LOGIN']"));
		login.click();
		
		// Explicit wait
		
		WebDriverWait w = new WebDriverWait(driver, 20 );
		
		WebElement close = driver.findElement(By.id("toast-container"));
		
		w.until(ExpectedConditions.visibilityOf(close));
		System.out.println(close.getText());
		w.until(ExpectedConditions.invisibilityOf(close));
		
		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign up']"));
		signup.click();
		
		
		
	}

}
