package com.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main_1 {
	
	public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Eclipse\\\\eclipse-workspace\\\\Maven_1\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		// Login
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Karthiklk");
		
		driver.findElement(By.id("password")).sendKeys("Karthi@4255");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		//Search hotel
		
		WebElement location = driver.findElement(By.id("location"));
		location.click();
		Select l = new Select(location);
	    l.selectByValue("Paris");
	    
	    WebElement hotel = driver.findElement(By.id("hotels"));
	    hotel.click();
	    Select h = new Select(hotel);
	    h.selectByIndex(2);
	    
	    WebElement roomtype = driver.findElement(By.name("room_type"));
	    roomtype.click();
	    Select r = new Select(roomtype);
	    r.selectByVisibleText("Super Deluxe");
	    
	    WebElement num = driver.findElement(By.name("room_nos"));
	    num.click();
	    Select n = new Select(num);
	    n.selectByValue("8");
	    
	    WebElement checkin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    checkin.sendKeys("12/06/2022");
	    
	    driver.findElement(By.id("datepick_out")).sendKeys("14/06/2022");
	    
	    WebElement adult = driver.findElement(By.id("adult_room"));
	    adult.click();
	    Select a = new Select(adult);
	    a.selectByIndex(3);
	    
	    WebElement child = driver.findElement(By.name("child_room"));
	    child.click();
	    Select c = new Select(child);
	    c.selectByValue("2");
	    
	    driver.findElement(By.id("Submit")).click(); // search
	    
	    driver.findElement(By.xpath("//input[@type='radio']")).click(); // radio button
	    
	    driver.findElement(By.id("continue")).click(); // continue
	    
	    driver.findElement(By.name("first_name")).sendKeys("Dinesh");
	    
	    driver.findElement(By.name("last_name")).sendKeys("G");
	    
	    driver.findElement(By.name("address")).sendKeys("4th floor, W122, 3rd Ave, W Block, Annanagar East, Chennai, Tamil Nadu 600040");
	    
	    driver.findElement(By.name("cc_num")).sendKeys("1234567890123456");
	    
	    WebElement cctype = driver.findElement(By.id("cc_type"));
	    cctype.click();
	    Select cc = new Select(cctype);
	    cc.selectByValue("AMEX");
	    
	    WebElement month = driver.findElement(By.name("cc_exp_month"));
	    month.click();
	    Select m = new Select(month);
	    m.selectByIndex(5);
	    
	    WebElement year = driver.findElement(By.name("cc_exp_year"));
	    year.click();
	    Select y = new Select(year);
	    y.selectByValue("2022");
	    
	    driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("888");
	    
	    driver.findElement(By.id("book_now")).click();
	    
	    driver.findElement(By.id("my_itinerary")).click();
	    
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
	    
	    driver.findElement(By.id("logout")).click();
	    
	    driver.findElement(By.xpath("//a[@href='index.php']")).click();
	    
	    System.out.println("Completed");
	    
	    
		
		
	}

}
