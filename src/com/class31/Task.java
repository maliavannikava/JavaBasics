package com.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task {

	public static void main(String[] args) throws IOException {
		
		String filePath="/Users/marharytamaliavannikava/eclipse-workspace/JavaBasics/configs/Task";
		
		FileInputStream fileInput=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fileInput);
		
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		
		String url=prop.getProperty("url");
		System.out.println(url);
	}
}
