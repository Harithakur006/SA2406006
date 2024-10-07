package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/MyCucumberProject/MyCucumberProject/F06PracticeLogin_DDF.feature"},
					glue = {"com.StepDef"})
public class S06PracticeLogin_DDF {

}
