package org.class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();

		// Actions performing like a mouse using MoveToElement method.perform

		Actions a = new Actions(driver);
		WebElement mvecourse = driver.findElement(By.xpath("//div[@title='Courses']"));
		// a.moveToElement(mvecourse).perform();

		WebElement mvejava = driver.findElement(By.xpath("//div[@title='Java']"));
		// a.moveToElement(mvejava).perform();

		WebElement selectcourse = driver.findElement(By.xpath("//span[text()='Core Java Certification Training']"));
		// a.click(selectcourse).perform();

		// Another way to perform the above actions

		a.moveToElement(mvecourse).moveToElement(mvejava).click(selectcourse).build().perform();

	}

}
