package firstCucumberJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import cucumber.api.java.en.*;

public class cucumberfirstjava {
	
	WebDriver driver = null;
	@Given("^I have open the browser$")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit.Tupe\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//FirefoxOptions options = new FirefoxOptions();
		//options.setCapability("marionette", false);
		//driver = new FirefoxDriver(options);
		driver = new ChromeDriver();
	}
	
	@When("^I open Google site$")
	public void gotoGoogle() {
		driver.navigate().to("https://www.google.com/");
	}
	
	@Then("^Login button should exist$")
	public void loginButton() {
		if(driver.findElement(By.name("q")).isEnabled()) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test failed");
		}
		driver.close();
	}
	
}
