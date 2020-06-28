package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HelpPage;
import com.qa.pages.HomePage;
import com.qa.utility.TestUtility;

public class HomePageTest extends TestBase {
	
	HomePage homepage;
	TestUtility testutility;
	
	
	// constructor
	public HomePageTest(){
		super();
	}
	
	@BeforeTest
	public void setup(){
		intilialization();
		testutility = new TestUtility();
		homepage = new HomePage();
		
	}
	
	// verify Home Page title
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String title = homepage.verifyHomePageTitle();
		System.out.println("Home Page title = " +title);
		Assert.assertEquals(title, 	"About");
		System.out.println("Home Page title verified");
	}
	
	// verify logo test
	@Test(priority=2)
	public void verifyLogoTest(){
		homepage.verifyLogo();
		
	}
	
	// verify Help link
	@Test(priority=3)
	public HelpPage verifyHelplinkTest(){
		homepage.verifyHelplink();
		return new HelpPage();
	}

	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
}
