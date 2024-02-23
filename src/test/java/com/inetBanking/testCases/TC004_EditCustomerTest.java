package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.CustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC004_EditCustomerTest extends BaseClass{

	@Test
	public void editCustomer() throws Exception {
       // Enter CustomerId......
				CustomerPage cp = new CustomerPage(driver);
				cp.clickEditCustomer();
				Thread.sleep(3000);
//				cp.setCustomerId("45048");
//				cp.clickAccReset();
				Thread.sleep(3000);
				cp.setCustomerId("45048");
				cp.clickAccSubmit();
				
		//Edit customer page
				
//				cp.isCustomerNameEditable("aaa");
//				cp.isCustomerGenderEditable();
//				Thread.sleep(3000);
//				cp.isCustomerDOBEditable("12", "12", "1998");
				cp.isCustomerAddressEditable("A");
				cp.isCustomerCityEditable("C");
				Thread.sleep(3000);
				cp.isCustomerStateEditable("M");
				cp.isCustomerPinNoEditable("591234");
				cp.isCustomerNumberEditable(randomeNum());
				cp.isCustomerEmailEditable(randomestring());
				Thread.sleep(5000);
				cp.editPageSubmit();
				

	}
	
	
	
}
