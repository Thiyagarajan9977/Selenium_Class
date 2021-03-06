package org.stepdefinition;

import org.baseclass.BaseClass;
import org.locators.FBlocators;

import io.cucumber.java.en.*;

public class CucumberTags extends BaseClass {

	FBlocators fb;

	@Given("The user should  be in FB page")
	public void the_user_should_be_in_FB_page() {
		launchBrowser("chrome");
		launchurl("https://wwww.facebook.com");
		System.out.println("Common for all scenarions");
	}

	@When("The user has to fill {string} and {string}")
	public void the_user_has_to_fill_and(String userName, String password) {
		fb = new FBlocators();
		sendkeys(fb.getUserName(), userName);
		sendkeys(fb.getPassword(), password);
		System.out.println("running @Smoke validation");
	}

	@When("The user has to click the login buttona")
	public void the_user_has_to_click_the_login_buttona() {
		fb = new FBlocators();
		btnclick(fb.getButton());
		System.out.println("Middle @Smoke validation");
		browserquit();
	}

	@Then("The user should navigate to the invalid login pages")
	public void the_user_should_navigate_to_the_invalid_login_pages() {
		System.out.println("Ending @Smoke validation");
	
	}

	@When("The user has to fill createUserName and passwords")
	public void the_user_has_to_fill_createUserName_and_passwords() {
		fb = new FBlocators();
		btnclick(fb.getCreateNew());		
		sendkeys(fb.getFirstName(), "thiyagarjan");
		sendkeys(fb.getLastName(), "Rajasudhakar");
		sendkeys(fb.getMobile(), "9876541230");
		sendkeys(fb.getNewPassword(), "Jaihind@India");
		System.out.println("Starting @Sanity validation");
	}

	@When("The user has to click the login buttone")
	public void the_user_has_to_click_the_login_buttone() {
		System.out.println("running @Sanity validation");
	}

	@Then("The user should navigate to the invalid login pagess")
	public void the_user_should_navigate_to_the_invalid_login_pagess() {
		System.out.println("Ending @Sanity validation");
		browserquit();
	}

	@When("The user has to fill userName and passwordas")
	public void the_user_has_to_fill_userName_and_passwordas() {
		System.out.println("Starting @Regression validation");
	}

	@When("The user has to click the login buttones")
	public void the_user_has_to_click_the_login_buttones() {
		System.out.println("Middle @Regression validation");
	}

	@Then("The user should navigate to the invalid login pagys")
	public void the_user_should_navigate_to_the_invalid_login_pagys() {
		System.out.println("Ending @Regression validation");
		browserquit();
	}
		
		@When("The second user has to fill two")
		public void the_second_user_has_to_fill_two() {
			System.out.println("running @Smoke validation 2");
		 
		}

		@When("The second user has to fill three")
		public void the_second_user_has_to_fill_three() {
			System.out.println("Middle @Smoke validation 2");
		}

		@Then("The second user has to fill four")
		public void the_second_user_has_to_fill_four() {
			System.out.println("Ending @Smoke validation 2");
		}

		@When("The second user has to fill two one")
		public void the_second_user_has_to_fill_two_one() {
			System.out.println("Starting @Sanity validation 2");
		}

		@When("The second user has to fill three one")
		public void the_second_user_has_to_fill_three_one() {
			System.out.println("running @Sanity validation 2");
		   
		}

		@Then("The second user has to fill four one")
		public void the_second_user_has_to_fill_four_one() {
			System.out.println("Ending @Sanity validation 3");
			browserquit();
		 
		}

		@When("The second user has to fill two two")
		public void the_second_user_has_to_fill_two_two() {
			System.out.println("Starting @Regression validation");
		   
		}

		@When("The second user has to fill three two")
		public void the_second_user_has_to_fill_three_two() {
			System.out.println("Running @Regression validation");
		
		}

		@Then("The second user has to fill four two")
		public void the_second_user_has_to_fill_four_two() {
			System.out.println("Ending @Regression validation");
			browserquit();
		
		}		
}
