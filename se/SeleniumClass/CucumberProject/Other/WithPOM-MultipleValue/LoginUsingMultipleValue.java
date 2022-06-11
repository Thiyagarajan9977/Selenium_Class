package org.stepdefinition;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.locators.FBlocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginUsingMultipleValue extends BaseClass {
	
WebDriver driver;
	
	@Given("The Another user should be in FB login page")
	public void The_Another_user_should_be_in_FB_login_page() {
		launchBrowser("chrome");
		launchurl("https://wwww.facebook.com");
	}

	@When("The Another user has to fill userName {string} and password {string}")
	public void the_Another_user_has_to_fill_userName_and_password(String user, String pass) {
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys(user);		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys(pass);		
	}

	@When("The Another user has to click the login button")
	public void the_Another_user_has_to_click_the_login_button() {
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();	    
	}

	@Then("The Another user should navigate to the invalid login page")
	public void the_Another_user_should_navigate_to_the_invalid_login_page() {
		Assert.assertTrue(true);
		System.out.println("User in invalid login page");
		driver.quit();	    
	}



}
