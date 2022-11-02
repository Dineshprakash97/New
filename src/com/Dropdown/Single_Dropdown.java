package com.Dropdown;

import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {

	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://letcode.in/dropdowns");
 
        WebElement Multiple = driver.findElement(By.xpath("//select[@id='superheros']"));
        
        Select s = new Select(Multiple);
        
        if (s.isMultiple()==true) {
        
        s.selectByValue("ca");
        s.selectByValue("bp");
        s.selectByValue("ta");
        s.selectByValue("cm");
        s.selectByValue("am");
        
        }  
        
        Iterator<WebElement> iterator = s.getAllSelectedOptions().iterator();
        
        while (iterator.hasNext()) {
        	
        	System.out.println(iterator.next().getText());
        	
        }
        
        
        
        
        
        
        
        
        
        
        
}       
}
