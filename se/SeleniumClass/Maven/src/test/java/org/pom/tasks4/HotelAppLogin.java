package org.pom.tasks4;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.baseclass.BaseClass;

public class HotelAppLogin extends BaseClass {	
	public static void main(String[] args) throws IOException {
		
		launchbrowser();
		launchurl("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HotelApp h = new HotelApp();
		sendkeys(h.getUserid(), "testthiyag");		
		sendkeys(h.getPassword(), "BCFK21");
		btnclick(h.getLogin());
		selectBy(h.getLocation(), "value", "London");
		selectBy(h.getHotel(), "index", "2");
		selectBy(h.getRoomType(), "text", "Deluxe");
		selectBy(h.getNoofRooms(), "value", "7");
		sendkeys(h.getCheckinDate(), "27/03/2021");
		sendkeys(h.getCheckOutDate(), "27/04/2021");
		selectBy(h.getAdultsperroom(), "value", "4");
		selectBy(h.getChildsperroom(), "text", "4 - Four");
		btnclick(h.getsearch());
		btnclick(h.getOptions());
		btnclick(h.getContinue());
		sendkeys(h.getFirstName(), "Thiyagarajan");
		sendkeys(h.getLastName(), "Rajasudhakar");
		sendkeys(h.getAddress(), "Chennai");
		sendkeys(h.getCCno(), "4568987654321234");
		selectBy(h.getCardType(), "text", "American Express");
		selectBy(h.getExpiryDate(), "text", "January");
		selectBy(h.getExpiryYear(), "text", "2012");
		sendkeys(h.getCVV(), "3569");
		btnclick(h.getBooknow());		
		WebElement get2 = driver.findElement(By.xpath("//input[@name='order_no']"));
		scrollDown(get2);
		String orderID = get2.getAttribute("value");
		System.out.println("The order ID is : "+get2.getAttribute("value"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		screenShort("HotelApp");		
		setExcelValue("HotelApp", 0, 1, orderID);		
		browserquit();		
	}
}
