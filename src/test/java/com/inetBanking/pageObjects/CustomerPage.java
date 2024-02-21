package com.inetBanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {

	
	WebDriver ldriver;
	public CustomerPage(WebDriver rdriver ) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement newCustomer;
	
//	input[name='rad1'][value='m']
	
	
	@FindBy(xpath="//input[@name='name']")
	@CacheLookup
	WebElement customerName;
	
	@FindBy(xpath="//input[@name='name']")
	@CacheLookup
	WebElement customerGender;
	
	@FindBy(id="dob")
	@CacheLookup
	WebElement customerDOB;
	
	@FindBy(xpath="//textarea[@name='addr']")
	@CacheLookup
	WebElement customerAddress;
	
	@FindBy(xpath="//input[@name='city']")
	@CacheLookup
	WebElement customerCity;
	
	@FindBy(xpath="//input[@name='state']")
	@CacheLookup
	WebElement customerState;
	
	@FindBy(xpath="//input[@name='pinno']")
	@CacheLookup
	WebElement customerPin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	@CacheLookup
	WebElement customerNumber;
	
	@FindBy(xpath="//input[@name='emailid']")
	@CacheLookup
	WebElement customerEmail;
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	WebElement customerPassword;
	
	@FindBy(xpath="(//input[@name='sub'])[1]")
	@CacheLookup
	WebElement clickSubmit;
	
//	
	
	
	public void clickNewCustomer() {
		newCustomer.click();
	}
	
	public void getCustomerName(String custname) {
		customerName.sendKeys(custname);
	}
	
	public void getCustomerGender() {
		customerGender.click();
	}
	
	public void getCustomerDOB(String mm, String dd,String yyyy) {
		customerDOB.sendKeys(mm);
		customerDOB.sendKeys(dd);
		customerDOB.sendKeys(yyyy);
	}
	
	public void getCustomerAddress(String custadd) {
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
	
	
	
	
	
	
	
	
	
}
