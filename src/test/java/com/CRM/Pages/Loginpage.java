package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 
{
	private WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;

	}
By email=By.id("email-id");
By pass=By.id("password");
By btn= By.id("submit-id");
public void doLogin(String em,String ps)
{
	driver.findElement(email).sendKeys(em);
	driver.findElement(pass).sendKeys(ps);
	driver.findElement(btn).click();

}
}
