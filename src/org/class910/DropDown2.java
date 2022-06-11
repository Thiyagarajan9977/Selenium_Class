package org.class910;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement drpmulti = driver.findElement(By.id("multi-select"));

		Select s = new Select(drpmulti);

		// Checking Multiple drop-down or not

		boolean mt = s.isMultiple();
		System.out.println(mt);

		// Select By Index

		s.selectByIndex(5);
		s.selectByIndex(2);

		// Select By Value

		s.selectByValue("Florida");

		// Select By Text

		s.selectByVisibleText("Pennsylvania");

		// getOptions

		List<WebElement> op = s.getOptions();

		for (WebElement eachoption : op) {
			System.out.println(eachoption.getText());
		}

		// get all selected options

		List<WebElement> allselect = s.getAllSelectedOptions();
		for (WebElement eachselect : allselect) {
			System.out.println(eachselect.getText());
		}

		// get First Selected Options

		WebElement first = s.getFirstSelectedOption();
		System.out.println("First Selected Option.... " + first.getText());

		// deselect

		s.deselectByIndex(2);

		// value

		s.deselectByValue("Florida");

		// Text

		s.deselectByVisibleText("Pennsylvania");

		// Deselect All

		s.deselectAll();

		// Select All Options

		for (int i = 0; i < op.size(); i++) {
			s.selectByIndex(i);
		}

		Thread.sleep(2000);
		s.deselectAll();

		// Select By Value

		for (int i = 0; i < op.size(); i++) {
			WebElement eachoption = op.get(i);
			String value = eachoption.getAttribute("value");
			s.selectByValue(value);
		}

		Thread.sleep(2000);
		s.deselectAll();

		// select By Text

		for (WebElement eachop : allselect) {
			String text = eachop.getText();
			s.selectByVisibleText(text);
		}
	}
}
