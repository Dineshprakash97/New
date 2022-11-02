package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/drop.html");
		
		driver.manage().window().fullscreen();
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		
		//a.dragAndDrop(drag, drop).build().perform();
		
		a.clickAndHold(drag).build().perform();
		
		a.release(drop).build().perform();
		
		System.out.println("Completed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
