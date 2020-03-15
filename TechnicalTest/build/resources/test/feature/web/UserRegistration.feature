#Author: heriberto-hg@hotmail.com
#Keywords Summary : User Registration

Feature: User Registration
    I want to register a user valid and invalid data and test the system validations

	Background: The user starts out on the login page
    Given I am on the registration screen
   
  @RegistrySucces 
  Scenario: user registration success
    When Enter the user's personal information
    Then Successful registration
    And login with registered user
	
	@RegistryFail
  Scenario Outline: user registration with invalid values
    When enter incorrect user information <email>
    Then registration <status>

    Examples: 
      | email 					| status  |
      | test						| Success |
      | teste@test.com 	| Fail    |
