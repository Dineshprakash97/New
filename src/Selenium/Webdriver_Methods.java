package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {
	
	public static void main(String[] args) {
		
		// Selenium webdriver -------> Tool
		
		                     // Key
		System.setProperty("webdriver.chrome.driver",
				
				  // Value (or) Path
				"C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32\\chromedriver.exe");

		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		// get
		driver.get("https://www.facebook.com/");
		
		// getTitle
		String title = driver.getTitle();
		System.out.println(title);
		
		// getCurrenturl
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		
		
		
		
		
		
		
		
	}

}
