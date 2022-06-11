package org.mobile.testing;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class DragAndDrop {
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		
		DesiredCapabilities cap =  new DesiredCapabilities();
		cap.setCapability("deviceName","OPPO CPH1819");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","10");
		cap.setCapability("appPackage","dragdrop.stufflex.com.dragdrop");
		cap.setCapability("appActivity","dragdrop.stufflex.com.dragdrop.splash");
		cap.setCapability("noReset","true");
				 	
		AndroidDriver<WebElement> driver =  new AndroidDriver<WebElement>(new URL(" http://0.0.0.0:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		WebElement btnfootball = driver.findElement(By.xpath("//*[@text='FOOTBALL']"));
		btnfootball.click();
		
		WebElement src = driver.findElement(By.xpath("//*[@text='Barcelona']"));
		WebElement des = driver.findElement(By.xpath("//*[@text='???']"));
		
		TouchAction a =  new TouchAction(driver);
		a.longPress(ElementOption.element(src))
		.moveTo(ElementOption.element(des)).release().perform();
		
		System.out.println("Done");
	}
}
