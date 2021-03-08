package com.ecommerce.webapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. formulate test domain url 
		final String siteURL ="https://www.google.com/";
		// 2. locate driver
		final String driverPath = "/home/wahidkhan74gmai/automation-workspace/phase5-selenium-test-03-08-2021/driver/geckodriver";
		
		
		// 3. set selenium property
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		// 4. instantiating selenium web driver
		WebDriver driver = new FirefoxDriver();
		
		// 5. launch browser
		driver.get(siteURL);
		
		//search data over google
		// 6.1 find element
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium documentation");
		searchBox.submit();
		
		
		// 6. Perform test Evaluation
		String expectedTitle = "Google";
		
		if(driver.getTitle().equals(expectedTitle)) {
			System.out.println("Test is Passed !");
			System.out.println("Actual Title : "+driver.getTitle());
			System.out.println("Expected Title : "+expectedTitle);
		} else {
			System.out.println("Test is Failed !");
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
