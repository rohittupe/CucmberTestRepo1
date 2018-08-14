package annotationcucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class annotationstepdef {
	
	static WebDriver driver = null;
	
	@Given("^I am on google homepage$")
	public void gotoGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit.Tupe\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	}
	
	@When("^I set \"(.*)\" as search value$")
	public void enterSearchValue(String value) {
		driver.findElement(By.name("q")).sendKeys(value);
	}
	
	@When("^I click Search button$")
	public void clickSearchButton() throws InterruptedException {
		/*Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();*/
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
	}
	
	@Then("^Search result should be displayed$")
	public void verifySearchResult() {
		if(driver.findElement(By.partialLinkText("Facebook - Log In or Sign Up")).isEnabled())
			System.out.println("Search Result displayed");
		else
			System.out.println("Search result not displayed");
	}
	
	@Then("^I am feeling luck should not be displayed$")
	public void verifyImFeelingluckyButton() {
		if(driver.findElement(By.name("btnI")).isDisplayed())
			System.out.println("Test Failed");
		else
			System.out.println("Test Passed");
		driver.quit();
	}

}
