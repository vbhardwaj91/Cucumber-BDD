package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.ConfigReader;

public class LoginPage {
	
	private By Pwd =By.xpath("//input[@id='password']");
	private By Submit = By.xpath("//button[@type='submit']");
	private WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	
	
	
	public void doLogin() {
		
		
		driver.findElement(Submit).click();
		
	}
	
	public void enterPassword(String pwd) {
		
		driver.findElement(Pwd).sendKeys(pwd);
	}
	
	public String verifyPageTitle() {
		
		return driver.getTitle();
		
	}
	
	public DashboardPage doLogin(String Password )
	{
		
		driver.findElement(Pwd).sendKeys(Password);
		driver.findElement(Submit).click();
		return new DashboardPage(driver);
		
		
		
		
		
	}


	public void loadURL() {
		
		String URL=ConfigReader.initProp().getProperty("URL");
		driver.get(URL);
		
		
	}
	

}
