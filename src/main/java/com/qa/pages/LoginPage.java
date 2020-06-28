package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.utility.TestUtility;

public class LoginPage extends TestBase{
	
	LoginPage loginPage;
	TestUtility testutility;
	HomePage homePage;
	
	// Page Factory
	@FindBy(id="txtUsername")
	WebElement EmailAddress;
	
	@FindBy(id="txtPassword")
	WebElement Password;
	
	@FindBy(id="btnLogin")
	WebElement SignInButton;
	
	@FindBy(id="lnkForgotPassword")
	WebElement ForgotPasswordLink;
	
	//constructor
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	// User login with enter credentials
	public void login(){
		
		EmailAddress.sendKeys(EmailAddress);
	}
	
	

}
