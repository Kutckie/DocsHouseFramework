@login
Feature: Lanit.ru DocsHouse Login Test

	Scenario: valid login
		When user enters valid username
		And user enters valid password
		And click on login button
		Then I validate that user is logged in
	
#  Scenario: empty password
#    When user enters valid username
#    And user leaves password empty
#    And click on login button
#    Then I validate that "" message is displayed
#
#  Scenario: invalid login
#    When user enters invalid username as "random_username"
#    And user enters invalid password as "random_password"
#    And click on login button
#    Then I validate that "" message is displayed