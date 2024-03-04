package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.TestBase;

public class Loginpage extends TestBase {
	
	
	
	// @FindBy annotation used from pagefactory class

		

	@FindBy (name="email")  WebElement username;	
	@FindBy (name="password")  WebElement password;
	@FindBy (id="signInSubmit")  WebElement SignInButton;
	@FindBy (xpath="//input[@type='submit']") WebElement Continuebutton;
	
	
	// Initilization of element 
	
	public Loginpage () {
		
		PageFactory.initElements(driver, this);

	}

	public String validateloginTitle() {
		
		return driver.getTitle();
	}


	public Homepage amzonlogin(String un, String pwd ) {
		
		username.sendKeys(un);
		Continuebutton.click();
		
		password.sendKeys(pwd);
		SignInButton.click();
		
		return new Homepage();
		
		
	
		
	}
	








	
	

}
