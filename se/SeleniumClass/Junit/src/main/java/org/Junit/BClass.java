package org.Junit;

import org.junit.Assert;
import org.junit.Test;

public class BClass {
	
	@Test
	public void testB1() {
		
		Assert.assertTrue("Verify password", false);
			System.out.println("Test B1");
	}
	
	@Test
	public void testB2() {
		Assert.assertTrue(true);
		System.out.println("Test B2");
	}
	
	@Test		
	public void testB3() {
		Assert.assertTrue(true);
		System.out.println("Test B3");
	}
}
