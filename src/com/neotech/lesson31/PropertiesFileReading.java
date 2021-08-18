package com.neotech.lesson31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		//how to read file?
				
		//1.have a file,  we need the location	
		
		String filePath= "/Users/buraksss/eclipse-workspace1/Java Basic/configs/example.properties";

		//2. Create  an object of FileInputStream
		
		FileInputStream  fileinput= new FileInputStream(filePath); 
		
		//to handle .Properties files we need to use properties java class
		
		Properties prop= new Properties();
		
		
		// we are loading all the properties in to prop object
		prop.load(fileinput);
		
		
		System.out.println(prop);
		
		
		
		// String username burak
	    // getProperty only stores Strings and case sensitive
		
		String str= prop.getProperty("username");
		
		System.out.println("Value of the username is "+ str);
		
		
		
		// getting all the keys from the properties files
		Set<Object> keys= prop.keySet();	
		
		// getting all the values from the properties files
		Collection<Object>values= prop.values();
		
		
		for ( Object key:keys) {System.out.println(key);}
		
		
	}
	
	
	
	

}
