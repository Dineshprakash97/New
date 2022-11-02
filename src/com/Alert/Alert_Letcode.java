package com.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Letcode {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
    driver.get("https://letcode.in/alert");
    
    // Simple Alert
    
    WebElement simple = driver.findElement(By.xpath("//button[@id='accept']"));
    simple.click();
    
    driver.switchTo().alert().accept();
    
    // Confirm Alert
    
    WebElement confirm = driver.findElement(By.xpath("//button[@class='button is-link is-outlined']"));
    confirm.click();
    
    driver.switchTo().alert().dismiss();
    
    // Prompt Alert
    
    WebElement prompt = driver.findElement(By.xpath("//button[@class='button is-primary']"));
    prompt.click();
    
    driver.switchTo().alert().sendKeys("Dinesh");
    
    String text = driver.switchTo().alert().getText();
    System.out.println(text);
    
    driver.switchTo().alert().accept();
    
    // Modern Alert
    
    WebElement modern = driver.findElement(By.xpath("//button[@class='button is-success']"));
    modern.click();
    
    WebElement close = driver.findElement(By.xpath("//button[@aria-label='close']"));
    close.click();
       
    System.out.println("Complete");
    
    

    
    
    
    
    
    
    
    
    
}

}
