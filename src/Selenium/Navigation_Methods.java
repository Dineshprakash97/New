package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32\\chromedriver.exe");

		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		// Navigation Methods
		
		
		// To
		driver.navigate().to("https://www.youtube.com/");
		
		// Back
		driver.navigate().back();
		
		// Forward
		driver.navigate().forward();
		
		// Refresh
		driver.navigate().refresh();
		
		// Close
		driver.close();
		
		// Quit
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
