package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.controls.ObjectsControl;

import io.cucumber.java.Scenario;

public class CommonPage  extends ObjectsControl{
	WebDriver driver;
	WebDriverWait wait;
	Scenario scenario;
	
	public CommonPage(WebDriver driver, Scenario sc) {
		super(driver, sc);
		this.driver = driver;
		this.scenario = sc;
		
	}
	public void navigateToQAVendors() {
		navigateTo("https://qavendors.com");
	}

	public boolean pageVerify(String title) {
		return verifyPageTitle(title);
	}

}
