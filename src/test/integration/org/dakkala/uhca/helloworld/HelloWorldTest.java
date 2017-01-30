package org.dakkala.uhca.helloworld;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HelloWorldTest {

	@Test
	public void test() throws InterruptedException, MalformedURLException {
		// WebDriver webDriver = new ChromeDriver(); // launches Chrome
		// browser,
		RemoteWebDriver webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
				DesiredCapabilities.chrome());
		try {
			String url = "http://localhost/Greetings.html"; // Make sure we add
															// http:// ,
															// otherwise
															// it doesn't work.
			webDriver.manage().window().maximize();
			webDriver.get(url); // Load the website
			Thread.sleep(5000); // Make the thread wait for 5 seconds, just to
								// make
								// sure the website loads
								// completely
			WebElement name = webDriver.findElement(By.id("name")); // Find the
																	// search
																	// box,
																	// google
																	// search
																	// box has
																	// id
																	// gbqfq
			name.sendKeys("GST"); // Type Name in name box.
			WebElement greet = webDriver.findElement(By.id("greet")); // find
																		// greet
																		// button
			greet.click(); // Click on greet button
			Thread.sleep(5000); // wait for 5 seconds to see the results
			WebElement greetings = webDriver.findElement(By.id("message"));
			assertEquals(true,
					(greetings.getText().contains("Good Morning") || greetings.getText().contains("Good Night"))
							&& greetings.getText().contains("GST"));
		} finally {
			webDriver.quit(); // Close the chrome
		}
	}

}
