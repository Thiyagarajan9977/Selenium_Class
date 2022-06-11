package org.mobile.testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class LaunchApp {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap =  new DesiredCapabilities();
		cap.setCapability("deviceName","OPPO CPH1819");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","10");
		cap.setCapability("appPackage","in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity","com.amazon.mShop.splashscreen.StartupActivity");
		cap.setCapability("noReset","true");
				 	
		AndroidDriver<WebElement> driver =  new AndroidDriver<WebElement>(new URL(" http://0.0.0.0:4723/wd/hub"), cap);
	
		WebElement txtsrc = driver.findElement(By.xpath("//*[@text='Search']"));
		txtsrc.sendKeys("iphone");
		
		
		KeyEvent k = new KeyEvent(AndroidKey.ENTER);		
		driver.pressKey(k);	
		
	    // Declare 
		//driver.pressKey(new KeyEvent(AndroidKey.ENTER);
		
	}
}
