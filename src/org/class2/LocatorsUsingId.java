package org.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsUsingId {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://wwww.facebook.com");
		
		WebElement txtusername = driver.findElement(By.id("email"));
		
		txtusername.sendKeys("thiyaguji@yahoo.com");

		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("9345030174@rT");
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		System.out.println("Sucessfully Login");
		
	}
}
