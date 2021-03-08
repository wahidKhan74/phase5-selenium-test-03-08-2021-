package com.ecommerce.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHomePageTest {

	public static void main(String[] args) {
		

		// 1. formulate test domain url 
		final String siteURL ="https://www.amazon.in/";
		// 2. locate driver
		final String driverPath = "/home/wahidkhan74gmai/automation-workspace/phase5-selenium-test-03-08-2021/driver/geckodriver";
		
		
		// 3. set selenium property
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		// 4. instantiating selenium web driver
		WebDriver driver = new FirefoxDriver();
		
		// 5. launch browser
		driver.get(siteURL);
		
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}

		// quit browser
		driver.close();
	}

}
