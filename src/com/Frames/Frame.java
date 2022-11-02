package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("http://demo.automationtesting.in/Frames.html");
	    
	    // Single Frame
	    
	    WebElement single = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	    driver.switchTo().frame(single);
	    
	    WebElement s1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	    s1.sendKeys("Dinesh");
	    
	    driver.switchTo().defaultContent();
	    
	    // Multi Frame
	    
	    WebElement next = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	    next.click();
	    
	    WebElement multi = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	    driver.switchTo().frame(multi);
	    
	    WebElement m1 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	    driver.switchTo().frame(m1);
	    
	    WebElement m2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	    m2.sendKeys("Dinesh");
	    
	    driver.switchTo().parentFrame();
	    
	    System.out.println("Complete");
	    
	    
	    
	
	}
}
