package com.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		
		//to read the file:
		// 1.have file
		String filePath="/Users/marharytamaliavannikava/eclipse-workspace/JavaBasics/configs/Examples.properties";
		
		// 2. bring object of FileInputStream
		FileInputStream fileInput=new FileInputStream(filePath);
		
		// to handle data from .properties file we ned Properties class
		Properties prop=new Properties();
		prop.load(fileInput);
		
		//to print specific value
		String name=prop.getProperty("name");
		System.out.println(name);
		
		String city=prop.getProperty("city");
		System.out.println(city);
		
		//to print all the keys
		Set<Object> keys=prop.keySet();
		for(Object key:keys) {
			System.out.println(key);
		}
	}
}
