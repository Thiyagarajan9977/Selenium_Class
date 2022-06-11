package org.locators;

import java.util.List;

import org.baseclass.Mobile_BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FlightSearch extends Mobile_BaseClass {
	
public FlightSearch() { 
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(id="onewayTgl")
	private WebElement oneway;

	@FindBy(id="btnFrom")
	private WebElement btnclick;
	
	@FindBy(xpath="//*[@text='Lamphun']")
	private List<WebElement> btnsearch;

	public WebElement getOneway() {
		return oneway;
	}

	public WebElement getBtnclick() {
		return btnclick;
	}

	public List<WebElement> getBtnsearch() {
		return btnsearch;
	}	
}
