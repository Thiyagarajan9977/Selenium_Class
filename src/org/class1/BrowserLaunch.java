package org.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	//get a current page URL
	
	String cu = driver.getCurrentUrl();
	System.out.println(cu);
	
	//get a page title
	
	String title = driver.getTitle();
	System.out.println(title);
	
	//quit the driver
	
	driver.quit();
	
	
	}

}
