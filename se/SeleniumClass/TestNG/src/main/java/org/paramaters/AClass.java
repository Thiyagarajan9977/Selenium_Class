package org.paramaters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AClass {
	
	
	//IF you want to execute more than one class we can go for suite level execution
	//with help of testing .XML file
	
	//@Parameters are using to pass the parameters input to fill the text boxes, we can use 
	//the parameter one tag in TestNG.XML file
	
	// We can pass the more than one parameter use ({"Parameters"})
	
	//@Optionl use the alternative data
	
	@Parameters({"username","password"})
	@Test
	private void testA1(@Optional("RajaRaja")String user, @Optional("7569845")String pass) {
	System.out.println("Test A1");
	System.out.println(user);
	System.out.println(pass);
	}
	
	@Parameters({"password"})
	@Test
	private void testA2(@Optional("1234656 ")String pass) {
	System.out.println("Test A2");
	System.out.println(pass);
	}	
	@Test
	private void testA3() {
	System.out.println("Test A3");

	}
}
