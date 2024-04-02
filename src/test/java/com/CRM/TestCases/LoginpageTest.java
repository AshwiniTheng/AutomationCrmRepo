package com.CRM.TestCases;

import org.testng.annotations.Test;

public class LoginpageTest extends BaseClass


{
  @Test
  public void verifyLogin() {
	  
	  lp.doLogin("test@gmail.com", "test123");
  }
}
