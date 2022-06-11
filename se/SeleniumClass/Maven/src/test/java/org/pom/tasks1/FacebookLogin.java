package org.pom.tasks1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.test.baseclass.BaseClass;

public class FacebookLogin extends BaseClass {
	
	// First create one constructor
	
	public FacebookLogin() {
		
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id ="email")
	private WebElement username;	
	
	@FindBy(id ="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement Btnlogin;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnlogin() {
		return Btnlogin;
	}	
}
	
