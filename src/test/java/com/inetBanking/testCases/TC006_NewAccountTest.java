package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AccountPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC006_NewAccountTest extends BaseClass {

		@Test
		public void newAccont() throws Exception {
			
			AccountPage ap=new AccountPage(driver);
			try {
				ap.clickNewAccount();
				Thread.sleep(5000);
				ap.getCustomerID("99264");
				ap.getAccountType("Savings");
				ap.getInitialAmount("20000");
				ap.clickSubmit();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}

		}
	
}
