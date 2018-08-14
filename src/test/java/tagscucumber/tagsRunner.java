package tagscucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
				 plugin = { "pretty", 
						 	"html:target/cucumber-htmlreport/tags/ANDCondition", 
						 	"json:target/jsonreport/tags/cucumber-report_ANDCondition.json"
						},
				tags = {"@SmokeTest,~@RegressionTest"},
				features = "tagsfeatures",
				glue = {"tagsstepdef"})
/*
 * OR : tags = {"@SmokeTest,@RegressionTest"}
 * AND : tags = {"@SmokeTest","@RegressionTest"}
 * Negate AND : tags = {"@SmokeTest","~@RegressionTest"}
 * Negate OR : tags = {"@SmokeTest,~@RegressionTest"}
 * */
public class tagsRunner {

}
