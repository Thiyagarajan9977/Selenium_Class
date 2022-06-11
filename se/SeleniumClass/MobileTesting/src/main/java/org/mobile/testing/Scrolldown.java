package org.mobile.testing;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Scrolldown {

	static AndroidDriver<WebElement> driver;

	public static void Scroll() {

		// Dimension

		Dimension size = driver.manage().window().getSize();

		// To find the whole screen height
		int height = size.getHeight();
		System.out.println(height);

		// To find 70% of screen size converted to double to int
		Double startheight = height * 0.7;
		int start = startheight.intValue();
		System.out.println(startheight);

		// To find 20% of screen size converted to double to int
		Double endheight = height * 0.2;
		int end = endheight.intValue();
		System.out.println(endheight);

		// Scrolling longpress and wait and longpress and release and perform

		TouchAction t = new TouchAction(driver);
		t.longPress(PointOption.point(0, start)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				.moveTo(PointOption.point(0, end)).release().perform();
	}

	public static void main(String[] args) throws MalformedURLException {

		// getting my size of the window

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO CPH1819");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.nokair.it.nokairapp");
		cap.setCapability("appActivity", "com.nokair.it.nokairapp.LauncherActivity");
		cap.setCapability("noReset", "true");

		driver = new AndroidDriver<WebElement>(new URL(" http://0.0.0.0:4723/wd/hub"), cap);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement bookflight = driver.findElement(By.id("imgBookFlight"));
		bookflight.click();
		WebElement oneway = driver.findElement(By.id("onewayTgl"));
		oneway.click();
		WebElement btnfrm = driver.findElement(By.id("btnFrom"));
		btnfrm.click();
		Scroll();

		WebElement btnlmn = driver.findElement(By.xpath("//*[@text='Lamphun']"));
		btnlmn.click();

		System.out.println("Done");
	}
}
