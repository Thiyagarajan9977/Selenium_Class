package org.pom.tasks2;

import java.util.concurrent.TimeUnit;

import org.test.baseclass.BaseClass;

public class DemoQALogin extends BaseClass {

	public static void main(String[] args) {

		launchbrowser();
		launchurl("https://demoqa.com/login");
		DemoQA d = new DemoQA();
		sendkeys(d.getUsername(), "thiyaguji");
		sendkeys(d.getPassword(), "889978@rT");
		screenShort("DemoQA");
		btnclick(d.getlogin());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		screenShort("DemoQA1");
		browserquit();
	}
}

