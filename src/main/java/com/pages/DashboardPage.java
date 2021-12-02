package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
	
	
	private WebDriver driver;
	private By DashBoardLabel=By.xpath("//span[text()='Dashboard']");
	private By FeatureLabel=By.xpath("//span[text()='Featured Services']");
	private By CardSection=By.cssSelector("span.StyledText-sc-1sadyjn-0.gJMuOU");
	
 
	public DashboardPage(WebDriver driver) {
	
		this.driver=driver;
		
	}
	
	public String getDashboardHeaderLabel() {
		
	String	DashboardActualText=driver.findElement(DashBoardLabel).getText();
	
	return DashboardActualText;
		
		
	}
	
	public String getFeaturedServiceLabel() {
		
		String	FeaturedServiceActualText=driver.findElement(FeatureLabel).getText();
		
		return FeaturedServiceActualText;
			
			
		}
	
	public List<String> getCards() {
		
		List<WebElement> ls=driver.findElements(CardSection);
		List<String> st = null;
		
		for(WebElement i: ls) {
			
			st.add(i.getText());
			
		}
		
		return st;
		
	}
	
	public int getCardCount() {
		
		List<WebElement> ls=driver.findElements(CardSection);
		
		return ls.size();
		
		
	}
	
	



	
	
	

}
