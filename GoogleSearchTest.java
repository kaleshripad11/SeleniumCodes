package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchTest {
	// Webdriver interface referance
	WebDriver google;
	
	{{System.out.println("WebDriver reference created");}}
	
	//  Variables to store urls, driver name
	String url = "https://www.google.com", driver = "webdriver.gecko.driver",
			loc = "/usr/bin/geckodriver";
	{{System.out.println("Variables created for storing URL, DRIVERNAME and LOCATION");}}
	
	
	
	// Method to load firefox browser 
	void openBrowser() {
		google = new FirefoxDriver();
		System.out.println("Firefox object created");
		System.setProperty(driver, loc);
		System.out.println("Setting up drivers finished");
		google.manage().window().maximize();
	}
	
	void testGoogle() {
		google.navigate().to(url);
		System.out.println("Google page loaded");
		google.findElement(By.name("q")).sendKeys("ubuntu os");
		System.out.println("Located searchbox and entered search text");
		WebDriverWait q = new WebDriverWait(google, 20);	
		q.until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();
		System.out.println("Located searchbutton and initiated search");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoogleSearchTest gst = new GoogleSearchTest();
		gst.openBrowser();
		gst.testGoogle();
		System.out.println("Closing browser");
		gst.google.close();
	}

}
