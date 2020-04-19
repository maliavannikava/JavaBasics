package com.class25;

interface TakesScreenshot{
	String fileExtension=".png";
	void takePicture();
	static void takeSelfie() {
		System.out.println("I can take selfie");
	}
	default void takePanoramaPic() {
		System.out.println("I can take panoram");
	}
}

public interface WebDriver {
	//Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), 
	//closeBrowser(), maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface: 
	//ChromeDriver and FirefoxDriver.
	
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}

class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("You can open Chrome driver");
	}

	@Override
	public void closeBrowser() {
		System.out.println("You can close Chrome driver");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("You can maximize the window in Chrome browser");
	}

	@Override
	public void findElement() {
		System.out.println("You can find element in Chrome browser");
	}
}
class FirefoxDriver implements WebDriver{
	@Override
	public void openBrowser() {
		System.out.println("You can open Firefox driver");
	}

	@Override
	public void closeBrowser() {
		System.out.println("You can close Firefox driver");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("You can maximize the window in Firefox browser");
	}

	@Override
	public void findElement() {
		System.out.println("You can find element in Firefox browser");
	}
}
