package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.CustomerPage;
import com.inetBanking.pageObjects.LoginPage;
public class TC003_NewCustomerTest extends BaseClass  {

	@Test
	public void addCustomer() throws Exception {
	    //Adding new customer.......
		logger.info("Adding new customer...");
		CustomerPage cp=new  CustomerPage(driver);
		cp.clickNewCustomer();
		cp.getCustomerName("hp");
		cp.getCustomerGender();
		cp.getCustomerDOB("12", "31", "1998");
		cp.getCustomerAddress("Maratha Street Shedbal");
		cp.getCustomerCity("Kagwad");
		cp.getCustomerState("Karnataka");
		cp.getCustomerPinNo("591315");
		cp.getCustomerNumber(randomeNum());
		cp.getCustomerEmail(randomestring());
		cp.getCustomerPassword("123456789");
		cp.clickToSubmit();
		Thread.sleep(3000);
        //copy the customer id......
		cp.getCustomerID();
		Thread.sleep(3000);
		cp.clickToContinue();

	}
	
}

//https://github.com/APJANKUSH/inetBankingV1.git