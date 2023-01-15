package com.runner;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(
			features = "Feature/",
			glue = {"com.hooks", "com.stepdefinition"},
			plugin = {"json:target/myreport.json"},
			dryRun = false,
			monochrome = true
			
			
	)
	public class Runner extends AbstractTestNGCucumberTests {
				
				}
		

