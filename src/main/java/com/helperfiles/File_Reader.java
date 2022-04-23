package com.helperfiles;

import java.io.IOException;

public class File_Reader {
	
	
	//private
	
	 private File_Reader() {
		 
		 
	 }
	//static
	public static File_Reader getInstance_FR() {
		File_Reader help= new File_Reader();
		return help;
	}
	
	//nonstatic
	
	public Configuration_reader getInstance_CR() throws IOException {
		
		Configuration_reader read= new Configuration_reader();
		return read;	

	}
}
