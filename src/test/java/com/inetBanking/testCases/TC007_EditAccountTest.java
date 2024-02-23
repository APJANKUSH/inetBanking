package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AccountPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC007_EditAccountTest extends BaseClass {

	@Test
	public void editAccont() throws Exception {
		AccountPage ap=new AccountPage(driver);
		ap.clickNewAccount();
		Thread.sleep(3000);
		ap.getCustomerAccountNumber("132493");
		ap.submitAccountBtn();
		ap.getResponceCode();
	
	}
	
}
