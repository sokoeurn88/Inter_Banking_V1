package com.interbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver gdriver;

	public LoginPage(WebDriver ldriver) {
		gdriver = ldriver;
		PageFactory.initElements(gdriver, this);
	}

	@FindBy(name = "uid")
	WebElement txtUserName;

	@FindBy(name = "password")
	WebElement txtPassWord;

	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassWord.sendKeys(pwd);
	}
	
	public void clickSubmit() {
		btnLogin.click();
	}

}
