package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
public static WebDriver driver;
public static Properties prop;

FileInputStream fis;


	public TestBase()    {          // constructor of Base Class for reading the property file

		try {
			 prop =new Properties();			
			 
			 FileInputStream fis = new FileInputStream("D:\\C drive Data 26_06_23\\eclipse-workspace\\POMCumcumberOct\\src\\main\\java\\Config\\Configuration.properties");
			
			prop.load(fis);
			
		} 
		
		catch (IOException e) {
			e.getMessage();
		
		}
		
	}
		
		public static void initilizations() {
			
			String browsername  = prop.getProperty("browser"); // read browser property from properties file 
			
			if (browsername.equals("Chrome")) {
				
				System.setProperty("webdriver.Chrome.driver","D:\\Testing\\Automation Testing\\chromedriver.exe");

				 driver = new ChromeDriver(); 
 
			   
			}    
		     
		     else if (browsername.equals("FF")) {
		    	 
		    	 System.setProperty("webdriver.gecko.driver","D:\\Testing\\Firfox driver");

					 driver = new FirefoxDriver(); 
		 
		     }
					
			       driver.manage().window().maximize();
					 driver.manage().deleteAllCookies();

			      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			      
			      driver.get(prop.getProperty("url"));
			      
			      driver.findElement(By.id("nav-link-accountList")).click();
			      
    	 
		     }
		     
			
		}
