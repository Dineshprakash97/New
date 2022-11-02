package com.Project;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        Thread.sleep(5000);
        
        driver.get("http://automationpractice.com/index.php");
        
        // Sign in
        WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
        signin.click();
        
        WebElement email = driver.findElement(By.id("email_create"));
        email.sendKeys("dinesh99@gmail.com");
        
        WebElement create = driver.findElement(By.name("SubmitCreate"));
        create.click();
        
        // Personel info
        WebElement mr = driver.findElement(By.xpath("(//label[@class='top'])[1]"));
        mr.click();
        
        WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        firstname.sendKeys("Dinesh");
        
        WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        lastname.sendKeys("G");
        
        WebElement pass = driver.findElement(By.id("passwd"));
        pass.sendKeys("Dinesh#12345");
        
        WebElement day = driver.findElement(By.id("days")); // Dropdown method      
        Select d = new Select(day);
        d.selectByIndex(26);
        
        WebElement month = driver.findElement(By.name("months"));     
        Select m = new Select(month);
        m.selectByValue("6");
       
        WebElement year = driver.findElement(By.name("years"));     
        Select y = new Select(year);
        y.selectByValue("1997");
        
        WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        checkbox.click();
        
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        checkbox1.click();
		
		WebElement fname = driver.findElement(By.id("firstname"));
		fname.sendKeys("dinesh");
		
		WebElement lname = driver.findElement(By.id("lastname"));
		lname.sendKeys("G");
		
		WebElement company = driver.findElement(By.name("company"));
		company.sendKeys("Greens Technology");
		
		WebElement address1 = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		address1.sendKeys("4th floor, W122, 3rd Ave, W Block");
		
		WebElement address2 = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
		address1.sendKeys("Annanagar East");
		
		WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		city.sendKeys("Chennai");
		
		WebElement state = driver.findElement(By.name("id_state"));
		Select s = new Select(state);
		s.selectByValue("32");
		
		WebElement zipcode = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		zipcode.sendKeys("10001");
		
		WebElement additional = driver.findElement(By.id("other"));
		additional.sendKeys("None");
		
		WebElement homephone = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		homephone.sendKeys("089399 15591");
		
		WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		mobile.sendKeys("89399 15591");
		
		WebElement myaddress = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		myaddress.sendKeys("Annanagar East, Chennai");
		
		WebElement register = driver.findElement(By.id("submitAccount"));
		register.click();
		
		System.out.println("Done");
		
		// Women
		
        WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
        
        Actions a = new Actions(driver);
		
		a.moveToElement(women).build().perform();
        
        WebElement evening = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]"));
        evening.click();
        
        WebElement image = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
        
        a.moveToElement(image).build().perform();
		
		WebElement quickview = driver.findElement(By.xpath("(//a[@class='quick-view'])"));
		quickview.click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame);
		
		WebElement quantity = driver.findElement(By.xpath("//i[@class= 'icon-plus']"));
		quantity.click();
		
		WebElement size = driver.findElement(By.name("group_1"));
		Select si = new Select(size);
		si.selectByValue("2");
		
		WebElement color = driver.findElement(By.name("Pink"));
		color.click();
		
		WebElement cart = driver.findElement(By.name("Submit"));
		cart.click();
		
		driver.switchTo().defaultContent();	
		
		//Screenshot
		
        TakesScreenshot t = (TakesScreenshot) driver;
        
        File source = t.getScreenshotAs(OutputType.FILE);
        
        File dest = new File ("C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Screenshot\\miniproject1.png");
        
        FileUtils.copyFile(source, dest);
		
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkout.click();	
		
		Thread.sleep(5000);
		
		WebElement checkout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		checkout2.click();
		
		driver.navigate().to("http://automationpractice.com/index.php?controller=order&step=1");
		
		WebElement procd3 = driver.findElement(By.xpath("processAddress"));
		procd3.click();
		
		WebElement terms = driver.findElement(By.id("cgv"));
		terms.click();
		
		WebElement procd4 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		procd4.click();
		
		WebElement pay = driver.findElement(By.xpath("//a[@class='bankwire']"));
		pay.click();
		
		//Screenshot
		
       TakesScreenshot t1 = (TakesScreenshot) driver;
      
       File se = t1.getScreenshotAs(OutputType.FILE);
       
       File dt = new File ("C:\\Users\\Admin\\eclipse-workspace\\Seleniumm\\Screenshot\\miniproject2.png");
      
       FileUtils.copyFile(se, dt);
		
		WebElement order = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		order.click();
		
		System.out.println("Project Completed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
