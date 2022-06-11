package org.stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.baseclass.BaseClass;
import org.locators.Homepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EcommerceProject extends BaseClass {

	@Given("The user should be in newEgg Home page")
	public void the_user_should_be_in_newEgg_Home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.newegg.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("The user has to search the product")
	public void the_user_has_to_search_the_product() throws InterruptedException {
		Homepage h = new Homepage();
		sendkeys(h.getSearch(), "samsung phone");
		btnclick(h.getBtnclick());				
		List<WebElement> product = h.getProductName();
		for (int i = 0; i < product.size(); i++) {
			List<WebElement> k = h.getProductName();
			System.out.println(k.get(i).getText());
		}
	}
	
	@When("The user has to print the product details")
	public void the_user_has_print_the_product_details() {

		Homepage h = new Homepage();
		System.out.println("Printing all product price amount");
		List<WebElement> amount = h.getPriceamount();
		System.out.println("Total Product amount.... :" + amount.size());

		for (int i = 0; i < amount.size(); i++) {
			List<WebElement> k = h.getPriceamount();
			String text = k.get(i).getText();
			int length = text.length();

			if (length == 7) {
				CharSequence ss = text.subSequence(0, 7);
				System.out.println(ss);
			} else if (length != 0) {
				CharSequence ss = text.subSequence(0, 8);
				System.out.println(ss);
			} else if (length == 0) {
				System.out.println("$0.00");
			}
		}
	}

	@Then("The user quit the broswer")
	public void the_user_quit_the_broswer() {		
		System.out.println("****Samsung Product details has been get from Home page***");
		driver.quit();
	}

}
