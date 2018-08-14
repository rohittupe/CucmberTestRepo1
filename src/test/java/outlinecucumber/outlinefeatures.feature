Feature: To test scenario outline

Scenario Outline: To test search with multiple search items
	Given I am on google homepage
	When I set "<searching>" as search value
	And I click Search button
	Then Search result "<resultDisplayed>" should be displayed
	Examples:
	|	searching	|	resultDisplayed					|
	|	facebook	|	Facebook - Log In or Sign Up	|
	|	twitter		|	Login on Twitter				|
	|	instagram	|	Login on Twitter						|