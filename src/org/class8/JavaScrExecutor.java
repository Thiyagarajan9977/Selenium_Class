package org.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScrExecutor {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium2\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		/*	Type Conversion or UpCasting Example
			
			int a =10;
			long b =20;
			b=a;  -> Here assigning integer value (a) into long (b) this
					kind of assign called Type conversion or UpCasting*/
		
		/*	Type Casting or DownCasting
		
		int a=10;
		long b=20;
		a=(int)b  -> Here assigning Long value(b) into integer value (a)
			   		this kind of assigning is called Type casting or Down Casting*/	
				
		// JavascriptExecutor is Interface driver is object,  Using Type Casting 
		//method to assigning driver object into Javascript executor
		
//		Type Casting 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement txtusername = driver.findElement(By.id("email"));
		
				
		//SendKeys using SetAttribute
		
		js.executeScript("arguments[0].setAttribute('value', 'Thiyagu')", txtusername);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value', 123456789)", txtpass);

		//getAttribute
		
		Object ob = js.executeScript("return arguments[0].getAttribute('value')", txtusername);
		System.out.println(ob);
		String s = (String) ob;
		System.out.println(s);
		
		//password
		
		String s1 = (String) js.executeScript("return arguments[0].getAttribute('value')", txtpass);
		System.out.println(s1);
		
		//ScrollDown
		
		WebElement btnhelp = driver.findElement(By.xpath("//a[text()='Help']"));
		js.executeScript("arguments[0].scrollIntoView(true)", btnhelp);
		
		Thread.sleep(5000);
		
		WebElement pass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].scrollIntoView(false)", pass);
		
		//Click
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btnlogin);
		
	}
}
