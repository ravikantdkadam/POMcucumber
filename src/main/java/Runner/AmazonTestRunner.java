package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(    
		
		features = "src/main/java/Features/loginfunctioanlity.feature",    // The path to the feature file is specified by features options 
		
		
		glue={"amazonStepDefinations"},   // This argument used to provide step defination file location
		
		dryRun=false ,          //dryRun compile the feature file and Step Defination 
		
		
		//monochrome =true,    // Display the console outout in readable format 
		
	
		
		
		//tags="@SmokeTest",  // We can mention tags to scenario in featureFile for grouping 
		    //"@SmokeTest or @RegressionTest"       Execute all test tageed with smokeTest or RegressionTest
		// " @SmokeTest and @RegressionTest"        Execute all test tageed with smokeTest AND RegressionTest
		
		// Ignore Tag    ======>  ~@SmokeTest
		   

		plugin = {"pretty", "html:target/cucumber-reports.html",
				"pretty", "json:target/cucumber-reports.json" ,
				"pretty",  "junit:target/cucumber-reports.xml"}


		)


public class AmazonTestRunner extends AbstractTestNGCucumberTests {

}
