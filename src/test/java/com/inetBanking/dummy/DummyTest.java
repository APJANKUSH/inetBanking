package com.inetBanking.dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyTest {

	public static WebDriver driver;
	@Test
	public void testCross() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/manager/CustomerRegMsg.php?cid=45048");
		driver.manage().window().maximize();
		
		
		String custId =driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		System.out.println(custId);
		driver.quit();
		
	}
}
