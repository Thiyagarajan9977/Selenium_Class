package org.stepdefinition;

import org.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	// We want to use cucumber Annotations not a Junit anotations
	
	@Before
	public static void beforescenario() {
		System.out.println("BeforeScenario");
		launchBrowser("chrome");
		launchurl("https://wwww.facebook.com");
	}
		
	@After
	public static void afterscenario() {
		System.out.println("AfterScenario");
		browserquit();
	}
}
