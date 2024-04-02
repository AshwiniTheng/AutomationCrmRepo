package com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest extends BaseClass  {
	@Test(priority=1)
	public void VerifyUrl() {
		String curl	=hp.getAppUrl();
		Assert.assertTrue(curl.contains("crm"),"Url is wrong!!!");
		System.out.println("Url is Valid");
	}
	@Test(priority=2)
	public void VerifyTitle() {
		Assert.assertTrue(hp.getAppTitle().contains("Service"),"Title is not Match");
		System.out.println("Title Matched!!!" +hp.getAppTitle());
	}
	@Test(priority=3)
	public void VerifySignIn() {
		hp.getSignIn();
		Assert.assertTrue(hp.getAppUrl().contains("Login"),"Test fail login Page not Found");
		System.out.println("Test Pass!! Login page open");



	}










}

