package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {

	WebDriver ldriver;

	public CustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
//**********************************Rough Work*************************************************

//	https://demo.guru99.com/v4/manager/CustomerRegMsg.php?cid=45048

//**********************************Rough Work************************************************

	@FindBy(xpath = "//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement newCustomer;

	@FindBy(xpath = "//input[@name='name']")
	@CacheLookup
	WebElement customerName;

	@FindBy(xpath = "//input[@name='gender']")
	@CacheLookup
	WebElement customerGender;

	@FindBy(id = "dob")
	@CacheLookup
	WebElement customerDOB;

	@FindBy(xpath = "//textarea[@name='addr']")
	@CacheLookup
	WebElement customerAddress;

	@FindBy(xpath = "//input[@name='city']")
	@CacheLookup
	WebElement customerCity;

	@FindBy(xpath = "//input[@name='state']")
	@CacheLookup
	WebElement customerState;

	@FindBy(xpath = "//input[@name='pinno']")
	@CacheLookup
	WebElement customerPin;

	@FindBy(xpath = "//input[@name='telephoneno']")
	@CacheLookup
	WebElement customerNumber;

	@FindBy(xpath = "//input[@name='emailid']")
	@CacheLookup
	WebElement customerEmail;

	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement customerPassword;

	@FindBy(xpath = "(//input[@name='sub'])[1]")
	@CacheLookup
	WebElement clickSubmit;

	@FindBy(xpath = "//table[@id='customer']/tbody/tr[4]/td[2]")
	@CacheLookup
	WebElement CustomerID;

	@FindBy(xpath = "//table[@id='customer']/tbody/tr[14]/td[1]")
	@CacheLookup
	WebElement clickToContinue;

//	Edit Customer Objects......
//  -----------------------------------------------------

	@FindBy(xpath = "//a[contains(text(),'Edit Customer')]")
	@CacheLookup
	WebElement editCustomer;

	@FindBy(xpath = "//input[@name='cusid']")
	@CacheLookup
	WebElement setCustomerId;

	@FindBy(xpath = "//input[@name='AccSubmit']")
	@CacheLookup
	WebElement clickAccSubmit;

	@FindBy(xpath = "//input[@name='res']")
	@CacheLookup
	WebElement resetAccSubmit;

	@FindBy(xpath = "//input[@name='sub']")
	@CacheLookup
	WebElement click2;

//	-----------------------------------New Customer Starts Here------------------------------------------------

	public void clickNewCustomer() {
		newCustomer.click();
	}

	public void getCustomerName(String custname) {
		customerName.sendKeys(custname);
	}

	public void getCustomerGender() {
		customerGender.click();
	}

	public void getCustomerDOB(String mm, String dd, String yyyy) {
		customerDOB.clear();
		
		
		customerDOB.sendKeys(mm);
		customerDOB.sendKeys(dd);
		customerDOB.sendKeys(yyyy);
	}

	public void getCustomerAddress(String custadd) {
		customerAddress.clear();
		customerAddress.sendKeys(custadd);
	}

	public void getCustomerCity(String custcity) {
		
		customerCity.sendKeys(custcity);
	}

	public void getCustomerState(String custstate) {
		
		customerState.sendKeys(custstate);
	}

	public void getCustomerPinNo(String custpin) {
		
		customerPin.sendKeys(String.valueOf(custpin));
	}

	public void getCustomerNumber(String custnum) {
		
		customerNumber.sendKeys(custnum);
	}

	public void getCustomerEmail(String custemail) {
		
		customerEmail.sendKeys(custemail);
	}

	public void getCustomerPassword(String custpass) {
		
		customerPassword.sendKeys(custpass);
	}

	public void clickToSubmit() {
		
		clickSubmit.click();

	}

	public void getCustomerID() {
		String custID = CustomerID.getText();
		System.out.println(custID);
	}

	public void clickToContinue() {
		clickToContinue.click();
	}

//	-----------------------------------New Customer Ends Here------------------------------------------------

//	-----------------------------------Edit Customer Starts Here------------------------------------------------

	public void clickEditCustomer() {
		editCustomer.click();
	}

	public void setCustomerId(String custId) {
		setCustomerId.sendKeys(custId);
	}

	public void clickAccSubmit() {
		clickAccSubmit.click();
	}

	public void clickAccReset() {
		resetAccSubmit.click();
	}

//	---------------------------------------------------------------------------

	public void isCustomerNameEditable(String custname) {
		String name = customerName.getAttribute("disabled");
	    boolean isEditable = !(name!=null && name.equals(true));
	    if(isEditable) {
//	    	customerName.clear();
	    	customerName.sendKeys(custname);
	    }
	}

	public void isCustomerGenderEditable() {
		String name = customerGender.getAttribute("disabled");
		boolean isEditable = !(name!=null && name.equals(true));
		if (isEditable) {
		
			customerGender.click();
		}

	}

	public void isCustomerDOBEditable(String mm, String dd, String yyyy) {
		String name = customerDOB.getAttribute("disabled");
		boolean isEditable = !(name!=null && name.equals(true));
		if (isEditable) {
//			customerDOB.clear();
			customerDOB.sendKeys(mm);
			customerDOB.sendKeys(dd);
			customerDOB.sendKeys(yyyy);
		}

	}

	public void isCustomerAddressEditable(String custadd) {
		String name = customerAddress.getAttribute("disabled");
		boolean isEditable = !(name!=null && name.equals(true));
//		System.out.println(name);
		if (isEditable) {
//			customerAddress.clear();
			customerAddress.sendKeys(custadd);
		}

	}

	public void isCustomerCityEditable(String custcity) {
		String name = customerAddress.getAttribute("disabled");
		boolean isEditable = !(name!=null && name.equals(true));
		if (isEditable) {
//			customerAddress.clear();
			customerAddress.sendKeys(custcity);
		}

	}

	public void isCustomerStateEditable(String custadd) {
		String name = customerState.getAttribute("disabled");
		boolean isEditable = !(name!=null && name.equals(true));
		if (isEditable) {
//			customerState.clear();
			customerState.sendKeys(custadd);
		}

	}

	public void isCustomerPinNoEditable(String custpin) {
		String name = customerPin.getAttribute("disabled");
		boolean isEditable = !(name!=null && name.equals(true));
		if (isEditable) {
//			customerPin.clear();
			customerPin.sendKeys(custpin);
		}

	}

	public void isCustomerNumberEditable(String custadd) {
		String name = customerNumber.getAttribute("disabled");
		boolean isEditable = !(name!=null && name.equals(true));
		if (isEditable) {
//			customerNumber.clear();
			customerNumber.sendKeys(custadd);
		}

	}

	public void isCustomerEmailEditable(String custemail) {
		String name = customerEmail.getAttribute("disabled");
		boolean isEditable = !(name!=null && name.equals(true));
		if (isEditable) {
//			customerEmail.clear();
			customerEmail.sendKeys(custemail);
		}

	}

	public void editPageSubmit() {
		click2.click();
	}

}
