package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
             (
            	 features="src/test/resources/Business_Logic",	 
            	 tags="@RegressionTest",
            	 glue="map",
            	 plugin="pretty",
            	 monochrome=true
            		 
            		 
            		 
            		 
            )		 
  







public class RunTest extends AbstractTestNGCucumberTests
{

}
