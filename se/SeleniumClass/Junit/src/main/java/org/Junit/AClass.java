package org.Junit;

import org.junit.Assert;
import org.junit.Test;

public class AClass {
	
	@Test
	public void testA1() {
		Assert.assertTrue(true);
			System.out.println("Test A1");
	}
	@Test
	public void testA2() {
		Assert.assertTrue("Verify URL", false);
		System.out.println("Test A2");
	}
	@Test
		
	public void testA3() {
		Assert.assertTrue(true);
		System.out.println("Test A3");
	}
}
