Feature: To verify annotations

Background:
	User navigates to google
	Given I am on google homepage

Scenario:
	When I set "facebook" as search value
	And I click Search button
	Then Search result should be displayed
	
Scenario:
	When I set "facebook" as search value
	And I click Search button
	Then Search result should be displayed
	But I am feeling luck should not be displayed
	