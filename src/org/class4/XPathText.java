package org.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathText {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\ews\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		Xpath find using Text
		
		WebElement txtcreate = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String text2 = txtcreate.getText();
		System.out.println(text2);
		
		WebElement txtbtn = driver.findElement(By.xpath("//div[text()=' for a celebrity, band or business.']"));
		String text = txtbtn.getText();
		System.out.println(text);
		
//		Xpath find using Contain Text
		
		WebElement txtfind = driver.findElement(By.xpath("//h2[contains(text(),'Facebook ')]"));
		String text3 = txtfind.getText();
		System.out.println(text3);
		
//		Xpath find using Contain Attributes
		
		WebElement attlogin = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
		attlogin.sendKeys("thiyaguji@yahoo.com");
		String attribute = attlogin.getAttribute("value");
		System.out.println(attribute);
		
		WebElement attpwd = driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
		attpwd.sendKeys("9345030174!rT");
		String attribute2 = attpwd.getAttribute("value");
		System.out.println(attribute2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
