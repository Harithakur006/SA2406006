package com.StepDef;

import io.cucumber.java.en.*;

public class S01GoogleTitle {
	@Given("Open google")
	public void open_google() {
	    System.out.println("Opening google");
	}

	@When("Read the title")
	public void read_the_title() {
	    System.out.println("Reading the title");
	}

	@Then("Title should be Google")
	public void title_should_be_google() {
	    System.out.println("Verifying the title");
	}
}
