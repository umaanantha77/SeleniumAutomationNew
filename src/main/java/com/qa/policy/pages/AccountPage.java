package com.qa.policy.pages;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.policy.utils.AppConstants;
import com.qa.policy.utils.ElementUtil;

public class AccountPage {
	private WebDriver driver;
	
	
	 private By AccountsHeader = By.cssSelector("div#content h2");
	 private By Logout = By.linkText("Logout");
	 private By search = By.name("search");
	 private By searchicon = By.cssSelector("#search button");
	
	
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}
	public String getAccountTitle() {
		 String AccountTitle= driver.getTitle();
		 return AccountTitle;
	  }
	  
	  public String getAccountCurrentUrl() {
			 String AccountCurrentUrl= driver.getCurrentUrl();
			 return AccountCurrentUrl;
		  }
	  
	  public void getAccountHeadersList() {
		  List<WebElement> AccountHeadersList = driver.findElements(AccountsHeader);
		  List<String> AccountValueList = new ArrayList<String>();
		  
		  for(WebElement:e AccountHeadersList){
			  e.
		  }
	  }
	
	
	
	
}
	
