package com.qa.policy.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	private WebDriver driver;
	
	public WebDriver intl_driver(String BrowserName) {
		if(BrowserName.trim().equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
		}
		else if(BrowserName.trim().equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
			
		}
		else if(BrowserName.trim().equalsIgnoreCase("safari")) {
			driver= new SafariDriver();
			
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		return driver;
	}

}
