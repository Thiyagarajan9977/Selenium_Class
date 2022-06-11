package org.class5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
		
		// To maximize the window
		
		driver.manage().window().maximize();
		
		//Implicitly waiting time (Dynamic Wait or Implicit Wait)
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement createacc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createacc.click();
				
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Thiyagarajan");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Rajasudhakar");
				
		System.out.println("Name details are entered");
	}
}
