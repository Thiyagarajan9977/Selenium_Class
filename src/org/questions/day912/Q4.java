package org.questions.day912;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement txtusername = driver.findElement(By.id("email"));		
		js.executeScript("arguments[0].setAttribute('value', 'Thiyagu')", txtusername);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value', 123456789)", txtpass);
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btnlogin);
			
		Thread.sleep(7000);

		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\se\\Selenium\\Day12\\Q4.png");
		FileUtils.copyFile(src, des);

		driver.quit();

	}

}
