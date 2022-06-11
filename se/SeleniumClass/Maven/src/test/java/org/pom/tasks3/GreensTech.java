package org.pom.tasks3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class GreensTech extends BaseClass {
	
	public GreensTech() {
	
		PageFactory.initElements(driver, this);
	}

		@FindBy(xpath="//span[contains(text(),'Greens technology Perumbakkam')]")
		private WebElement note1;
		
		@FindBy(xpath="//h1[contains(text(),'No 1 Software ')]")
		private WebElement note2;
		
		@FindBy(xpath="//a[contains(text(),'Certifications')]")
		private WebElement note3;
		
		@FindBy(xpath="(//a[contains(text(),'Course Content')])[30]")
		private WebElement note4;
		
		@FindBy(xpath="//strong[contains(text(),'Selenium Training in Chennai')]")
		private WebElement note5;
		
		@FindBy(xpath="//a[contains(text(),'COURSES')]")
		private WebElement note6;
		
		@FindBy(xpath="//a[contains(text(),'Java Training ')]")
		private WebElement note7;
		
		@FindBy(xpath="//a[contains(text(),'Core Java Training')]")
		private WebElement note8;
		
		@FindBy(xpath="//h2[contains(text(),'Java training Reviews from Anitha')]")
		private WebElement note9;
		
		@FindBy(xpath="(//p[10])[1]")
		private WebElement note91;
		
		@FindBy(xpath="//a[contains(text(),'CAREERS')]")
		private WebElement note10;
		
		@FindBy(xpath="(//a[contains(text(),'contact@greenstechnologys.com')])[1]")
		private WebElement note11;
		
		//Switch Window
		
		@FindBy(xpath="//a[@title='Selenium Certification Training']")
		private WebElement note12;
		
		@FindBy(xpath="//a[contains(text(),'TESTIMONIALS')]")
		private WebElement note13;
		
		@FindBy(xpath="//div[contains(text(),'goes to Greens Technology team')]")
		private WebElement note14;
		
		@FindBy(xpath="(//a[contains(text(),'Contact Us')])[1]")
		private WebElement note15;
		
		@FindBy(xpath="//h3[contains(text(),'Our Main Branches In Chennai ')]")
		private WebElement note16;
		
		@FindBy(xpath="//p[contains(text(),'Copyright ©')]")
		private WebElement note17;

		public WebElement getNote1() {
			return note1;
		}

		public WebElement getNote2() {
			return note2;
		}

		public WebElement getNote3() {
			return note3;
		}

		public WebElement getNote4() {
			return note4;
		}

		public WebElement getNote5() {
			return note5;
		}

		public WebElement getNote6() {
			return note6;
		}

		public WebElement getNote7() {
			return note7;
		}

		public WebElement getNote8() {
			return note8;
		}

		public WebElement getNote9() {
			return note9;
		}

		public WebElement getNote10() {
			return note10;
		}

		public WebElement getNote11() {
			return note11;
		}

		public WebElement getNote12() {
			return note12;
		}

		public WebElement getNote13() {
			return note13;
		}

		public WebElement getNote14() {
			return note14;
		}

		public WebElement getNote15() {
			return note15;
		}

		public WebElement getNote16() {
			return note16;
		}

		public WebElement getNote17() {
			return note17;
		}

		public WebElement getNote91() {
					return note91;
		}		
		 
		
}
