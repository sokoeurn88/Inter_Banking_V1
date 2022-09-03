package com.interbanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;

import com.interbanking.pageObjects.AddCustomerPage;
import com.interbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class AddCustomerTest_003 extends BaseClass {
	
	public void addNewCustomer() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		// call all methods from AddNewCustomerPage
		AddCustomerPage addcust= new AddCustomerPage(driver);
		addcust.customerName();		// just have one method from AddCustomerClass
		
		//call randomString
		String email = randomString()+"@gmail.com";
		addcust.custemailid(email);
		//addcust.custpassword ("ancd188");
		//addcust.custsubmit(email);
		
		//after create account, we should verify successfully created
		boolean res=driver.getPageSource().contains("Customer Registered Successfully");
		if(res==true) {
			Assert.assertTrue(true);
		} else {
			//captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false); 	//if test assertion fail, need to take screenshot
		}
		
	}	
	
	//random email
	public String randomString() {
		String generatestring = RandomStringUtils.randomAlphabetic(8);
		return generatestring;
	}
	
	public static String randomNum() {
		String generatedString2=RandomStringUtils.randomNumeric(4);
		return(generatedString2);
	}
}
