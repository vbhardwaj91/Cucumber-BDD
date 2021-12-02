package stepDefinitions;

import java.util.List;

import org.junit.Assert;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardPageSteps {
	
	LoginPage lp = new LoginPage(DriverFactory.getDriver());
	DashboardPage Dp;
	private String DashboardHeaderLabel;
	private String FeaturedServicesLabel;
	
	
	@Given("^: User is already on DashBoardPage using Password$")
    public void _user_is_already_on_dashboardpage_using_password(DataTable dataTable) throws Throwable {
        
		
	List<List<String>> pwd=dataTable.asLists();	
	
	String Pwd= pwd.get(1).get(0);
	lp.loadURL();
	Dp=lp.doLogin(Pwd);
		
    }

    @Given("^User is on Dashboard Page$")
    public void user_is_on_dashboard_page() throws Throwable {
        
    	System.out.println("User is on Dashboard Page");
    	
    }

    @When("^User check the Header Label of Dashboard Page$")
    public void user_check_the_header_label_of_dashboard_page() throws Throwable {
        
    	DashboardHeaderLabel = Dp.getDashboardHeaderLabel();
    }

    @When("^User check the number of Cards$")
    public void user_check_the_number_of_cards() throws Throwable {
        
    	System.out.println("Needs to be developed");
    	
    }

    @When("^User check the Feature Services$")
    public void user_check_the_feature_services() throws Throwable {
        
    	FeaturedServicesLabel = Dp.getFeaturedServiceLabel();
    	
    }


    @Then("^Verify the Header Label of Dashboard Page \"([^\"]*)\"$")
    public void verify_the_header_label_of_dashboard_page_something(String ExpectedTitle) throws Throwable {
        
    	Assert.assertTrue(DashboardHeaderLabel.contains(ExpectedTitle));
    }

    @Then("^Verify the following Cards as shown$")
    public void verify_the_following_cards_as_shown() throws Throwable {
    	System.out.println("Needs to be done");
    }

    @Then("^Verify Features services section is showing or not with Label as \"([^\"]*)\"$")
    public void verify_features_services_section_is_showing_or_not_with_label_as_something(String ExpectedTitle) throws Throwable {
        
    	
    	Assert.assertTrue(FeaturedServicesLabel.contains(ExpectedTitle));
    	
    }

    @And("^Verify the Cards Count as 5$")
    public void verify_the_cards_count() throws Throwable {
        
    	System.out.println("Needs to be done");
    }


}
