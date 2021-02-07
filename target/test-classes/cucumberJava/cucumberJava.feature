Feature: Tranca Jogatina

	Scenario: Open app and read texts
	
	Given I open app
	Then The texts should appear in english

	Scenario: Click button
	
	Given I open app
	And Click in Play now button
	When The text is in correct language
	Then I click in two players button
	
	Scenario: Start a game
	
	Given I open app
	When Click in Play now button
	Then I click in two players button
	
	Scenario: Playing a Tutorial
	
	Given I open app
	And Click in Play now button
	When I click in two players button
	Then Play tutorial