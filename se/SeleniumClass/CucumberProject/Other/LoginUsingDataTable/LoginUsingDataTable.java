package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.locators.FBlocators;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginUsingDataTable extends BaseClass {
	
WebDriver driver;
FBlocators fb;
	
	@Given("The Another user should be in FB login page")
	public void The_Another_user_should_be_in_FB_login_page() {
		launchBrowser("chrome");
		launchurl("https://wwww.facebook.com");
	}
	@When("The Another user has to fill userName and password")
	public void the_Another_user_has_to_fill_userName_and_password(io.cucumber.datatable.DataTable data) {
		
		// 1D list without Header
		
		List<String> li = data.asList();
		String user = li.get(0);
		String pass = li.get(1);
		
		fb =  new FBlocators();
		sendkeys(fb.getUserName(), user);
		sendkeys(fb.getPassword(), pass);
		browserquit();
	}
	
	@When("The second user has to fill userName and password")
	public void the_second_user_has_to_fill_userName_and_password(io.cucumber.datatable.DataTable data2) throws InterruptedException {
		
		launchBrowser("chrome");
		launchurl("https://wwww.facebook.com");
		
		List<List<String>> li = data2.asLists();
		List<String> a = li.get(0);
		List<String> b = li.get(1);
		List<String> c = li.get(2);
		
		System.out.println(a.get(0)+" "+a.get(1));
		System.out.println(b.get(0)+" "+b.get(1));
		System.out.println(c.get(0)+" "+c.get(1));
			
		String user = a.get(0);
		
		fb =  new FBlocators();
		sendkeys(fb.getUserName(), user);
		sendkeys(fb.getPassword(), b.get(1));
		btnclick(fb.getButton());
		Thread.sleep(2000);
		browserquit();
	}
	
	@Then("The Another user has to click the create button")
	public void the_Another_user_has_to_click_the_create_button() {
		launchBrowser("chrome");
		launchurl("https://wwww.facebook.com");		
		fb =  new FBlocators();		
		btnclick(fb.getCreateNew());		
	}
	
	@When("The user has to enter the personal details")
	public void the_user_has_to_enter_the_personal_details(io.cucumber.datatable.DataTable data3) {
		
		Map<String, String> mp = data3.asMap(String.class, String.class);
		String fname = mp.get("firstName");
		
		fb =  new FBlocators();
		sendkeys(fb.getFirstName(), fname);
		sendkeys(fb.getLastName(), mp.get("lastName"));
		sendkeys(fb.getMobile(), mp.get("mobiles"));
		sendkeys(fb.getNewPassword(), mp.get("newpassword"));	
	}
	
	@When("The user has to click the sign up button")
	public void the_user_has_to_click_the_sign_up_button() {
		fb =  new FBlocators();
		btnclick(fb.getSubmit());
		browserquit();
	}
	
	@Then("The page refresh and moving to Home page")
	public void the_page_refresh_and_moving_to_Home_page(io.cucumber.datatable.DataTable data4) throws InterruptedException {
		
		launchBrowser("chrome");
		launchurl("https://wwww.facebook.com");
		
		List<Map<String, String>> list = data4.asMaps();
		Map<String, String> a = list.get(0);
		String user = a.get("userName");
		
		fb =  new FBlocators();
		sendkeys(fb.getUserName(), user);		
		sendkeys(fb.getPassword(), list.get(2).get("password"));
		
		browserquit();
		
	}
}
	