package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.utility.TestUtility;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	// constructor
	public TestBase(){
		
		// read properties file
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/qa/config/config.properties");
			prop.load(ip);		
		}	
		catch(FileNotFoundException e){
			e.printStackTrace();
			}
		catch(IOException e){
			e.printStackTrace();
		}		
			}
	
	// intialization method
	public static void intilialization(){
		String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chrome driver 83.0.4103.39\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browserName.equals("FF")){
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtility.Page_Load_Timeout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtility.Implicit_Wait, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	
	
	}

}
