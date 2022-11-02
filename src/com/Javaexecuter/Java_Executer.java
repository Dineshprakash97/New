package com.Javaexecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Executer {
	
	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Dinesh");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12567");
		
//		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
//		login.click();
		
		System.out.println("Login");
		
		JavascriptExecutor j = (JavascriptExecutor) driver; // narrow casting
		
		j.executeScript("window.scrollBy(0,2000)", " ");
		
		//j.("arguments[0].scrollIntoView();", signup);
		
		
		WebElement signup = driver.findElement(By.xpath("//span[text()='Sign up']"));
		signup.click();
		
		
	}

}
