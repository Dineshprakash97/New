package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_1 {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	    close.click();
		
		WebElement electronics = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[5]"));
	
		Actions a = new Actions(driver);
		
		a.moveToElement(electronics).build().perform();
		
		WebElement audio = driver.findElement(By.xpath("//a[text()='Audio']"));	
		a.moveToElement(audio).build().perform();
		
		WebElement blutooth = driver.findElement(By.xpath("//a[text()='Bluetooth Headphones']"));
		blutooth.click();
		
		System.out.println("Completed");

		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
