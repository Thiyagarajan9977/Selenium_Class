package org.paramaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.baseclass.BaseClass;

public class loginpage extends BaseClass {

	public loginpage() {

		PageFactory.initElements(driver, this); // this represent current class name		
	}	
	// ******private int a; (Private DataType referenceName )******** // like wise declare the below things
	
	@FindBy(id = "email")
	private WebElement txtusername;
	
	@FindBy(id="pass")
	private WebElement txtpassword;
	
	@FindBy(name="login")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
}
