package com.class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropetiesFile {

	public static void main(String[] args) throws IOException {
		
		//write into existing file and add values
		
		String filePath="/Users/marharytamaliavannikava/eclipse-workspace/JavaBasics/configs/Examples.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		prop.setProperty("PhoneNumber", "123456789");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos,  "Added additional key");

	}
}
