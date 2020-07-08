package first;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

/** Following jar files are mandatory for running the selenium script successfully
 * 1. byte-buddy.jar
 * 2. client-combined.jar
 * 3. client-combined-sources.jar
 * 4. commons-exec.jar
 * 5. okio.jar
 * 6. okhttp.jar
 * 7. guava.jar
 */

public class TestWebdriver {
	
	//Create reference of WebDirver interface
	WebDriver web;
	
	//Create method locate the webdriver for firefox and test the script
	void openFirefox() {
		//Create object of FirefoxDriver
		web = new FirefoxDriver();
		
		//Locate the geckodriver for firefox automation
		System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
		
		//Open the url for google.com using get method of webdriver interface
		web.get("https://www.google.com/");
		web.manage().window().maximize();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestWebdriver tw = new TestWebdriver();
		tw.openFirefox();
		tw.web.close();
	}

}
