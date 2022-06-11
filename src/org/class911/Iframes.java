package org.class911;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// To find the Iframe size through List
		
		List<WebElement> framesize = driver.findElements(By.tagName("iframe"));
		int size = framesize.size();
		System.out.println(size);		
		
		// *************Switch To frame by Index************
		
		//driver.switchTo().frame(1);// Choosing 2nd Iframe hence given value of index[1]
		
		//***************Switch To Frame by ID**************
		
		//driver.switchTo().frame("a077aa5e"); // Choosing Iframe using ID
		
		
		//****************Switch To Frame by WEbelement************
		
		WebElement switchwebelement = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(switchwebelement);
		
		WebElement findElement = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		findElement.click();
		
		//*************Come out of the frame*********
		
		driver.switchTo().defaultContent();
		
		//************Inner Frame*********
		
		driver.switchTo().frame("frame1");	//Switch to Frame 1
		driver.switchTo().frame("frame2");	//Switch to Frame 1 to 2
		driver.switchTo().frame("frame3");	//Switch to Frame 2	to 3
		driver.switchTo().frame("frame4");	//Switch to Frame 3 to 4
		
		// ******Come back out of frame*****
		
		driver.switchTo().parentFrame();	//4 to 3
		driver.switchTo().parentFrame();	//3	to 2
		driver.switchTo().parentFrame();	//2 to 1
		
//		Come out from complete Frame
		
		driver.switchTo().defaultContent();

	}
}
