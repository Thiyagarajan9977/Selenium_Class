package org.datadriven.tasks2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class HotelAppOrderID extends BaseClass {
	
	public HotelAppOrderID()   {
		
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement getorder;

		public WebElement getorder() {
		return getorder;
	}
}
