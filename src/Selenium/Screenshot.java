package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://www.facebook.com/");
 
        TakesScreenshot t = (TakesScreenshot) driver;
        
        File source = t.getScreenshotAs(OutputType.FILE);
        
        File dest = new File ("C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Screenshot\\facebook.png");
        
        FileUtils.copyFile(source, dest);
        
        System.out.println("Screenshot Taken");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
}
