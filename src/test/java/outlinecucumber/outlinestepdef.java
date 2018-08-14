package outlinecucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class outlinestepdef {
	
	WebDriver driver = null;
	
	@Given("^I am on google homepage$")
	public void gotoGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit.Tupe\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	}
	
	@When("^I set \"([^\\\"]*)\" as search value$")
	public void enterSearchValue(String value) {
		driver.findElement(By.name("q")).sendKeys(value);
	}
	
	@When("^I click Search button$")
	public void clickSearchButton() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
	}
	
	@Then("^Search result \"([^\\\"]*)\" should be displayed$")
	public void verifySearchResult(String searchValue) {
		if(driver.findElement(By.partialLinkText(searchValue)).isEnabled())
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
	}

}
