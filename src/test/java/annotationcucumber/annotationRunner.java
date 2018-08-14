package annotationcucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
plugin = { "pretty", 
		"html:target/cucumber-htmlreport/annotation", 
		"json:target/jsonreport/annotation/cucumber-report.json"
		})
public class annotationRunner {

}
