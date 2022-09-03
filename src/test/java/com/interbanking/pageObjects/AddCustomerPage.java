package com.interbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	WebDriver gdriver;
	
	//create constructor
	public AddCustomerPage(WebDriver ldriver) {
		gdriver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	// using @FindBy(how=)
	@FindBy(how=How.XPATH, using="xpath expression") WebElement lnkAddNewCustomer;
	
	
	// after we create @FindBy then need to create a method
	public void customerName() {
		lnkAddNewCustomer.click();
	}
	
	public void custemailid(String txtemailid) {
		
	}

}
