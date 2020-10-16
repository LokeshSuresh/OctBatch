package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserss {
WebDriver driver = null;
@Parameters("browsername")
@Test
public void t1(String name) {
	if (name.equals("ff")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91978\\eclipse-workspace\\TestNGBatch\\target\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else if (name.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91978\\eclipse-workspace\\TestNGBatch\\target\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else {
		System.out.println("Not Matched");
	}
	driver.get("https://www.facebook.com");
	driver.quit();
	
}

}
