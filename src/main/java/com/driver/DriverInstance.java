package com.driver;

import java.net.MalformedURLException;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInstance {

	private static DriverInstance instance;
	private WebDriver driver;

	private DriverInstance(String browser) throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();

	}

	public static void setInstance(String browser) throws MalformedURLException {
		instance = new DriverInstance(browser);
	}

	public static DriverInstance getInstance() {
		return instance;
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
