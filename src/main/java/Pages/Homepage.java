package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.TestBase;

public class Homepage extends TestBase {
	
	
	
	@FindBy(id="nav-logo-sprites") WebElement Amazonlogo;
	
	
	
	public Homepage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public boolean validatehomepage() {
		
		return Amazonlogo.isDisplayed();
		
	}
	
	

}
