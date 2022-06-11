package org.Junit;

import org.junit.Assert;
import org.junit.Test;

public class CClass {
	
	@Test
	public void testC1() {
		Assert.assertTrue(true);
			System.out.println("Test C1");
	}
	@Test
	public void testC2() {		
		System.out.println("Test C2");
	}
	@Test
		
	public void testC3() {
		Assert.assertTrue("Verify Username", false);
		System.out.println("Test C3");
	}
}
