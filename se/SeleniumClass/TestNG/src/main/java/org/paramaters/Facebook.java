package org.paramaters;

import java.util.Date;
import org.baseclass.BaseClass;
import org.testng.annotations.*;

public class Facebook extends BaseClass {
	
	@BeforeClass
	private void beforeclass() {
		launchbrowser();
		System.out.println("Before Class");
	}
	@AfterClass
	private void afterclass() {
		browserquit();
		System.out.println("after Class");
	}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("Test starts........"+new Date());		
		System.out.println("Before Method");
	}
	@AfterMethod
	private void aftermethod() {
		System.out.println("Test ends........"+new Date());
		System.out.println("After Method");
	}
	@Parameters({"username", "password"})
	@Test
	private void test2(String user, String pass) {
		launchurl("https://www.facebook.com");
		loginpage l = new loginpage();
		sendkeys(l.getTxtusername(), user);
		sendkeys(l.getTxtpassword(), pass);
		btnclick(l.getBtnlogin());
		System.out.println("Test1");		
	}
	@Test
	private void test3() {
		System.out.println("Test3");
	}
}
