package firstCucumberJava;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions( monochrome = true,
		//dryRun = true,
		plugin = { "pretty", 
				"html:target/cucumber-htmlreport", 
				"json:target/cucumber-report"+1+".json"
				})//"com.cucmber.listner.ExtentCucumberFormatter:target/ExtentReport.html"
public class Runner {

}
