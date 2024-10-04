package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/MyCucumberProject/MyCucumberProject/F03PracticeTestLogin.feature"},
					glue = {"com.StepDef"})
public class R03PracticeTestLogin {

}
