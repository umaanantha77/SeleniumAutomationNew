package com.qa.policy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
 private WebDriver driver;
 
 private By emailid = By.id("input-email");
 private By password = By.id("input-password");
 private By clicklogin = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
 private By forgotpassword = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a");
 
  public loginPage(WebDriver driver) {
	  this.driver = driver;
  }
  
  public String getLoginTitle() {
	 String loginTitle= driver.getTitle();
	 return loginTitle;
  }
  
  public String getLoginCurrentUrl() {
		 String LoginCurrentUrl= driver.getCurrentUrl();
		 return LoginCurrentUrl;
	  }
  
  public boolean forgotpswdLinkExist() {
	  return driver.findElement(forgotpassword).isDisplayed();
  }
  public AccountPage dologin(String un, String pswd) {
	  driver.findElement(emailid).sendKeys(un);
	  driver.findElement(password).sendKeys(pswd);
	  driver.findElement(clicklogin).click();
	  return new AccountPage(driver);
  }
  
  
  
  
  
  
}
