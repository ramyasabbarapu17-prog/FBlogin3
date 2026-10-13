package projectJulyRunnerfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"julyfeature/julyreg.feature"},// path of feature
		
        glue =     {"projectjulyStepdedinations"},//path of stepdefinations
        
		 plugin =    { "pretty","html:target/cucumber-reports",
				 
        		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        		
        		 },
	tags="@regerssion",
 monochrome = true //true if terminal output should be without colours.
)
public class projectjulyrunnerfileC extends  AbstractTestNGCucumberTests
{

	
}
