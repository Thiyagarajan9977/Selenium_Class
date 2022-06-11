package org.pom.pages2;

import org.test.baseclass.BaseClass;

public class Sample2 extends BaseClass {

	public static void main(String[] args) {
		launchbrowser();
		launchurl("https://www.facebook.com");
		loginpage l = new loginpage();
		l.login("thiyaguji@yahoo.com", "9345030174@rT");		
	}
}
