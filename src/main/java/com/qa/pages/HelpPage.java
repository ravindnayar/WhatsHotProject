package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HelpPage extends TestBase{

	// Page Factory
	
	
	
	// constructor
	public HelpPage(){
		PageFactory.initElements(driver, this);
	}
	
	// verify Help Page title
	public void helpPageTitle(){
		driver.getTitle();
	}
}
