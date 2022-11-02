package com.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demosite {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    
	    // Alert with OK
	    
	    WebElement ok = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
	    ok.click();
	    
	    WebElement a = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    a.click();
	    
	    driver.switchTo().alert().accept();
	    
	    // Alert with OK & Cancel
	    
	    WebElement cancel = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	    cancel.click();
	    
	    WebElement b = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	    b.click();
	    
	    driver.switchTo().alert().dismiss();
	    
	    //Alert with Textbox
	    
	    WebElement text = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	    text.click();
	    
	    WebElement c = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	    c.click();
	    
	    driver.switchTo().alert().sendKeys("Dinesh");
	    
	    String text2 = driver.switchTo().alert().getText();
	    System.out.println(text2);
	    
	    driver.switchTo().alert().accept();
	    
	    System.out.println("Done");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
