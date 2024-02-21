package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.CustomerPage;
import com.inetBanking.pageObjects.LoginPage;
public class TC_addCustomer_003 extends BaseClass  {

	@Test
	public void addCustomer() {
		
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		
		logger.info("Adding new customer...");
		CustomerPage cp=new  CustomerPage(driver);
		cp.clickNewCustomer();
		cp.getCustomerName("hp");
		cp.getCustomerGender();
		cp.getCustomerDOB("12", "31", "1998");
		cp.getCustomerAddress("");
		cp.getCustomerCity("Kagwad");
		cp.getCustomerState("Karnataka");
		cp.getCustomerPinNo("591315");
		cp.getCustomerNumber(randomeNum());
		cp.getCustomerEmail(randomestring());
		cp.getCustomerPassword("123456789");

	}
	
}

//https://github.com/APJANKUSH/inetBankingV1.git