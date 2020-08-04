package demo;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunBrowser {
	// Create reference for WebDriver interface
	WebDriver web;
	
	// URL to geckodriver
	String geko = "/usr/bin/geckodriver", driv = "webdriver.gecko.driver";
	
	// Function to run firefox browser
	void openFirefox() {
		// Set locations for geckodriver
		System.setProperty(driv,geko);
		
		// Create object of Firefox browser
		web = new FirefoxDriver();
		web.navigate().to("https://www.google.com");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunBrowser run = new RunBrowser();
		run.openFirefox();
		//Close browser
		run.web.close();
	}

}
