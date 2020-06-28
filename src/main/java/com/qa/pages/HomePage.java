package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.TestBase;

public class HomePage extends TestBase{
	
	// page factory
	@FindBy(xpath="//p[@class='menu-font']")
	WebElement Loginlink;
	
	@FindBy(xpath="//img[@class='site-logo']")
	WebElement Logo;
	
	@FindBy(xpath="//p[@class='menu-font white-text']")
	WebElement Aboutlink;
	
	@FindBy(xpath="//p[@class='menu-font white-text']")
	WebElement Helplink;
	
	// constructor
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	// verify page title
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	// verify logo present on page
	public void verifyLogo(){
		Logo.isDisplayed();
		Assert.assertTrue(true);
		System.out.println("Logo verified");
	}
	
	// verify About link present on page and clickable
	public void verifyAboutlink(){
		Aboutlink.isDisplayed();
		Aboutlink.click();
	}
	
	// verify user able to click on login link
	public LoginPage clickOnLoginlink(){
		Loginlink.click();
		return new LoginPage();
	}
	
	// verify Help Link
	public void verifyHelplink(){
		Helplink.click();
	}
}
