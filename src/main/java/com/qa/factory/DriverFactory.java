package com.qa.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static ThreadLocal <WebDriver> tlDriver= new ThreadLocal<>();
	
	public WebDriver init_driver( String Browser ) {
		
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
			
		}
		
		else if(Browser.equalsIgnoreCase("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
			
		}
		
		else
			System.out.println("Enter valid Browser");
		
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
		return getDriver();
		
	}

	public static synchronized WebDriver getDriver() {
		
		WebDriver driver=tlDriver.get();
		
		return driver;
		
	}
	
}


