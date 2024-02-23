package com.inetBanking.pageObjects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountPage {

	
	public WebDriver ldriver;

	@FindBy(xpath = "//a[contains(text(),'New Account')]")
	@CacheLookup
	WebElement newAccount;
	
	@FindBy(xpath = "//input[@name='cusid']")
	@CacheLookup
	WebElement enterCustomerId;
	
	@FindBy(xpath = "//select[@name='selaccount']")
	@CacheLookup
	WebElement accountType;
	
	@FindBy(xpath = "//input[@name='inideposit']")
	@CacheLookup
	WebElement initialAmount;
	
	@FindBy(xpath = "//input[@name='button2']")
	@CacheLookup
	WebElement submit;
	
	@FindBy(xpath = "//a[contains(text(),'Edit Account')]")
	@CacheLookup
	WebElement editAccount;
	
	@FindBy(xpath = "//input[contains(@name,'accountno')]")
	@CacheLookup
	WebElement accountNumber;
	
	@FindBy(xpath = "//input[contains(@name,'AccSubmit')]")
	@CacheLookup
	WebElement subEditActBtn;
	
	
//	
	
	
	
	
	
//	-------------------------------------------------------------------------------------------------
	
	public AccountPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	public void clickNewAccount() {
		newAccount.click();
	}
	
	public void getCustomerID(String custid) {
		enterCustomerId.sendKeys(custid);
	}
	
	public void getAccountType(String accType) {
		Select accoutType = new Select(accountType);
		accoutType.selectByValue(accType);
	}
	public void getInitialAmount(String initAmmount) {
		initialAmount.sendKeys(initAmmount);
	}
	
	public void clickSubmit() {
		submit.click();
	}
	
//	----------------------------------------------------------------

	
	public void editAccount() {
		editAccount.click();
	}
	
	
	public void getCustomerAccountNumber(String custActNo) {
		accountNumber.sendKeys(custActNo);
	}
	
	public void submitAccountBtn() {
		subEditActBtn.click();
	}
	
	
	public int getResponceCode() throws Exception {
		HttpURLConnection c=(HttpURLConnection)new URL("https://demo.guru99.com/v4/manager/editAccountPage.php")
		  .openConnection();
		c.setRequestMethod("PUT");
		c.connect();
		int r = c.getResponseCode();
	      System.out.println("Http response code: " + r);
         return r;
	}
	
	
}
