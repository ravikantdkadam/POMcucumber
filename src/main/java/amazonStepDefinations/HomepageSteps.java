package amazonStepDefinations;

import org.testng.Assert;

import Pages.Homepage;
import Pages.Loginpage;
import Utils.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomepageSteps extends TestBase{
	
	Loginpage loginpage;
	Homepage homepage;
	
	
	@Given("user open the browser and application")
	public void user_open_the_browser_and_application() {
		
		TestBase.initilizations();
	    
	}
	
	
	
	@Then("user validate loginpage title")
	public void user_validate_loginpage_title() {
		
		 loginpage= new Loginpage();
		
		String Title=loginpage.validateloginTitle();
		Assert.assertEquals("Amazon Sign In", Title);
	}
	
	
	
	@Then("user login to application")
	public void user_login_to_application()  {
		
		homepage=loginpage.amzonlogin(prop.getProperty("username"), prop.getProperty("password"));
		
	    
	}
	
	
	
	@Then("validate user loged in successfully")
	public void validate_user_loged_in_successfully() {
		
	  boolean logo=homepage.validatehomepage();
	  
	  Assert.assertTrue(logo);
	  
	}

	
	

}
