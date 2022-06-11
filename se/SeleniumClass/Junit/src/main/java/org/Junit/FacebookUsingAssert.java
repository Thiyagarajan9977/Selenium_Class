package org.Junit;

import java.util.Date;
import org.junit.*;

public class FacebookUsingAssert extends BaseClass {

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
	public void Test() throws InterruptedException {
		launchurl("https://www.facebook.com");
		Assert.assertTrue("Verify the Login URL", driver.getCurrentUrl().contains("facebook"));

		Loginpage2 l = new Loginpage2();
		sendkeys(l.getTxtusername(), "Thiyagu");
		Assert.assertEquals("Verify username", "Thiyagu", l.getTxtusername().getAttribute("value"));

		sendkeys(l.getTxtpassword(), "34567");
		Assert.assertEquals("Verify password", "34567", l.getTxtpassword().getAttribute("value"));
		btnclick(l.getBtnlogin());
		Thread.sleep(5000);
		Assert.assertTrue("Verify Login", driver.getCurrentUrl().contains("login"));
		System.out.println("user is invalid");
		System.out.println("Test 1");
	}

	@Test // Invalid Username and valid password
	public void Test1() {
		System.out.println("Test 2");
	}
}
