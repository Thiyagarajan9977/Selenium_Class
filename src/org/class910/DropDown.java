package org.class910;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement btncreate = driver.findElement(By.xpath("//div[@class=' css-yk16xz-control']"));
		btncreate.click();

		// Select Class - dropdown method

		WebElement drdmonth = driver.findElement(By.id("month"));
		Select s = new Select(drdmonth);

		// selectByIndex Method
		s.selectByIndex(6);
		// selectByValue Method
		s.selectByValue("8");
		// selectByVisible Text Method
		s.selectByVisibleText("Jun");

		// get all options

		List<WebElement> op = s.getOptions();
		int size = op.size();

		System.out.println("Size of Month..... " + size);

		for (int i = 0; i < op.size(); i++) {

			WebElement eachoption = op.get(i);
			String text = eachoption.getText();
			System.out.println(text);
		}

		System.out.println("Size of Month..... " + size);

		// Enhanced Loop
		for (WebElement eachoption1 : op) {
			String text2 = eachoption1.getText();
			System.out.println(text2);
		}
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
	}
}
