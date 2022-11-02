package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath {
	
	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://www.facebook.com/login/");
       
        // Absolute Xpath
        
        WebElement name = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/div[2]/form/div/div/input"));
        name.sendKeys("dinesh");
        
        WebElement password = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/div[2]/form/div/div[2]/div/div/input"));
        password.sendKeys("23457");
        
        WebElement login = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/div[2]/form/div/div[3]/button"));
        login.click();
        
        System.out.println("Completed");
        
		
		
		
		
		
		
		
		
		
	}

}
