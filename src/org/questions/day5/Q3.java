package org.questions.day5;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions a = new Actions(driver);
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		WebElement Home = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[6]"));
		a.moveToElement(Home).perform();

		WebElement furnishing = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		a.moveToElement(furnishing).perform();

		WebElement bath = driver.findElement(By.xpath("//a[contains(text(),'Bath linen')]"));

		Thread.sleep(2000);
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File des = new File("D:\\se\\Selenium\\Day5\\Q3.png");
		FileUtils.copyFile(src, des);

		a.click(bath).perform();

		driver.quit();

	}
}
