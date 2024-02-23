package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC002_LogoutTest extends BaseClass  {

	
	@Test
	public void logoutTest(ITestResult tr) throws IOException 
	{
	
		LoginPage lp=new LoginPage(driver);
		lp.clickLogout();
		
		
		
	}
	
	
	
}
