package org.pom.tasks2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class DemoQA extends BaseClass {
	
	public DemoQA() {
		
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="userName")
	private WebElement Username;
	
	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="login")
	private WebElement login;
	
	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return password;
	}	
	
	public WebElement getlogin() {
		return login;
	}	
	
}
