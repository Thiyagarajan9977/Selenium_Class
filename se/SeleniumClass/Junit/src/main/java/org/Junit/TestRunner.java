package org.Junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// It is used to execute all Suite Level Execution
	@RunWith(Suite.class)
	@Suite.SuiteClasses({ AClass.class, BClass.class, CClass.class })
	
	public class TestRunner {
	}