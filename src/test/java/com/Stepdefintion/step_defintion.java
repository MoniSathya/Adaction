package com.Stepdefintion;

import org.openqa.selenium.WebDriver;

import com.Pojo.ProjectObject;
import com.helperfiles.File_Reader;

import BaseClasses.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step_defintion extends BaseClass {
	
	public static WebDriver driver= BaseClass.GetBrowser("Chrome");
	
	public static ProjectObject pom = new ProjectObject(driver);
	
	

	@Given("^enter the browser url$")
	public void enter_the_browser_url() throws Throwable {
		GetUrl(File_Reader.getInstance_FR().getInstance_CR().geturl());
		
	    
	}

	@When("^enter the username$")
	public void enter_the_username() throws Throwable {
		Textbox(pom.getInstancepc().getUsername(), null);
	}

	@Then("^enter the password$")
	public void enter_the_password() throws Throwable {
	    
	}

	
}
