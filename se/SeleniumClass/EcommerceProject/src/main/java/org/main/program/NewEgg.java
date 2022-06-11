package org.main.program;

import java.util.*;
import org.base.BaseClass;
import org.locators.Homepage;
import org.openqa.selenium.WebElement;

public class NewEgg extends BaseClass {

	public static void main(String[] args) {

		launchbrowser();
		launchurl("https://www.newegg.ca/");
		Homepage h = new Homepage();
		sendkeys(h.getSearch(), "samsung phone");
		btnclick(h.getBtnclick());
		List<WebElement> product = h.getProductName();

		// Product Looping

		for (int i = 0; i < product.size(); i++) {
			List<WebElement> k = h.getProductName();
			System.out.println(k.get(i).getText());
		}

		System.out.println("Printing all product price amount");

		// Pricing Lopping

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
}
