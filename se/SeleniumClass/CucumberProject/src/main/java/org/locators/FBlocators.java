package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBlocators extends BaseClass {
	
public FBlocators ()   {
		
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="email")
private WebElement userName;

@FindBy(id="pass")
private WebElement password;

@FindBy(name="login")
private WebElement button;

@FindBy(name="firstname")
private WebElement firstName;

@FindBy(name="lastname")
private WebElement lastName;

@FindBy(name="reg_email__")
private WebElement mobile;

@FindBy(id="password_step_input")
private WebElement newPassword;

@FindBy(id="day")
private WebElement date;

@FindBy(id="month")
private WebElement month;

@FindBy(id="year")
private WebElement year;

@FindBy(id="u_e_3_uh")
private WebElement male;

@FindBy(id="u_e_2_M6")
private WebElement feMale;

@FindBy(name="websubmit")
private WebElement Submit;

@FindBy(xpath="//a[text()='Create New Account']")
private WebElement createNew;


public WebElement getUserName() {
	return userName;
}

public WebElement getPassword() {
	return password;
}

public WebElement getButton() {
	return button;
}

public WebElement getFirstName() {
	return firstName;
}

public WebElement getLastName() {
	return lastName;
}

public WebElement getMobile() {
	return mobile;
}

public WebElement getNewPassword() {
	return newPassword;
}

public WebElement getDate() {
	return date;
}

public WebElement getMonth() {
	return month;
}

public WebElement getYear() {
	return year;
}

public WebElement getMale() {
	return male;
}

public WebElement getFeMale() {
	return feMale;
}

public WebElement getSubmit() {
	return Submit;
}

public WebElement getCreateNew() {
	return createNew;
}
}
