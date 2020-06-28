package com.qa.testcases;

import org.testng.annotations.BeforeTest;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

import net.bytebuddy.dynamic.NexusAccessor.InitializationAppender;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	
	// constructor
	public LoginPageTest(){
		super();
	}
	
	@BeforeTest
	public void setup(){
		InitializationAppender();
	}

}
