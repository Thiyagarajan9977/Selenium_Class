package org.pom.pages;

import org.test.baseclass.BaseClass;

public class Sample extends BaseClass {

	public static void main(String[] args) {
		launchbrowser();
		launchurl("https://www.facebook.com");
		loginpage l = new loginpage();
		sendkeys(l.getTxtusername(), "thiyaguji@yahoo.com");
		sendkeys(l.getTxtpassword(), "9345030174@rT");
		driver.navigate().refresh();
		sendkeys(l.getTxtusername(), "Thiygau");
		sendkeys(l.getTxtpassword(), "123456");
		btnclick(l.getBtnlogin());
	}
}
