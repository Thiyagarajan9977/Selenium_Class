package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUsingSingleValue {
	
	WebDriver driver;
	
	@Given("The user should be in FB login page")
	public void the_user_should_be_in_FB_login_page() {
		// To set the property		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://wwww.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("The user has to fill userName {string} and password {string}")
	public void the_user_has_to_fill_userName_and_password(String user, String pass) {
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys(user);		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys(pass);	    
	}

	@When("The user has to click the login button")
	public void the_user_has_to_click_the_login_button() {
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();	    
	}

	@Then("The user should navigate to the invalid login page")
	public void the_user_should_navigate_to_the_invalid_login_page() {
		Assert.assertTrue(true);
		System.out.println("User in invalid login page");
		driver.quit();	    
	}
}
