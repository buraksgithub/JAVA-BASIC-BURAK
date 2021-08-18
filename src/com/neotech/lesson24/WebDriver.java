package com.neotech.lesson24;



//Create a WebDriver Interface that will have the following unimplemented behaviour: 
//	   openBrowser(), 
//	   closeBrowser(), 
//	   maximizeWindow(), 
//	   findElement(). 

 //Create another interface named Camera that will have the method:
	//   takePicture();
 //Create 2 classes that implements WebDriver and Camera interfaces: ChromeDriver and FirefoxDriver.

public interface WebDriver {
	
	 void openBrowser();
	 void closeBrowser(); 
	 void maximizeWindow();
     void findElement();
     
     
}

 interface Camera {  
	void takePicture();     
	
	
}
 
            class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		
		
	}

	@Override
	public void closeBrowser() {
		
		
	}

	@Override
	public void maximizeWindow() {
		
		
	}

	@Override
	public void findElement() {
		
		
	}  
	 
 }
 
           class FirefoxDriver implements Camera{

	@Override
	public void takePicture() {
	
		
	}
	 
 }
 
 