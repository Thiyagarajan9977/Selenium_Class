package org.class9;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakScreenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);

		File des = new File("./Screenshot\\facebook.png");
		FileUtils.copyFile(src, des);
		System.out.println("Done");
		
		
		
		
		
		
		
	/*	
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		File src1 = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src1);
		
		
		
		
		
		File des1 = new File("./Screenshot\\facebook.png");
		FileUtils.copyFile(src1, des1);
		System.out.println("Done 1");
		
		driver.get("http://www.msn.com");
		driver.manage().window().maximize();
		File src2 = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src2);
		
		File des2 = new File("./Screenshot\\facebook.png");
		FileUtils.copyFile(src2, des2);
		System.out.println("Done 1");
		*/
		
	}
}
