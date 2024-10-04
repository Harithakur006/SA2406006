package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/MyCucumberProject/MyCucumberProject/F04GoogleLinks.feature"},
					glue = {"com.StepDef"},
					tags = "@AllLinks",
					publish = true)
public class R04GoogleLinks {
	/*
	 Single Scenario 		- tags = "@AdvtLink"
	 Multiple Scenarios 	- tags = "@AdvtLink or @GmailTest"
	 Skip Scenario			- tags = "not @GmailTest"
	 All Scenarios			- tags = "@AllLinks"
	 
	 */

}
