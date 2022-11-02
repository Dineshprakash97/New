package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32\\chromedriver.exe");

		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// Webelement Methods 
		
		WebElement username = driver.findElement(By.id("email"));
		
		username.sendKeys("Dinesh");
		
		username.clear();

		
		WebElement login = driver.findElement(By.name("login"));
	
		
		String text = login.getText();
		System.out.println(text);
		
		// Attribute name
		String attribute = login.getAttribute("type");
		System.out.println(attribute);
		
		// Attribute value
		String attribute2 = login.getAttribute("royal_login_button");
		System.out.println(attribute2);
		
		boolean displayed = login.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = login.isEnabled();
		System.out.println(enabled);
		
		boolean selected = login.isSelected();
		System.out.println(selected);
		
		login.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
