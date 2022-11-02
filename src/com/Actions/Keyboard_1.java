package com.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_1 {

public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.get("http://automationpractice.com/index.php");

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(women).build().perform();
		a.contextClick(women).build().perform();
		
		// Robot
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Women");
		
		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		
		a.moveToElement(dress).build().perform();
		a.contextClick(dress).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Dress");
		
		Thread.sleep(5000);
		
		driver.navigate().to("http://automationpractice.com/index.php");
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		
		a.moveToElement(tshirt).build().perform();
		a.contextClick(tshirt);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("T-Shirt");
		
		
}
}
