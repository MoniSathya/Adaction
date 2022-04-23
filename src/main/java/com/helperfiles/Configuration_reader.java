package com.helperfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_reader {
	
	public static Properties p;
	
	
	public Configuration_reader() throws IOException{
		
		File f= new File("C:\\Users\\monika\\eclipse-workspace\\Project_Practice\\src\\main\\java\\com\\helperfiles\\Configuration.properties");
		
		FileInputStream fis= new FileInputStream(f);
		
		 p= new Properties();
		p.load(fis);
			
		
	}
	public String geturl() {
		String url_Adaction = p.getProperty("url");
		
		return url_Adaction;
	
	}
	
	public String getusername() {
		String user=p.getProperty("username");
		return user;		
		
	}

}
