package org.dakkala.uhca.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldTest {
	public void test() throws InterruptedException {
		String url = "http://localhost/Greetings.html"; // Make sure we add
														// http:// , otherwise
														// it doesn't work.
		WebDriver webDriver = new ChromeDriver(); // launches Chrome browser,
		webDriver.get(url); // Load the website
		Thread.sleep(5000); // Make the thread wait for 5 seconds, just to make
							// sure the website loads
							// completely
		WebElement name = webDriver.findElement(By.id("name")); // Find the
																// search box,
																// google search
																// box has id
																// gbqfq
		name.sendKeys("Hello World"); // Type Name in name box.
		WebElement greet = webDriver.findElement(By.id("greet")); // find greet
																	// button
		greet.click(); // Click on greet button
		Thread.sleep(5000); // wait for 5 seconds to see the results
		WebElement greetings = webDriver.findElement(By.id("message"));
		// Next step is doing validations using Junit's Asserts or using manual
		// validation, its left to implementation.
		webDriver.quit(); // Close the firefox
	}

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "./3rd_party/chromedriver.exe");
			new HelloWorldTest().test();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}