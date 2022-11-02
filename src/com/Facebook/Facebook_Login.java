package com.Facebook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Login {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://www.facebook.com/");
       
       
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys ("dinesh");
		
		WebElement password  = driver.findElement(By.name("pass"));
		password.sendKeys ("23456788");
		
		
		// Screenshot
        TakesScreenshot t = (TakesScreenshot) driver;
        
        File source = t.getScreenshotAs(OutputType.FILE);
        
        File dest = new File ("C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Screenshot\\facebooklogin.png");
        
        FileUtils.copyFile(source, dest);
        
        System.out.println("Screenshot Taken");
       
        
       WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
       
       create.click();
       
       
       driver.navigate().to("https://www.facebook.com/campaign/landing.php?");
       				
		  WebElement firstname = driver.findElement(By.name("firstname"));      
	           firstname.sendKeys("dinesh");
	           
	        WebElement lastname = driver.findElement(By.name("lastname"));   
	           lastname.sendKeys("govindaraj");
	           
	        WebElement mobilenum = driver.findElement(By.name("reg_email__")); 
	           
	           mobilenum.sendKeys("1234567890");
	           
	           WebElement pass = driver.findElement(By.id("password_step_input"));
	           pass.sendKeys("23455");
	           
	           
	           WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	           
	           Select s = new Select (day);
	           s.selectByIndex(25);
	           
	           WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	           
	           Select m = new Select (month);
	           m.selectByIndex(5);
	           
	           WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	           
	           Select y = new Select (year);
	           y.selectByVisibleText("1997");
	           
	           WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
	           gender.click();
	           
	        // Screenshot
	           TakesScreenshot ts = (TakesScreenshot) driver;
	           
	           File source1 = ts.getScreenshotAs(OutputType.FILE);
	           
	           File dest1 = new File ("C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Screenshot\\facebookregister.png");
	           
	           FileUtils.copyFile(source1, dest1);
	           
	           System.out.println("Screenshot Taken");
	           
	           
	           WebElement register = driver.findElement(By.name("websubmit"));
	           register.click();
	           
	           
	       
	           
	           
	}
}
