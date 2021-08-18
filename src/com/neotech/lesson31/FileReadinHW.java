package com.neotech.lesson31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class FileReadinHW {

	public static void main(String[] args) throws IOException {
		String homework = "/Users/buraksss/eclipse-workspace1/Java Basic/configs/example.properties";
		System.out.println(homework);
		
		FileInputStream fis= new FileInputStream(homework);
		
		Properties prop= new Properties();
		
		prop.load(fis);
		
		Set<Object> keys = prop.keySet();
		for (Object key : keys) {
			System.out.println(prop.get(key));
		}

		
	}

}
