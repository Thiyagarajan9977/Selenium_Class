package org.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//find element
		
		WebElement txtusername = driver.findElement(By.xpath("//input[@id='email']"));
		txtusername.sendKeys("thiyaguji@yahoo.com");
		
		WebElement txtpwd = driver.findElement(By.xpath("//input[@id='pass']"));
		txtpwd.sendKeys("9345030174!rT");
		
		WebElement btnlogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnlogin.click();
		
		
	}
}
