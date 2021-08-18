package com.neotech.lesson31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
	
		
		// we want to write an existing file and add more pair/entries	
String filePath= "/Users/buraksss/eclipse-workspace1/Java Basic/configs/example.properties";


FileInputStream  fis= new FileInputStream(filePath);

Properties prop= new Properties();


prop.load(fis);

prop.setProperty("phonenumber", "123456");

// to write to file we need FileOutputStream

FileOutputStream fos=new FileOutputStream(filePath);

prop.store(fos, "I just added a new property");

		
		
	}

}
