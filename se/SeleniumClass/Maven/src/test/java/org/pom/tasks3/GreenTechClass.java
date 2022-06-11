package org.pom.tasks3;

import java.util.Set;

import org.test.baseclass.BaseClass;

public class GreenTechClass extends BaseClass {
	
	public static void main(String[] args) {
		
		launchbrowser();
		launchurl("http://www.greenstechnologys.com/");
		GreensTech g = new GreensTech();
		scrollUp(g.getNote1());		
		System.out.println("Scrolldown printed the last line....:" +g.getNote1().getText());
		scrollUp(g.getNote2());
		System.out.println("scrollup and print the first line....:" +g.getNote2().getText());
		btnclick(g.getNote3());
		btnclick(g.getNote4());
		System.out.println(g.getNote5().getText());
		moveToElement(g.getNote6());
		moveToElement(g.getNote7());
		btnclick(g.getNote8());		
		scrollUp(g.getNote9());
		System.out.println("Java training Reviews from Anitha..." +g.getNote91().getText());
		btnclick(g.getNote10());
		scrollUp(g.getNote11());
		System.out.println("Printed the email displayed at last"+g.getNote11().getText());
		btnclick(g.getNote12());
		
			String parID = driver.getWindowHandle();
			// All ID
			Set<String> allID = driver.getWindowHandles();
						for (String eachID : allID) {
				if (!parID.equals(eachID)) {
					driver.switchTo().window(eachID);
				}}
		
		btnclick(g.getNote13());
		scrollDown(g.getNote14());
		System.out.println(g.getNote14().getText());
		btnclick(g.getNote15());
		System.out.println(g.getNote16().getText());
		System.out.println(g.getNote17().getText());
		browserquit();		
		}
}
