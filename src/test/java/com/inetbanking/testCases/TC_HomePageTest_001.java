package com.inetbanking.testCases;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class TC_HomePageTest_001 extends BaseClass
{

	@Test

	public void titleTest() throws IOException, Exception
	{


		String actualTitle = driver.getTitle();
        String expectedTitle = "Google1529";

        assertEquals(expectedTitle, actualTitle, "Page title did not match!");

	}
	@Test
	public void valueEn() {
		
		driver.findElement(By.className("gLFyf")).sendKeys("Hey Google");
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);

	}
}
