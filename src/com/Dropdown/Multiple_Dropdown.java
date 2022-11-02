package com.Dropdown;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://letcode.in/dropdowns");
        
        WebElement Multiple = driver.findElement(By.xpath("//select[@id='superheros']"));
        
        Select s = new Select(Multiple);
 
//        boolean multiple2 = s.isMultiple();
//        System.out.println(multiple2);
        
        if (s.isMultiple()== true) {
        	
        	s.selectByValue("ta");
        	
        	System.out.println("Done");
        }
        
        List<WebElement> options = s.getOptions();
        
        for (WebElement w: options) {
        	
        	System.out.println(w.getText());
        }
        
        
        Iterator<WebElement> iterator = s.getOptions().iterator();
        
        while (iterator.hasNext()); {
        
        System.out.println(iterator.next().getText());
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
}
