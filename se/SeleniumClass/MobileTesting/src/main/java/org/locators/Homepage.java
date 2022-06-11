package org.locators;

import org.baseclass.Mobile_BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Homepage extends Mobile_BaseClass {
	
	public Homepage() { 
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(id="imgBookFlight")
	private WebElement Flightbook;

	public WebElement getFlightbook() {
		return Flightbook;
	}
}
