package org.locators;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {
	
	public Homepage() {
		
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//input[@title='Search Site']")
	private WebElement Search;
	
	@FindBy(xpath="//button[@class='fas fa-search']")
	private WebElement btnclick;
	
	@FindBy(xpath="//a[@title='View Details']")
	private List<WebElement> productName;
	
	@FindBy(xpath="//li[@class='price-current ']")
	private List<WebElement> priceamount;
	
	public WebElement getSearch() {
		return Search;		
	}
		public WebElement getBtnclick() {
		return btnclick;
		
	}
		public List<WebElement> getProductName() {
			return productName;			
	}
		public List<WebElement> getPriceamount() {
			return priceamount;
	}	
}
