package org.tasks;

import org.baseclass.Mobile_BaseClass;
import org.locators.FlightSearch;
import org.locators.Homepage;

public class task1 extends Mobile_BaseClass {
	
	public static void main(String[] args) {
		
		launchapp();	
		Homepage a = new Homepage();
		click(a.getFlightbook());				
		FlightSearch f = new FlightSearch();
		
		click(f.getOneway());
		click(f.getBtnclick());		
		scrolldowntillloc(f.getBtnsearch());
		System.out.println("Done");
	}
}
