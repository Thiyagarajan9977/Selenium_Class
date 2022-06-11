package org.test.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {

	public static void main(String[] args) {
		launchbrowser();
		launchurl("https://www.facebook.com");

		WebElement txtusername = driver.findElement(By.id("email"));
		sendkeys(txtusername, "Thiyagu");

		WebElement txtpassword = driver.findElement(By.id("pass"));
		sendkeys(txtpassword, "34567");

		WebElement btnlogin = driver.findElement(By.name("login"));
		btnclick(btnlogin);
		
		String s = gettext(txtusername);
		System.out.println(s);
		System.out.println(getAttribute(txtpassword));
		moveToElement(txtusername);
		SelectByIndex(txtusername, 5);
		browserquit();
	}
}
