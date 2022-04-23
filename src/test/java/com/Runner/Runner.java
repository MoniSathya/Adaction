package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\FeatureFile\\Login.feature",glue="com.Stepdefintion"
	
		)

public class Runner {

	
	
}
