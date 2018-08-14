package outlinecucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
plugin = { "pretty", 
		"html:target/cucumber-htmlreport/outline", 
		"json:target/jsonreport/outline/cucumber-report.json"
		})
public class outlineRunner {

}
