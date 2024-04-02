package com.CRM.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.CRM.Pages.*;

public class BaseClass {
	public WebDriver driver;
	public Homepage hp;
	public Loginpage lp;


	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		hp=new Homepage(driver);
		lp=new Loginpage(driver);
	}
@BeforeClass
public void pageSetUp()
{
hp.getSignIn();	
}











}
