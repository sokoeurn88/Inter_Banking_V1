package com.interbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.interbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException {
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("enter username");
		
		lp.setPassword(password);
		logger.info("enter password");
		
		
		lp.clickSubmit();
		
		//verify title of page
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("LoginTest passed");
			
		} else {
			captuereScreen(driver, "loginTest");	//driver & this testcasename
			Assert.assertTrue(false);
			logger.info("LonginTest failed");
			
		}
	}

}
