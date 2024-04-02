package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	public WebDriver driver;

	public Homepage(WebDriver driver) 

	{
this.driver=driver;

	}
	 private By signIn=By.id("SignIn"); 
	 
	 public String getAppUrl () 
	 {
		  return driver.getCurrentUrl();
	 }
	 
	 public String getAppTitle () 
	 {
		  return driver.getTitle();
	 }
	 public void getSignIn () 
	 {
		  driver.findElement(signIn).click();
		  
	 }
}
