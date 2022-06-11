package org.class6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("Thiyagarajan");

		// Double click method to select the value
		a.doubleClick(txtusername).perform();

		// Contextclick is defined as Right click of mouse

		a.contextClick(txtusername).perform();

		// Robot Class which is available in (import java.awt.Robot)

		Robot r = new Robot();

		// Keypress is method to perform keyboard actions

		// keyevent is an Ennum to use keyboard commands, Here VK means Virtualkeyboard.

		// VK_DOWN means pressing down arrow

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement txtpwd = driver.findElement(By.id("pass"));
		a.contextClick(txtpwd).perform();

		for (int i = 0; i < 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
