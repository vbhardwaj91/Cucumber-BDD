package stepDefinitions;

import com.aventstack.extentreports.util.Assert;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	
	private LoginPage lp = new LoginPage(DriverFactory.getDriver()); 
	
	@Given("^: User is on Login Page$")
    public void _user_is_on_login_page() throws Throwable {
        
		lp.loadURL();
		
	//	DriverFactory.getDriver().get("https://q2cdev-app.q2c-qa.cloud.hpe.com/");
		
    }

    @When("^: User enters Password as \"([^\"]*)\"$")
    public void _user_enters_password_as_something(String strArg1) throws Throwable {
        lp.enterPassword(strArg1);
       
    }

    @Then("^: User lands to Dashboard Page with expected title as \"([^\"]*)\"$")
    public void _user_lands_to_dashboard_page_with_expected_title_as_something(String ExpectedTitle) throws Throwable {
        
        String ActualTitle = lp.verifyPageTitle();
    	org.junit.Assert.assertTrue(ActualTitle.contains(ExpectedTitle));
    	
    	
    }
    	
    	
    

    @And("^: User click on Submit$")
    public void _user_click_on_submit() throws Throwable {
       lp.doLogin();
    }

  
    	
    	
    	
    }
    
    


