package org.paramaters;

import org.testng.annotations.Test;

public class CClass {
	
	@Test
	private void testC1() {
	System.out.println("Test C1");

	}
	
	@Test(enabled=false)
	private void testC2() {
	System.out.println("Test C2");

	}
	
	@Test
	private void testC3() {
	System.out.println("Test C3");

	}
}
