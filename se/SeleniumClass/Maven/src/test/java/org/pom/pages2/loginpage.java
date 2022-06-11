package org.pom.pages2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class loginpage extends BaseClass {

	public loginpage() {

		PageFactory.initElements(driver, this); // this represent current class name		
	}	
	// ******private int a; (Private DataType referenceName )******** // like wise declare the below things
	
	
	@CacheLookup
	@FindBys({@FindBy(id = "email"),
			  @FindBy(xpath="//input[@name='email']")})
	
	private List<WebElement> txtusername;
	
	@FindAll({@FindBy(id="pass"), 
		 		@FindBy(xpath="//input[@name='password']")})
	
	private WebElement txtpassword;
	
	@FindBy(name="login")
	private WebElement btnlogin;

	public List<WebElement> getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	public void login(String user, String pass) {
		
		sendkeys(getTxtusername().get(0), user);		
		sendkeys(getTxtpassword(), pass);		
		btnclick(getBtnlogin());
	}
	
}
