package com.neotech.lesson25;

public interface WebDriver {
	
	void open();
	void close();
	String getTitle();	
	
}

interface TakesScreenshot {
	void getScreeenshot();
	
	
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot {
	void navigate();
		
}

abstract class ChromeDriver implements RemoteWebDriver{

}
	

abstract class FirefoxDriver implements RemoteWebDriver{
	
}

abstract class SafariDriver implements RemoteWebDriver{
	
}