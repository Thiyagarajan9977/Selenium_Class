package org.pom.pages2;

import org.test.baseclass.BaseClass;

public class Sample extends BaseClass {

	public static void main(String[] args) {
		launchbrowser();
		launchurl("https://www.facebook.com");
		loginpage l = new loginpage();
		sendkeys(l.getTxtusername().get(0), "thiyaguji@yahoo.com");		
		sendkeys(l.getTxtpassword(), "9345030174");		
		btnclick(l.getBtnlogin());		
	}
}
