package com.class25;

public class WebDriverTest {

	public static void main(String[] args) {
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.openBrowser();
		chrome.closeBrowser();
		chrome.maximizeWindow();
		chrome.findElement();

		
		FirefoxDriver ff=new FirefoxDriver();
		ff.openBrowser();
		ff.closeBrowser();
		ff.maximizeWindow();
		ff.findElement();
	}
}
