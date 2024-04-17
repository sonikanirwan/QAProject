package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.itlearn.utilities.BrowserFactory;
import com.itlearn.utilities.ConfigDataProvider;

public class BaseClass {
	WebDriver driver;
	public ConfigDataProvider conf = new ConfigDataProvider();

	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startapplication(driver, conf.getBrowser(), conf.getUrl());
	}

}
