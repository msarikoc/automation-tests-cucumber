Feature: home page search functionality

Scenario: Verify search term
	Given the user is on the home page
	When the user enters a search term
	Then the search box should contain the search term