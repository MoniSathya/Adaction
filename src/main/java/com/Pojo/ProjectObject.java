package com.Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProjectObject {
	
	public static WebDriver driver;
	
	
	private PojoClass pc;
	
	public ProjectObject(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
		
		
	}

	public PojoClass getInstancepc() {
		pc= new PojoClass(driver);
		return pc;
		

	}
		
	}
	

	
