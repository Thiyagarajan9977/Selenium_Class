package org.class912;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();

		WebElement txtsearch = driver.findElement(By.name("q"));
		txtsearch.sendKeys("Iphone", Keys.ENTER);

		WebElement retry = driver.findElement(By.xpath("//span[contains(text(),'RETRY')]"));
		retry.click();

		WebElement iphone = driver.findElement(By.xpath("//a[contains(text(),'APPLE iPhone 11 (White, 64 GB)')]"));
		iphone.click();

		// Switch to Window
		// Parent ID

		String parID = driver.getWindowHandle();
		System.out.println(parID);

		// All ID
		Set<String> allID = driver.getWindowHandles();
		System.out.println(allID);

		for (String eachID : allID) {
			if (!parID.equals(eachID)) {
				driver.switchTo().window(eachID);
			}
		}

		// Add to Cart

		WebElement addcart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		addcart.click();

		Thread.sleep(4000);

		// Click Help Center

		WebElement helpcenter = driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[7]"));
		helpcenter.click();

		// Switch to ParentID
		// ParentID

		String parID2 = driver.getWindowHandle();
		System.out.println(parID2);

		// All ID
		Set<String> allID2 = driver.getWindowHandles();
		System.out.println(allID2);

		List<String> li = new ArrayList<String>();
		li.addAll(allID2);

		driver.switchTo().window(li.get(2));

		WebElement viewmore = driver.findElement(By.xpath("//span[contains(text(),'View More')]"));
		viewmore.click();

		driver.switchTo().window(li.get(0));

		driver.close();

		Thread.sleep(3000);

		driver.quit();

	}
}
