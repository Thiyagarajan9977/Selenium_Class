package org.pom.tasks1;

import org.test.baseclass.BaseClass;

public class FacebookTest extends BaseClass {
	
	public static void main(String[] args) {
		launchbrowser();
		launchurl("https://www.facebook.com");
		FacebookLogin l = new FacebookLogin();
		sendkeys(l.getUsername(), "thiyaguji@yahoo.com");
		sendkeys(l.getPassword(), "9345030174@rT");
		screenShort("Facebook");
		driver.navigate().refresh();		
		sendkeys(l.getUsername(), "Thiygau");
		sendkeys(l.getPassword(), "123456");
		btnclick(l.getBtnlogin());
		screenShort("Facebook1");
		System.out.println("Done");
		browserquit();
	}

}
