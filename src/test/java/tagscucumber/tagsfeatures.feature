Feature: To verify annotations

Background:
	User navigates to google
	Given I am on google homepage

@SmokeTest @RegressionTest
Scenario:
	When I set "facebook" as search value
	And I click Search button
	Then Search result "Facebook - Log In or Sign Up" should be displayed

@SmokeTest
Scenario:
	When I set "twitter" as search value
	And I click Search button
	Then Search result "Login on Twitter" should be displayed
	
@SmokeTest @RegressionTest
Scenario:
	When I set "instagram" as search value
	And I click Search button
	Then Search result "Instagram" should be displayed

@RegressionTest
Scenario:
	When I set "facebook" as search value
	And I click Search button
	Then Search result "Facebook - Log In or Sign Up" should be displayed
	But I am feeling luck should not be displayed