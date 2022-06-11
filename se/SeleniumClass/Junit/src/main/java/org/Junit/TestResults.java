package org.Junit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestResults {

	@Test
	public void Results() {

		Result re = JUnitCore.runClasses(AClass.class, BClass.class, CClass.class);
		System.out.println("Total Run Count...." + re.getRunCount());
		System.out.println("Total Ignore Count..." + re.getIgnoreCount());
		System.out.println("Total Failure Count..." + re.getFailureCount());
		System.out.println("Total Runtime Count..." + re.getRunTime());
		System.out.println("Suite Result..." + re.wasSuccessful());
		
		System.out.println(" ");
		
		System.out.println("********Get Failures Results***********");

		List<Failure> fail = re.getFailures();
		for (Failure x : fail) {
			// get failure method
			System.out.println(x);
			// get failure message method
			System.out.println(x.getMessage());
			// get Test Case Name
			System.out.println(x.getTestHeader());
			// get Exception name
			System.out.println(x.getException());
		}
	}
}
