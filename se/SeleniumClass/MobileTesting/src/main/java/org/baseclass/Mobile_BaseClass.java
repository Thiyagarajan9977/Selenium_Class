package org.baseclass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Mobile_BaseClass {

	public static AndroidDriver driver;

	public static void launchapp() {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO CPH1819");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.nokair.it.nokairapp");
		cap.setCapability("appActivity", "com.nokair.it.nokairapp.LauncherActivity");
		cap.setCapability("noReset", "true");

		try {
			driver = new AndroidDriver<WebElement>(new URL(" http://0.0.0.0:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	// SENDKEYS

	public static void type(WebElement e, String value) {
		e.sendKeys(value);
	}

	// cLICK

	public static void click(WebElement e) {
		e.click();
	}
	
	public static void Waits() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	

	// ScROLLDOWN

	public static void scrolldown() {

		Dimension size = driver.manage().window().getSize();

		int height = size.getHeight();

		Double startheight = height * 0.7;
		int start = startheight.intValue();

		Double endheight = height * 0.2;
		int end = endheight.intValue();

		TouchAction t = new TouchAction(driver);
		t.longPress(PointOption.point(0, start)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				.moveTo(PointOption.point(0, end)).release().perform();
	}

	public static List<WebElement> getlocator() {
		List<WebElement> locator = driver.findElements(By.xpath(""));
		return locator;
	}

	public static void scrolldowntillloc(List<WebElement> element) {
		
		while(element.size() == 0) {
			scrolldown();
		}
		if (element.size() != 0) {
			element.get(0).click();
		}
	}
	public static void quitapp() {
		driver.quit();
	}
}
