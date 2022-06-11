package org.Junit;

import org.junit.*;

public class SampleJunit {
	
	// Before class and After class should be static
	// Methods should not be private
	// Order of execution will be ascending/Descending order
	
	//BeforeClass - Always First
	
	//Before - Before Test
	//Test
	//After - After Test
	
	//AfterClass - Always Last	
	
	@BeforeClass
	private void beforeclass() {
		System.out.println("Before Class");
	}

	@AfterClass
	private void afterclass() {
		System.out.println("Before Class");
	}

	@Before
	private void before() {
		System.out.println("Before Class");
	}

	@After
	private void after() {
		System.out.println("Before Class");
	}

	@Test
	private void Test() {
		System.out.println("Test");
	}
	
	@Test
	private void Test1() {
		System.out.println("Test1");
	}

}
