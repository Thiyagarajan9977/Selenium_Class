package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", 
				  glue="org.stepdefinition",
				  dryRun=false, // To generate the update snippets
				  snippets=SnippetType.CAMELCASE, //To change the snippet method as Camel case
				  //snippets=SnippetType.UNDERSCORE //To change the snippet method as without underscore
				  monochrome=true, //it support before 4.2 version 
				  // to read the console in readable format
				  strict=true, // If any changes in snippets means
				  //if strict false means it can skip the step and execute the method
				  //if strict true means it can exit the step and execute the another method
				  
				  tags = {"@smoke and @Sanity"})
					//{"not @Smoke or @Regression"}
					//{"@Smoke or not @Regression"}
					//{"@Smoke, @Sanity"}
					//{"@Smoke or @Sanity"}
					//{"@Smoke : @Sanity"}
					//{"not @Smoke"} or {"~@Sanity"}
					//{"not @Smoke"} or {"~@Sanity"}

				  	  
public class TestRunner {

}
