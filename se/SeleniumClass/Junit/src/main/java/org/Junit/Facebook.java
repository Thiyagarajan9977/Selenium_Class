package org.Junit;

import java.util.Date;

import org.junit.*;

public class Facebook extends BaseClass {

	@BeforeClass
	public static void beforeclass() {
		launchbrowser();
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterclass() {
		browserquit();
		System.out.println("After Class");
	}

	@Before
	public void before() {
		Date d = new Date();
		System.out.println("Test Starts...." + d);
		System.out.println("Before ");
	}

	@After
	public void after() {
		Date d1 = new Date();
		System.out.println("Test ends...." + d1);
		System.out.println("After");
	}

	@Test // Invalid Username and invalid password
	public void Test() {
		launchurl("https://www.facebook.com");		
		loginpage l = new loginpage();
		sendkeys(l.getTxtusername().get(0), "Thiyagu");
		sendkeys(l.getTxtpassword(), "34567");
		btnclick(l.getBtnlogin());
		System.out.println("Test");
	}

	@Test // Invalid Username and valid password
	public void Test1() {
		System.out.println("Test1");
		launchurl("https://www.facebook.com");
		loginpage l = new loginpage();
		sendkeys(l.getTxtusername().get(0), "Rajan");
		sendkeys(l.getTxtpassword(), "56789");
		btnclick(l.getBtnlogin());
	}

}
